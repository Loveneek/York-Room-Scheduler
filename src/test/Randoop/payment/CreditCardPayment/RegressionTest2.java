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
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1.0f, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01002");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 10, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01003");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(100.0d, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01004");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 'a', user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01005");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 10L, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) '#', user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay(100.0d, user32);
        java.lang.Class<?> wildcardClass34 = creditCardPayment0.getClass();
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
    public void test01006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01006");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(100.0d, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01007");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 10, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100.0f, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(100.0d, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay(100.0d, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (byte) -1, user32);
        java.lang.Class<?> wildcardClass34 = creditCardPayment0.getClass();
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
    public void test01008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01008");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '4', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(1.0d, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01009");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((-1.0d), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01010");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1.0f), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0.0f, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01011");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1.0f), user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01012");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10L, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01013");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 100, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(0.0d, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 1L, user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
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
    public void test01014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01014");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1.0f), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(0.0d, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01015");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(1.0d, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01016");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1L, user8);
        java.lang.Class<?> wildcardClass10 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01017");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 10, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 100, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01018");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100L, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01019");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) '#', user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 'a', user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 1, user32);
        java.lang.Class<?> wildcardClass34 = creditCardPayment0.getClass();
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
    public void test01020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01020");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) '4', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01021");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1.0f), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100L, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01022");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) -1, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01023");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (-1L), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1.0f), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(0.0d, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01024");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) -1, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01025");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        java.lang.Class<?> wildcardClass7 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test01026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01026");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0.0f, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (-1), user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (-1), user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) '#', user35);
        java.lang.Class<?> wildcardClass37 = creditCardPayment0.getClass();
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
    public void test01027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01027");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 0, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1), user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01028");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(10.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1L), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(0.0d, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (short) 1, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 10L, user32);
        java.lang.Class<?> wildcardClass34 = creditCardPayment0.getClass();
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
    public void test01029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01029");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01030");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1.0f), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) '4', user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(100.0d, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01031");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01032");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) -1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) '#', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(100.0d, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01033");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(10.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1L), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 100, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01034");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) '#', user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (short) 100, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01035");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((-1.0d), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) -1, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01036");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((-1.0d), user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01037");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) -1, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01038");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) '#', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0.0f, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01039");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100L, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) -1, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (-1), user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
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
    public void test01040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01040");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) '4', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 10, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01041");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) '#', user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01042");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01043");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 0L, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(0.0d, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 100L, user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
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
    public void test01044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01044");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) -1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 10, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01045");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(10.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 1, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01046");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100L, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01047");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) '#', user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) -1, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01048");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(1.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100L, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01049");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 'a', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 'a', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 10, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01050");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 100L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01051");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 0.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0.0f, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01052");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 1, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) '4', user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01053");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 'a', user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01054");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(100.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10.0f, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(0.0d, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01055");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(1.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100L, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01056");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((-1.0d), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01057");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) ' ', user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01058");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 1, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01059");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01060");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) ' ', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01061");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(10.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1L), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) '#', user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay(100.0d, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (byte) 10, user32);
        java.lang.Class<?> wildcardClass34 = creditCardPayment0.getClass();
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
    public void test01062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01062");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01063");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(100.0d, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01064");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 100, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) 0, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01065");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(100.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10.0f, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0L, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 100.0f, user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
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
    public void test01066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01066");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 100L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) -1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) '#', user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01067");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(1.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 0, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01068");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 100, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01069");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10.0f, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(0.0d, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01070");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01071");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(1.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1L), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 1, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01072");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((-1.0d), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 10, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01073");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01074");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 10, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01075");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((-1.0d), user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01076");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((-1.0d), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 1, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01077");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) -1, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01078");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) ' ', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 10, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01079");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(10.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1.0f), user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01080");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) -1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) -1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 1, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) '#', user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01081");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1L), user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01082");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 0, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01083");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0L, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01084");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) -1, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01085");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((-1.0d), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 10, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01086");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1.0f), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 1, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01087");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1), user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01088");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01089");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 0, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01090");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01091");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01092");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(1.0d, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01093");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1.0f), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 1, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) 100, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01094");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100L, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01095");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1L, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01096");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((-1.0d), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 10, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) '4', user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01097");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 1, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01098");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        java.lang.Class<?> wildcardClass10 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01099");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 10, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(10.0d, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 0.0f, user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
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
    public void test01100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01100");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '4', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 1, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01101");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((-1.0d), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(1.0d, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01102");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(1.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 100, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01103");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) '#', user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 1L, user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
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
    public void test01104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01104");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((-1.0d), user8);
        java.lang.Class<?> wildcardClass10 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01105");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01106");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(10.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 100, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01107");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) ' ', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 10, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1L), user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01108");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(10.0d, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01109");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100L, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01110");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(100.0d, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01111");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 10, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0.0f, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) '4', user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
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
    public void test01112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01112");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01113");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01114");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (-1.0f), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 0L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) '#', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01115");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 0, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01116");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01117");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) '#', user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 'a', user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
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
    public void test01118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01118");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 100, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01119");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) ' ', user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01120");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) -1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) '4', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) '#', user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01121");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1L), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) -1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) '#', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 0, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01122");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) '4', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 10, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 1, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) '#', user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
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
    public void test01123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01123");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 1, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01124");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 10, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100.0f, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(100.0d, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay(100.0d, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 10, user32);
        java.lang.Class<?> wildcardClass34 = creditCardPayment0.getClass();
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
    public void test01125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01125");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '4', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100L, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01126");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01127");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(100.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 100, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01128");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1.0f), user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01129");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 'a', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) -1, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01130");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) '#', user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 1, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 0, user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
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
    public void test01131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01131");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((-1.0d), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(1.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 1, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01132");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1.0f), user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01133");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '4', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) -1, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01134");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(1.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((-1.0d), user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01135");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(10.0d, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01136");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 0.0f, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01137");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(10.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1L), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 100, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (short) 0, user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
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
    public void test01138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01138");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 0, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((-1.0d), user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (-1.0f), user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
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
    public void test01139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01139");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(10.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) '4', user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01140");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((-1.0d), user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01141");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(100.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01142");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '#', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 100, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01143");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 100, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01144");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 10, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(1.0d, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (byte) 100, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 10L, user32);
        java.lang.Class<?> wildcardClass34 = creditCardPayment0.getClass();
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
    public void test01145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01145");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((-1.0d), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 10, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10L, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01146");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) -1, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 100L, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (-1L), user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
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
    public void test01147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01147");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(1.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 100, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 10, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01148");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) ' ', user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) ' ', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 0, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01149");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01150");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 0, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01151");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) '4', user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01152");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 10, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 10L, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (byte) 100, user32);
        java.lang.Class<?> wildcardClass34 = creditCardPayment0.getClass();
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
    public void test01153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01153");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '#', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1L), user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01154");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(10.0d, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01155");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((-1.0d), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01156");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) -1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((-1.0d), user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01157");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((-1.0d), user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01158");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) ' ', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01159");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1L), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 100.0f, user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
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
    public void test01160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01160");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 1, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01161");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 10L, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay(0.0d, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay(0.0d, user32);
        java.lang.Class<?> wildcardClass34 = creditCardPayment0.getClass();
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
    public void test01162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01162");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 0L, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01163");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1.0f, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01164");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 'a', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 'a', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) ' ', user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01165");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '#', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) '#', user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01166");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 10L, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) '#', user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (short) 0, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) (-1L), user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((double) 100.0f, user38);
        java.lang.Class<?> wildcardClass40 = creditCardPayment0.getClass();
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
    public void test01167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01167");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01168");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) '#', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '4', user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01169");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100L, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01170");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(10.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) ' ', user20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test01171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01171");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(10.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 10, user14);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test01172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01172");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(100.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10.0f, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(0.0d, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (-1), user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (byte) -1, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) 1L, user35);
        java.lang.Class<?> wildcardClass37 = creditCardPayment0.getClass();
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
    public void test01173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01173");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 0, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01174");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) '#', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(10.0d, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01175");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 0, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01176");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 'a', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 'a', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) ' ', user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) 0, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01177");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(1.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01178");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0.0f, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 'a', user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
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
    public void test01179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01179");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(100.0d, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01180");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 'a', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1L), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1.0f), user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01181");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1L), user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01182");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(1.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01183");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1L), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) -1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) '#', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 0, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01184");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1L), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01185");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100L, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01186");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (-1L), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 100, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01187");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(100.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 1L, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) -1, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (byte) 1, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay(0.0d, user32);
        java.lang.Class<?> wildcardClass34 = creditCardPayment0.getClass();
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
    public void test01188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01188");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(100.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01189");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) -1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(1.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) -1, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01190");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(1.0d, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01191");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 100, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01192");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 0, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1.0f), user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01193");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 100, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 100.0f, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01194");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '#', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1.0f), user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01195");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(1.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 10.0f, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01196");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 0.0f, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01197");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100L, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01198");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '4', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1L), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) '4', user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01199");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100L, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01200");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) ' ', user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) ' ', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 0, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01201");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) -1, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (short) 0, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01202");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 10, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100.0f, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(100.0d, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay(100.0d, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 10, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) 1, user35);
        java.lang.Class<?> wildcardClass37 = creditCardPayment0.getClass();
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
    public void test01203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01203");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1.0f), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) '4', user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 10, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01204");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01205");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((-1.0d), user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01206");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1L), user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01207");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1.0f), user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01208");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((-1.0d), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01209");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(10.0d, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01210");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1.0f), user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01211");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((-1.0d), user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01212");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01213");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) -1, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01214");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 100, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01215");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(1.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((-1.0d), user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01216");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) '#', user5);
        java.lang.Class<?> wildcardClass7 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test01217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01217");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(1.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(0.0d, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01218");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 'a', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 'a', user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01219");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(10.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 1, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (short) 0, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01220");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) ' ', user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) ' ', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1L), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 0, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01221");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01222");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (-1), user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) ' ', user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
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
    public void test01223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01223");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1L), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) -1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) '#', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 0, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(0.0d, user26);
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
    public void test01224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01224");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((-1.0d), user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01225");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1L), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 1, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01226");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1.0f), user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01227");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1.0f, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01228");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) '4', user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01229");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 0, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 0, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01230");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(100.0d, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (-1.0f), user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 10, user32);
        java.lang.Class<?> wildcardClass34 = creditCardPayment0.getClass();
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
    public void test01231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01231");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 1, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01232");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0.0f, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (-1), user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) '#', user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay(0.0d, user35);
        java.lang.Class<?> wildcardClass37 = creditCardPayment0.getClass();
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
    public void test01233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01233");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1.0f), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01234");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01235");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (-1L), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01236");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 0, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01237");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((-1.0d), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 10, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01238");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 100, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01239");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 0, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 'a', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 1, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) '4', user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01240");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 100, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 1, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01241");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) '4', user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01242");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) '#', user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '#', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01243");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (-1), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01244");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01245");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01246");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01247");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) -1, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01248");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 'a', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(100.0d, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01249");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((-1.0d), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '#', user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01250");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (-1), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(10.0d, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01251");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 'a', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 100, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01252");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 100, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01253");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 100, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10.0f, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01254");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 1, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01255");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1.0f), user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01256");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((-1.0d), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1L), user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01257");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) -1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(100.0d, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01258");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10.0f, user23);
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
    public void test01259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01259");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(100.0d, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01260");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) 100, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01261");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) -1, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01262");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10L, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01263");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 10, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (-1L), user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01264");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '4', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1), user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01265");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 100, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01266");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(100.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) -1, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (short) 10, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 10L, user32);
        java.lang.Class<?> wildcardClass34 = creditCardPayment0.getClass();
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
    public void test01267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01267");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01268");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 10, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0L, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01269");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(100.0d, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01270");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 100.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 'a', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 100, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 0L, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01271");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(10.0d, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01272");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 10, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1.0f), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 'a', user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 10.0f, user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
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
    public void test01273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01273");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(1.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01274");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0.0f, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (-1), user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay(0.0d, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) (short) 0, user35);
        java.lang.Class<?> wildcardClass37 = creditCardPayment0.getClass();
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
    public void test01275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01275");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((-1.0d), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 10, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01276");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 10, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01277");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 10, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 0.0f, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (short) 1, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01278");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1L, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01279");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '4', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 'a', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01280");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10.0f, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 100.0f, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01281");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) ' ', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 100, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01282");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 100, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (short) 0, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01283");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 100.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100L, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01284");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 'a', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100.0f, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01285");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 10, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 0, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01286");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01287");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 100.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01288");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (-1), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 100.0f, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01289");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01290");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10L, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01291");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) -1, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01292");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 10, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1.0f), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 'a', user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay(100.0d, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay(0.0d, user32);
        java.lang.Class<?> wildcardClass34 = creditCardPayment0.getClass();
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
    public void test01293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01293");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 10, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(1.0d, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (byte) 100, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay(100.0d, user32);
        java.lang.Class<?> wildcardClass34 = creditCardPayment0.getClass();
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
    public void test01294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01294");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 100, user8);
        java.lang.Class<?> wildcardClass10 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01295");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(100.0d, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01296");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 0, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01297");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) '#', user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1.0f), user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01298");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) ' ', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 0, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01299");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01300");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(1.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 10.0f, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) '4', user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
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
    public void test01301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01301");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 'a', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 100, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01302");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 10, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10L, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01303");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 0.0f, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0L, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01304");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(1.0d, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01305");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) ' ', user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01306");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 100L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(100.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01307");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(10.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1), user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01308");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01309");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '4', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 10, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01310");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((-1.0d), user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01311");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (-1.0f), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 0L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) '#', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) '#', user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01312");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 100, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 10, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01313");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(1.0d, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01314");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 10, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 'a', user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01315");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) -1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) '4', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 0.0f, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01316");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '4', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01317");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(10.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01318");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(10.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (-1), user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01319");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 100, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 0, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01320");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 0L, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (short) 100, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01321");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) '#', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 'a', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1L), user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01322");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (-1), user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01323");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '#', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '#', user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01324");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 0.0f, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(100.0d, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01325");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '4', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1L), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 10L, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01326");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((-1.0d), user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01327");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01328");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(1.0d, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01329");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((-1.0d), user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01330");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '#', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 'a', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 0, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 10.0f, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01331");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 100, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01332");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (-1.0f), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0.0f, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01333");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '#', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 'a', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) '4', user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01334");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01335");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) -1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100L, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01336");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (-1L), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1L, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01337");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0.0f, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01338");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 10, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (short) 100, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01339");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 'a', user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (-1.0f), user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01340");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1), user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01341");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 10, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1.0f), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 'a', user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 10.0f, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (byte) 100, user32);
        java.lang.Class<?> wildcardClass34 = creditCardPayment0.getClass();
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
    public void test01342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01342");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) ' ', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01343");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100L, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) -1, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (short) -1, user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
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
    public void test01344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01344");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) ' ', user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 1, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 1, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 'a', user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) 100.0f, user35);
        java.lang.Class<?> wildcardClass37 = creditCardPayment0.getClass();
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
    public void test01345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01345");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 0, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01346");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (short) 0, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (-1.0f), user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
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
    public void test01347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01347");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 100L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10L, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01348");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(1.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01349");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) -1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 0, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01350");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) ' ', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 10, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1L), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01351");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '#', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 0, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01352");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01353");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(10.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1L), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 10L, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01354");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(1.0d, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01355");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 100, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1L), user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01356");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) '#', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 10, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) -1, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01357");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 100, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01358");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (-1), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '#', user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01359");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0.0f, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01360");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01361");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 100L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0.0f, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01362");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100.0f, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01363");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01364");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(1.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1L), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 1.0f, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (byte) 0, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 100L, user32);
        java.lang.Class<?> wildcardClass34 = creditCardPayment0.getClass();
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
    public void test01365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01365");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) '#', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1), user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01366");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((-1.0d), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01367");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(10.0d, user17);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test01368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01368");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 1, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01369");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10.0f, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) ' ', user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 1.0f, user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
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
    public void test01370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01370");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10.0f, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 100.0f, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 100.0f, user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
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
    public void test01371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01371");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((-1.0d), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 0, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01372");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) ' ', user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) ' ', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) -1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 10, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01373");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '#', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(10.0d, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01374");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 1, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) 10, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 1, user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
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
    public void test01375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01375");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((-1.0d), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01376");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 100, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01377");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(1.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (short) 10, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) '#', user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
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
    public void test01378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01378");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 100.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 1, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01379");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) '4', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 0, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01380");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '#', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1.0f), user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01381");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01382");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1L), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) -1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 1.0f, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (short) -1, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01383");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100.0f, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01384");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 0, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01385");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) '#', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 1, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01386");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 10, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01387");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 'a', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) -1, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01388");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 'a', user8);
        java.lang.Class<?> wildcardClass10 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01389");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) ' ', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100L, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(1.0d, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (short) -1, user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
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
    public void test01390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01390");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) -1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) '#', user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01391");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) -1, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 1, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) '4', user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
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
    public void test01392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01392");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '#', user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01393");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 0, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) -1, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01394");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 0, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((-1.0d), user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01395");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1L), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) -1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(10.0d, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01396");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100L, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01397");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01398");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0.0f, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (-1), user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (-1), user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) ' ', user35);
        java.lang.Class<?> wildcardClass37 = creditCardPayment0.getClass();
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
    public void test01399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01399");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1.0f), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 100.0f, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) ' ', user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
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
    public void test01400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01400");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) '#', user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 'a', user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (-1.0f), user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) 10, user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((double) 1L, user38);
        java.lang.Class<?> wildcardClass40 = creditCardPayment0.getClass();
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
    public void test01401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01401");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(1.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01402");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01403");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) -1, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) 100, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (-1), user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
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
    public void test01404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01404");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((-1.0d), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1.0f), user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01405");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) -1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) -1, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01406");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) '#', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 10, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) -1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100.0f, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01407");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01408");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10, user8);
        java.lang.Class<?> wildcardClass10 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01409");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) '4', user5);
        java.lang.Class<?> wildcardClass7 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test01410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01410");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((-1.0d), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((-1.0d), user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01411");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(100.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(1.0d, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01412");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) -1, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01413");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 10, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01414");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) ' ', user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) ' ', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 0.0f, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01415");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 'a', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(1.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) '4', user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(100.0d, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01416");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(100.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0L, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01417");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((-1.0d), user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01418");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(10.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1L), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) '#', user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (short) 0, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 0L, user32);
        java.lang.Class<?> wildcardClass34 = creditCardPayment0.getClass();
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
    public void test01419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01419");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 10L, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) '#', user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (short) 100, user32);
        java.lang.Class<?> wildcardClass34 = creditCardPayment0.getClass();
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
    public void test01420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01420");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01421");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01422");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 10, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 10L, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) 0L, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) (short) 1, user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((double) (-1.0f), user38);
        java.lang.Class<?> wildcardClass40 = creditCardPayment0.getClass();
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
    public void test01423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01423");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1), user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01424");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 10, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0.0f, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01425");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 10, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 10, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (-1L), user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
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
    public void test01426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01426");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (-1L), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1.0f), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01427");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(1.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(100.0d, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01428");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(100.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(100.0d, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01429");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(10.0d, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01430");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(10.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 100, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) '4', user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01431");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) '#', user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01432");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(100.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10.0f, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0L, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 10L, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (short) 0, user32);
        java.lang.Class<?> wildcardClass34 = creditCardPayment0.getClass();
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
    public void test01433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01433");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) '#', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 'a', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1L), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(100.0d, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01434");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1.0f, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01435");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((-1.0d), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1.0f), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 1.0f, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay(10.0d, user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
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
    public void test01436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01436");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100.0f, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01437");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 100L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) -1, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01438");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 1, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01439");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((-1.0d), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01440");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (-1), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 10, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(10.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (-1), user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01441");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((-1.0d), user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01442");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 100.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 10, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0.0f, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (-1), user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (byte) 1, user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay(0.0d, user35);
        java.lang.Class<?> wildcardClass37 = creditCardPayment0.getClass();
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
    public void test01443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01443");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(100.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 100, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) 0, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 0, user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
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
    public void test01444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01444");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 10, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 1, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01445");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01446");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1.0f), user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01447");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) -1, user17);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test01448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01448");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(1.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1.0f), user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01449");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1L), user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01450");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1.0f), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 'a', user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01451");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 0, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01452");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(10.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1L), user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01453");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 0, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 0L, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01454");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 10, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01455");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0.0f, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (-1), user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) '#', user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay(0.0d, user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay(1.0d, user38);
        java.lang.Class<?> wildcardClass40 = creditCardPayment0.getClass();
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
    public void test01456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01456");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (short) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) ' ', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01457");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) '#', user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01458");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(100.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 100.0f, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01459");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((-1.0d), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) ' ', user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 10, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (-1.0f), user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 'a', user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 100.0f, user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
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
    public void test01460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01460");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 1.0f, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(0.0d, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01461");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(1.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01462");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 100L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(100.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 1, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(100.0d, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01463");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 100L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 0, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01464");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) ' ', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1L), user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01465");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1L), user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01466");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (-1L), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1.0f), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01467");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '#', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01468");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01469");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 10L, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0.0f, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01470");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (byte) 1, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01471");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100L, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (short) 0, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) '4', user29);
        java.lang.Class<?> wildcardClass31 = creditCardPayment0.getClass();
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
    public void test01472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01472");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        java.lang.Class<?> wildcardClass10 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01473");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) '#', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '4', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 10, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01474");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((-1.0d), user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01475");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10L, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 10, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 0L, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) ' ', user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01476");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(10.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01477");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 0.0f, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01478");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(10.0d, user11);
        java.lang.Class<?> wildcardClass13 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01479");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(10.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (short) -1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 1L, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01480");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10L, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01481");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) ' ', user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) ' ', user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 1, user20);
        java.lang.Class<?> wildcardClass22 = creditCardPayment0.getClass();
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
    public void test01482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01482");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 0L, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay(0.0d, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (short) 10, user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) '4', user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) 10L, user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((double) 100L, user38);
        java.lang.Class<?> wildcardClass40 = creditCardPayment0.getClass();
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
    public void test01483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01483");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay(1.0d, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(1.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 0L, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 100.0f, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (short) 1, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01484");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 1L, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(100.0d, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01485");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (byte) 0, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 1, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 100.0f, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01486");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 1, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01487");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (-1L), user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '4', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (-1L), user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(10.0d, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01488");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0.0f, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) 'a', user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay(100.0d, user32);
        java.lang.Class<?> wildcardClass34 = creditCardPayment0.getClass();
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
    public void test01489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01489");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10.0f, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100L, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01490");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 100L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) 0, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(1.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((-1.0d), user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01491");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 10, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) 10, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 100, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01492");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (byte) 1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 0, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01493");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (-1.0f), user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (byte) 1, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) (short) 0, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) (byte) 10, user26);
        java.lang.Class<?> wildcardClass28 = creditCardPayment0.getClass();
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
    public void test01494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01494");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01495");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay((double) 1L, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) 100, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay(0.0d, user17);
        java.lang.Class<?> wildcardClass19 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01496");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(10.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) -1, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (short) 1, user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01497");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) (-1L), user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) (short) -1, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay((double) 1.0f, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01498");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) 0L, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 100, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay((double) 10.0f, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(1.0d, user23);
        java.lang.Class<?> wildcardClass25 = creditCardPayment0.getClass();
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
    public void test01499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01499");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) 10.0f, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) ' ', user14);
        java.lang.Class<?> wildcardClass16 = creditCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01500");
        payment.CreditCardPayment creditCardPayment0 = new payment.CreditCardPayment();
        model.User user2 = null;
        boolean boolean3 = creditCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = creditCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = creditCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = creditCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = creditCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = creditCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = creditCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = creditCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = creditCardPayment0.pay((double) 0.0f, user26);
        model.User user29 = null;
        boolean boolean30 = creditCardPayment0.pay((double) (-1), user29);
        model.User user32 = null;
        boolean boolean33 = creditCardPayment0.pay((double) (-1), user32);
        model.User user35 = null;
        boolean boolean36 = creditCardPayment0.pay((double) (byte) 1, user35);
        model.User user38 = null;
        boolean boolean39 = creditCardPayment0.pay((double) 1.0f, user38);
        java.lang.Class<?> wildcardClass40 = creditCardPayment0.getClass();
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
}

