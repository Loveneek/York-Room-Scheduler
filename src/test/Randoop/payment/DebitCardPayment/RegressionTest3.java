import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test01501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01501");
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
        boolean boolean18 = debitCardPayment0.pay((double) 0L, user17);
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
    public void test01502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01502");
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
        boolean boolean18 = debitCardPayment0.pay((double) '4', user17);
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
    public void test01503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01503");
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
    public void test01504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01504");
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
    public void test01505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01505");
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
    public void test01506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01506");
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
    public void test01507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01507");
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
    public void test01508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01508");
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
    public void test01509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01509");
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
    public void test01510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01510");
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
    public void test01511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01511");
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
    public void test01512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01512");
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
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 0, user14);
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
    public void test01513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01513");
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
    public void test01514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01514");
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
    public void test01515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01515");
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
        boolean boolean27 = debitCardPayment0.pay((double) 1, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) '4', user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (byte) 1, user32);
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
    public void test01516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01516");
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
    public void test01517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01517");
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
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01518");
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
    public void test01519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01519");
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
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
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
    public void test01520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01520");
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
        boolean boolean15 = debitCardPayment0.pay((double) (short) 100, user14);
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
    public void test01521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01521");
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
    public void test01522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01522");
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
    public void test01523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01523");
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
    public void test01524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01524");
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
    public void test01525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01525");
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
    public void test01526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01526");
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
        boolean boolean27 = debitCardPayment0.pay((double) '4', user26);
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
    public void test01527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01527");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1.0f, user11);
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
    public void test01528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01528");
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
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 10, user17);
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
    public void test01529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01529");
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
        boolean boolean18 = debitCardPayment0.pay((double) (byte) -1, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((-1.0d), user20);
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
    public void test01530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01530");
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
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
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
    public void test01531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01531");
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
    public void test01532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01532");
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
    public void test01533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01533");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) ' ', user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01534");
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
    public void test01535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01535");
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
    public void test01536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01536");
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
    public void test01537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01537");
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
        boolean boolean15 = debitCardPayment0.pay((double) 0.0f, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1L), user17);
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
    public void test01538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01538");
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
        boolean boolean21 = debitCardPayment0.pay((double) 'a', user20);
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
    public void test01539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01539");
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
        boolean boolean15 = debitCardPayment0.pay((double) 10.0f, user14);
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
    public void test01540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01540");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((-1.0d), user8);
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
    public void test01541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01541");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
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
    public void test01542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01542");
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
    public void test01543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01543");
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
    public void test01544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01544");
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
    public void test01545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01545");
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
    public void test01546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01546");
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
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 10, user14);
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
    public void test01547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01547");
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
    public void test01548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01548");
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
    public void test01549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01549");
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
    public void test01550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01550");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(1.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 10, user11);
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
    public void test01551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01551");
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
    public void test01552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01552");
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
        boolean boolean18 = debitCardPayment0.pay((double) (-1), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 1L, user20);
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
    public void test01553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01553");
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
    public void test01554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01554");
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
        boolean boolean27 = debitCardPayment0.pay((double) (byte) 1, user26);
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
    public void test01555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01555");
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
    public void test01556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01556");
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
        boolean boolean24 = debitCardPayment0.pay((double) 0.0f, user23);
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
    public void test01557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01557");
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
        boolean boolean21 = debitCardPayment0.pay((double) 1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (-1.0f), user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 'a', user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (-1.0f), user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 100, user32);
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
    public void test01558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01558");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(1.0d, user20);
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
    public void test01559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01559");
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
    public void test01560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01560");
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
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 10, user20);
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
    public void test01561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01561");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 1, user20);
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
    public void test01562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01562");
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
    public void test01563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01563");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 0, user23);
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
    public void test01564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01564");
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
    public void test01565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01565");
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
    public void test01566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01566");
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
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 0, user17);
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
    public void test01567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01567");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(10.0d, user8);
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
    public void test01568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01568");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 0L, user20);
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
    public void test01569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01569");
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
    public void test01570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01570");
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
    public void test01571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01571");
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
        boolean boolean15 = debitCardPayment0.pay((double) 100.0f, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01572");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(100.0d, user11);
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
    public void test01573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01573");
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
        boolean boolean24 = debitCardPayment0.pay((double) 'a', user23);
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
    public void test01574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01574");
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
        boolean boolean24 = debitCardPayment0.pay((double) ' ', user23);
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
    public void test01575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01575");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(10.0d, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01576");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
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
    public void test01577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01577");
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
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01578");
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
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) 0L, user35);
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
    public void test01579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01579");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) '4', user17);
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
    public void test01580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01580");
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
    public void test01581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01581");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) '#', user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) -1, user8);
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
    public void test01582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01582");
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
    public void test01583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01583");
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
        boolean boolean18 = debitCardPayment0.pay((double) 100, user17);
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
    public void test01584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01584");
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
    public void test01585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01585");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
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
    public void test01586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01586");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 100L, user23);
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
    public void test01587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01587");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 10, user8);
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
    public void test01588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01588");
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
    public void test01589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01589");
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
    public void test01590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01590");
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
    public void test01591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01591");
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
    public void test01592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01592");
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
        boolean boolean18 = debitCardPayment0.pay((double) (-1), user17);
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
    public void test01593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01593");
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
    public void test01594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01594");
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
    public void test01595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01595");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((-1.0d), user8);
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
    public void test01596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01596");
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
    public void test01597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01597");
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
        boolean boolean30 = debitCardPayment0.pay((double) '#', user29);
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
    public void test01598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01598");
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
    public void test01599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01599");
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
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 10, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 0, user23);
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
    public void test01600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01600");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1, user11);
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
    public void test01601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01601");
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
    public void test01602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01602");
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
    public void test01603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01603");
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
    public void test01604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01604");
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
    public void test01605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01605");
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
    public void test01606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01606");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 100, user8);
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
    public void test01607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01607");
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
    public void test01608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01608");
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
        boolean boolean18 = debitCardPayment0.pay((double) (short) 0, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 'a', user23);
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
    public void test01609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01609");
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
    public void test01610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01610");
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
    public void test01611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01611");
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
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 0, user20);
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
    public void test01612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01612");
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
    public void test01613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01613");
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
    public void test01614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01614");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10.0f, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1L), user11);
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
    public void test01615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01615");
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
    public void test01616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01616");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1.0f), user11);
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
    public void test01617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01617");
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
    public void test01618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01618");
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
    public void test01619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01619");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) '#', user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 0, user11);
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
    public void test01620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01620");
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
    public void test01621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01621");
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
        boolean boolean15 = debitCardPayment0.pay((double) (short) -1, user14);
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
    public void test01622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01622");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10.0f, user17);
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
    public void test01623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01623");
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
    public void test01624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01624");
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
    public void test01625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01625");
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
        boolean boolean18 = debitCardPayment0.pay((double) (short) 0, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
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
    public void test01626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01626");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100L, user17);
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
    public void test01627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01627");
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
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
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
    public void test01628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01628");
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
        boolean boolean21 = debitCardPayment0.pay((double) 1L, user20);
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
    public void test01629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01629");
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
    public void test01630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01630");
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
    public void test01631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01631");
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
        boolean boolean15 = debitCardPayment0.pay((double) (-1), user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 1, user17);
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
    public void test01632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01632");
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
    public void test01633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01633");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '4', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 1, user17);
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
    public void test01634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01634");
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
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 10, user14);
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
    public void test01635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01635");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((-1.0d), user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
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
    public void test01636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01636");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 1.0f, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01637");
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
    public void test01638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01638");
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
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 100, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 0, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 10L, user26);
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
    public void test01639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01639");
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
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 1, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 10.0f, user23);
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
    public void test01640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01640");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) -1, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) 1, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) '#', user29);
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
    public void test01641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01641");
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
        boolean boolean15 = debitCardPayment0.pay((double) (short) -1, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 1.0f, user17);
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
    public void test01642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01642");
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
    public void test01643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01643");
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
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 0, user20);
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
    public void test01644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01644");
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
    public void test01645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01645");
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
    public void test01646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01646");
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
    public void test01647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01647");
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
    public void test01648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01648");
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
    public void test01649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01649");
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
    public void test01650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01650");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) (byte) 0, user14);
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
    public void test01651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01651");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 10, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) ' ', user11);
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
    public void test01652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01652");
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
    public void test01653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01653");
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
    public void test01654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01654");
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
        boolean boolean24 = debitCardPayment0.pay(0.0d, user23);
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
    public void test01655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01655");
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
        boolean boolean27 = debitCardPayment0.pay((double) (byte) 100, user26);
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
    public void test01656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01656");
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
    public void test01657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01657");
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
    public void test01658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01658");
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
        boolean boolean36 = debitCardPayment0.pay(100.0d, user35);
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
    public void test01659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01659");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1, user14);
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
    public void test01660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01660");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
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
    public void test01661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01661");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 0, user23);
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
    public void test01662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01662");
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
        boolean boolean15 = debitCardPayment0.pay(0.0d, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 100, user17);
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
    public void test01663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01663");
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
        boolean boolean18 = debitCardPayment0.pay((double) 10.0f, user17);
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
    public void test01664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01664");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(1.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) ' ', user20);
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
    public void test01665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01665");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (-1.0f), user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 100.0f, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01666");
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
        boolean boolean24 = debitCardPayment0.pay((double) ' ', user23);
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
    public void test01667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01667");
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
        boolean boolean18 = debitCardPayment0.pay(10.0d, user17);
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
    public void test01668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01668");
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
    public void test01669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01669");
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
    public void test01670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01670");
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
    public void test01671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01671");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(100.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) -1, user26);
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
    public void test01672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01672");
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
        boolean boolean15 = debitCardPayment0.pay((double) 100, user14);
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
    public void test01673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01673");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 0, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 0, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 0, user23);
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
    public void test01674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01674");
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
    public void test01675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01675");
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
        boolean boolean27 = debitCardPayment0.pay((double) (short) 0, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (byte) 1, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((-1.0d), user32);
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
    public void test01676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01676");
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
        boolean boolean18 = debitCardPayment0.pay((double) (short) 100, user17);
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
    public void test01677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01677");
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
    public void test01678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01678");
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
    public void test01679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01679");
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
    public void test01680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01680");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
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
    public void test01681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01681");
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
    public void test01682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01682");
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
    public void test01683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01683");
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
    public void test01684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01684");
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
        boolean boolean21 = debitCardPayment0.pay((double) 100, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (-1.0f), user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 100.0f, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) ' ', user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 100.0f, user32);
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
    public void test01685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01685");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) '#', user8);
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
    public void test01686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01686");
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
    public void test01687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01687");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 100, user20);
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
    public void test01688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01688");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 1.0f, user17);
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
    public void test01689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01689");
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
    public void test01690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01690");
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
        boolean boolean15 = debitCardPayment0.pay((double) (-1.0f), user14);
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
    public void test01691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01691");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (-1.0f), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
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
    public void test01692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01692");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100, user8);
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
    public void test01693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01693");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 0L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1.0f, user11);
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
    public void test01694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01694");
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
    public void test01695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01695");
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
    public void test01696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01696");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1L, user11);
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
    public void test01697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01697");
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
        boolean boolean24 = debitCardPayment0.pay((double) 100, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(100.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (-1.0f), user29);
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
    public void test01698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01698");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) ' ', user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01699");
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
    public void test01700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01700");
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
        boolean boolean24 = debitCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) 0L, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) 0.0f, user29);
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
    public void test01701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01701");
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
        boolean boolean15 = debitCardPayment0.pay((double) 1, user14);
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
    public void test01702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01702");
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
        boolean boolean15 = debitCardPayment0.pay((double) 100, user14);
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
    public void test01703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01703");
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
    public void test01704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01704");
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
        boolean boolean18 = debitCardPayment0.pay((double) 10, user17);
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
    public void test01705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01705");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
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
    public void test01706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01706");
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
    public void test01707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01707");
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
        boolean boolean33 = debitCardPayment0.pay((-1.0d), user32);
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
    public void test01708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01708");
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
    public void test01709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01709");
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
    public void test01710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01710");
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
    public void test01711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01711");
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
    public void test01712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01712");
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
    public void test01713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01713");
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
        boolean boolean15 = debitCardPayment0.pay((double) 100, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10.0f, user17);
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
    public void test01714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01714");
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
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 0, user23);
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
    public void test01715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01715");
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
    public void test01716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01716");
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
    public void test01717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01717");
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
    public void test01718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01718");
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
        boolean boolean30 = debitCardPayment0.pay((double) (byte) 0, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 100.0f, user32);
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
    public void test01719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01719");
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
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) 10, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) '4', user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) 10L, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay(0.0d, user38);
        model.User user41 = null;
        boolean boolean42 = debitCardPayment0.pay((double) 0L, user41);
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
    public void test01720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01720");
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
    public void test01721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01721");
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
    public void test01722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01722");
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
    public void test01723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01723");
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
        boolean boolean24 = debitCardPayment0.pay((double) (short) 0, user23);
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
    public void test01724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01724");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(1.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 10, user11);
        java.lang.Class<?> wildcardClass13 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01725");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (-1L), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (-1.0f), user20);
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
    public void test01726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01726");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
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
    public void test01727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01727");
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
    public void test01728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01728");
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
        boolean boolean18 = debitCardPayment0.pay((double) 10L, user17);
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
    public void test01729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01729");
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
    public void test01730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01730");
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
        boolean boolean27 = debitCardPayment0.pay((double) 1, user26);
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
    public void test01731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01731");
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
        boolean boolean15 = debitCardPayment0.pay((double) 100, user14);
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
    public void test01732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01732");
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
    public void test01733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01733");
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
        boolean boolean21 = debitCardPayment0.pay(1.0d, user20);
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
    public void test01734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01734");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 10, user8);
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
    public void test01735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01735");
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
        boolean boolean15 = debitCardPayment0.pay((double) '#', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 100, user17);
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
    public void test01736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01736");
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
        boolean boolean18 = debitCardPayment0.pay(1.0d, user17);
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
    public void test01737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01737");
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
    public void test01738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01738");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) '#', user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100, user17);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test01739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01739");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 'a', user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 0, user14);
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
    public void test01740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01740");
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
        boolean boolean18 = debitCardPayment0.pay((double) ' ', user17);
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
    public void test01741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01741");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 0, user23);
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
    public void test01742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01742");
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
    public void test01743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01743");
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
        boolean boolean18 = debitCardPayment0.pay((double) 100, user17);
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
    public void test01744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01744");
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
    public void test01745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01745");
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
    public void test01746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01746");
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
    public void test01747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01747");
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
    public void test01748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01748");
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
    public void test01749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01749");
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
    public void test01750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01750");
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
    public void test01751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01751");
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
    public void test01752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01752");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(0.0d, user23);
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
    public void test01753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01753");
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
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 10, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 100L, user20);
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
    public void test01754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01754");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) '#', user23);
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
    public void test01755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01755");
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
        boolean boolean15 = debitCardPayment0.pay((double) 0.0f, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100L, user17);
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
    public void test01756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01756");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(1.0d, user8);
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
    public void test01757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01757");
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
    public void test01758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01758");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (-1), user8);
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
    public void test01759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01759");
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
    public void test01760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01760");
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
    public void test01761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01761");
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
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) 10, user29);
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
    public void test01762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01762");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 0.0f, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 10.0f, user8);
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
    public void test01763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01763");
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
    public void test01764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01764");
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
    public void test01765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01765");
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
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 1, user26);
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
    public void test01766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01766");
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
    public void test01767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01767");
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
        boolean boolean18 = debitCardPayment0.pay((double) 10.0f, user17);
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
    public void test01768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01768");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((-1.0d), user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0, user11);
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
    public void test01769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01769");
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
    public void test01770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01770");
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
    public void test01771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01771");
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
    public void test01772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01772");
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
    public void test01773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01773");
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
        boolean boolean21 = debitCardPayment0.pay((double) 100, user20);
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
    public void test01774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01774");
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
    public void test01775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01775");
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
        boolean boolean21 = debitCardPayment0.pay((double) 1L, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay(0.0d, user23);
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
    public void test01776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01776");
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
    public void test01777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01777");
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
    public void test01778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01778");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 0.0f, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1.0f, user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 10.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (byte) -1, user23);
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
    public void test01779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01779");
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
    public void test01780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01780");
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
    public void test01781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01781");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((-1.0d), user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) '4', user23);
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
    public void test01782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01782");
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
    public void test01783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01783");
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
    public void test01784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01784");
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
    public void test01785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01785");
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
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 1, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 10, user20);
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
    public void test01786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01786");
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
    public void test01787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01787");
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
    public void test01788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01788");
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
        boolean boolean18 = debitCardPayment0.pay((double) (-1.0f), user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) -1, user20);
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
    public void test01789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01789");
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
    public void test01790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01790");
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
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
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
    public void test01791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01791");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 0L, user8);
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
    public void test01792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01792");
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
    public void test01793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01793");
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
    public void test01794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01794");
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
    public void test01795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01795");
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
        boolean boolean30 = debitCardPayment0.pay(0.0d, user29);
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
    public void test01796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01796");
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
        boolean boolean15 = debitCardPayment0.pay((double) (short) 0, user14);
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
    public void test01797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01797");
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
    public void test01798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01798");
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
        boolean boolean27 = debitCardPayment0.pay((double) (byte) 10, user26);
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
    public void test01799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01799");
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
    public void test01800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01800");
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
    public void test01801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01801");
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
    public void test01802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01802");
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
    public void test01803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01803");
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
        boolean boolean18 = debitCardPayment0.pay((double) (short) 100, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) ' ', user20);
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
    public void test01804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01804");
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
    public void test01805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01805");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 10, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01806");
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
    public void test01807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01807");
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
    public void test01808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01808");
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
    public void test01809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01809");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((-1.0d), user8);
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
    public void test01810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01810");
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
    public void test01811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01811");
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
    public void test01812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01812");
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
        boolean boolean21 = debitCardPayment0.pay(100.0d, user20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test01813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01813");
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
        boolean boolean18 = debitCardPayment0.pay((double) (byte) -1, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 100L, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) -1, user23);
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
    public void test01814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01814");
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
    public void test01815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01815");
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
        boolean boolean21 = debitCardPayment0.pay((double) 0.0f, user20);
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
    public void test01816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01816");
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
    public void test01817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01817");
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
        boolean boolean21 = debitCardPayment0.pay((double) 1L, user20);
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
    public void test01818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01818");
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
        boolean boolean30 = debitCardPayment0.pay((double) ' ', user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 0.0f, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) 10L, user35);
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
    public void test01819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01819");
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
    public void test01820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01820");
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
    public void test01821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01821");
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
    public void test01822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01822");
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
        boolean boolean15 = debitCardPayment0.pay((double) (-1), user14);
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
    public void test01823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01823");
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
        boolean boolean24 = debitCardPayment0.pay((double) 100, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay(100.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (-1.0f), user29);
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
    public void test01824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01824");
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
    public void test01825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01825");
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
        boolean boolean21 = debitCardPayment0.pay((double) 10.0f, user20);
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
    public void test01826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01826");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) '#', user8);
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
    public void test01827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01827");
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
    public void test01828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01828");
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
    public void test01829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01829");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (-1L), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (-1), user8);
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
    public void test01830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01830");
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
    public void test01831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01831");
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
    public void test01832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01832");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (-1L), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 0L, user8);
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
    public void test01833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01833");
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
    public void test01834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01834");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 0, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '#', user11);
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
    public void test01835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01835");
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
    public void test01836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01836");
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
    public void test01837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01837");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
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
    public void test01838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01838");
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
    public void test01839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01839");
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
        boolean boolean21 = debitCardPayment0.pay((double) (short) 100, user20);
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
    public void test01840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01840");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) '#', user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) '4', user8);
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
    public void test01841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01841");
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
    public void test01842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01842");
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
    public void test01843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01843");
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
    public void test01844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01844");
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
    public void test01845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01845");
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
    public void test01846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01846");
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
    public void test01847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01847");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) '4', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100L, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (short) 1, user20);
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
    public void test01848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01848");
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
    public void test01849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01849");
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
        boolean boolean18 = debitCardPayment0.pay((double) (-1.0f), user17);
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
    public void test01850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01850");
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
    public void test01851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01851");
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
    public void test01852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01852");
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
    public void test01853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01853");
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
    public void test01854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01854");
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
        boolean boolean21 = debitCardPayment0.pay((double) 100.0f, user20);
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
    public void test01855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01855");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((-1.0d), user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) '#', user11);
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
    public void test01856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01856");
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
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) (-1L), user35);
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
    public void test01857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01857");
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
    public void test01858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01858");
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
    public void test01859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01859");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(100.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) 100L, user20);
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
    public void test01860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01860");
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
    public void test01861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01861");
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
        boolean boolean24 = debitCardPayment0.pay((double) 1, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) '4', user26);
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
    public void test01862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01862");
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
    public void test01863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01863");
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
        boolean boolean21 = debitCardPayment0.pay((double) 100L, user20);
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
    public void test01864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01864");
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
    public void test01865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01865");
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
    public void test01866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01866");
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
    public void test01867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01867");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 0.0f, user23);
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
    public void test01868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01868");
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
    public void test01869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01869");
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
    public void test01870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01870");
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
        boolean boolean24 = debitCardPayment0.pay((double) 0L, user23);
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
    public void test01871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01871");
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
    public void test01872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01872");
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
    public void test01873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01873");
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
    public void test01874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01874");
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
    public void test01875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01875");
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
        boolean boolean24 = debitCardPayment0.pay(0.0d, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) 0, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay(100.0d, user29);
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
    public void test01876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01876");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 0.0f, user8);
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
    public void test01877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01877");
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
    public void test01878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01878");
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
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) -1, user23);
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
    public void test01879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01879");
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
        boolean boolean15 = debitCardPayment0.pay((double) 0, user14);
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
    public void test01880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01880");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (short) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) '4', user14);
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) 100L, user17);
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
    public void test01881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01881");
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
    public void test01882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01882");
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
    public void test01883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01883");
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
    public void test01884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01884");
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
        boolean boolean18 = debitCardPayment0.pay(1.0d, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 1, user20);
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
    public void test01885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01885");
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
    public void test01886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01886");
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
    public void test01887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01887");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 0, user5);
        java.lang.Class<?> wildcardClass7 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test01888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01888");
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
    public void test01889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01889");
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
    public void test01890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01890");
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
    public void test01891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01891");
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
    public void test01892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01892");
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
    public void test01893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01893");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
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
    public void test01894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01894");
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
    public void test01895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01895");
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
    public void test01896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01896");
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
        boolean boolean21 = debitCardPayment0.pay((double) (byte) -1, user20);
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
    public void test01897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01897");
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
    public void test01898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01898");
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
        boolean boolean24 = debitCardPayment0.pay((double) 10.0f, user23);
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
    public void test01899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01899");
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
    public void test01900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01900");
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
        boolean boolean30 = debitCardPayment0.pay((double) 10L, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 0L, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) (short) 1, user35);
        model.User user38 = null;
        boolean boolean39 = debitCardPayment0.pay((double) 0L, user38);
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
    public void test01901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01901");
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
    public void test01902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01902");
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
    public void test01903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01903");
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
        boolean boolean21 = debitCardPayment0.pay((double) 0L, user20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test01904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01904");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay(0.0d, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1L, user14);
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
    public void test01905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01905");
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
        boolean boolean24 = debitCardPayment0.pay((double) 0.0f, user23);
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
    public void test01906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01906");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(100.0d, user8);
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
    public void test01907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01907");
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
    public void test01908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01908");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) 0.0f, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (-1), user8);
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
    public void test01909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01909");
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
    public void test01910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01910");
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
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 10, user20);
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
    public void test01911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01911");
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
    public void test01912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01912");
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
    public void test01913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01913");
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
    public void test01914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01914");
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
        boolean boolean24 = debitCardPayment0.pay(1.0d, user23);
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
    public void test01915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01915");
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
        boolean boolean21 = debitCardPayment0.pay((double) (short) 100, user20);
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
    public void test01916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01916");
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
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) '#', user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 1, user23);
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
    public void test01917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01917");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 'a', user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 0, user11);
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
    public void test01918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01918");
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
    public void test01919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01919");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) 1, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01920");
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
    public void test01921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01921");
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
    public void test01922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01922");
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
    public void test01923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01923");
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
    public void test01924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01924");
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
        boolean boolean18 = debitCardPayment0.pay((double) '4', user17);
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
    public void test01925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01925");
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
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 10, user20);
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
    public void test01926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01926");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) -1, user8);
        java.lang.Class<?> wildcardClass10 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01927");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) '#', user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) '4', user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10.0f, user11);
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
    public void test01928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01928");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(0.0d, user17);
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
    public void test01929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01929");
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
        boolean boolean18 = debitCardPayment0.pay((double) (byte) -1, user17);
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
    public void test01930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01930");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 0.0f, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) (byte) 0, user11);
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
    public void test01931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01931");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 100L, user11);
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
    public void test01932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01932");
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
    public void test01933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01933");
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
    public void test01934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01934");
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
    public void test01935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01935");
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
        boolean boolean15 = debitCardPayment0.pay((double) 1.0f, user14);
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
    public void test01936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01936");
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
        boolean boolean15 = debitCardPayment0.pay((double) (-1L), user14);
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
    public void test01937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01937");
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
        boolean boolean18 = debitCardPayment0.pay((double) 0.0f, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay(0.0d, user20);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test01938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01938");
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
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01939");
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
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 10, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 100, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) 10, user26);
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
    public void test01940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01940");
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
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((double) (short) 10, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) '4', user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) 10L, user35);
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
    public void test01941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01941");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(0.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 0.0f, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 100.0f, user14);
        java.lang.Class<?> wildcardClass16 = debitCardPayment0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01942");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 0, user17);
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
    public void test01943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01943");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((-1.0d), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
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
    public void test01944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01944");
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
        boolean boolean27 = debitCardPayment0.pay(100.0d, user26);
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
    public void test01945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01945");
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
    public void test01946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01946");
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
    public void test01947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01947");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (-1L), user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 0L, user8);
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
    public void test01948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01948");
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
    public void test01949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01949");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay(10.0d, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 100, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 1L, user11);
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
    public void test01950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01950");
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
        boolean boolean21 = debitCardPayment0.pay(100.0d, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) '4', user23);
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
    public void test01951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01951");
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
    public void test01952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01952");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100L, user5);
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
    public void test01953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01953");
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
    public void test01954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01954");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) ' ', user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(0.0d, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10L, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 1.0f, user14);
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
    public void test01955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01955");
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
    public void test01956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01956");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (short) 10, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 10L, user11);
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
    public void test01957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01957");
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
    public void test01958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01958");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 100, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (-1), user8);
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
    public void test01959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01959");
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
        boolean boolean30 = debitCardPayment0.pay((double) (short) -1, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) (byte) 0, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) (-1.0f), user35);
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
    public void test01960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01960");
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
    public void test01961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01961");
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
    public void test01962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01962");
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
    public void test01963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01963");
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
    public void test01964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01964");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay((double) (short) 0, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 0, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 10L, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) ' ', user26);
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
    public void test01965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01965");
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
    public void test01966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01966");
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
        model.User user17 = null;
        boolean boolean18 = debitCardPayment0.pay(1.0d, user17);
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
    public void test01967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01967");
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
    public void test01968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01968");
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
    public void test01969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01969");
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
    public void test01970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01970");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 100, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 10L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) 100L, user8);
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
    public void test01971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01971");
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
    public void test01972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01972");
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
    public void test01973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01973");
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
        boolean boolean18 = debitCardPayment0.pay((double) (short) -1, user17);
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
    public void test01974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01974");
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
    public void test01975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01975");
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
        boolean boolean30 = debitCardPayment0.pay((double) 0L, user29);
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
    public void test01976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01976");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (byte) 10, user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) '#', user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (short) -1, user8);
        model.User user11 = null;
        boolean boolean12 = debitCardPayment0.pay((double) 100, user11);
        model.User user14 = null;
        boolean boolean15 = debitCardPayment0.pay((double) 10.0f, user14);
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
    public void test01977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01977");
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
    public void test01978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01978");
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
    public void test01979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01979");
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
    public void test01980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01980");
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
    public void test01981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01981");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((-1.0d), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) 1L, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay(10.0d, user8);
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
    public void test01982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01982");
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
    public void test01983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01983");
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
        boolean boolean21 = debitCardPayment0.pay((double) 100.0f, user20);
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
    public void test01984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01984");
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
        boolean boolean27 = debitCardPayment0.pay(100.0d, user26);
        model.User user29 = null;
        boolean boolean30 = debitCardPayment0.pay((-1.0d), user29);
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
    public void test01985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01985");
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
    public void test01986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01986");
        payment.DebitCardPayment debitCardPayment0 = new payment.DebitCardPayment();
        model.User user2 = null;
        boolean boolean3 = debitCardPayment0.pay((double) (-1.0f), user2);
        model.User user5 = null;
        boolean boolean6 = debitCardPayment0.pay((double) (byte) 0, user5);
        model.User user8 = null;
        boolean boolean9 = debitCardPayment0.pay((double) (byte) 10, user8);
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
    public void test01987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01987");
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
        boolean boolean21 = debitCardPayment0.pay((double) 1L, user20);
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
    public void test01988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01988");
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
    public void test01989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01989");
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
        boolean boolean24 = debitCardPayment0.pay((double) (short) -1, user23);
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
    public void test01990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01990");
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
    public void test01991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01991");
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
        boolean boolean24 = debitCardPayment0.pay((double) (byte) 0, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (short) -1, user26);
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
    public void test01992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01992");
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
        boolean boolean33 = debitCardPayment0.pay(100.0d, user32);
        model.User user35 = null;
        boolean boolean36 = debitCardPayment0.pay((double) (-1.0f), user35);
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
    public void test01993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01993");
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
    public void test01994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01994");
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
        boolean boolean30 = debitCardPayment0.pay((double) 1, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay((double) 'a', user32);
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
    public void test01995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01995");
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
    public void test01996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01996");
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
        boolean boolean21 = debitCardPayment0.pay((double) (short) 100, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) (short) 100, user23);
        model.User user26 = null;
        boolean boolean27 = debitCardPayment0.pay((double) (byte) 100, user26);
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
    public void test01997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01997");
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
        boolean boolean30 = debitCardPayment0.pay(100.0d, user29);
        model.User user32 = null;
        boolean boolean33 = debitCardPayment0.pay(100.0d, user32);
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
    public void test01998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01998");
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
    public void test01999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01999");
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
    public void test02000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test02000");
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
        boolean boolean18 = debitCardPayment0.pay((double) (byte) 0, user17);
        model.User user20 = null;
        boolean boolean21 = debitCardPayment0.pay((double) (byte) 100, user20);
        model.User user23 = null;
        boolean boolean24 = debitCardPayment0.pay((double) 10L, user23);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }
}

