import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.Class<?> wildcardClass5 = partner3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.Class<?> wildcardClass8 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.Class<?> wildcardClass6 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        boolean boolean9 = partner3.isVerified();
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.login("hi!", "");
        java.lang.Class<?> wildcardClass11 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass6 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(false);
        partner3.logout();
        partner3.setVerified(false);
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass9 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass7 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        java.lang.String str9 = partner3.getID();
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass7 = partner3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        boolean boolean9 = partner3.isVerified();
        java.lang.String str10 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass11 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.Class<?> wildcardClass8 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getID();
        java.lang.Class<?> wildcardClass9 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass9 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        java.lang.Class<?> wildcardClass9 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.setVerified(true);
        java.lang.Class<?> wildcardClass6 = partner3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getPassword();
        partner3.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass11 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(false);
        boolean boolean12 = partner3.isVerified();
        partner3.setVerified(true);
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        model.Partner partner3 = new model.Partner("partner", "", "partner");
        partner3.setVerified(false);
        partner3.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass9 = partner3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
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
        partner3.setVerified(false);
        java.lang.Class<?> wildcardClass16 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        double double8 = partner3.getHourlyRate();
        java.lang.String str9 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass7 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        partner3.viewProfile();
        partner3.login("", "partner");
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getAccountType();
        java.lang.String str8 = partner3.getID();
        java.lang.Class<?> wildcardClass9 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getPassword();
        partner3.logout();
        java.lang.Class<?> wildcardClass8 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getPassword();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass11 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getID();
        java.lang.Class<?> wildcardClass8 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.login("", "");
        java.lang.String str10 = partner3.getID();
        boolean boolean11 = partner3.isVerified();
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.login("", "");
        double double7 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass8 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        java.lang.Class<?> wildcardClass9 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getEmail();
        java.lang.Class<?> wildcardClass6 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getEmail();
        java.lang.Class<?> wildcardClass6 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        boolean boolean8 = partner3.isVerified();
        partner3.setVerified(true);
        java.lang.Class<?> wildcardClass11 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getPassword();
        java.lang.Class<?> wildcardClass8 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        model.Partner partner3 = new model.Partner("hi!", "", "partner");
        java.lang.Class<?> wildcardClass4 = partner3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getEmail();
        java.lang.String str9 = partner3.getEmail();
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        model.Partner partner3 = new model.Partner("hi!", "partner", "partner");
        java.lang.String str4 = partner3.getID();
        java.lang.Class<?> wildcardClass5 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
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
        java.lang.Class<?> wildcardClass18 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        partner3.logout();
        java.lang.Class<?> wildcardClass6 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        model.Partner partner3 = new model.Partner("partner", "hi!", "partner");
        java.lang.Class<?> wildcardClass4 = partner3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.login("hi!", "");
        java.lang.String str11 = partner3.getPassword();
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.viewProfile();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass7 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        boolean boolean9 = partner3.isVerified();
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getAccountType();
        java.lang.String str12 = partner3.getPassword();
        java.lang.Class<?> wildcardClass13 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        partner3.logout();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass11 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        partner3.viewProfile();
        partner3.login("", "partner");
        partner3.login("", "partner");
        java.lang.String str15 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass17 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.viewProfile();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getEmail();
        java.lang.Class<?> wildcardClass7 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        model.Partner partner3 = new model.Partner("", "partner", "partner");
        double double4 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass5 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 50.0d + "'", double4 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.login("", "hi!");
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
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
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getEmail();
        java.lang.Class<?> wildcardClass11 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getID();
        java.lang.Class<?> wildcardClass6 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "hi!");
        partner3.login("hi!", "partner");
        java.lang.Class<?> wildcardClass7 = partner3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        partner3.logout();
        partner3.viewProfile();
        java.lang.String str9 = partner3.getEmail();
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.setVerified(false);
        java.lang.Class<?> wildcardClass6 = partner3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
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
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getID();
        partner3.logout();
        java.lang.String str10 = partner3.getPassword();
        java.lang.Class<?> wildcardClass11 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        partner3.logout();
        java.lang.Class<?> wildcardClass5 = partner3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getAccountType();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass7 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
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
        java.lang.Class<?> wildcardClass20 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        partner3.viewProfile();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getEmail();
        java.lang.Class<?> wildcardClass11 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getEmail();
        partner3.logout();
        java.lang.String str9 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass4 = partner3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getEmail();
        java.lang.Class<?> wildcardClass6 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        java.lang.Class<?> wildcardClass8 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
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
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getEmail();
        double double6 = partner3.getHourlyRate();
        double double7 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass8 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        partner3.setVerified(true);
        partner3.login("partner", "partner");
        double double11 = partner3.getHourlyRate();
        partner3.viewProfile();
        java.lang.String str13 = partner3.getEmail();
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.login("", "");
        double double7 = partner3.getHourlyRate();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getPassword();
        java.lang.Class<?> wildcardClass11 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
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
        java.lang.Class<?> wildcardClass16 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getEmail();
        partner3.viewProfile();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        java.lang.Class<?> wildcardClass9 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        partner3.logout();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
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
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
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
        java.lang.Class<?> wildcardClass18 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getPassword();
        partner3.login("hi!", "hi!");
        boolean boolean12 = partner3.isVerified();
        java.lang.String str13 = partner3.getEmail();
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        java.lang.String str7 = partner3.getAccountType();
        java.lang.String str8 = partner3.getPassword();
        java.lang.Class<?> wildcardClass9 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        model.Partner partner3 = new model.Partner("partner", "partner", "");
        java.lang.Class<?> wildcardClass4 = partner3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
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
        partner3.login("partner", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
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
        java.lang.String str15 = partner3.getPassword();
        java.lang.Class<?> wildcardClass16 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getPassword();
        partner3.login("", "");
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        boolean boolean9 = partner3.isVerified();
        java.lang.String str10 = partner3.getEmail();
        partner3.setVerified(false);
        java.lang.Class<?> wildcardClass13 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        boolean boolean8 = partner3.isVerified();
        java.lang.String str9 = partner3.getID();
        double double10 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass11 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
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
        java.lang.Class<?> wildcardClass20 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getAccountType();
        boolean boolean7 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.Class<?> wildcardClass5 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
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
        java.lang.Class<?> wildcardClass16 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
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
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
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
        java.lang.String str13 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
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
        java.lang.String str15 = partner3.getPassword();
        java.lang.String str16 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.login("", "");
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass8 = partner3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getPassword();
        partner3.setVerified(true);
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
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
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        java.lang.String str9 = partner3.getID();
        partner3.login("hi!", "");
        java.lang.String str13 = partner3.getID();
        java.lang.String str14 = partner3.getID();
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getAccountType();
        partner3.logout();
        partner3.login("", "");
        java.lang.Class<?> wildcardClass13 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.login("", "");
        double double10 = partner3.getHourlyRate();
        java.lang.String str11 = partner3.getPassword();
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        partner3.viewProfile();
        java.lang.String str9 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
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
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.login("", "");
        java.lang.String str10 = partner3.getID();
        java.lang.Class<?> wildcardClass11 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getEmail();
        java.lang.String str11 = partner3.getPassword();
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.login("", "partner");
        java.lang.String str10 = partner3.getEmail();
        boolean boolean11 = partner3.isVerified();
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
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
        java.lang.Class<?> wildcardClass13 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        java.lang.String str4 = partner3.getEmail();
        partner3.login("", "partner");
        java.lang.String str8 = partner3.getPassword();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        model.Partner partner3 = new model.Partner("hi!", "", "");
        java.lang.String str4 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        partner3.viewProfile();
        java.lang.String str12 = partner3.getID();
        partner3.login("hi!", "");
        java.lang.Class<?> wildcardClass16 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getPassword();
        partner3.login("partner", "hi!");
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
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
        java.lang.String str14 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getAccountType();
        partner3.logout();
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        model.Partner partner3 = new model.Partner("", "partner", "partner");
        partner3.viewProfile();
        partner3.viewProfile();
        java.lang.String str6 = partner3.getAccountType();
        java.lang.String str7 = partner3.getPassword();
        java.lang.Class<?> wildcardClass8 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        model.Partner partner3 = new model.Partner("", "partner", "partner");
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass5 = partner3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
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
        java.lang.Class<?> wildcardClass20 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.logout();
        java.lang.String str5 = partner3.getEmail();
        java.lang.String str6 = partner3.getAccountType();
        partner3.login("partner", "partner");
        double double10 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass11 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.Class<?> wildcardClass8 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.login("hi!", "");
        java.lang.String str11 = partner3.getPassword();
        boolean boolean12 = partner3.isVerified();
        partner3.setVerified(true);
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        model.Partner partner3 = new model.Partner("", "hi!", "hi!");
        java.lang.Class<?> wildcardClass4 = partner3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getPassword();
        double double10 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass11 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        partner3.logout();
        partner3.setVerified(true);
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        boolean boolean8 = partner3.isVerified();
        java.lang.String str9 = partner3.getID();
        double double10 = partner3.getHourlyRate();
        partner3.logout();
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getEmail();
        boolean boolean8 = partner3.isVerified();
        java.lang.Class<?> wildcardClass9 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
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
        java.lang.String str16 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(true);
        partner3.login("hi!", "hi!");
        java.lang.String str15 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.login("", "");
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        double double8 = partner3.getHourlyRate();
        boolean boolean9 = partner3.isVerified();
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
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
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        model.Partner partner3 = new model.Partner("", "partner", "partner");
        partner3.viewProfile();
        partner3.viewProfile();
        java.lang.String str6 = partner3.getAccountType();
        java.lang.String str7 = partner3.getEmail();
        java.lang.Class<?> wildcardClass8 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getPassword();
        partner3.logout();
        java.lang.Class<?> wildcardClass9 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getEmail();
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
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
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getEmail();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.Class<?> wildcardClass8 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
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
        boolean boolean14 = partner3.isVerified();
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        partner3.logout();
        double double10 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass11 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getEmail();
        partner3.setVerified(false);
        partner3.login("partner", "hi!");
        java.lang.String str12 = partner3.getAccountType();
        double double13 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        boolean boolean9 = partner3.isVerified();
        java.lang.String str10 = partner3.getEmail();
        java.lang.Class<?> wildcardClass11 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        model.Partner partner3 = new model.Partner("", "partner", "partner");
        double double4 = partner3.getHourlyRate();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass7 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 50.0d + "'", double4 == 50.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
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
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.login("", "");
        double double7 = partner3.getHourlyRate();
        partner3.setVerified(false);
        partner3.logout();
        java.lang.Class<?> wildcardClass11 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "partner");
        partner3.login("hi!", "partner");
        java.lang.String str7 = partner3.getEmail();
        java.lang.Class<?> wildcardClass8 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
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
        java.lang.Class<?> wildcardClass16 = partner3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
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
        java.lang.Class<?> wildcardClass21 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 50.0d + "'", double19 == 50.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        java.lang.String str4 = partner3.getEmail();
        double double5 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass6 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 50.0d + "'", double5 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        java.lang.String str4 = partner3.getEmail();
        partner3.login("hi!", "");
        java.lang.Class<?> wildcardClass8 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getAccountType();
        partner3.logout();
        boolean boolean10 = partner3.isVerified();
        partner3.login("", "hi!");
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getEmail();
        java.lang.String str11 = partner3.getID();
        java.lang.String str12 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        boolean boolean8 = partner3.isVerified();
        boolean boolean9 = partner3.isVerified();
        partner3.login("", "partner");
        double double13 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
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
        java.lang.Class<?> wildcardClass13 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.logout();
        java.lang.String str5 = partner3.getEmail();
        partner3.logout();
        partner3.login("", "partner");
        java.lang.String str10 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass11 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        model.Partner partner3 = new model.Partner("partner", "partner", "hi!");
        java.lang.String str4 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass6 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
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
        java.lang.Class<?> wildcardClass18 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
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
        java.lang.Class<?> wildcardClass13 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getEmail();
        partner3.setVerified(false);
        partner3.logout();
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        boolean boolean9 = partner3.isVerified();
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getAccountType();
        double double12 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass13 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str10 = partner3.getID();
        partner3.login("", "partner");
        java.lang.String str14 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getAccountType();
        java.lang.String str8 = partner3.getEmail();
        partner3.logout();
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        model.Partner partner3 = new model.Partner("", "", "partner");
        partner3.login("partner", "partner");
        double double7 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass8 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        partner3.logout();
        java.lang.String str5 = partner3.getEmail();
        partner3.login("", "");
        java.lang.Class<?> wildcardClass9 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getEmail();
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        partner3.logout();
        double double10 = partner3.getHourlyRate();
        partner3.setVerified(true);
        partner3.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass16 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        java.lang.String str9 = partner3.getID();
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.login("hi!", "");
        java.lang.String str11 = partner3.getPassword();
        double double12 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        java.lang.String str4 = partner3.getEmail();
        partner3.login("", "partner");
        java.lang.Class<?> wildcardClass8 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getID();
        java.lang.String str9 = partner3.getID();
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
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
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.login("hi!", "");
        java.lang.String str11 = partner3.getPassword();
        boolean boolean12 = partner3.isVerified();
        boolean boolean13 = partner3.isVerified();
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getAccountType();
        partner3.setVerified(false);
        boolean boolean10 = partner3.isVerified();
        partner3.logout();
        java.lang.String str12 = partner3.getEmail();
        java.lang.Class<?> wildcardClass13 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getEmail();
        double double6 = partner3.getHourlyRate();
        boolean boolean7 = partner3.isVerified();
        java.lang.Class<?> wildcardClass8 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.login("", "hi!");
        java.lang.Class<?> wildcardClass11 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        partner3.logout();
        partner3.logout();
        partner3.login("", "");
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
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
        java.lang.Class<?> wildcardClass16 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
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
        java.lang.Class<?> wildcardClass19 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.login("", "");
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getEmail();
        partner3.logout();
        java.lang.String str10 = partner3.getID();
        double double11 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getPassword();
        java.lang.String str10 = partner3.getPassword();
        java.lang.String str11 = partner3.getEmail();
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
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
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
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
        double double14 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        java.lang.String str4 = partner3.getEmail();
        java.lang.Class<?> wildcardClass5 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        double double8 = partner3.getHourlyRate();
        java.lang.String str9 = partner3.getEmail();
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getEmail();
        double double6 = partner3.getHourlyRate();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        java.lang.Class<?> wildcardClass9 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getPassword();
        java.lang.Class<?> wildcardClass9 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getID();
        partner3.login("", "");
        java.lang.String str10 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str13 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
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
        partner3.setVerified(true);
        java.lang.Class<?> wildcardClass24 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 50.0d + "'", double21 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.login("", "");
        partner3.viewProfile();
        partner3.viewProfile();
        partner3.login("", "");
        partner3.logout();
        java.lang.String str13 = partner3.getID();
        double double14 = partner3.getHourlyRate();
        java.lang.String str15 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "partner" + "'", str15, "partner");
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.login("", "");
        double double7 = partner3.getHourlyRate();
        partner3.login("partner", "partner");
        java.lang.String str11 = partner3.getID();
        partner3.logout();
        double double13 = partner3.getHourlyRate();
        double double14 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
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
        java.lang.Class<?> wildcardClass19 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getPassword();
        partner3.login("", "partner");
        boolean boolean11 = partner3.isVerified();
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
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
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.logout();
        java.lang.String str5 = partner3.getEmail();
        double double6 = partner3.getHourlyRate();
        boolean boolean7 = partner3.isVerified();
        java.lang.String str8 = partner3.getID();
        java.lang.Class<?> wildcardClass9 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        model.Partner partner3 = new model.Partner("hi!", "", "partner");
        partner3.setVerified(false);
        partner3.setVerified(false);
        partner3.logout();
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        boolean boolean10 = partner3.isVerified();
        java.lang.Class<?> wildcardClass11 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.login("", "hi!");
        partner3.login("partner", "hi!");
        java.lang.Class<?> wildcardClass13 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        model.Partner partner3 = new model.Partner("", "partner", "partner");
        double double4 = partner3.getHourlyRate();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getAccountType();
        double double8 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass9 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 50.0d + "'", double4 == 50.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        model.Partner partner3 = new model.Partner("", "", "partner");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getAccountType();
        java.lang.String str7 = partner3.getEmail();
        java.lang.Class<?> wildcardClass8 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
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
        java.lang.Class<?> wildcardClass13 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getAccountType();
        partner3.setVerified(true);
        partner3.logout();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        java.lang.String str8 = partner3.getEmail();
        partner3.login("", "");
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        model.Partner partner3 = new model.Partner("", "partner", "partner");
        double double4 = partner3.getHourlyRate();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getAccountType();
        partner3.login("partner", "");
        partner3.login("partner", "");
        partner3.logout();
        java.lang.String str14 = partner3.getPassword();
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 50.0d + "'", double4 == 50.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
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
        java.lang.Class<?> wildcardClass16 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double14 = partner3.getHourlyRate();
        partner3.login("", "partner");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        partner3.logout();
        partner3.logout();
        partner3.logout();
        java.lang.Class<?> wildcardClass7 = partner3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        partner3.logout();
        partner3.logout();
        java.lang.Class<?> wildcardClass7 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
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
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
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
        partner3.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass17 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
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
        java.lang.Class<?> wildcardClass17 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        model.Partner partner3 = new model.Partner("partner", "partner", "hi!");
        java.lang.String str4 = partner3.getEmail();
        java.lang.String str5 = partner3.getPassword();
        java.lang.Class<?> wildcardClass6 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
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
        java.lang.Class<?> wildcardClass16 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        partner3.viewProfile();
        partner3.login("", "");
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        partner3.setVerified(true);
        partner3.login("", "hi!");
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.setVerified(true);
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass8 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        partner3.viewProfile();
        partner3.login("", "partner");
        partner3.login("", "partner");
        java.lang.String str15 = partner3.getEmail();
        double double16 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass17 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        partner3.setVerified(true);
        boolean boolean8 = partner3.isVerified();
        partner3.setVerified(false);
        java.lang.String str11 = partner3.getAccountType();
        partner3.logout();
        boolean boolean13 = partner3.isVerified();
        boolean boolean14 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        java.lang.String str8 = partner3.getID();
        java.lang.String str9 = partner3.getEmail();
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        partner3.setVerified(false);
        boolean boolean9 = partner3.isVerified();
        double double10 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        boolean boolean9 = partner3.isVerified();
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getAccountType();
        double double12 = partner3.getHourlyRate();
        double double13 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        model.Partner partner3 = new model.Partner("", "hi!", "hi!");
        partner3.login("partner", "partner");
        java.lang.String str7 = partner3.getID();
        java.lang.String str8 = partner3.getID();
        java.lang.Class<?> wildcardClass9 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        partner3.setVerified(false);
        partner3.logout();
        java.lang.String str12 = partner3.getID();
        java.lang.Class<?> wildcardClass13 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getAccountType();
        java.lang.String str12 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        model.Partner partner3 = new model.Partner("", "partner", "");
        partner3.setVerified(true);
        partner3.login("", "hi!");
        partner3.viewProfile();
        java.lang.String str10 = partner3.getID();
        partner3.viewProfile();
        double double12 = partner3.getHourlyRate();
        boolean boolean13 = partner3.isVerified();
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        partner3.logout();
        java.lang.String str5 = partner3.getPassword();
        java.lang.String str6 = partner3.getEmail();
        java.lang.Class<?> wildcardClass7 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        boolean boolean10 = partner3.isVerified();
        java.lang.String str11 = partner3.getID();
        double double12 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass13 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getAccountType();
        boolean boolean9 = partner3.isVerified();
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        model.Partner partner3 = new model.Partner("", "partner", "partner");
        double double4 = partner3.getHourlyRate();
        java.lang.String str5 = partner3.getEmail();
        java.lang.String str6 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass7 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 50.0d + "'", double4 == 50.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
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
        java.lang.String str14 = partner3.getEmail();
        java.lang.String str15 = partner3.getPassword();
        boolean boolean16 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
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
        java.lang.Class<?> wildcardClass17 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
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
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
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
        java.lang.Class<?> wildcardClass16 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        boolean boolean8 = partner3.isVerified();
        boolean boolean9 = partner3.isVerified();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.setVerified(false);
        partner3.viewProfile();
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getAccountType();
        partner3.login("hi!", "partner");
        double double13 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
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
        partner3.login("hi!", "");
        java.lang.Class<?> wildcardClass17 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getID();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getAccountType();
        partner3.viewProfile();
        java.lang.String str11 = partner3.getID();
        java.lang.String str12 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        model.Partner partner3 = new model.Partner("", "", "partner");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getAccountType();
        java.lang.String str7 = partner3.getEmail();
        boolean boolean8 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        double double8 = partner3.getHourlyRate();
        java.lang.String str9 = partner3.getID();
        partner3.logout();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        partner3.logout();
        partner3.viewProfile();
        partner3.setVerified(true);
        java.lang.Class<?> wildcardClass9 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
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
        java.lang.String str18 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass19 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        java.lang.Class<?> wildcardClass7 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        model.Partner partner3 = new model.Partner("hi!", "partner", "partner");
        java.lang.String str4 = partner3.getID();
        partner3.setVerified(true);
        double double7 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass8 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
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
        java.lang.Class<?> wildcardClass16 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        model.Partner partner3 = new model.Partner("partner", "hi!", "");
        partner3.login("hi!", "hi!");
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
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
        java.lang.String str17 = partner3.getEmail();
        java.lang.Class<?> wildcardClass18 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        partner3.setVerified(false);
        partner3.setVerified(false);
        java.lang.String str11 = partner3.getPassword();
        java.lang.String str12 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        double double8 = partner3.getHourlyRate();
        partner3.logout();
        partner3.logout();
        partner3.login("partner", "partner");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        partner3.login("hi!", "hi!");
        java.lang.String str11 = partner3.getEmail();
        partner3.login("partner", "hi!");
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        model.Partner partner3 = new model.Partner("", "partner", "partner");
        partner3.viewProfile();
        partner3.viewProfile();
        java.lang.String str6 = partner3.getAccountType();
        java.lang.String str7 = partner3.getEmail();
        partner3.setVerified(false);
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(true);
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass13 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        boolean boolean9 = partner3.isVerified();
        java.lang.String str10 = partner3.getAccountType();
        partner3.setVerified(false);
        partner3.login("hi!", "hi!");
        java.lang.Class<?> wildcardClass16 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        model.Partner partner3 = new model.Partner("", "", "partner");
        java.lang.String str4 = partner3.getID();
        double double5 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass6 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 50.0d + "'", double5 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getAccountType();
        partner3.viewProfile();
        partner3.viewProfile();
        java.lang.String str12 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        model.Partner partner3 = new model.Partner("", "", "partner");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getAccountType();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getPassword();
        java.lang.Class<?> wildcardClass9 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        partner3.login("", "hi!");
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
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
        java.lang.Class<?> wildcardClass16 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "hi!");
        partner3.login("hi!", "partner");
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        partner3.viewProfile();
        partner3.setVerified(false);
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        model.Partner partner3 = new model.Partner("partner", "", "partner");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getPassword();
        java.lang.Class<?> wildcardClass9 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
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
        java.lang.Class<?> wildcardClass16 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getAccountType();
        java.lang.String str8 = partner3.getPassword();
        java.lang.Class<?> wildcardClass9 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        double double8 = partner3.getHourlyRate();
        boolean boolean9 = partner3.isVerified();
        partner3.setVerified(false);
        double double12 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass13 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getAccountType();
        java.lang.String str12 = partner3.getPassword();
        java.lang.String str13 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        partner3.setVerified(false);
        java.lang.String str11 = partner3.getEmail();
        java.lang.String str12 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        partner3.viewProfile();
        java.lang.String str9 = partner3.getID();
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getID();
        partner3.logout();
        partner3.logout();
        java.lang.String str11 = partner3.getPassword();
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.login("", "");
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getEmail();
        partner3.logout();
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
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
        java.lang.Class<?> wildcardClass16 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
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
        boolean boolean16 = partner3.isVerified();
        java.lang.String str17 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass18 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        double double10 = partner3.getHourlyRate();
        java.lang.String str11 = partner3.getID();
        java.lang.String str12 = partner3.getAccountType();
        boolean boolean13 = partner3.isVerified();
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getAccountType();
        java.lang.String str8 = partner3.getEmail();
        java.lang.String str9 = partner3.getEmail();
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getPassword();
        partner3.login("hi!", "hi!");
        boolean boolean11 = partner3.isVerified();
        java.lang.String str12 = partner3.getEmail();
        java.lang.String str13 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getPassword();
        double double7 = partner3.getHourlyRate();
        double double8 = partner3.getHourlyRate();
        double double9 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getID();
        partner3.logout();
        double double10 = partner3.getHourlyRate();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getEmail();
        partner3.viewProfile();
        partner3.setVerified(true);
        java.lang.String str9 = partner3.getPassword();
        partner3.setVerified(false);
        partner3.login("hi!", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        partner3.setVerified(true);
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        model.Partner partner3 = new model.Partner("hi!", "partner", "partner");
        partner3.setVerified(true);
        java.lang.Class<?> wildcardClass6 = partner3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
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
        java.lang.Class<?> wildcardClass19 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
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
        partner3.login("", "partner");
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
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
        java.lang.String str15 = partner3.getEmail();
        java.lang.String str16 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
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
        java.lang.Class<?> wildcardClass16 = partner3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getAccountType();
        java.lang.String str8 = partner3.getEmail();
        partner3.setVerified(true);
        boolean boolean11 = partner3.isVerified();
        partner3.login("hi!", "partner");
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getEmail();
        partner3.logout();
        java.lang.String str12 = partner3.getID();
        partner3.viewProfile();
        partner3.login("partner", "hi!");
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
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
        java.lang.String str20 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getPassword();
        partner3.setVerified(true);
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.login("", "partner");
        partner3.login("hi!", "hi!");
        java.lang.String str13 = partner3.getAccountType();
        java.lang.String str14 = partner3.getPassword();
        double double15 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
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
        java.lang.Class<?> wildcardClass18 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str8 = partner3.getAccountType();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.login("", "");
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getEmail();
        java.lang.String str9 = partner3.getAccountType();
        partner3.login("partner", "partner");
        java.lang.Class<?> wildcardClass13 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        model.Partner partner3 = new model.Partner("partner", "partner", "partner");
        java.lang.Class<?> wildcardClass4 = partner3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.viewProfile();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass6 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
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
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
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
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        boolean boolean8 = partner3.isVerified();
        java.lang.String str9 = partner3.getID();
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        double double8 = partner3.getHourlyRate();
        java.lang.String str9 = partner3.getEmail();
        java.lang.String str10 = partner3.getPassword();
        java.lang.String str11 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
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
        boolean boolean15 = partner3.isVerified();
        partner3.setVerified(true);
        java.lang.Class<?> wildcardClass18 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.login("", "");
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getPassword();
        double double12 = partner3.getHourlyRate();
        java.lang.String str13 = partner3.getID();
        java.lang.String str14 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        partner3.logout();
        partner3.viewProfile();
        java.lang.String str9 = partner3.getEmail();
        java.lang.String str10 = partner3.getEmail();
        partner3.logout();
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getEmail();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getPassword();
        partner3.viewProfile();
        java.lang.String str12 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass13 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
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
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "hi!");
        partner3.login("hi!", "partner");
        partner3.logout();
        java.lang.Class<?> wildcardClass8 = partner3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.login("", "");
        partner3.viewProfile();
        partner3.viewProfile();
        partner3.login("", "");
        java.lang.String str12 = partner3.getEmail();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        java.lang.Class<?> wildcardClass8 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
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
        boolean boolean16 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
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
        partner3.login("partner", "hi!");
        boolean boolean24 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "partner" + "'", str20, "partner");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getPassword();
        partner3.login("hi!", "hi!");
        java.lang.String str11 = partner3.getPassword();
        java.lang.String str12 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(false);
        boolean boolean12 = partner3.isVerified();
        java.lang.String str13 = partner3.getEmail();
        java.lang.String str14 = partner3.getID();
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        partner3.login("", "hi!");
        java.lang.Class<?> wildcardClass7 = partner3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
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
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str7 = partner3.getPassword();
        double double8 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass9 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
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
        java.lang.Class<?> wildcardClass20 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
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
        boolean boolean16 = partner3.isVerified();
        java.lang.Class<?> wildcardClass17 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        java.lang.String str4 = partner3.getEmail();
        partner3.logout();
        partner3.setVerified(true);
        java.lang.String str8 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getAccountType();
        partner3.setVerified(false);
        partner3.viewProfile();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass13 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getPassword();
        double double8 = partner3.getHourlyRate();
        partner3.setVerified(true);
        java.lang.Class<?> wildcardClass11 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        partner3.setVerified(true);
        boolean boolean10 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        double double8 = partner3.getHourlyRate();
        partner3.login("partner", "partner");
        partner3.login("partner", "");
        partner3.setVerified(true);
        java.lang.Class<?> wildcardClass17 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(false);
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        java.lang.String str9 = partner3.getID();
        partner3.login("hi!", "");
        partner3.logout();
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getEmail();
        java.lang.Class<?> wildcardClass8 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getAccountType();
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str12 = partner3.getAccountType();
        partner3.login("hi!", "partner");
        partner3.logout();
        java.lang.String str17 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        partner3.setVerified(false);
        partner3.setVerified(false);
        java.lang.String str11 = partner3.getPassword();
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
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
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
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
        java.lang.Class<?> wildcardClass20 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.login("hi!", "");
        java.lang.String str11 = partner3.getEmail();
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
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
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
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
        java.lang.Class<?> wildcardClass13 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
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
        partner3.setVerified(true);
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        partner3.setVerified(false);
        partner3.setVerified(false);
        java.lang.Class<?> wildcardClass11 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        double double8 = partner3.getHourlyRate();
        java.lang.String str9 = partner3.getEmail();
        java.lang.String str10 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass11 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        partner3.logout();
        partner3.logout();
        double double10 = partner3.getHourlyRate();
        partner3.setVerified(true);
        java.lang.Class<?> wildcardClass13 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        model.Partner partner3 = new model.Partner("", "partner", "");
        java.lang.String str4 = partner3.getPassword();
        java.lang.String str5 = partner3.getEmail();
        partner3.logout();
        partner3.login("partner", "");
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
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
        java.lang.String str16 = partner3.getPassword();
        java.lang.String str17 = partner3.getID();
        java.lang.String str18 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        partner3.viewProfile();
        java.lang.String str9 = partner3.getPassword();
        java.lang.String str10 = partner3.getPassword();
        java.lang.Class<?> wildcardClass11 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
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
        java.lang.Class<?> wildcardClass19 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
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
        partner3.login("partner", "");
        java.lang.Class<?> wildcardClass19 = partner3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        double double8 = partner3.getHourlyRate();
        partner3.logout();
        partner3.logout();
        partner3.setVerified(true);
        java.lang.Class<?> wildcardClass13 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
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
        partner3.setVerified(true);
        double double19 = partner3.getHourlyRate();
        java.lang.String str20 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 50.0d + "'", double19 == 50.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "partner" + "'", str20, "partner");
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
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
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
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
        partner3.login("hi!", "partner");
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getAccountType();
        partner3.setVerified(false);
        boolean boolean10 = partner3.isVerified();
        partner3.login("hi!", "");
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        model.Partner partner3 = new model.Partner("", "hi!", "hi!");
        partner3.login("partner", "partner");
        partner3.logout();
        java.lang.String str8 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.login("hi!", "");
        java.lang.String str11 = partner3.getPassword();
        java.lang.String str12 = partner3.getPassword();
        java.lang.Class<?> wildcardClass13 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass6 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
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
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str10 = partner3.getEmail();
        java.lang.String str11 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        partner3.setVerified(false);
        java.lang.String str11 = partner3.getEmail();
        java.lang.String str12 = partner3.getPassword();
        java.lang.String str13 = partner3.getID();
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str10 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass11 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        partner3.viewProfile();
        partner3.logout();
        java.lang.String str10 = partner3.getID();
        partner3.login("", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
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
        java.lang.Class<?> wildcardClass16 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
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
        boolean boolean16 = partner3.isVerified();
        java.lang.Class<?> wildcardClass17 = partner3.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getEmail();
        java.lang.String str11 = partner3.getPassword();
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getEmail();
        partner3.viewProfile();
        partner3.logout();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass9 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.login("hi!", "");
        java.lang.String str11 = partner3.getPassword();
        boolean boolean12 = partner3.isVerified();
        java.lang.String str13 = partner3.getEmail();
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getID();
        java.lang.Class<?> wildcardClass9 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
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
        java.lang.String str14 = partner3.getPassword();
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.logout();
        partner3.logout();
        java.lang.Class<?> wildcardClass6 = partner3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getEmail();
        partner3.setVerified(false);
        partner3.login("partner", "hi!");
        partner3.logout();
        java.lang.String str13 = partner3.getEmail();
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
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
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
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
        java.lang.Class<?> wildcardClass22 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 50.0d + "'", double18 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        boolean boolean9 = partner3.isVerified();
        partner3.setVerified(false);
        java.lang.String str12 = partner3.getPassword();
        java.lang.Class<?> wildcardClass13 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        java.lang.String str8 = partner3.getAccountType();
        partner3.logout();
        boolean boolean10 = partner3.isVerified();
        java.lang.Class<?> wildcardClass11 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getEmail();
        partner3.setVerified(false);
        partner3.login("partner", "hi!");
        partner3.logout();
        java.lang.Class<?> wildcardClass13 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
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
        partner3.login("", "");
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        model.Partner partner3 = new model.Partner("", "partner", "");
        partner3.viewProfile();
        boolean boolean5 = partner3.isVerified();
        partner3.setVerified(false);
        java.lang.Class<?> wildcardClass8 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
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
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.login("", "");
        partner3.viewProfile();
        partner3.viewProfile();
        partner3.login("", "");
        partner3.logout();
        java.lang.String str13 = partner3.getID();
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.setVerified(true);
        partner3.login("partner", "");
        java.lang.String str9 = partner3.getAccountType();
        java.lang.String str10 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
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
        java.lang.String str17 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        java.lang.String str8 = partner3.getAccountType();
        partner3.logout();
        partner3.logout();
        java.lang.String str11 = partner3.getAccountType();
        java.lang.String str12 = partner3.getEmail();
        double double13 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
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
        partner3.setVerified(true);
        java.lang.Class<?> wildcardClass20 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "partner" + "'", str17, "partner");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
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
        java.lang.String str14 = partner3.getEmail();
        double double15 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass16 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        partner3.viewProfile();
        partner3.login("", "partner");
        partner3.login("", "partner");
        java.lang.String str15 = partner3.getEmail();
        java.lang.String str16 = partner3.getEmail();
        java.lang.String str17 = partner3.getID();
        java.lang.Class<?> wildcardClass18 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        partner3.login("partner", "");
        java.lang.String str11 = partner3.getAccountType();
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
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
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getEmail();
        double double6 = partner3.getHourlyRate();
        partner3.viewProfile();
        java.lang.String str8 = partner3.getEmail();
        partner3.setVerified(false);
        java.lang.Class<?> wildcardClass11 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        partner3.setVerified(true);
        partner3.setVerified(true);
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.logout();
        java.lang.String str5 = partner3.getEmail();
        partner3.logout();
        partner3.login("", "partner");
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getAccountType();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(false);
        boolean boolean12 = partner3.isVerified();
        partner3.setVerified(true);
        boolean boolean15 = partner3.isVerified();
        java.lang.Class<?> wildcardClass16 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
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
        partner3.setVerified(false);
        java.lang.Class<?> wildcardClass18 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getAccountType();
        partner3.viewProfile();
        java.lang.String str9 = partner3.getAccountType();
        java.lang.String str10 = partner3.getPassword();
        double double11 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        partner3.logout();
        partner3.viewProfile();
        java.lang.String str9 = partner3.getEmail();
        boolean boolean10 = partner3.isVerified();
        java.lang.String str11 = partner3.getPassword();
        java.lang.String str12 = partner3.getID();
        partner3.viewProfile();
        java.lang.String str14 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        boolean boolean7 = partner3.isVerified();
        java.lang.String str8 = partner3.getID();
        double double9 = partner3.getHourlyRate();
        java.lang.String str10 = partner3.getPassword();
        partner3.login("", "hi!");
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.logout();
        java.lang.String str5 = partner3.getEmail();
        java.lang.String str6 = partner3.getAccountType();
        partner3.login("partner", "partner");
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
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
        java.lang.String str16 = partner3.getPassword();
        java.lang.Class<?> wildcardClass17 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.login("", "");
        double double7 = partner3.getHourlyRate();
        partner3.login("partner", "partner");
        java.lang.String str11 = partner3.getID();
        java.lang.String str12 = partner3.getAccountType();
        partner3.logout();
        partner3.setVerified(false);
        partner3.setVerified(true);
        java.lang.String str18 = partner3.getID();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
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
        java.lang.Class<?> wildcardClass18 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(false);
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str15 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass17 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getEmail();
        partner3.setVerified(false);
        boolean boolean13 = partner3.isVerified();
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.login("", "");
        partner3.login("partner", "partner");
        java.lang.String str13 = partner3.getAccountType();
        partner3.login("", "hi!");
        java.lang.Class<?> wildcardClass17 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.viewProfile();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getPassword();
        java.lang.Class<?> wildcardClass8 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        boolean boolean9 = partner3.isVerified();
        double double10 = partner3.getHourlyRate();
        java.lang.String str11 = partner3.getID();
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        model.Partner partner3 = new model.Partner("", "partner", "partner");
        double double4 = partner3.getHourlyRate();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        boolean boolean7 = partner3.isVerified();
        double double8 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass9 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 50.0d + "'", double4 == 50.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
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
        java.lang.Class<?> wildcardClass17 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        double double8 = partner3.getHourlyRate();
        partner3.viewProfile();
        java.lang.String str10 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
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
        java.lang.Class<?> wildcardClass19 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getAccountType();
        partner3.logout();
        boolean boolean10 = partner3.isVerified();
        partner3.login("", "hi!");
        double double14 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getPassword();
        partner3.login("", "partner");
        java.lang.String str11 = partner3.getAccountType();
        java.lang.String str12 = partner3.getEmail();
        java.lang.String str13 = partner3.getPassword();
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
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
        java.lang.Class<?> wildcardClass19 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
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
        java.lang.Class<?> wildcardClass16 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        partner3.setVerified(true);
        boolean boolean8 = partner3.isVerified();
        partner3.setVerified(false);
        java.lang.String str11 = partner3.getAccountType();
        double double12 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass13 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        partner3.setVerified(true);
        boolean boolean8 = partner3.isVerified();
        partner3.logout();
        partner3.viewProfile();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        partner3.logout();
        java.lang.String str8 = partner3.getID();
        java.lang.Class<?> wildcardClass9 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.login("", "");
        partner3.viewProfile();
        partner3.viewProfile();
        partner3.login("", "");
        partner3.logout();
        java.lang.String str13 = partner3.getID();
        boolean boolean14 = partner3.isVerified();
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getID();
        partner3.logout();
        partner3.logout();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
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
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.logout();
        java.lang.String str5 = partner3.getEmail();
        double double6 = partner3.getHourlyRate();
        partner3.setVerified(false);
        partner3.login("", "");
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getPassword();
        double double5 = partner3.getHourlyRate();
        double double6 = partner3.getHourlyRate();
        partner3.viewProfile();
        double double8 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 50.0d + "'", double5 == 50.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        java.lang.String str4 = partner3.getPassword();
        double double5 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 50.0d + "'", double5 == 50.0d);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
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
        boolean boolean18 = partner3.isVerified();
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        partner3.login("hi!", "");
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
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
        double double14 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
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
        java.lang.String str18 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        partner3.setVerified(false);
        boolean boolean7 = partner3.isVerified();
        java.lang.Class<?> wildcardClass8 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
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
        double double22 = partner3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "partner" + "'", str21, "partner");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 50.0d + "'", double22 == 50.0d);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
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
        partner3.setVerified(false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getEmail();
        partner3.logout();
        partner3.viewProfile();
        partner3.login("partner", "hi!");
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        partner3.logout();
        partner3.viewProfile();
        java.lang.String str9 = partner3.getEmail();
        boolean boolean10 = partner3.isVerified();
        java.lang.String str11 = partner3.getPassword();
        partner3.login("hi!", "hi!");
        double double15 = partner3.getHourlyRate();
        boolean boolean16 = partner3.isVerified();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 50.0d + "'", double15 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
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
        partner3.logout();
        java.lang.String str14 = partner3.getID();
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        partner3.setVerified(false);
        partner3.setVerified(true);
        partner3.viewProfile();
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getAccountType();
        java.lang.String str14 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        model.Partner partner3 = new model.Partner("partner", "hi!", "partner");
        boolean boolean4 = partner3.isVerified();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass6 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        partner3.setVerified(true);
        partner3.login("partner", "partner");
        java.lang.String str11 = partner3.getPassword();
        java.lang.String str12 = partner3.getEmail();
        java.lang.Class<?> wildcardClass13 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.setVerified(false);
        double double9 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 50.0d + "'", double9 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
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
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        model.Partner partner3 = new model.Partner("", "partner", "partner");
        partner3.setVerified(true);
        boolean boolean6 = partner3.isVerified();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
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
        java.lang.Class<?> wildcardClass17 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
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
        java.lang.Class<?> wildcardClass16 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        model.Partner partner3 = new model.Partner("", "", "partner");
        partner3.login("partner", "partner");
        double double7 = partner3.getHourlyRate();
        double double8 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass9 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getAccountType();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass11 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getPassword();
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.setVerified(true);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getID();
        double double8 = partner3.getHourlyRate();
        java.lang.String str9 = partner3.getEmail();
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        model.Partner partner3 = new model.Partner("", "partner", "");
        partner3.setVerified(true);
        partner3.login("", "hi!");
        partner3.viewProfile();
        java.lang.String str10 = partner3.getID();
        partner3.viewProfile();
        double double12 = partner3.getHourlyRate();
        boolean boolean13 = partner3.isVerified();
        boolean boolean14 = partner3.isVerified();
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str10 = partner3.getAccountType();
        double double11 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getID();
        partner3.viewProfile();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
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
        boolean boolean18 = partner3.isVerified();
        java.lang.String str19 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getID();
        partner3.setVerified(false);
        java.lang.Class<?> wildcardClass8 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
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
        partner3.viewProfile();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass17 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        java.lang.String str8 = partner3.getEmail();
        java.lang.Class<?> wildcardClass9 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getEmail();
        java.lang.String str11 = partner3.getPassword();
        java.lang.String str12 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass13 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "hi!");
        partner3.login("hi!", "partner");
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        partner3.viewProfile();
        boolean boolean10 = partner3.isVerified();
        java.lang.String str11 = partner3.getID();
        partner3.setVerified(false);
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getPassword();
        double double7 = partner3.getHourlyRate();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getID();
        java.lang.String str11 = partner3.getID();
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getID();
        partner3.setVerified(false);
        double double12 = partner3.getHourlyRate();
        partner3.setVerified(false);
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        double double8 = partner3.getHourlyRate();
        boolean boolean9 = partner3.isVerified();
        partner3.setVerified(false);
        double double12 = partner3.getHourlyRate();
        java.lang.String str13 = partner3.getEmail();
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        partner3.viewProfile();
        partner3.logout();
        partner3.viewProfile();
        java.lang.String str11 = partner3.getEmail();
        partner3.login("", "partner");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        double double10 = partner3.getHourlyRate();
        java.lang.String str11 = partner3.getID();
        java.lang.String str12 = partner3.getEmail();
        partner3.logout();
        double double14 = partner3.getHourlyRate();
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getAccountType();
        partner3.logout();
        java.lang.String str8 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str10 = partner3.getID();
        boolean boolean11 = partner3.isVerified();
        partner3.setVerified(false);
        java.lang.String str14 = partner3.getEmail();
        partner3.setVerified(false);
        java.lang.Class<?> wildcardClass17 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.logout();
        java.lang.String str5 = partner3.getEmail();
        double double6 = partner3.getHourlyRate();
        boolean boolean7 = partner3.isVerified();
        java.lang.String str8 = partner3.getEmail();
        java.lang.Class<?> wildcardClass9 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str9 = partner3.getPassword();
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        java.lang.String str8 = partner3.getID();
        java.lang.String str9 = partner3.getPassword();
        java.lang.String str10 = partner3.getPassword();
        partner3.logout();
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.setVerified(true);
        double double6 = partner3.getHourlyRate();
        partner3.login("partner", "partner");
        java.lang.Class<?> wildcardClass10 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
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
        java.lang.String str13 = partner3.getPassword();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getPassword();
        java.lang.String str7 = partner3.getAccountType();
        partner3.setVerified(false);
        boolean boolean10 = partner3.isVerified();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        double double8 = partner3.getHourlyRate();
        boolean boolean9 = partner3.isVerified();
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getAccountType();
        double double12 = partner3.getHourlyRate();
        double double13 = partner3.getHourlyRate();
        partner3.setVerified(true);
        boolean boolean16 = partner3.isVerified();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getPassword();
        java.lang.String str8 = partner3.getPassword();
        java.lang.String str9 = partner3.getAccountType();
        partner3.login("hi!", "partner");
        java.lang.Class<?> wildcardClass13 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
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
        partner3.viewProfile();
        boolean boolean16 = partner3.isVerified();
        double double17 = partner3.getHourlyRate();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass19 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getAccountType();
        java.lang.String str11 = partner3.getPassword();
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
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
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 50.0d + "'", double10 == 50.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
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
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
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
        java.lang.String str19 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        model.Partner partner3 = new model.Partner("", "", "partner");
        java.lang.String str4 = partner3.getID();
        double double5 = partner3.getHourlyRate();
        double double6 = partner3.getHourlyRate();
        partner3.setVerified(false);
        partner3.logout();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 50.0d + "'", double5 == 50.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        double double6 = partner3.getHourlyRate();
        java.lang.String str7 = partner3.getID();
        java.lang.String str8 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
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
        partner3.viewProfile();
        boolean boolean16 = partner3.isVerified();
        double double17 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass18 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 50.0d + "'", double17 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        double double8 = partner3.getHourlyRate();
        boolean boolean9 = partner3.isVerified();
        partner3.setVerified(false);
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        model.Partner partner3 = new model.Partner("", "partner", "");
        partner3.setVerified(true);
        double double6 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass7 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 50.0d + "'", double6 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        boolean boolean9 = partner3.isVerified();
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        partner3.setVerified(false);
        java.lang.String str9 = partner3.getID();
        partner3.login("", "hi!");
        partner3.setVerified(true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        double double7 = partner3.getHourlyRate();
        boolean boolean8 = partner3.isVerified();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getAccountType();
        partner3.login("hi!", "hi!");
        partner3.viewProfile();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
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
        java.lang.Class<?> wildcardClass19 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "partner" + "'", str12, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        partner3.setVerified(false);
        partner3.setVerified(false);
        java.lang.String str11 = partner3.getAccountType();
        partner3.logout();
        partner3.login("", "hi!");
        java.lang.Class<?> wildcardClass16 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.setVerified(true);
        java.lang.String str10 = partner3.getEmail();
        partner3.setVerified(true);
        partner3.logout();
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        partner3.viewProfile();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getID();
        java.lang.String str10 = partner3.getAccountType();
        partner3.setVerified(false);
        partner3.logout();
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
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
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 50.0d + "'", double12 == 50.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getPassword();
        partner3.logout();
        partner3.login("", "");
        java.lang.Class<?> wildcardClass13 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        boolean boolean5 = partner3.isVerified();
        java.lang.String str6 = partner3.getID();
        java.lang.String str7 = partner3.getID();
        partner3.login("hi!", "");
        partner3.login("hi!", "");
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        java.lang.String str8 = partner3.getAccountType();
        java.lang.String str9 = partner3.getAccountType();
        java.lang.String str10 = partner3.getID();
        java.lang.Class<?> wildcardClass11 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "partner" + "'", str8, "partner");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        model.Partner partner3 = new model.Partner("", "partner", "");
        java.lang.String str4 = partner3.getPassword();
        java.lang.String str5 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass7 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.setVerified(false);
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getAccountType();
        partner3.viewProfile();
        partner3.viewProfile();
        partner3.setVerified(true);
        boolean boolean12 = partner3.isVerified();
        java.lang.String str13 = partner3.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "partner" + "'", str7, "partner");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.String str12 = partner3.getEmail();
        java.lang.Class<?> wildcardClass13 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        model.Partner partner3 = new model.Partner("hi!", "hi!", "");
        partner3.setVerified(false);
        partner3.viewProfile();
        partner3.setVerified(false);
        partner3.viewProfile();
        partner3.viewProfile();
        partner3.logout();
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
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
        partner3.login("", "partner");
        java.lang.String str18 = partner3.getAccountType();
        java.lang.Class<?> wildcardClass19 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "partner" + "'", str14, "partner");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
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
        java.lang.Class<?> wildcardClass20 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
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
        java.lang.Class<?> wildcardClass14 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
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
        partner3.logout();
        partner3.login("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getEmail();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.login("hi!", "partner");
        java.lang.String str11 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass13 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
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
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
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
        java.lang.Class<?> wildcardClass13 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.viewProfile();
        partner3.viewProfile();
        partner3.logout();
        java.lang.String str10 = partner3.getPassword();
        double double11 = partner3.getHourlyRate();
        java.lang.Class<?> wildcardClass12 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 50.0d + "'", double11 == 50.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        java.lang.String str10 = partner3.getEmail();
        partner3.viewProfile();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass13 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
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
        java.lang.String str18 = partner3.getAccountType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 50.0d + "'", double13 == 50.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "partner" + "'", str18, "partner");
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        model.Partner partner3 = new model.Partner("hi!", "partner", "");
        partner3.logout();
        partner3.logout();
        java.lang.String str6 = partner3.getEmail();
        java.lang.Class<?> wildcardClass7 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        partner3.logout();
        partner3.login("hi!", "hi!");
        partner3.viewProfile();
        partner3.login("", "partner");
        partner3.login("", "partner");
        java.lang.String str15 = partner3.getEmail();
        java.lang.String str16 = partner3.getEmail();
        partner3.login("", "");
        java.lang.Class<?> wildcardClass20 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        java.lang.String str6 = partner3.getPassword();
        partner3.setVerified(false);
        partner3.setVerified(true);
        partner3.viewProfile();
        java.lang.String str12 = partner3.getID();
        java.lang.String str13 = partner3.getAccountType();
        partner3.viewProfile();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "partner" + "'", str13, "partner");
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
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
        java.lang.String str22 = partner3.getAccountType();
        partner3.logout();
        java.lang.Class<?> wildcardClass24 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "partner" + "'", str11, "partner");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 50.0d + "'", double16 == 50.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "partner" + "'", str22, "partner");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        partner3.logout();
        partner3.setVerified(false);
        partner3.viewProfile();
        partner3.login("hi!", "");
        boolean boolean14 = partner3.isVerified();
        partner3.logout();
        java.lang.String str16 = partner3.getID();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        model.Partner partner3 = new model.Partner("", "", "");
        java.lang.Class<?> wildcardClass4 = partner3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        model.Partner partner3 = new model.Partner("hi!", "", "hi!");
        java.lang.String str4 = partner3.getAccountType();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getAccountType();
        java.lang.String str7 = partner3.getPassword();
        java.lang.Class<?> wildcardClass8 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "partner" + "'", str4, "partner");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "partner" + "'", str6, "partner");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
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
        java.lang.Class<?> wildcardClass15 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 50.0d + "'", double7 == 50.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        java.lang.String str4 = partner3.getID();
        java.lang.String str5 = partner3.getAccountType();
        boolean boolean6 = partner3.isVerified();
        java.lang.Class<?> wildcardClass7 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "partner" + "'", str5, "partner");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
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
        boolean boolean15 = partner3.isVerified();
        java.lang.String str16 = partner3.getPassword();
        java.lang.Class<?> wildcardClass17 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 50.0d + "'", double14 == 50.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        java.lang.String str7 = partner3.getEmail();
        java.lang.String str8 = partner3.getEmail();
        java.lang.String str9 = partner3.getAccountType();
        partner3.logout();
        java.lang.Class<?> wildcardClass11 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "partner" + "'", str9, "partner");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
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
        java.lang.String str16 = partner3.getAccountType();
        partner3.logout();
        java.lang.Class<?> wildcardClass18 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 50.0d + "'", double8 == 50.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "partner" + "'", str10, "partner");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "partner" + "'", str16, "partner");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        model.Partner partner3 = new model.Partner("", "", "hi!");
        partner3.logout();
        java.lang.String str5 = partner3.getID();
        java.lang.String str6 = partner3.getEmail();
        partner3.viewProfile();
        java.lang.Class<?> wildcardClass8 = partner3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
}

