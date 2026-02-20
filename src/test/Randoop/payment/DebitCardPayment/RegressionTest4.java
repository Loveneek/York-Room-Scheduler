import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test02001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02001");
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
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 100, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) '4', user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((-1.0d), user26);
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
    public void test02002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02002");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
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
    public void test02003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02003");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 0, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(10.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1.0f), user14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test02004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02004");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
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
    public void test02005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02005");
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
    public void test02006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02006");
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
    public void test02007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02007");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) '#', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 10, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 1L, user23);
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
    public void test02008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02008");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) -1, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 10, user20);
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
    public void test02009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02009");
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
        boolean boolean27 = debitCardPayment0.pay((double) 100, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay(10.0d, user29);
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
    public void test02010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02010");
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
    public void test02011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02011");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) -1, user23);
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
    public void test02012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02012");
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
        boolean boolean24 = debitCardPayment0.pay((double) 100.0f, user23);
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
    public void test02013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02013");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) -1, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) '4', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 1L, user23);
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
    public void test02014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02014");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 10L, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(100.0d, user23);
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
    public void test02015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02015");
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
        boolean boolean15 = debitCardPayment0.pay((double) 10L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 0, user17);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test02016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02016");
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
    public void test02017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02017");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 100, user17);
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
    public void test02018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02018");
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
        boolean boolean21 = debitCardPayment0.pay((double) (-1), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) '4', user23);
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
    public void test02019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02019");
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
        boolean boolean21 = debitCardPayment0.pay((double) '#', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 100, user23);
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
    public void test02020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02020");
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
        boolean boolean15 = debitCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) -1, user17);
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
    public void test02021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02021");
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
        boolean boolean18 = debitCardPayment0.pay((double) (short) 10, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 1, user20);
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
    public void test02022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02022");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (-1.0f), user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 1.0f, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay(10.0d, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 0, user32);
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
    public void test02023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02023");
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
    public void test02024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02024");
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
    public void test02025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02025");
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
        boolean boolean18 = debitCardPayment0.pay((double) 100.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 0, user20);
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
    public void test02026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02026");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 'a', user8);
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
    public void test02027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02027");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(1.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) -1, user26);
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
    public void test02028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02028");
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
        boolean boolean15 = debitCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 0, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 10, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(100.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (byte) -1, user29);
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
    public void test02029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02029");
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
        boolean boolean24 = debitCardPayment0.pay((double) 100.0f, user23);
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
    public void test02030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02030");
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
        boolean boolean18 = debitCardPayment0.pay((double) 100.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(100.0d, user20);
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
    public void test02031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02031");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 10L, user23);
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
    public void test02032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02032");
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
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 10.0f, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) (short) 10, user35);
        java.lang.Class<?> wildcardClass37 = debitCardPayment0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test02033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02033");
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
        boolean boolean18 = debitCardPayment0.pay((double) '4', user17);
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
    public void test02034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02034");
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
        boolean boolean27 = debitCardPayment0.pay((double) 10L, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) '#', user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (short) 0, user32);
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
    public void test02035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02035");
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
        boolean boolean15 = debitCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
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
    public void test02036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02036");
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
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 10, user23);
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
    public void test02037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02037");
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
    public void test02038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02038");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 0L, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02039");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 10, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 0, user11);
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
    public void test02040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02040");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (-1L), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (-1.0f), user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) 1, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 1.0f, user29);
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
    public void test02041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02041");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10L, user8);
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
    public void test02042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02042");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) ' ', user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(0.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 1, user29);
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
    }

    @Test
    public void test02043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02043");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test02044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02044");
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
        boolean boolean24 = debitCardPayment0.pay((double) 10L, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 0L, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (-1L), user29);
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
    public void test02045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02045");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(10.0d, user23);
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
    public void test02046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02046");
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
        boolean boolean21 = debitCardPayment0.pay((double) '4', user20);
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
    public void test02047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02047");
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
    public void test02048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02048");
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
        boolean boolean21 = debitCardPayment0.pay((double) (short) 100, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 10, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 10L, user26);
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
    public void test02049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02049");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 100, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(1.0d, user17);
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
    public void test02050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02050");
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
    public void test02051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02051");
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
    public void test02052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02052");
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
    public void test02053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02053");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (-1), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (-1.0f), user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 10.0f, user26);
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
    public void test02054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02054");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((-1.0d), user23);
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
    public void test02055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02055");
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
        boolean boolean15 = debitCardPayment0.pay((double) (short) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 1, user20);
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
    public void test02056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02056");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) '#', user17);
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
    public void test02057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02057");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) '#', user23);
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
    public void test02058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02058");
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
        boolean boolean21 = debitCardPayment0.pay((double) (-1.0f), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 100L, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (-1L), user26);
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
    public void test02059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02059");
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
        boolean boolean18 = debitCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 100.0f, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) ' ', user26);
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
    public void test02060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02060");
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
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 10L, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay(0.0d, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay(0.0d, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) (-1), user35);
        java.lang.Class<?> wildcardClass37 = debitCardPayment0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test02061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02061");
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
    public void test02062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02062");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 'a', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 10, user23);
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
    public void test02063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02063");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 10, user20);
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
    public void test02064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02064");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 0.0f, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 0, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 1, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) '#', user20);
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
    public void test02065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02065");
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
    public void test02066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02066");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (-1), user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) ' ', user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 0, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) 0.0f, user35);
        java.lang.Class<?> wildcardClass37 = debitCardPayment0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test02067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02067");
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
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) '4', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 10.0f, user23);
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
    public void test02068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02068");
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
    public void test02069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02069");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 0, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) 1, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 'a', user29);
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
    public void test02070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02070");
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
        boolean boolean18 = debitCardPayment0.pay((double) 10.0f, user17);
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
    public void test02071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02071");
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
    public void test02072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02072");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) -1, user17);
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
    public void test02073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02073");
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
        boolean boolean18 = debitCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 'a', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 100, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 100, user26);
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
    public void test02074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02074");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 10, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 100, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 100, user26);
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
    public void test02075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02075");
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
        boolean boolean15 = debitCardPayment0.pay((double) ' ', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100L, user17);
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
    public void test02076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02076");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 10.0f, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(0.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) 100, user29);
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
    public void test02077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02077");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 1, user17);
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
    public void test02078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02078");
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
    public void test02079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02079");
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
        boolean boolean18 = debitCardPayment0.pay((double) 0.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 10, user20);
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
    public void test02080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02080");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 100L, user23);
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
    public void test02081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02081");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 'a', user23);
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
    public void test02082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02082");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 10, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 100, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 100, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 1.0f, user29);
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
    public void test02083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02083");
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
    public void test02084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02084");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 10, user20);
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
    public void test02085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02085");
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
        boolean boolean15 = debitCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100.0f, user17);
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
    public void test02086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02086");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) '#', user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) '4', user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) '#', user14);
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
    public void test02087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02087");
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
        boolean boolean24 = debitCardPayment0.pay((double) 100.0f, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) '#', user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (byte) 0, user29);
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
    public void test02088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02088");
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
    public void test02089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02089");
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
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 0.0f, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 10L, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 1, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 1, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay(0.0d, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) 100.0f, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) (-1.0f), user38);
        java.lang.Class<?> wildcardClass40 = debitCardPayment0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test02090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02090");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 0, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(0.0d, user23);
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
    public void test02091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02091");
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
        boolean boolean21 = debitCardPayment0.pay((double) '4', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) -1, user26);
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
    public void test02092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02092");
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
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 0.0f, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((-1.0d), user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 1, user26);
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
    public void test02093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02093");
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
        boolean boolean18 = debitCardPayment0.pay((double) '#', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) '#', user20);
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
    public void test02094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02094");
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
    public void test02095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02095");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 10.0f, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 0, user23);
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
    public void test02096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02096");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 'a', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) -1, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((-1.0d), user26);
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
    public void test02097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02097");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1.0f, user8);
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
    public void test02098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02098");
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
        boolean boolean24 = debitCardPayment0.pay((double) ' ', user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 1, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 100, user29);
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
    public void test02099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02099");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 10L, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(100.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 100.0f, user26);
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
    public void test02100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02100");
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
        boolean boolean24 = debitCardPayment0.pay(1.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(0.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (-1.0f), user29);
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
    public void test02101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02101");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 1, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (-1), user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) '#', user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (byte) 100, user32);
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
    public void test02102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02102");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) '#', user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) '4', user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1L), user14);
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
    public void test02103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02103");
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
    public void test02104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02104");
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
    public void test02105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02105");
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
        boolean boolean15 = debitCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 0, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 10, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 0, user26);
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
    public void test02106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02106");
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
        boolean boolean15 = debitCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 0, user17);
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
    public void test02107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02107");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
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
    public void test02108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02108");
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
        boolean boolean15 = debitCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 0, user17);
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
    public void test02109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02109");
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
        boolean boolean24 = debitCardPayment0.pay((double) 10L, user23);
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
    public void test02110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02110");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(1.0d, user14);
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
    public void test02111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02111");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 10, user23);
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
    public void test02112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02112");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) '#', user17);
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
    public void test02113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02113");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 10, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02114");
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
        boolean boolean27 = debitCardPayment0.pay((double) 100, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay(10.0d, user29);
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
    public void test02115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02115");
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
        boolean boolean27 = debitCardPayment0.pay((double) 100, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 10, user29);
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
    public void test02116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02116");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
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
    public void test02117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02117");
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
    public void test02118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02118");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 0, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1.0f), user11);
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
    public void test02119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02119");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(10.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10, user17);
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
    public void test02120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02120");
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
    public void test02121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02121");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 100, user23);
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
    public void test02122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02122");
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
        boolean boolean18 = debitCardPayment0.pay(100.0d, user17);
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
    public void test02123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02123");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 10.0f, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(0.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 100, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 100L, user32);
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
    public void test02124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02124");
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
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) 'a', user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay(100.0d, user38);
        model.User user41 = null;
        boolean boolean42 = debitCardPayment0.pay((double) (short) 10, user41);
        java.lang.Class<?> wildcardClass43 = debitCardPayment0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test02125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02125");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 100, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100, user17);
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
    public void test02126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02126");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 100.0f, user20);
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
    public void test02127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02127");
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
    public void test02128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02128");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(1.0d, user17);
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
    public void test02129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02129");
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
        boolean boolean15 = debitCardPayment0.pay((double) 100L, user14);
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
    public void test02130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02130");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
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
    public void test02131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02131");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (-1), user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) ' ', user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (byte) 100, user32);
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
    public void test02132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02132");
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
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 'a', user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 0.0f, user32);
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
    public void test02133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02133");
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
    public void test02134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02134");
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
        boolean boolean21 = debitCardPayment0.pay((double) 0.0f, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 100.0f, user23);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test02135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02135");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (-1), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (-1.0f), user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(0.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 'a', user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 100L, user32);
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
    public void test02136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02136");
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
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 10.0f, user32);
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
    public void test02137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02137");
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
    public void test02138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02138");
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
        boolean boolean24 = debitCardPayment0.pay((double) '#', user23);
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
    public void test02139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02139");
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
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 10, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) '#', user26);
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
    public void test02140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02140");
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
    public void test02141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02141");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 1, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) 0, user26);
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
    public void test02142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02142");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) -1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 100, user23);
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
    public void test02143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02143");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 'a', user23);
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
    public void test02144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02144");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) '#', user17);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test02145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02145");
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
    public void test02146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02146");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(100.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) -1, user20);
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
    public void test02147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02147");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 100, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 10, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (byte) 100, user32);
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
    }

    @Test
    public void test02148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02148");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test02149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02149");
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
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 1, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 'a', user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (-1L), user29);
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
    public void test02150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02150");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 1, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 1, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) 0, user29);
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
    public void test02151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02151");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(100.0d, user17);
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
    public void test02152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02152");
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
    public void test02153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02153");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(10.0d, user23);
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
    public void test02154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02154");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 1, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 1, user26);
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
    public void test02155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02155");
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
        boolean boolean21 = debitCardPayment0.pay((double) (short) 10, user20);
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
    public void test02156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02156");
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
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 1, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) 0, user26);
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
    public void test02157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02157");
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
    public void test02158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02158");
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
        boolean boolean18 = debitCardPayment0.pay((double) 10, user17);
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
    public void test02159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02159");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (-1.0f), user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 0L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) ' ', user20);
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
    public void test02160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02160");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 1L, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) -1, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (byte) 1, user29);
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
    public void test02161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02161");
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
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (-1), user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (-1), user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) (byte) 1, user35);
        java.lang.Class<?> wildcardClass37 = debitCardPayment0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test02162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02162");
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
        boolean boolean24 = debitCardPayment0.pay((double) 100.0f, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(100.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay(100.0d, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) ' ', user32);
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
    public void test02163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02163");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 100, user20);
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
    public void test02164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02164");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 0.0f, user20);
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
    public void test02165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02165");
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
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 1, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 10.0f, user29);
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
    public void test02166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02166");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (-1L), user20);
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
    public void test02167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02167");
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
    public void test02168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02168");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((-1.0d), user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 0, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay(1.0d, user29);
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
    public void test02169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02169");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (-1L), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10, user14);
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
    public void test02170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02170");
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
        boolean boolean15 = debitCardPayment0.pay((double) '#', user14);
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
    public void test02171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02171");
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
    public void test02172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02172");
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
    public void test02173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02173");
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
    public void test02174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02174");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(1.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) -1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) -1, user14);
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
    public void test02175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02175");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 0L, user17);
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
    public void test02176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02176");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 1, user14);
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
    public void test02177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02177");
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
    public void test02178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02178");
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
    public void test02179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02179");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) ' ', user17);
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
    public void test02180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02180");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 10, user20);
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
    public void test02181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02181");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 0, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) -1, user26);
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
    public void test02182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02182");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) '4', user17);
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
    public void test02183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02183");
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
        boolean boolean15 = debitCardPayment0.pay((double) 100L, user14);
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
    public void test02184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02184");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 'a', user17);
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
    public void test02185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02185");
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
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (-1), user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (-1), user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) '#', user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) (short) 100, user38);
        java.lang.Class<?> wildcardClass40 = debitCardPayment0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test02186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02186");
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
        boolean boolean18 = debitCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 'a', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(100.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (-1), user26);
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
    public void test02187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02187");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 10, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 10L, user23);
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
    public void test02188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02188");
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
        boolean boolean21 = debitCardPayment0.pay((double) '4', user20);
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
    public void test02189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02189");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 100.0f, user11);
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
    public void test02190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02190");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(1.0d, user11);
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
    public void test02191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02191");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 'a', user8);
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
    public void test02192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02192");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) '#', user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(100.0d, user17);
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
    public void test02193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02193");
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
        boolean boolean27 = debitCardPayment0.pay((double) 10L, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (-1), user29);
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
    public void test02194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02194");
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
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 10, user17);
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
    public void test02195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02195");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) '#', user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 100L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 1L, user17);
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
    public void test02196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02196");
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
        boolean boolean21 = debitCardPayment0.pay((double) 1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 10, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) 0, user26);
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
    public void test02197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02197");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) '#', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 'a', user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 'a', user26);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test02198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02198");
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
        boolean boolean18 = debitCardPayment0.pay((double) 10, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) '#', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (-1), user23);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test02199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02199");
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
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
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
    public void test02200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02200");
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
        boolean boolean15 = debitCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
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
    public void test02201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02201");
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
        boolean boolean18 = debitCardPayment0.pay((double) '4', user17);
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
    public void test02202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02202");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 0, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) '#', user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 'a', user29);
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
    public void test02203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02203");
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
        boolean boolean18 = debitCardPayment0.pay((double) 100.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(100.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(0.0d, user23);
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
    public void test02204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02204");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 10.0f, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 1, user26);
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
    public void test02205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02205");
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
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 'a', user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) ' ', user32);
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
    }

    @Test
    public void test02206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02206");
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
    public void test02207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02207");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 100, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((-1.0d), user17);
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
    public void test02208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02208");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10.0f, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02209");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(10.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 10, user20);
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
    public void test02210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02210");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 10.0f, user20);
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
    public void test02211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02211");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 100, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 1, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) -1, user20);
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
    public void test02212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02212");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 1, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 1, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 0.0f, user29);
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
    public void test02213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02213");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) '#', user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 'a', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 10, user20);
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
    public void test02214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02214");
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
        boolean boolean21 = debitCardPayment0.pay((double) 10, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 10.0f, user23);
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
    public void test02215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02215");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(1.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (-1L), user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 1.0f, user26);
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
    public void test02216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02216");
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
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 100, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) '#', user23);
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
    public void test02217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02217");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 100, user17);
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
    public void test02218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02218");
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
        boolean boolean15 = debitCardPayment0.pay(0.0d, user14);
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
    public void test02219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02219");
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
        boolean boolean15 = debitCardPayment0.pay((double) 10L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 10, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 0L, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) ' ', user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (byte) 100, user29);
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
    }

    @Test
    public void test02220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02220");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) '#', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 1, user23);
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
    public void test02221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02221");
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
        boolean boolean18 = debitCardPayment0.pay(100.0d, user17);
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
    public void test02222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02222");
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
    public void test02223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02223");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 1, user20);
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
    public void test02224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02224");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(10.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 100, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((-1.0d), user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) '4', user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) 100, user35);
        java.lang.Class<?> wildcardClass37 = debitCardPayment0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test02225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02225");
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
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 'a', user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (byte) 10, user32);
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
    public void test02226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02226");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(10.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 100, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) 100, user29);
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
    public void test02227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02227");
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
        boolean boolean30 = debitCardPayment0.pay((double) (short) 1, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (short) 10, user32);
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
    public void test02228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02228");
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
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02229");
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
    public void test02230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02230");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 10.0f, user20);
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
    public void test02231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02231");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 100, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 0L, user23);
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
    public void test02232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02232");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (-1.0f), user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 1.0f, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay(10.0d, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) ' ', user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) 0, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) 'a', user38);
        model.User user41 = null;
        boolean boolean42 = debitCardPayment0.pay((double) 100.0f, user41);
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test02233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02233");
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
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 0.0f, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 10L, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 1, user26);
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
    public void test02234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02234");
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
    public void test02235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02235");
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
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((-1.0d), user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 10L, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 100L, user32);
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
    public void test02236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02236");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 100.0f, user23);
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
    public void test02237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02237");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (-1L), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (-1.0f), user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) 1, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 1.0f, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 10.0f, user32);
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
    public void test02238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02238");
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
        boolean boolean18 = debitCardPayment0.pay((double) 1, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(1.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((-1.0d), user23);
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
    public void test02239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02239");
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
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay(100.0d, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (short) 100, user32);
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
    public void test02240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02240");
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
        boolean boolean15 = debitCardPayment0.pay((double) 10.0f, user14);
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
    public void test02241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02241");
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
        boolean boolean21 = debitCardPayment0.pay((double) 1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (-1L), user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 0, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 100L, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 1, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) '#', user35);
        java.lang.Class<?> wildcardClass37 = debitCardPayment0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test02242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02242");
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
        boolean boolean24 = debitCardPayment0.pay((double) 100.0f, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 0L, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 10.0f, user29);
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
    public void test02243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02243");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 0L, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 0, user23);
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
    public void test02244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02244");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((-1.0d), user14);
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
    public void test02245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02245");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(1.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0L, user11);
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
    public void test02246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02246");
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
    public void test02247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02247");
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
        boolean boolean27 = debitCardPayment0.pay((double) (byte) 0, user26);
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
    public void test02248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02248");
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
    public void test02249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02249");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 0, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(1.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) 10, user29);
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
    public void test02250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02250");
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
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (-1), user29);
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
    public void test02251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02251");
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
        boolean boolean18 = debitCardPayment0.pay((double) '#', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) '#', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (-1), user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 1, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) '4', user29);
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
    public void test02252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02252");
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
    public void test02253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02253");
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
    public void test02254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02254");
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
    public void test02255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02255");
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
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(1.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 0, user29);
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
    public void test02256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02256");
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
        boolean boolean18 = debitCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (-1), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 100.0f, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 0, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 1.0f, user29);
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
    public void test02257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02257");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) '#', user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) '4', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 10, user17);
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
    public void test02258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02258");
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
        boolean boolean27 = debitCardPayment0.pay(0.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 10.0f, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 10L, user32);
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
    public void test02259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02259");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 10, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 1, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 100, user26);
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
    public void test02260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02260");
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
    public void test02261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02261");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 1, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 1, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 0, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay(10.0d, user29);
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
    public void test02262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02262");
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
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) -1, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) 0, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay(10.0d, user32);
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
    public void test02263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02263");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (-1), user8);
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
    public void test02264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02264");
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
    public void test02265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02265");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (-1.0f), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 100L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 100, user14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test02266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02266");
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
        boolean boolean18 = debitCardPayment0.pay((-1.0d), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 10, user20);
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
    public void test02267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02267");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) '#', user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) '4', user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1L), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 0.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 10, user20);
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
    public void test02268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02268");
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
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 1.0f, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (byte) 10, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 1.0f, user32);
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
    public void test02269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02269");
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
        boolean boolean27 = debitCardPayment0.pay((double) '#', user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) 0, user29);
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
    public void test02270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02270");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 100L, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(1.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) -1, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (-1), user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) 100.0f, user35);
        java.lang.Class<?> wildcardClass37 = debitCardPayment0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test02271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02271");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(1.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) -1, user11);
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
    public void test02272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02272");
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
        boolean boolean15 = debitCardPayment0.pay((double) 100L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 0, user17);
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
    public void test02273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02273");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1), user11);
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
    public void test02274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02274");
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
        boolean boolean15 = debitCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100, user17);
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
    public void test02275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02275");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (-1.0f), user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 100.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 100, user14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test02276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02276");
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
    public void test02277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02277");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (-1.0f), user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10, user14);
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
    public void test02278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02278");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) -1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 1, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) '#', user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (byte) -1, user29);
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
    }

    @Test
    public void test02279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02279");
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
        boolean boolean27 = debitCardPayment0.pay((double) 100, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) ' ', user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (short) 1, user32);
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
    public void test02280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02280");
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
    public void test02281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02281");
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
        boolean boolean27 = debitCardPayment0.pay((-1.0d), user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (byte) 100, user29);
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
    public void test02282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02282");
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
        boolean boolean15 = debitCardPayment0.pay((double) ' ', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 0.0f, user20);
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
    public void test02283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02283");
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
        boolean boolean15 = debitCardPayment0.pay((double) (short) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 1.0f, user17);
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
    public void test02284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02284");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) '#', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 10, user23);
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
    public void test02285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02285");
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
    public void test02286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02286");
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
        boolean boolean18 = debitCardPayment0.pay((double) (short) 10, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 10L, user23);
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
    public void test02287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02287");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) '#', user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(0.0d, user14);
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
    public void test02288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02288");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(10.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 100, user26);
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
    public void test02289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02289");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '4', user11);
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
    public void test02290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02290");
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
        boolean boolean27 = debitCardPayment0.pay((double) 10L, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) '#', user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (short) 100, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) (byte) 10, user35);
        java.lang.Class<?> wildcardClass37 = debitCardPayment0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test02291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02291");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(100.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 1L, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 1, user26);
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
    public void test02292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02292");
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
        boolean boolean21 = debitCardPayment0.pay((double) 0, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(10.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 10L, user26);
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
    public void test02293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02293");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 'a', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 100, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 10, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(0.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) ' ', user29);
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
    public void test02294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02294");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 0.0f, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 0, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 0.0f, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 10, user23);
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
    public void test02295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02295");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(1.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 0, user26);
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
    public void test02296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02296");
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
        boolean boolean27 = debitCardPayment0.pay((double) (short) -1, user26);
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
    public void test02297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02297");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 10, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 100, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(10.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay(100.0d, user29);
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
    public void test02298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02298");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(1.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((-1.0d), user14);
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
    public void test02299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02299");
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
    public void test02300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02300");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1.0f), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 10, user20);
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
    public void test02301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02301");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) '#', user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 10, user14);
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
    public void test02302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02302");
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
        boolean boolean15 = debitCardPayment0.pay(1.0d, user14);
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
    public void test02303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02303");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(1.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((-1.0d), user14);
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
    public void test02304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02304");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(10.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 10, user14);
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
    public void test02305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02305");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) -1, user20);
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
    public void test02306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02306");
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
    public void test02307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02307");
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
    public void test02308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02308");
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
        boolean boolean15 = debitCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 'a', user20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test02309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02309");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 1L, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(100.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 'a', user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 100.0f, user29);
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
    public void test02310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02310");
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
        boolean boolean15 = debitCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 0, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((-1.0d), user20);
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
    public void test02311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02311");
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
    public void test02312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02312");
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
        boolean boolean21 = debitCardPayment0.pay((double) '4', user20);
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
    public void test02313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02313");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 100, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02314");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (-1.0f), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) '4', user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 10, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 10L, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (short) 1, user32);
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
    }

    @Test
    public void test02315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02315");
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
        boolean boolean21 = debitCardPayment0.pay(1.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) '4', user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 0, user26);
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
    public void test02316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02316");
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
        boolean boolean21 = debitCardPayment0.pay((double) 1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 100, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 100, user26);
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
    public void test02317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02317");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) '#', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 0, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(1.0d, user26);
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
    public void test02318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02318");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (-1.0f), user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 1.0f, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay(10.0d, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) ' ', user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) 0, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) 'a', user38);
        java.lang.Class<?> wildcardClass40 = debitCardPayment0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test02319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02319");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 100, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) -1, user23);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test02320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02320");
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
    public void test02321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02321");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 0, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((-1.0d), user14);
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
    public void test02322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02322");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 1, user11);
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
    public void test02323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02323");
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
        boolean boolean18 = debitCardPayment0.pay((double) (byte) -1, user17);
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
    public void test02324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02324");
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
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 10, user14);
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
    public void test02325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02325");
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
        boolean boolean27 = debitCardPayment0.pay(0.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (-1), user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (byte) -1, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) 1L, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) 1, user38);
        java.lang.Class<?> wildcardClass40 = debitCardPayment0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test02326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02326");
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
    public void test02327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02327");
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
    public void test02328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02328");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 0, user17);
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
    public void test02329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02329");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
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
    public void test02330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02330");
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
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 100, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) '#', user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(10.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (byte) -1, user29);
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
    public void test02331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02331");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) ' ', user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 1, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) '4', user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (short) -1, user32);
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
    public void test02332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02332");
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
        boolean boolean15 = debitCardPayment0.pay((double) 0, user14);
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
    public void test02333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02333");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (-1.0f), user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10L, user14);
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
    public void test02334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02334");
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
    public void test02335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02335");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(100.0d, user17);
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
    public void test02336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02336");
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
    public void test02337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02337");
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
        boolean boolean18 = debitCardPayment0.pay((double) 1L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 100, user20);
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
    public void test02338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02338");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 1L, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 0, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) ' ', user26);
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
    public void test02339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02339");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 100, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 0L, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 10, user26);
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
    public void test02340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02340");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (-1L), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 0, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(0.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 10, user29);
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
    public void test02341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02341");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 0, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 100, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 0, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 0, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) ' ', user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (byte) -1, user32);
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
    public void test02342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02342");
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
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 0.0f, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 10L, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) '#', user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 10.0f, user29);
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
    public void test02343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02343");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 0, user23);
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
    public void test02344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02344");
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
    public void test02345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02345");
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
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) 1, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 1.0f, user32);
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
    public void test02346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02346");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 'a', user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(10.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 1L, user29);
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
    public void test02347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02347");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (-1.0f), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) '4', user23);
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
    public void test02348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02348");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 1L, user17);
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
    public void test02349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02349");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) '#', user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 0, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02350");
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
        boolean boolean21 = debitCardPayment0.pay((double) 1, user20);
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
    public void test02351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02351");
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
        boolean boolean21 = debitCardPayment0.pay((double) (short) 10, user20);
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
    public void test02352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02352");
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
        boolean boolean30 = debitCardPayment0.pay((double) 100.0f, user29);
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
    public void test02353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02353");
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
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 1, user14);
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
    public void test02354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02354");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 0, user17);
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
    public void test02355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02355");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) -1, user17);
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
    public void test02356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02356");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '#', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(10.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 1, user20);
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
    public void test02357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02357");
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
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 1, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 0, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) ' ', user29);
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
    public void test02358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02358");
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
        boolean boolean18 = debitCardPayment0.pay((double) 10, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) '4', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) ' ', user23);
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
    public void test02359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02359");
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
        boolean boolean21 = debitCardPayment0.pay((double) 10.0f, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) -1, user23);
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
    public void test02360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02360");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (-1.0f), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) '4', user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(100.0d, user26);
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
    public void test02361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02361");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 1, user14);
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
    public void test02362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02362");
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
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 100.0f, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay(100.0d, user32);
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
    public void test02363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02363");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
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
    public void test02364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02364");
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
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 100, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (byte) 0, user29);
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
    public void test02365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02365");
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
        boolean boolean15 = debitCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 0, user17);
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
    public void test02366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02366");
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
        boolean boolean21 = debitCardPayment0.pay((double) 0, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(10.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) -1, user26);
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
    public void test02367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02367");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 100, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(0.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) -1, user29);
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
    public void test02368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02368");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 0, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 10, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) 0, user26);
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
    public void test02369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02369");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) '4', user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02370");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(1.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(0.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 0, user29);
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
    public void test02371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02371");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((-1.0d), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 0.0f, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(100.0d, user23);
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
    public void test02372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02372");
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
        boolean boolean18 = debitCardPayment0.pay((double) '#', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) '#', user20);
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
    public void test02373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02373");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(1.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 1, user14);
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
    public void test02374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02374");
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
        boolean boolean18 = debitCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 'a', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 100.0f, user23);
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
    public void test02375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02375");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 100.0f, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 10, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 0, user26);
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
    public void test02376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02376");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 10, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 100, user17);
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
    public void test02377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02377");
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
    public void test02378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02378");
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
    public void test02379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02379");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(1.0d, user11);
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
    public void test02380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02380");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((-1.0d), user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (-1.0f), user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 0.0f, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay(1.0d, user32);
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
    public void test02381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02381");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
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
    public void test02382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02382");
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
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 0.0f, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 1, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) (-1L), user35);
        java.lang.Class<?> wildcardClass37 = debitCardPayment0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test02383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02383");
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
    public void test02384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02384");
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
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 1, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((-1.0d), user26);
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
    public void test02385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02385");
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
    public void test02386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02386");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 0, user11);
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
    public void test02387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02387");
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
        boolean boolean18 = debitCardPayment0.pay(1.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((-1.0d), user20);
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
    public void test02388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02388");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(10.0d, user11);
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
    public void test02389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02389");
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
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) 'a', user35);
        java.lang.Class<?> wildcardClass37 = debitCardPayment0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test02390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02390");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 10, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 100, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 100.0f, user26);
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
    public void test02391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02391");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) '#', user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 10, user17);
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
    public void test02392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02392");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 1, user20);
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
    public void test02393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02393");
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
        boolean boolean15 = debitCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
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
    public void test02394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02394");
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
    public void test02395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02395");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 'a', user8);
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
    public void test02396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02396");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 0, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(10.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 100.0f, user20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test02397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02397");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 1L, user17);
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
    public void test02398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02398");
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
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 10, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) '#', user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 100.0f, user29);
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
    public void test02399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02399");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) -1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 100, user23);
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
    public void test02400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02400");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 'a', user20);
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
    public void test02401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02401");
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
    public void test02402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02402");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 0.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 'a', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 1, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 10.0f, user26);
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
    public void test02403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02403");
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
        boolean boolean18 = debitCardPayment0.pay((double) 10, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) '4', user20);
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
    public void test02404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02404");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) '#', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 1, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) -1, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (byte) 100, user29);
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
    public void test02405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02405");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 1.0f, user20);
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
    public void test02406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02406");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((-1.0d), user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (-1.0f), user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) -1, user29);
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
    public void test02407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02407");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (-1.0f), user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 1.0f, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay(0.0d, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((-1.0d), user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay(0.0d, user35);
        java.lang.Class<?> wildcardClass37 = debitCardPayment0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test02408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02408");
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
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) 0, user29);
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
    public void test02409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02409");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) -1, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 1.0f, user26);
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
    public void test02410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02410");
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
        boolean boolean18 = debitCardPayment0.pay((-1.0d), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 0.0f, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((-1.0d), user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 0, user26);
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
    public void test02411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02411");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 100, user23);
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
    public void test02412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02412");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 100, user14);
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
    public void test02413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02413");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) '#', user8);
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
    public void test02414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02414");
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
    public void test02415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02415");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((-1.0d), user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 10, user11);
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
    public void test02416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02416");
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
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 0.0f, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 10L, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 1, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 1, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay(0.0d, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) 100.0f, user35);
        java.lang.Class<?> wildcardClass37 = debitCardPayment0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test02417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02417");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) -1, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 100L, user29);
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
    public void test02418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02418");
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
        boolean boolean15 = debitCardPayment0.pay(100.0d, user14);
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
    public void test02419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02419");
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
    public void test02420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02420");
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
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 1, user20);
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
    public void test02421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02421");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
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
    public void test02422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02422");
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
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 10, user14);
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
    public void test02423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02423");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1.0f), user11);
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
    public void test02424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02424");
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
        boolean boolean15 = debitCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10, user17);
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
    public void test02425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02425");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (-1.0f), user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10, user14);
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
    public void test02426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02426");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) -1, user17);
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
    public void test02427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02427");
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
        boolean boolean18 = debitCardPayment0.pay((double) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 100, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 1.0f, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) '4', user26);
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
    public void test02428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02428");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 0.0f, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
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
    public void test02429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02429");
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
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 0.0f, user20);
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
    public void test02430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02430");
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
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 10L, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) 0.0f, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay(0.0d, user38);
        java.lang.Class<?> wildcardClass40 = debitCardPayment0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test02431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02431");
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
        boolean boolean18 = debitCardPayment0.pay((double) (short) 1, user17);
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
    public void test02432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02432");
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
        boolean boolean24 = debitCardPayment0.pay((double) ' ', user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 1, user26);
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
    public void test02433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02433");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) -1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 0, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 10, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 10, user29);
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
    public void test02434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02434");
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
        boolean boolean18 = debitCardPayment0.pay((double) '4', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 100.0f, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 0L, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay(10.0d, user29);
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
    public void test02435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02435");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) ' ', user20);
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
    public void test02436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02436");
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
    public void test02437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02437");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 10L, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) '#', user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 100.0f, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) 10, user29);
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
    public void test02438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02438");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) '#', user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 100L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 1L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 1, user20);
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
    public void test02439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02439");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) ' ', user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test02440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02440");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 0, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 10, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) 0, user26);
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
    public void test02441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02441");
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
        boolean boolean18 = debitCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 10, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (-1), user26);
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
    public void test02442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02442");
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
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 10, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 0, user29);
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
    public void test02443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02443");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((-1.0d), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1, user14);
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
    public void test02444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02444");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) '#', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 1, user20);
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
    public void test02445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02445");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 0, user17);
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
    public void test02446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02446");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
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
    public void test02447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02447");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 100, user14);
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
    public void test02448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02448");
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
        boolean boolean27 = debitCardPayment0.pay((double) 100, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) '#', user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 1.0f, user32);
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
    public void test02449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02449");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
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
    public void test02450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02450");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(100.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 1.0f, user23);
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
    public void test02451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02451");
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
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 10L, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) 0.0f, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) (-1L), user38);
        java.lang.Class<?> wildcardClass40 = debitCardPayment0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test02452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02452");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 1, user20);
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
    public void test02453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02453");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 0, user8);
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
    public void test02454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02454");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (-1.0f), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 0, user14);
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
    public void test02455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02455");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 1, user20);
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
    public void test02456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02456");
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
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 0.0f, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (-1), user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (byte) 1, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) (short) 100, user35);
        java.lang.Class<?> wildcardClass37 = debitCardPayment0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test02457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02457");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (-1.0f), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) -1, user11);
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
    public void test02458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02458");
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
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (-1), user29);
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
    public void test02459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02459");
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
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 10.0f, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (byte) 10, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay(10.0d, user35);
        java.lang.Class<?> wildcardClass37 = debitCardPayment0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test02460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02460");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 1L, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (-1.0f), user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (-1.0f), user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 10, user29);
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
    public void test02461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02461");
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
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test02462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02462");
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
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 10.0f, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (byte) 10, user32);
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
    public void test02463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02463");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) '#', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 0, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 100, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 0.0f, user29);
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
    public void test02464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02464");
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
        boolean boolean27 = debitCardPayment0.pay((double) 0, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 100.0f, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (-1), user32);
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
    public void test02465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02465");
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
        boolean boolean24 = debitCardPayment0.pay(1.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 1.0f, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay(0.0d, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (byte) 1, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay(0.0d, user35);
        java.lang.Class<?> wildcardClass37 = debitCardPayment0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test02466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02466");
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
    public void test02467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02467");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) '#', user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (-1L), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10.0f, user17);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test02468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02468");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 10, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
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
    public void test02469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02469");
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
        boolean boolean21 = debitCardPayment0.pay((double) 0, user20);
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
    public void test02470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02470");
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
        boolean boolean18 = debitCardPayment0.pay((double) 1.0f, user17);
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
    public void test02471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02471");
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
    public void test02472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02472");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 10, user20);
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
    public void test02473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02473");
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
        boolean boolean15 = debitCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 0, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 10, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(100.0d, user26);
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
    public void test02474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02474");
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
        boolean boolean21 = debitCardPayment0.pay((double) 10, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 1, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 0.0f, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (byte) 10, user29);
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
    public void test02475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02475");
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
    public void test02476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02476");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(10.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 1, user14);
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
    public void test02477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02477");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(10.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) ' ', user11);
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
    public void test02478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02478");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 0, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 10, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 0, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) -1, user29);
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
    public void test02479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02479");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (-1.0f), user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 0L, user17);
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
    public void test02480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02480");
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
        boolean boolean27 = debitCardPayment0.pay((double) 10L, user26);
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
    public void test02481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02481");
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
        boolean boolean18 = debitCardPayment0.pay((double) 1L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) '#', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 1L, user23);
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
    public void test02482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02482");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) '#', user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 100L, user14);
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
    public void test02483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02483");
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
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 0, user14);
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
    public void test02484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02484");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) '#', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) ' ', user23);
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
    public void test02485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02485");
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
        boolean boolean18 = debitCardPayment0.pay((double) 0, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 10.0f, user20);
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
    public void test02486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02486");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 0, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 1, user14);
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
    public void test02487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02487");
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
        boolean boolean18 = debitCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) '#', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 100, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay(0.0d, user29);
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
    }

    @Test
    public void test02488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02488");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 10, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 10, user20);
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
    public void test02489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02489");
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
        boolean boolean18 = debitCardPayment0.pay(1.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(10.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 100, user23);
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
    public void test02490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02490");
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
        boolean boolean18 = debitCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 10, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 0, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 0L, user29);
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
    public void test02491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02491");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(1.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 10.0f, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (byte) 1, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (byte) 1, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) (byte) 100, user35);
        java.lang.Class<?> wildcardClass37 = debitCardPayment0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test02492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02492");
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
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 10, user14);
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
    public void test02493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02493");
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
        boolean boolean18 = debitCardPayment0.pay((double) 10.0f, user17);
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
    public void test02494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02494");
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
        boolean boolean21 = debitCardPayment0.pay((double) (-1L), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 100, user23);
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
    public void test02495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02495");
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
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((-1.0d), user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (-1.0f), user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (short) 1, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay(100.0d, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) 100, user38);
        java.lang.Class<?> wildcardClass40 = debitCardPayment0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test02496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02496");
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
        boolean boolean18 = debitCardPayment0.pay((double) 1, user17);
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
    public void test02497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02497");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 0, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 10, user11);
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
    public void test02498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02498");
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
        boolean boolean15 = debitCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 0, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 1L, user23);
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
    public void test02499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02499");
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
    public void test02500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test02500");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 0.0f, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 0, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 0.0f, user20);
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
}

