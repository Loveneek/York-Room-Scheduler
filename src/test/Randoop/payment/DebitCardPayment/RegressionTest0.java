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
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        java.lang.Class<?> wildcardClass1 = debitCardPayment0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        java.lang.Class<?> wildcardClass4 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        java.lang.Class<?> wildcardClass4 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (short) 10, user5);
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(1.0d, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 0.0f, user5);
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10L, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        java.lang.Class<?> wildcardClass4 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '4', user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 100, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0L, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10L, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1.0f), user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 0, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) -1, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10.0f, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((-1.0d), user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(1.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1.0f), user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(1.0d, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 0, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 1, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 0, user5);
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 0, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 1, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '#', user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0.0f, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 0, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100.0f, user5);
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10L, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 1, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0L, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 10, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 100, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10, user5);
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(10.0d, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 10, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(0.0d, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1L, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 100, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) ' ', user5);
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 100, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 100, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 100L, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 100, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) ' ', user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) ' ', user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) -1, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) ' ', user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '#', user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) ' ', user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0.0f, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) ' ', user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100.0f, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) ' ', user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) -1, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(10.0d, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1L, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 100, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 10, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0.0f, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1.0f, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(10.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (-1L), user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(0.0d, user26);
        java.lang.Class<?> wildcardClass28 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 10, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(1.0d, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0L, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 1, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100L, user5);
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 0, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) -1, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 0, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1), user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 1, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 100L, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10.0f, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 10, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 0, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10.0f, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 10, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(100.0d, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1.0f, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0.0f, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) '#', user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 1, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(10.0d, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1.0f), user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 'a', user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 10, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 0, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 100, user23);
        java.lang.Class<?> wildcardClass25 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((-1.0d), user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10L, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) '#', user5);
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(10.0d, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 1.0f, user23);
        java.lang.Class<?> wildcardClass25 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) -1, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1L), user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1), user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 0L, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((-1.0d), user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) ' ', user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 100L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 1, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (-1.0f), user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1L, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(1.0d, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (-1L), user5);
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 10, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 10, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 1, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) '#', user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) '4', user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 100, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 10.0f, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(10.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) -1, user23);
        java.lang.Class<?> wildcardClass25 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        java.lang.Class<?> wildcardClass4 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 100L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) -1, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((-1.0d), user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 1, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 100, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) ' ', user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(1.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(10.0d, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 10, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 0, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 100, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) 10, user26);
        java.lang.Class<?> wildcardClass28 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (-1L), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((-1.0d), user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) ' ', user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) -1, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 10, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 100, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(100.0d, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (-1L), user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(100.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((-1.0d), user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) ' ', user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1L, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 10, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 0, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 100, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) '#', user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (-1), user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(0.0d, user23);
        java.lang.Class<?> wildcardClass25 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 100L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) ' ', user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 1, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) ' ', user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10.0f, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 10, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(10.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((-1.0d), user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '4', user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 100, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10L, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 10, user23);
        java.lang.Class<?> wildcardClass25 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) '#', user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) -1, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 100, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 0, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 10, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 1, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 0, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 1, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) -1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 100, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) 1, user26);
        java.lang.Class<?> wildcardClass28 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(1.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 0, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) '#', user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(100.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 10.0f, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 0L, user26);
        java.lang.Class<?> wildcardClass28 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 0, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10L, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 100L, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 100.0f, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) ' ', user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 0.0f, user26);
        java.lang.Class<?> wildcardClass28 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 'a', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 'a', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 1, user23);
        java.lang.Class<?> wildcardClass25 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(1.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 0, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) '#', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 10, user23);
        java.lang.Class<?> wildcardClass25 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 10, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) '#', user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (-1L), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 1, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 0, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 100.0f, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 100.0f, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1.0f), user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 0, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(10.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(1.0d, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (-1L), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(10.0d, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 0.0f, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 0, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(10.0d, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(10.0d, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) '#', user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) -1, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 0, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1), user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(10.0d, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1.0f), user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 0, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(10.0d, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10.0f, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(100.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 100, user23);
        java.lang.Class<?> wildcardClass25 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((-1.0d), user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(100.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 10.0f, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 0L, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 10L, user29);
        java.lang.Class<?> wildcardClass31 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '#', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 100, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 'a', user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1L, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 1L, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 0, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 10, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 100, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(10.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (-1L), user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(0.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) 1, user29);
        java.lang.Class<?> wildcardClass31 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 1, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(1.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(1.0d, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (-1), user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1.0f), user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10.0f, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 0, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(1.0d, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 100, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 100L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 100, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) '4', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 1, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1L), user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 100L, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 0L, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 0, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 100, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 0, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 100.0f, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 10, user23);
        java.lang.Class<?> wildcardClass25 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1L), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (-1), user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(1.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (-1L), user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (-1), user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1.0f, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 100L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 100, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 1, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 'a', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (-1L), user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((-1.0d), user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(100.0d, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 100L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 0, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) ' ', user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) ' ', user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((-1.0d), user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 100L, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(1.0d, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(1.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) -1, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 1L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 10L, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 0, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) -1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 'a', user23);
        java.lang.Class<?> wildcardClass25 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 1, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 'a', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 'a', user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 0, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 'a', user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (-1.0f), user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 10, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 'a', user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (-1), user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 0, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (-1L), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1.0f), user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 100.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1), user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '#', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 100, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(10.0d, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (-1), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 10, user23);
        java.lang.Class<?> wildcardClass25 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 10, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 100, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 10, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 1, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) -1, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 100L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) -1, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 0, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100.0f, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 10, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 100L, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 0, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 10, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 1L, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) '#', user26);
        java.lang.Class<?> wildcardClass28 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 10, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1), user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 100, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(0.0d, user23);
        java.lang.Class<?> wildcardClass25 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10L, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (-1L), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 1, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 0, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((-1.0d), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(1.0d, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1), user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(0.0d, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 0, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 0L, user23);
        java.lang.Class<?> wildcardClass25 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1.0f), user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 10, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 0, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(10.0d, user23);
        java.lang.Class<?> wildcardClass25 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) '4', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 'a', user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '#', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 100, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 100, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 10L, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 0.0f, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(1.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 0, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (-1), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 10, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 10, user26);
        java.lang.Class<?> wildcardClass28 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 1, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) -1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 100, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) 1, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay(0.0d, user29);
        java.lang.Class<?> wildcardClass31 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(100.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 10.0f, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 0L, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) 10, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (byte) 0, user32);
        java.lang.Class<?> wildcardClass34 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (-1), user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1), user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 0L, user23);
        java.lang.Class<?> wildcardClass25 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0.0f, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(10.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 10, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 0, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '#', user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 100.0f, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(0.0d, user23);
        java.lang.Class<?> wildcardClass25 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 10, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((-1.0d), user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 0, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10L, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 100L, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 0, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) -1, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) ' ', user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) ' ', user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 0, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 10, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 1L, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 0, user23);
        java.lang.Class<?> wildcardClass25 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '4', user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 0.0f, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 0.0f, user23);
        java.lang.Class<?> wildcardClass25 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 10.0f, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10.0f, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (-1L), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1.0f), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 100, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(100.0d, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) '4', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 1, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 0, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 1, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 0, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 0, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((-1.0d), user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 10, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '#', user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10.0f, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0.0f, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '#', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 100, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 'a', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 1, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1L), user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 10, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 100L, user23);
        java.lang.Class<?> wildcardClass25 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(1.0d, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(100.0d, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 0, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1), user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 10, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) '4', user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 1, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 0, user23);
        java.lang.Class<?> wildcardClass25 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(10.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) ' ', user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1), user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 10, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (-1), user23);
        java.lang.Class<?> wildcardClass25 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1L), user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) '4', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 'a', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 10L, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 100L, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 1L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 10L, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 0.0f, user23);
        java.lang.Class<?> wildcardClass25 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0.0f, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (-1), user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 1, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(10.0d, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 10, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1L), user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) '4', user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 100, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 1, user26);
        java.lang.Class<?> wildcardClass28 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(1.0d, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 'a', user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '#', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 100, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 10, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (-1.0f), user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 100.0f, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 0, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 100, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) -1, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 1, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) -1, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 10, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) '#', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) ' ', user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 10, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) '#', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 1, user23);
        java.lang.Class<?> wildcardClass25 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((-1.0d), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 10, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 0, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 100, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 0.0f, user26);
        java.lang.Class<?> wildcardClass28 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) -1, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100.0f, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '4', user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((-1.0d), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 10, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 100.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1.0f), user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 10, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 100L, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) -1, user26);
        java.lang.Class<?> wildcardClass28 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 1.0f, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 'a', user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 'a', user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) '#', user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) ' ', user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) ' ', user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 10, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1.0f), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 0L, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 100, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10, user14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((-1.0d), user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 10, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 1L, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 0, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 10, user26);
        java.lang.Class<?> wildcardClass28 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(1.0d, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 10, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(10.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 1, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay(0.0d, user32);
        java.lang.Class<?> wildcardClass34 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 0, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 0, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 100, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) '#', user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) '4', user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) '4', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 1, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (-1L), user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1), user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 100, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 0, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 10, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 0, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(10.0d, user23);
        java.lang.Class<?> wildcardClass25 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 100L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) -1, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (-1), user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1), user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 1, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) ' ', user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) ' ', user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(10.0d, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 1, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(100.0d, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 0, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) -1, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 100.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 'a', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 100, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1.0f, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0.0f, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1), user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(1.0d, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 100, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(1.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) -1, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10L, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(10.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (-1L), user23);
        java.lang.Class<?> wildcardClass25 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1.0f, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(1.0d, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 100.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 100, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1.0f), user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (-1L), user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '4', user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) '#', user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1L, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 0.0f, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 0, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((-1.0d), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 100, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) -1, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 100, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1.0f), user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) ' ', user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1.0f, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) '4', user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1.0f, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '#', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 100, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 'a', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (-1.0f), user23);
        java.lang.Class<?> wildcardClass25 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((-1.0d), user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1L), user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1.0f, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 1.0f, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10.0f, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 10.0f, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 0.0f, user23);
        java.lang.Class<?> wildcardClass25 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 1, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1), user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 0, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(10.0d, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(1.0d, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 10, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(10.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 1, user29);
        java.lang.Class<?> wildcardClass31 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0.0f, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 10, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 10, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (-1.0f), user23);
        java.lang.Class<?> wildcardClass25 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) -1, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 'a', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (-1L), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 0, user23);
        java.lang.Class<?> wildcardClass25 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(1.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 0L, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 0, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 0L, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(0.0d, user26);
        java.lang.Class<?> wildcardClass28 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 10, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 10L, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1), user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(1.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) -1, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 100, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) '#', user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) '4', user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((-1.0d), user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 1, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100L, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 0, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1), user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(100.0d, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0.0f, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) '#', user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 10, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (-1.0f), user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 'a', user26);
        java.lang.Class<?> wildcardClass28 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) '#', user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (-1L), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 0, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) -1, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (-1), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 10, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) '#', user26);
        java.lang.Class<?> wildcardClass28 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1L), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) -1, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(0.0d, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) ' ', user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) ' ', user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 1, user23);
        java.lang.Class<?> wildcardClass25 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) -1, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1L), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 1.0f, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 100, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) ' ', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 0, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1L), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) -1, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1.0f, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 0, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 10, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(10.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(0.0d, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) -1, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (-1.0f), user26);
        java.lang.Class<?> wildcardClass28 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(10.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (-1), user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 100, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 1.0f, user17);
        java.lang.Class<?> wildcardClass19 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(1.0d, user23);
        java.lang.Class<?> wildcardClass25 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(1.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) -1, user20);
        java.lang.Class<?> wildcardClass22 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 0, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(100.0d, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }
}

