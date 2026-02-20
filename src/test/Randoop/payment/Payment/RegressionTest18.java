import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest18 {

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
    public void test09001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09001");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 1L, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        boolean boolean10 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        boolean boolean16 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass19 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test09002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09002");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) 1, "hi!", "hi!");
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean8 = payment4.paymentCompleted();
        boolean boolean9 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test09003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09003");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) 1, "hi!", "hi!");
        payment4.payDeposit();
        payment4.payDeposit();
    }

    @Test
    public void test09004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09004");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean14 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass15 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test09005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09005");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) (byte) 10, "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test09006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09006");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) (byte) 0, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
    }

    @Test
    public void test09007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09007");
        payment.Payment payment4 = new payment.Payment((long) '4', 0.0d, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test09008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09008");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) 100L, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test09009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09009");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
    }

    @Test
    public void test09010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09010");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) 10L, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
    }

    @Test
    public void test09011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09011");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) (byte) 10, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test09012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09012");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) ' ', "", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        boolean boolean8 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test09013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09013");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) (short) -1, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
    }

    @Test
    public void test09014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09014");
        payment.Payment payment4 = new payment.Payment(100L, (double) (short) -1, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test09015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09015");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) (short) -1, "", "");
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test09016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09016");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) 100, "", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test09017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09017");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) 'a', "hi!", "hi!");
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payBalance();
    }

    @Test
    public void test09018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09018");
        payment.Payment payment4 = new payment.Payment((long) 'a', 0.0d, "", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        boolean boolean8 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test09019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09019");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, (double) '#', "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test09020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09020");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 1L, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test09021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09021");
        payment.Payment payment4 = new payment.Payment(10L, (double) (short) -1, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        boolean boolean13 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test09022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09022");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (short) -1, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        boolean boolean11 = payment4.paymentCompleted();
        boolean boolean12 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test09023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09023");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) 10L, "hi!", "");
        payment4.payDeposit();
        payment4.payBalance();
    }

    @Test
    public void test09024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09024");
        payment.Payment payment4 = new payment.Payment((-1L), (double) '#', "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
    }

    @Test
    public void test09025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09025");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean13 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test09026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09026");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "", "");
    }

    @Test
    public void test09027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09027");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payBalance();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean14 = payment4.paymentCompleted();
        boolean boolean15 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        payment.PaymentStrategy paymentStrategy18 = null;
        payment4.setPaymentStrategy(paymentStrategy18);
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test09028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09028");
        payment.Payment payment4 = new payment.Payment(0L, (double) 0L, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test09029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09029");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean13 = payment4.paymentCompleted();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass15 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test09030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09030");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test09031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09031");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test09032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09032");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) 1L, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test09033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09033");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payDeposit();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment4.payBalance();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test09034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09034");
        payment.Payment payment4 = new payment.Payment(10L, (double) (-1), "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test09035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09035");
        payment.Payment payment4 = new payment.Payment(0L, (double) 1L, "", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean7 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test09036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09036");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        boolean boolean10 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test09037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09037");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) 1L, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test09038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09038");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) (short) -1, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test09039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09039");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test09040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09040");
        payment.Payment payment4 = new payment.Payment(10L, (double) (short) 0, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
    }

    @Test
    public void test09041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09041");
        payment.Payment payment4 = new payment.Payment(10L, 100.0d, "", "");
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test09042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09042");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (-1L), "", "hi!");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test09043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09043");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        payment.PaymentStrategy paymentStrategy17 = null;
        payment4.setPaymentStrategy(paymentStrategy17);
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
    }

    @Test
    public void test09044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09044");
        payment.Payment payment4 = new payment.Payment((long) (-1), 100.0d, "hi!", "hi!");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test09045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09045");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) 0L, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
    }

    @Test
    public void test09046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09046");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean14 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean16 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test09047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09047");
        payment.Payment payment4 = new payment.Payment(0L, (double) 100.0f, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test09048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09048");
        payment.Payment payment4 = new payment.Payment(1L, 100.0d, "hi!", "hi!");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test09049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09049");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean9 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test09050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09050");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, 0.0d, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payBalance();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test09051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09051");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 0L, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test09052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09052");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payBalance();
        boolean boolean11 = payment4.paymentCompleted();
        boolean boolean12 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test09053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09053");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        java.lang.Class<?> wildcardClass14 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test09054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09054");
        payment.Payment payment4 = new payment.Payment(10L, (double) (byte) 0, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test09055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09055");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) 'a', "hi!", "hi!");
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payBalance();
        payment4.payDeposit();
    }

    @Test
    public void test09056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09056");
        payment.Payment payment4 = new payment.Payment(0L, (double) (-1), "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean11 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test09057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09057");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, 0.0d, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass14 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test09058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09058");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, 0.0d, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
    }

    @Test
    public void test09059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09059");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) (short) -1, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
    }

    @Test
    public void test09060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09060");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test09061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09061");
        payment.Payment payment4 = new payment.Payment(1L, (double) 1.0f, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test09062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09062");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) 1, "", "");
    }

    @Test
    public void test09063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09063");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (-1), "", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test09064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09064");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) 0, "hi!", "hi!");
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test09065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09065");
        payment.Payment payment4 = new payment.Payment(10L, 100.0d, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test09066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09066");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) (byte) 10, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test09067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09067");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean19 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy20 = null;
        payment4.setPaymentStrategy(paymentStrategy20);
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test09068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09068");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) (byte) 0, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean9 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test09069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09069");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) 0L, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payDeposit();
        boolean boolean12 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test09070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09070");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, (double) 1, "", "hi!");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test09071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09071");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) 100, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
    }

    @Test
    public void test09072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09072");
        payment.Payment payment4 = new payment.Payment((long) 0, 10.0d, "hi!", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test09073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09073");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) (-1), "", "hi!");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test09074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09074");
        payment.Payment payment4 = new payment.Payment(100L, (double) 'a', "", "hi!");
        payment4.payBalance();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test09075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09075");
        payment.Payment payment4 = new payment.Payment(10L, (double) 0.0f, "hi!", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test09076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09076");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) (short) 1, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        boolean boolean14 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test09077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09077");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) 'a', "hi!", "hi!");
        payment4.payDeposit();
    }

    @Test
    public void test09078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09078");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        payment.PaymentStrategy paymentStrategy18 = null;
        payment4.setPaymentStrategy(paymentStrategy18);
        payment.PaymentStrategy paymentStrategy20 = null;
        payment4.setPaymentStrategy(paymentStrategy20);
    }

    @Test
    public void test09079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09079");
        payment.Payment payment4 = new payment.Payment((-1L), (double) '#', "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean11 = payment4.paymentCompleted();
        boolean boolean12 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test09080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09080");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) '#', "", "hi!");
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test09081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09081");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payBalance();
        boolean boolean13 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        payment4.payDeposit();
        boolean boolean19 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test09082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09082");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean18 = payment4.paymentCompleted();
        boolean boolean19 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test09083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09083");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) (byte) -1, "", "hi!");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test09084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09084");
        payment.Payment payment4 = new payment.Payment((-1L), 0.0d, "", "hi!");
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test09085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09085");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) ' ', "", "hi!");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test09086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09086");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass15 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test09087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09087");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test09088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09088");
        payment.Payment payment4 = new payment.Payment((long) 1, 0.0d, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test09089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09089");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test09090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09090");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) 100, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test09091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09091");
        payment.Payment payment4 = new payment.Payment(0L, (double) (short) 1, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        boolean boolean13 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test09092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09092");
        payment.Payment payment4 = new payment.Payment((long) 100, 1.0d, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        boolean boolean8 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test09093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09093");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) (byte) 10, "", "hi!");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean10 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test09094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09094");
        payment.Payment payment4 = new payment.Payment((long) 'a', 0.0d, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test09095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09095");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean14 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean16 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test09096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09096");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) (-1.0f), "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test09097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09097");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) (short) 100, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
    }

    @Test
    public void test09098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09098");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) (short) 0, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test09099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09099");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean10 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy17 = null;
        payment4.setPaymentStrategy(paymentStrategy17);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test09100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09100");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test09101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09101");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) 10, "hi!", "hi!");
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test09102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09102");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (short) 0, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test09103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09103");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        boolean boolean9 = payment4.paymentCompleted();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass12 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test09104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09104");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean19 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy21 = null;
        payment4.setPaymentStrategy(paymentStrategy21);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test09105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09105");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean13 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        payment4.payBalance();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test09106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09106");
        payment.Payment payment4 = new payment.Payment((long) 10, (-1.0d), "hi!", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test09107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09107");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) ' ', "hi!", "hi!");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test09108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09108");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) 10L, "hi!", "hi!");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test09109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09109");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) 0, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test09110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09110");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) 100, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test09111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09111");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean11 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test09112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09112");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, 0.0d, "", "");
        payment4.payBalance();
        payment4.payBalance();
    }

    @Test
    public void test09113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09113");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) (-1L), "", "hi!");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test09114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09114");
        payment.Payment payment4 = new payment.Payment(10L, 0.0d, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test09115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09115");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) (-1), "", "hi!");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean11 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass12 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test09116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09116");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        boolean boolean15 = payment4.paymentCompleted();
        boolean boolean16 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass17 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test09117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09117");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test09118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09118");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass17 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test09119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09119");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) 10.0f, "", "");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test09120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09120");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) 100.0f, "", "hi!");
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
    }

    @Test
    public void test09121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09121");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) (short) 100, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test09122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09122");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, (double) 1.0f, "", "hi!");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test09123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09123");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) (short) 100, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass12 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test09124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09124");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) (byte) 1, "hi!", "");
        payment4.payDeposit();
        payment4.payDeposit();
    }

    @Test
    public void test09125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09125");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) (-1L), "", "hi!");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass12 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test09126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09126");
        payment.Payment payment4 = new payment.Payment(100L, (double) 'a', "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test09127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09127");
        payment.Payment payment4 = new payment.Payment(100L, (double) (short) 0, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy17 = null;
        payment4.setPaymentStrategy(paymentStrategy17);
        boolean boolean19 = payment4.paymentCompleted();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass21 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test09128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09128");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) (short) 100, "hi!", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test09129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09129");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payBalance();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean14 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        java.lang.Class<?> wildcardClass17 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test09130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09130");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) 1L, "", "");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
    }

    @Test
    public void test09131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09131");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        boolean boolean18 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test09132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09132");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payDeposit();
        boolean boolean14 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test09133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09133");
        payment.Payment payment4 = new payment.Payment(0L, (double) 10.0f, "", "hi!");
    }

    @Test
    public void test09134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09134");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) (-1), "", "hi!");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
    }

    @Test
    public void test09135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09135");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) (short) 10, "", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test09136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09136");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) '#', "", "");
        boolean boolean5 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test09137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09137");
        payment.Payment payment4 = new payment.Payment(0L, (double) 'a', "", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
    }

    @Test
    public void test09138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09138");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        payment.PaymentStrategy paymentStrategy17 = null;
        payment4.setPaymentStrategy(paymentStrategy17);
        boolean boolean19 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test09139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09139");
        payment.Payment payment4 = new payment.Payment((long) 10, 10.0d, "", "hi!");
    }

    @Test
    public void test09140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09140");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) (-1L), "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test09141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09141");
        payment.Payment payment4 = new payment.Payment(0L, (double) (byte) -1, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test09142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09142");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test09143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09143");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) (byte) 0, "hi!", "");
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test09144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09144");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) (-1.0f), "hi!", "hi!");
        payment4.payDeposit();
    }

    @Test
    public void test09145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09145");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        boolean boolean14 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass17 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test09146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09146");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) (byte) 10, "", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
    }

    @Test
    public void test09147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09147");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (byte) 1, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test09148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09148");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) '4', "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
    }

    @Test
    public void test09149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09149");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean11 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        boolean boolean14 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test09150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09150");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) (byte) 10, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        boolean boolean14 = payment4.paymentCompleted();
        boolean boolean15 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test09151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09151");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) 0L, "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
    }

    @Test
    public void test09152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09152");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) (short) 100, "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test09153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09153");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 10.0f, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
    }

    @Test
    public void test09154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09154");
        payment.Payment payment4 = new payment.Payment(100L, (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payBalance();
    }

    @Test
    public void test09155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09155");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (-1.0f), "hi!", "");
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test09156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09156");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 100L, "", "");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test09157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09157");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass15 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test09158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09158");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) (byte) 10, "", "hi!");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test09159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09159");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (-1L), "", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
    }

    @Test
    public void test09160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09160");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean14 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test09161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09161");
        payment.Payment payment4 = new payment.Payment(10L, (double) 100L, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test09162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09162");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (short) 10, "", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test09163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09163");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) (short) 0, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test09164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09164");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass15 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test09165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09165");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy20 = null;
        payment4.setPaymentStrategy(paymentStrategy20);
    }

    @Test
    public void test09166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09166");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) (-1.0f), "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test09167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09167");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 1L, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        boolean boolean16 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test09168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09168");
        payment.Payment payment4 = new payment.Payment(10L, (double) (byte) 100, "", "hi!");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test09169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09169");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean11 = payment4.paymentCompleted();
        boolean boolean12 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test09170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09170");
        payment.Payment payment4 = new payment.Payment((-1L), 1.0d, "", "hi!");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test09171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09171");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) '#', "", "hi!");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test09172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09172");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) (byte) 10, "hi!", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test09173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09173");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment4.payDeposit();
    }

    @Test
    public void test09174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09174");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        java.lang.Class<?> wildcardClass12 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test09175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09175");
        payment.Payment payment4 = new payment.Payment(100L, (double) (-1.0f), "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test09176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09176");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) 'a', "", "hi!");
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean12 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass16 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test09177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09177");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        payment.PaymentStrategy paymentStrategy17 = null;
        payment4.setPaymentStrategy(paymentStrategy17);
        java.lang.Class<?> wildcardClass19 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test09178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09178");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        payment4.payBalance();
    }

    @Test
    public void test09179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09179");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean10 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass17 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test09180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09180");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) 100L, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test09181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09181");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) (byte) 1, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
    }

    @Test
    public void test09182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09182");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 0L, "hi!", "hi!");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test09183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09183");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 0L, "hi!", "hi!");
        payment4.payDeposit();
        payment4.payDeposit();
    }

    @Test
    public void test09184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09184");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (byte) 1, "", "");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
    }

    @Test
    public void test09185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09185");
        payment.Payment payment4 = new payment.Payment((long) 1, (double) 10, "", "");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test09186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09186");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (-1), "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test09187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09187");
        payment.Payment payment4 = new payment.Payment(0L, (double) 10, "", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test09188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09188");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) 0.0f, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test09189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09189");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 1L, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payDeposit();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test09190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09190");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) '4', "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test09191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09191");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (short) 0, "", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test09192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09192");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) (short) 0, "", "hi!");
        payment4.payBalance();
    }

    @Test
    public void test09193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09193");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass12 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test09194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09194");
        payment.Payment payment4 = new payment.Payment((long) 100, (-1.0d), "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
    }

    @Test
    public void test09195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09195");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) 10, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test09196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09196");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean16 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass20 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test09197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09197");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) 0.0f, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test09198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09198");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test09199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09199");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy20 = null;
        payment4.setPaymentStrategy(paymentStrategy20);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy23 = null;
        payment4.setPaymentStrategy(paymentStrategy23);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test09200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09200");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) (-1), "", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test09201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09201");
        payment.Payment payment4 = new payment.Payment(100L, (double) (byte) -1, "hi!", "hi!");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test09202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09202");
        payment.Payment payment4 = new payment.Payment((long) 'a', 100.0d, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test09203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09203");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        boolean boolean14 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass15 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test09204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09204");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
    }

    @Test
    public void test09205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09205");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean13 = payment4.paymentCompleted();
        boolean boolean14 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test09206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09206");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) 10L, "", "");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test09207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09207");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        boolean boolean9 = payment4.paymentCompleted();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass12 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test09208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09208");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) '4', "", "");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payBalance();
    }

    @Test
    public void test09209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09209");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test09210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09210");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 1, "", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test09211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09211");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean17 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy19 = null;
        payment4.setPaymentStrategy(paymentStrategy19);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test09212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09212");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) 0L, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test09213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09213");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) 10L, "", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test09214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09214");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) (short) 10, "", "hi!");
    }

    @Test
    public void test09215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09215");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        boolean boolean11 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test09216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09216");
        payment.Payment payment4 = new payment.Payment(0L, (double) 10.0f, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test09217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09217");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, (double) (byte) 10, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test09218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09218");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) (short) 1, "", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test09219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09219");
        payment.Payment payment4 = new payment.Payment(100L, (double) (short) 10, "hi!", "");
        payment4.payDeposit();
    }

    @Test
    public void test09220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09220");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, 1.0d, "", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test09221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09221");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) '#', "hi!", "");
        payment4.payBalance();
    }

    @Test
    public void test09222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09222");
        payment.Payment payment4 = new payment.Payment((long) 1, (double) (byte) 0, "", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test09223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09223");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test09224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09224");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, 1.0d, "hi!", "");
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test09225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09225");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean15 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean17 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass18 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test09226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09226");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) (byte) 100, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test09227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09227");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) 0L, "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
    }

    @Test
    public void test09228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09228");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment4.payDeposit();
        boolean boolean17 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test09229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09229");
        payment.Payment payment4 = new payment.Payment(100L, (double) (byte) -1, "", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test09230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09230");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) 10L, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test09231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09231");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (short) 100, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test09232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09232");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "hi!");
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        boolean boolean12 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test09233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09233");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) 10, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test09234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09234");
        payment.Payment payment4 = new payment.Payment((long) 100, 0.0d, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test09235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09235");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean13 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass16 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test09236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09236");
        payment.Payment payment4 = new payment.Payment(100L, (double) 0, "hi!", "");
    }

    @Test
    public void test09237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09237");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) '4', "", "hi!");
        payment4.payBalance();
    }

    @Test
    public void test09238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09238");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) 0, "hi!", "hi!");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        boolean boolean12 = payment4.paymentCompleted();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass14 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test09239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09239");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        payment.PaymentStrategy paymentStrategy17 = null;
        payment4.setPaymentStrategy(paymentStrategy17);
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy21 = null;
        payment4.setPaymentStrategy(paymentStrategy21);
    }

    @Test
    public void test09240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09240");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (short) 10, "", "");
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test09241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09241");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (-1.0d), "", "hi!");
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test09242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09242");
        payment.Payment payment4 = new payment.Payment((long) 1, (double) 100, "", "");
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test09243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09243");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass16 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test09244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09244");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) 1, "", "hi!");
        payment4.payBalance();
    }

    @Test
    public void test09245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09245");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test09246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09246");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean11 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test09247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09247");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) (short) 0, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test09248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09248");
        payment.Payment payment4 = new payment.Payment((long) ' ', 100.0d, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test09249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09249");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) (short) -1, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test09250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09250");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean10 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        boolean boolean13 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy17 = null;
        payment4.setPaymentStrategy(paymentStrategy17);
        java.lang.Class<?> wildcardClass19 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test09251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09251");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) 10, "hi!", "");
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test09252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09252");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 1L, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test09253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09253");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        boolean boolean12 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test09254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09254");
        payment.Payment payment4 = new payment.Payment(1L, (double) (byte) 10, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test09255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09255");
        payment.Payment payment4 = new payment.Payment((long) 'a', 100.0d, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean11 = payment4.paymentCompleted();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test09256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09256");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) (short) 10, "", "hi!");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test09257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09257");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        boolean boolean14 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test09258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09258");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean7 = payment4.paymentCompleted();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test09259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09259");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) (byte) 100, "", "");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test09260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09260");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 10.0f, "hi!", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test09261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09261");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) (byte) -1, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
    }

    @Test
    public void test09262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09262");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, 10.0d, "", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass13 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test09263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09263");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, 1.0d, "", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test09264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09264");
        payment.Payment payment4 = new payment.Payment((-1L), 10.0d, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test09265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09265");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass13 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test09266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09266");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, 100.0d, "", "hi!");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
    }

    @Test
    public void test09267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09267");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) 100, "", "hi!");
        payment4.payBalance();
        payment4.payBalance();
    }

    @Test
    public void test09268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09268");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test09269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09269");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 0L, "hi!", "hi!");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
    }

    @Test
    public void test09270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09270");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        boolean boolean17 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test09271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09271");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) 0, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test09272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09272");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
    }

    @Test
    public void test09273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09273");
        payment.Payment payment4 = new payment.Payment((-1L), (double) '#', "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean14 = payment4.paymentCompleted();
        boolean boolean15 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass16 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test09274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09274");
        payment.Payment payment4 = new payment.Payment(0L, (double) (short) 100, "", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean11 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test09275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09275");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (-1.0f), "", "");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test09276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09276");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass16 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test09277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09277");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) ' ', "hi!", "hi!");
        payment4.payDeposit();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test09278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09278");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) '4', "", "");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        boolean boolean11 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass12 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test09279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09279");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) 0.0f, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
    }

    @Test
    public void test09280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09280");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        boolean boolean14 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test09281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09281");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean16 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test09282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09282");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) 1L, "", "");
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean8 = payment4.paymentCompleted();
        boolean boolean9 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test09283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09283");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) 100L, "", "");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test09284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09284");
        payment.Payment payment4 = new payment.Payment(100L, (double) (short) -1, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test09285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09285");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
    }

    @Test
    public void test09286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09286");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) (short) 100, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean9 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test09287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09287");
        payment.Payment payment4 = new payment.Payment((long) 'a', 0.0d, "", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test09288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09288");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass19 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test09289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09289");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean16 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass19 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test09290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09290");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy17 = null;
        payment4.setPaymentStrategy(paymentStrategy17);
        boolean boolean19 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test09291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09291");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (-1.0d), "hi!", "hi!");
        payment4.payDeposit();
    }

    @Test
    public void test09292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09292");
        payment.Payment payment4 = new payment.Payment(0L, (double) 1, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test09293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09293");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        boolean boolean13 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean16 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy17 = null;
        payment4.setPaymentStrategy(paymentStrategy17);
        payment.PaymentStrategy paymentStrategy19 = null;
        payment4.setPaymentStrategy(paymentStrategy19);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test09294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09294");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test09295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09295");
        payment.Payment payment4 = new payment.Payment(0L, 0.0d, "hi!", "hi!");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test09296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09296");
        payment.Payment payment4 = new payment.Payment(0L, (double) (short) 1, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test09297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09297");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, 0.0d, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean11 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        java.lang.Class<?> wildcardClass14 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test09298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09298");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass14 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test09299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09299");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) 0, "", "");
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test09300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09300");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass16 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test09301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09301");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (-1L), "", "");
        payment4.payBalance();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test09302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09302");
        payment.Payment payment4 = new payment.Payment(0L, (double) 'a', "", "");
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test09303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09303");
        payment.Payment payment4 = new payment.Payment(0L, (double) (byte) 10, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test09304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09304");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        java.lang.Class<?> wildcardClass18 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test09305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09305");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 100L, "hi!", "");
    }

    @Test
    public void test09306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09306");
        payment.Payment payment4 = new payment.Payment(0L, (double) (short) 1, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test09307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09307");
        payment.Payment payment4 = new payment.Payment((long) (-1), 1.0d, "hi!", "");
        payment4.payDeposit();
    }

    @Test
    public void test09308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09308");
        payment.Payment payment4 = new payment.Payment(0L, (double) 0L, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test09309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09309");
        payment.Payment payment4 = new payment.Payment((long) '4', 0.0d, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test09310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09310");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        java.lang.Class<?> wildcardClass17 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test09311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09311");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) (short) 100, "", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payBalance();
    }

    @Test
    public void test09312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09312");
        payment.Payment payment4 = new payment.Payment(100L, (double) (byte) 1, "", "hi!");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test09313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09313");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean10 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        boolean boolean13 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy19 = null;
        payment4.setPaymentStrategy(paymentStrategy19);
        boolean boolean21 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy22 = null;
        payment4.setPaymentStrategy(paymentStrategy22);
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test09314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09314");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) '4', "hi!", "");
        payment4.payDeposit();
    }

    @Test
    public void test09315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09315");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (-1.0f), "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test09316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09316");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test09317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09317");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test09318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09318");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) 'a', "hi!", "hi!");
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        boolean boolean12 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass15 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test09319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09319");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) 0.0f, "hi!", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
    }

    @Test
    public void test09320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09320");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test09321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09321");
        payment.Payment payment4 = new payment.Payment(1L, (double) (byte) -1, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test09322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09322");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
    }

    @Test
    public void test09323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09323");
        payment.Payment payment4 = new payment.Payment((-1L), (double) '#', "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test09324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09324");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) 10.0f, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        boolean boolean8 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test09325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09325");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) 1L, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test09326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09326");
        payment.Payment payment4 = new payment.Payment(1L, (double) (byte) 10, "hi!", "");
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment4.payDeposit();
    }

    @Test
    public void test09327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09327");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        boolean boolean14 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean16 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test09328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09328");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (short) -1, "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test09329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09329");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        payment4.verifyPaymentDetails();
        boolean boolean18 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy20 = null;
        payment4.setPaymentStrategy(paymentStrategy20);
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test09330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09330");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (short) 0, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
    }

    @Test
    public void test09331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09331");
        payment.Payment payment4 = new payment.Payment((long) 1, 1.0d, "hi!", "hi!");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean13 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test09332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09332");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) (-1L), "", "hi!");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean8 = payment4.paymentCompleted();
        boolean boolean9 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test09333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09333");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (-1.0d), "hi!", "");
    }

    @Test
    public void test09334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09334");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 1L, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test09335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09335");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy19 = null;
        payment4.setPaymentStrategy(paymentStrategy19);
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass22 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test09336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09336");
        payment.Payment payment4 = new payment.Payment(100L, 0.0d, "", "");
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test09337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09337");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, 0.0d, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
    }

    @Test
    public void test09338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09338");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) (short) 100, "", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
    }

    @Test
    public void test09339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09339");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) (-1), "", "hi!");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test09340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09340");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test09341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09341");
        payment.Payment payment4 = new payment.Payment(0L, (-1.0d), "hi!", "hi!");
        payment4.payBalance();
        payment4.payBalance();
    }

    @Test
    public void test09342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09342");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) (short) 0, "", "hi!");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test09343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09343");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (-1), "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test09344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09344");
        payment.Payment payment4 = new payment.Payment(0L, (double) (byte) 1, "hi!", "hi!");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test09345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09345");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy17 = null;
        payment4.setPaymentStrategy(paymentStrategy17);
    }

    @Test
    public void test09346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09346");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) ' ', "", "");
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test09347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09347");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) '4', "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test09348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09348");
        payment.Payment payment4 = new payment.Payment((long) 'a', 100.0d, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test09349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09349");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        java.lang.Class<?> wildcardClass14 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test09350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09350");
        payment.Payment payment4 = new payment.Payment((-1L), (double) '4', "hi!", "hi!");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
    }

    @Test
    public void test09351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09351");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) (short) -1, "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
    }

    @Test
    public void test09352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09352");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) 0.0f, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass12 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test09353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09353");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (short) 0, "", "");
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
    }

    @Test
    public void test09354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09354");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) '4', "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payBalance();
    }

    @Test
    public void test09355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09355");
        payment.Payment payment4 = new payment.Payment((long) 'a', 0.0d, "hi!", "hi!");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test09356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09356");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
    }

    @Test
    public void test09357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09357");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (short) -1, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean12 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test09358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09358");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) (-1L), "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test09359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09359");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test09360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09360");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) (short) 100, "", "hi!");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test09361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09361");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) '4', "", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
    }

    @Test
    public void test09362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09362");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) 'a', "", "hi!");
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
    }

    @Test
    public void test09363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09363");
        payment.Payment payment4 = new payment.Payment(0L, (double) (short) -1, "hi!", "");
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
    }

    @Test
    public void test09364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09364");
        payment.Payment payment4 = new payment.Payment(100L, 0.0d, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test09365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09365");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) (short) 100, "hi!", "hi!");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment4.payBalance();
    }

    @Test
    public void test09366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09366");
        payment.Payment payment4 = new payment.Payment(0L, (double) 1L, "", "hi!");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test09367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09367");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) (-1.0f), "", "hi!");
    }

    @Test
    public void test09368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09368");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payBalance();
        boolean boolean15 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test09369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09369");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test09370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09370");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (-1.0f), "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test09371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09371");
        payment.Payment payment4 = new payment.Payment((long) '4', 0.0d, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean12 = payment4.paymentCompleted();
        boolean boolean13 = payment4.paymentCompleted();
        boolean boolean14 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test09372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09372");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        boolean boolean11 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean16 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy18 = null;
        payment4.setPaymentStrategy(paymentStrategy18);
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test09373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09373");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) '#', "", "hi!");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
    }

    @Test
    public void test09374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09374");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) (byte) 10, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test09375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09375");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payBalance();
    }

    @Test
    public void test09376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09376");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) 100L, "hi!", "hi!");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test09377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09377");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 0L, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test09378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09378");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) 10.0f, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payBalance();
        payment4.payDeposit();
    }

    @Test
    public void test09379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09379");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) 0L, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test09380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09380");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) (short) 100, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test09381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09381");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 0, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test09382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09382");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        boolean boolean12 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test09383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09383");
        payment.Payment payment4 = new payment.Payment(0L, (double) 10.0f, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        boolean boolean12 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test09384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09384");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        boolean boolean9 = payment4.paymentCompleted();
        boolean boolean10 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test09385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09385");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) 100L, "", "hi!");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
    }

    @Test
    public void test09386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09386");
        payment.Payment payment4 = new payment.Payment((-1L), 10.0d, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean9 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test09387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09387");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        java.lang.Class<?> wildcardClass15 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test09388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09388");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean16 = payment4.paymentCompleted();
        boolean boolean17 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test09389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09389");
        payment.Payment payment4 = new payment.Payment(10L, (double) (byte) 100, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test09390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09390");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (byte) 0, "", "hi!");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass12 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test09391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09391");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, 0.0d, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test09392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09392");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test09393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09393");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) (byte) 1, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean7 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test09394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09394");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        java.lang.Class<?> wildcardClass17 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test09395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09395");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, 100.0d, "hi!", "");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test09396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09396");
        payment.Payment payment4 = new payment.Payment((long) 'a', 100.0d, "", "hi!");
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test09397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09397");
        payment.Payment payment4 = new payment.Payment(0L, 0.0d, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
    }

    @Test
    public void test09398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09398");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) 100.0f, "", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test09399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09399");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) 10L, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test09400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09400");
        payment.Payment payment4 = new payment.Payment(100L, (double) (short) 0, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test09401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09401");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) 100, "", "hi!");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test09402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09402");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) 100.0f, "", "");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test09403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09403");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy18 = null;
        payment4.setPaymentStrategy(paymentStrategy18);
        payment.PaymentStrategy paymentStrategy20 = null;
        payment4.setPaymentStrategy(paymentStrategy20);
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test09404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09404");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
    }

    @Test
    public void test09405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09405");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) 1.0f, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test09406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09406");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (byte) 1, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
    }

    @Test
    public void test09407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09407");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) (short) 0, "hi!", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test09408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09408");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) (short) 0, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test09409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09409");
        payment.Payment payment4 = new payment.Payment(100L, (double) (short) -1, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test09410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09410");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) 100, "hi!", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test09411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09411");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        boolean boolean15 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy21 = null;
        payment4.setPaymentStrategy(paymentStrategy21);
        java.lang.Class<?> wildcardClass23 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test09412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09412");
        payment.Payment payment4 = new payment.Payment((long) 'a', 0.0d, "", "");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
    }

    @Test
    public void test09413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09413");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, 100.0d, "", "hi!");
        payment4.payBalance();
    }

    @Test
    public void test09414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09414");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.payDeposit();
    }

    @Test
    public void test09415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09415");
        payment.Payment payment4 = new payment.Payment((long) 'a', 100.0d, "", "hi!");
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test09416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09416");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payDeposit();
        boolean boolean14 = payment4.paymentCompleted();
        boolean boolean15 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass16 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test09417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09417");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean13 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        java.lang.Class<?> wildcardClass17 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test09418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09418");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) 10L, "hi!", "");
        payment4.payDeposit();
        payment4.payBalance();
    }

    @Test
    public void test09419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09419");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (byte) 1, "", "");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payBalance();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test09420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09420");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy17 = null;
        payment4.setPaymentStrategy(paymentStrategy17);
        java.lang.Class<?> wildcardClass19 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test09421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09421");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) (-1.0f), "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test09422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09422");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) 0L, "", "");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test09423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09423");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) '#', "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass12 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test09424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09424");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test09425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09425");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) (byte) -1, "", "hi!");
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test09426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09426");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) 10.0f, "", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
    }

    @Test
    public void test09427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09427");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 1, "", "hi!");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test09428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09428");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) (-1L), "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test09429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09429");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) (-1), "", "hi!");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test09430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09430");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        boolean boolean9 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean16 = payment4.paymentCompleted();
        boolean boolean17 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test09431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09431");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) ' ', "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test09432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09432");
        payment.Payment payment4 = new payment.Payment(0L, (double) (-1), "", "");
        payment4.payDeposit();
    }

    @Test
    public void test09433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09433");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, 10.0d, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test09434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09434");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean13 = payment4.paymentCompleted();
        boolean boolean14 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test09435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09435");
        payment.Payment payment4 = new payment.Payment((-1L), (double) '#', "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean13 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test09436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09436");
        payment.Payment payment4 = new payment.Payment(100L, (double) (-1), "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test09437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09437");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) 0, "hi!", "hi!");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean15 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test09438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09438");
        payment.Payment payment4 = new payment.Payment((-1L), (double) '#', "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
    }

    @Test
    public void test09439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09439");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) 100, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test09440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09440");
        payment.Payment payment4 = new payment.Payment(0L, (double) (byte) 0, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test09441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09441");
        payment.Payment payment4 = new payment.Payment((long) ' ', 100.0d, "", "");
        payment4.payBalance();
        payment4.payBalance();
    }

    @Test
    public void test09442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09442");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (byte) 1, "hi!", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test09443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09443");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 100, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
    }

    @Test
    public void test09444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09444");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) (-1), "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test09445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09445");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (short) 1, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
    }

    @Test
    public void test09446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09446");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) (short) 1, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test09447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09447");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) 'a', "hi!", "hi!");
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        boolean boolean9 = payment4.paymentCompleted();
        boolean boolean10 = payment4.paymentCompleted();
        boolean boolean11 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass12 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test09448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09448");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, (double) 0.0f, "hi!", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test09449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09449");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, 100.0d, "", "");
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test09450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09450");
        payment.Payment payment4 = new payment.Payment((-1L), (double) '#', "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test09451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09451");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) 'a', "hi!", "hi!");
    }

    @Test
    public void test09452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09452");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test09453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09453");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, 1.0d, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean11 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test09454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09454");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean15 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy18 = null;
        payment4.setPaymentStrategy(paymentStrategy18);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test09455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09455");
        payment.Payment payment4 = new payment.Payment(0L, (double) 1L, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test09456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09456");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) (-1L), "", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test09457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09457");
        payment.Payment payment4 = new payment.Payment(100L, (double) (short) 0, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test09458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09458");
        payment.Payment payment4 = new payment.Payment((long) 1, (double) 100, "hi!", "hi!");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test09459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09459");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) (short) 100, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        boolean boolean12 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test09460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09460");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, 1.0d, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test09461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09461");
        payment.Payment payment4 = new payment.Payment((-1L), (double) '#', "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        boolean boolean10 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test09462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09462");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) 10L, "hi!", "hi!");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test09463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09463");
        payment.Payment payment4 = new payment.Payment(0L, (double) 1.0f, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test09464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09464");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) (byte) 1, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test09465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09465");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, 10.0d, "", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payBalance();
        boolean boolean12 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test09466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09466");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        boolean boolean13 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test09467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09467");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) 0, "hi!", "hi!");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payBalance();
    }

    @Test
    public void test09468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09468");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, 1.0d, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test09469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09469");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) 1L, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test09470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09470");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, 0.0d, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test09471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09471");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) (-1L), "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
    }

    @Test
    public void test09472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09472");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (-1.0f), "hi!", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
    }

    @Test
    public void test09473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09473");
        payment.Payment payment4 = new payment.Payment(1L, 1.0d, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass13 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test09474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09474");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        boolean boolean15 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test09475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09475");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) (-1L), "", "hi!");
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test09476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09476");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) 100L, "", "");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test09477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09477");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, 1.0d, "hi!", "");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
    }

    @Test
    public void test09478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09478");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) (short) 1, "", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test09479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09479");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) 10L, "hi!", "hi!");
        payment4.payBalance();
    }

    @Test
    public void test09480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09480");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) '#', "", "");
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test09481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09481");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, 100.0d, "hi!", "");
        payment4.payDeposit();
    }

    @Test
    public void test09482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09482");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) (byte) 10, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test09483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09483");
        payment.Payment payment4 = new payment.Payment((long) 1, (double) 1L, "", "hi!");
        payment4.payBalance();
    }

    @Test
    public void test09484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09484");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) 100.0f, "", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        java.lang.Class<?> wildcardClass12 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test09485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09485");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) (-1L), "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
    }

    @Test
    public void test09486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09486");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        boolean boolean9 = payment4.paymentCompleted();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass16 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test09487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09487");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) (byte) 10, "", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test09488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09488");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) (short) 100, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        boolean boolean10 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test09489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09489");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean16 = payment4.paymentCompleted();
        boolean boolean17 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test09490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09490");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, 1.0d, "", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test09491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09491");
        payment.Payment payment4 = new payment.Payment(10L, (double) '4', "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test09492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09492");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        payment4.payBalance();
        boolean boolean18 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy19 = null;
        payment4.setPaymentStrategy(paymentStrategy19);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test09493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09493");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, 100.0d, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test09494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09494");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 1L, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        boolean boolean8 = payment4.paymentCompleted();
        boolean boolean9 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payBalance();
        boolean boolean13 = payment4.paymentCompleted();
        boolean boolean14 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test09495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09495");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 0, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test09496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09496");
        payment.Payment payment4 = new payment.Payment((long) 'a', 10.0d, "hi!", "");
    }

    @Test
    public void test09497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09497");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) (byte) 100, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
    }

    @Test
    public void test09498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09498");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) (byte) 10, "", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test09499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09499");
        payment.Payment payment4 = new payment.Payment(1L, (double) (short) 0, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test09500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test09500");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        boolean boolean7 = payment4.paymentCompleted();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }
}

