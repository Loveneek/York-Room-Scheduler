import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest29 {

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
    public void test14501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14501");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) (-1.0f), "hi!", "");
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14502");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (short) 1, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test14503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14503");
        payment.Payment payment4 = new payment.Payment(0L, (double) 10.0f, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payDeposit();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass14 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test14504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14504");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) 1.0f, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test14505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14505");
        payment.Payment payment4 = new payment.Payment((long) 1, (double) (short) 100, "", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14506");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) 1L, "hi!", "hi!");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test14507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14507");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test14508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14508");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (short) 0, "", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
    }

    @Test
    public void test14509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14509");
        payment.Payment payment4 = new payment.Payment(10L, (double) (-1), "", "hi!");
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14510");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) (short) 100, "", "hi!");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean16 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass17 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test14511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14511");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, (double) 0L, "", "");
        payment4.payBalance();
    }

    @Test
    public void test14512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14512");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) 1.0f, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean13 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test14513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14513");
        payment.Payment payment4 = new payment.Payment((long) 'a', 1.0d, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14514");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) (short) 100, "hi!", "hi!");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        boolean boolean11 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        java.lang.Class<?> wildcardClass14 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test14515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14515");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) 10.0f, "", "hi!");
        payment4.payBalance();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14516");
        payment.Payment payment4 = new payment.Payment((long) '4', 0.0d, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14517");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) 1.0f, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14518");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 1, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test14519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14519");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) 100, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14520");
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
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        boolean boolean23 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test14521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14521");
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
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
    }

    @Test
    public void test14522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14522");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (-1.0d), "", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
    }

    @Test
    public void test14523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14523");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (short) 100, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        boolean boolean7 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14524");
        payment.Payment payment4 = new payment.Payment(10L, (double) (-1.0f), "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14525");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) 100.0f, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
    }

    @Test
    public void test14526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14526");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) (byte) 1, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass13 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test14527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14527");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        boolean boolean14 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test14528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14528");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test14529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14529");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payDeposit();
        boolean boolean15 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy17 = null;
        payment4.setPaymentStrategy(paymentStrategy17);
        java.lang.Class<?> wildcardClass19 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test14530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14530");
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
        boolean boolean18 = payment4.paymentCompleted();
        boolean boolean19 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test14531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14531");
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
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass21 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test14532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14532");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) (short) 0, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test14533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14533");
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
        payment4.payBalance();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14534");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
    }

    @Test
    public void test14535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14535");
        payment.Payment payment4 = new payment.Payment((-1L), (double) '#', "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean10 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14536");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean18 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy19 = null;
        payment4.setPaymentStrategy(paymentStrategy19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test14537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14537");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14538");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) (short) -1, "hi!", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14539");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, (double) (short) 100, "hi!", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14540");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14541");
        payment.Payment payment4 = new payment.Payment(100L, (double) (short) -1, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14542");
        payment.Payment payment4 = new payment.Payment((long) 'a', 0.0d, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14543");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, 0.0d, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14544");
        payment.Payment payment4 = new payment.Payment((long) 'a', 100.0d, "", "hi!");
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
    }

    @Test
    public void test14545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14545");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) 10.0f, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14546");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy19 = null;
        payment4.setPaymentStrategy(paymentStrategy19);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14547");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        boolean boolean12 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean14 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass15 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test14548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14548");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, 100.0d, "hi!", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14549");
        payment.Payment payment4 = new payment.Payment((-1L), (double) '#', "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14550");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) 10, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14551");
        payment.Payment payment4 = new payment.Payment(10L, (double) (short) 10, "", "hi!");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
    }

    @Test
    public void test14552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14552");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean16 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy19 = null;
        payment4.setPaymentStrategy(paymentStrategy19);
        boolean boolean21 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test14553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14553");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) 100L, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean9 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test14554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14554");
        payment.Payment payment4 = new payment.Payment((-1L), (double) '#', "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payBalance();
    }

    @Test
    public void test14555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14555");
        payment.Payment payment4 = new payment.Payment(100L, (double) (-1L), "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14556");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass14 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test14557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14557");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) (byte) 1, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14558");
        payment.Payment payment4 = new payment.Payment(100L, (double) 1, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14559");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean13 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test14560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14560");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean14 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        java.lang.Class<?> wildcardClass17 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test14561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14561");
        payment.Payment payment4 = new payment.Payment(0L, 0.0d, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14562");
        payment.Payment payment4 = new payment.Payment(0L, (double) (short) -1, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14563");
        payment.Payment payment4 = new payment.Payment((long) '4', 0.0d, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test14564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14564");
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
        payment4.payDeposit();
        boolean boolean16 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass19 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test14565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14565");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) (short) 0, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        boolean boolean11 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test14566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14566");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) '4', "", "");
        boolean boolean5 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14567");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) (-1L), "", "hi!");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test14568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14568");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) (-1L), "", "");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test14569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14569");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) (byte) 10, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14570");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (byte) 1, "", "");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean16 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test14571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14571");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) (byte) 1, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14572");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) (short) 0, "", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
    }

    @Test
    public void test14573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14573");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14574");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.payDeposit();
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
        payment4.verifyPaymentDetails();
        boolean boolean18 = payment4.paymentCompleted();
        boolean boolean19 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy20 = null;
        payment4.setPaymentStrategy(paymentStrategy20);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test14575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14575");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, 0.0d, "", "");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14576");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) 0L, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean14 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test14577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14577");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14578");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) (byte) 10, "", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test14579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14579");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 100L, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14580");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) (byte) 10, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14581");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) 0.0f, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean9 = payment4.paymentCompleted();
        boolean boolean10 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14582");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        boolean boolean12 = payment4.paymentCompleted();
        boolean boolean13 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean15 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy17 = null;
        payment4.setPaymentStrategy(paymentStrategy17);
        payment.PaymentStrategy paymentStrategy19 = null;
        payment4.setPaymentStrategy(paymentStrategy19);
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test14583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14583");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, 0.0d, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14584");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 1L, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass13 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test14585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14585");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        java.lang.Class<?> wildcardClass17 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test14586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14586");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, 0.0d, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        boolean boolean11 = payment4.paymentCompleted();
        boolean boolean12 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test14587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14587");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) (-1L), "", "hi!");
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
    }

    @Test
    public void test14588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14588");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14589");
        payment.Payment payment4 = new payment.Payment((long) 'a', 0.0d, "", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        java.lang.Class<?> wildcardClass14 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test14590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14590");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) 0, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14591");
        payment.Payment payment4 = new payment.Payment((long) '4', 0.0d, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14592");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) ' ', "hi!", "hi!");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14593");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        boolean boolean9 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test14594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14594");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, (double) 0, "", "hi!");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
    }

    @Test
    public void test14595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14595");
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
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        payment.PaymentStrategy paymentStrategy18 = null;
        payment4.setPaymentStrategy(paymentStrategy18);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy21 = null;
        payment4.setPaymentStrategy(paymentStrategy21);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14596");
        payment.Payment payment4 = new payment.Payment(0L, (double) 0L, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payDeposit();
        payment4.payBalance();
    }

    @Test
    public void test14597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14597");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) 0.0f, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payDeposit();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14598");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass14 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test14599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14599");
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
        boolean boolean21 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test14600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14600");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (-1L), "hi!", "hi!");
        payment4.payDeposit();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test14601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14601");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test14602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14602");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) ' ', "", "hi!");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        boolean boolean11 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test14603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14603");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, 0.0d, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14604");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) (short) 0, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14605");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        boolean boolean12 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy18 = null;
        payment4.setPaymentStrategy(paymentStrategy18);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test14606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14606");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        boolean boolean17 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        boolean boolean20 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy21 = null;
        payment4.setPaymentStrategy(paymentStrategy21);
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test14607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14607");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) 1L, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
    }

    @Test
    public void test14608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14608");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) 0, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14609");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, 0.0d, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14610");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, 1.0d, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean12 = payment4.paymentCompleted();
        boolean boolean13 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test14611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14611");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) (short) 100, "", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14612");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14613");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) 0, "hi!", "hi!");
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test14614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14614");
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
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14615");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) 100.0f, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14616");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) (short) 0, "hi!", "hi!");
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payBalance();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14617");
        payment.Payment payment4 = new payment.Payment(10L, (double) (byte) 0, "hi!", "hi!");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
    }

    @Test
    public void test14618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14618");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) 0L, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean13 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test14619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14619");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (-1), "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14620");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        boolean boolean16 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test14621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14621");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) 0L, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payBalance();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test14622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14622");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) (-1L), "", "hi!");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payBalance();
        boolean boolean11 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test14623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14623");
        payment.Payment payment4 = new payment.Payment((-1L), (double) '#', "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payDeposit();
    }

    @Test
    public void test14624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14624");
        payment.Payment payment4 = new payment.Payment(1L, (double) (byte) -1, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        boolean boolean12 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test14625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14625");
        payment.Payment payment4 = new payment.Payment(10L, (double) (short) 1, "", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
    }

    @Test
    public void test14626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14626");
        payment.Payment payment4 = new payment.Payment(0L, (double) (-1L), "hi!", "hi!");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14627");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test14628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14628");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment4.payDeposit();
    }

    @Test
    public void test14629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14629");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) (byte) 1, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.verifyPaymentDetails();
        boolean boolean14 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test14630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14630");
        payment.Payment payment4 = new payment.Payment((long) 1, (double) (byte) 0, "", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14631");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) 10.0f, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
    }

    @Test
    public void test14632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14632");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        boolean boolean12 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        boolean boolean17 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test14633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14633");
        payment.Payment payment4 = new payment.Payment(0L, (double) (byte) 10, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14634");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) (short) 0, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14635");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 1L, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean10 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14636");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean16 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test14637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14637");
        payment.Payment payment4 = new payment.Payment(10L, 100.0d, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14638");
        payment.Payment payment4 = new payment.Payment(1L, (double) (-1L), "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
    }

    @Test
    public void test14639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14639");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) 100.0f, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
    }

    @Test
    public void test14640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14640");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14641");
        payment.Payment payment4 = new payment.Payment(10L, 0.0d, "", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14642");
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
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        boolean boolean18 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test14643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14643");
        payment.Payment payment4 = new payment.Payment((-1L), (double) ' ', "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14644");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) (-1), "", "");
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14645");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) 1, "hi!", "hi!");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test14646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14646");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (byte) 100, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14647");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy17 = null;
        payment4.setPaymentStrategy(paymentStrategy17);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy20 = null;
        payment4.setPaymentStrategy(paymentStrategy20);
        java.lang.Class<?> wildcardClass22 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test14648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14648");
        payment.Payment payment4 = new payment.Payment(10L, (double) (-1.0f), "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
    }

    @Test
    public void test14649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14649");
        payment.Payment payment4 = new payment.Payment(10L, (double) (-1), "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14650");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) 0.0f, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14651");
        payment.Payment payment4 = new payment.Payment(100L, (double) (-1.0f), "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14652");
        payment.Payment payment4 = new payment.Payment((-1L), (double) '#', "", "hi!");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14653");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payDeposit();
        boolean boolean12 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        boolean boolean15 = payment4.paymentCompleted();
        boolean boolean16 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean18 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test14654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14654");
        payment.Payment payment4 = new payment.Payment((long) 'a', 0.0d, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14655");
        payment.Payment payment4 = new payment.Payment((long) 1, (double) '#', "hi!", "hi!");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        boolean boolean8 = payment4.paymentCompleted();
        boolean boolean9 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test14656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14656");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (byte) 1, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        boolean boolean12 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass13 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test14657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14657");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 100, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14658");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean16 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test14659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14659");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) (byte) 10, "", "hi!");
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14660");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean15 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        boolean boolean18 = payment4.paymentCompleted();
        boolean boolean19 = payment4.paymentCompleted();
        boolean boolean20 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test14661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14661");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        boolean boolean14 = payment4.paymentCompleted();
        boolean boolean15 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test14662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14662");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, 0.0d, "", "");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean11 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass12 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test14663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14663");
        payment.Payment payment4 = new payment.Payment(10L, 0.0d, "hi!", "");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
    }

    @Test
    public void test14664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14664");
        payment.Payment payment4 = new payment.Payment((long) 1, 0.0d, "hi!", "hi!");
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean13 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test14665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14665");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) (-1), "", "hi!");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14666");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (-1.0f), "hi!", "");
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        boolean boolean10 = payment4.paymentCompleted();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test14667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14667");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean13 = payment4.paymentCompleted();
        boolean boolean14 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test14668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14668");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        boolean boolean10 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14669");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) (short) 100, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean9 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test14670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14670");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) 0, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test14671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14671");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) 1.0f, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
    }

    @Test
    public void test14672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14672");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        payment.PaymentStrategy paymentStrategy18 = null;
        payment4.setPaymentStrategy(paymentStrategy18);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14673");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) (byte) -1, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass12 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test14674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14674");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean17 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy18 = null;
        payment4.setPaymentStrategy(paymentStrategy18);
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass21 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test14675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14675");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean14 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test14676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14676");
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
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test14677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14677");
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
        java.lang.Class<?> wildcardClass14 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test14678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14678");
        payment.Payment payment4 = new payment.Payment((long) '4', 1.0d, "", "hi!");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14679");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        java.lang.Class<?> wildcardClass17 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test14680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14680");
        payment.Payment payment4 = new payment.Payment((long) '4', 0.0d, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        boolean boolean14 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass15 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test14681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14681");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) 100.0f, "", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14682");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, 1.0d, "hi!", "");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
    }

    @Test
    public void test14683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14683");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, 0.0d, "", "");
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test14684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14684");
        payment.Payment payment4 = new payment.Payment((long) 'a', 0.0d, "", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
    }

    @Test
    public void test14685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14685");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 100, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test14686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14686");
        payment.Payment payment4 = new payment.Payment(0L, (double) 1L, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test14687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14687");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) 100, "hi!", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14688");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) 10, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14689");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payDeposit();
        boolean boolean13 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        java.lang.Class<?> wildcardClass18 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test14690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14690");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (byte) 1, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean12 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test14691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14691");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        boolean boolean14 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test14692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14692");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) '4', "", "hi!");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
    }

    @Test
    public void test14693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14693");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) 1, "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
    }

    @Test
    public void test14694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14694");
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
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass21 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test14695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14695");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) 100.0f, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        boolean boolean8 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14696");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment4.payBalance();
        boolean boolean17 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy18 = null;
        payment4.setPaymentStrategy(paymentStrategy18);
        payment.PaymentStrategy paymentStrategy20 = null;
        payment4.setPaymentStrategy(paymentStrategy20);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test14697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14697");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) (short) 1, "", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test14698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14698");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 1, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14699");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) 1.0f, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payBalance();
        boolean boolean15 = payment4.paymentCompleted();
        boolean boolean16 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy19 = null;
        payment4.setPaymentStrategy(paymentStrategy19);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test14700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14700");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.payDeposit();
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
        payment4.verifyPaymentDetails();
        boolean boolean20 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy23 = null;
        payment4.setPaymentStrategy(paymentStrategy23);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test14701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14701");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, 10.0d, "", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payBalance();
        java.lang.Class<?> wildcardClass13 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test14702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14702");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14703");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) ' ', "", "");
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payDeposit();
        boolean boolean11 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test14704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14704");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) (byte) 100, "", "hi!");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14705");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) (byte) 10, "", "hi!");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
    }

    @Test
    public void test14706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14706");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) (-1), "hi!", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test14707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14707");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) (short) 100, "", "hi!");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payBalance();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test14708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14708");
        payment.Payment payment4 = new payment.Payment(10L, (double) '4', "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
    }

    @Test
    public void test14709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14709");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (-1L), "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14710");
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
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean20 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test14711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14711");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test14712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14712");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) 100L, "", "hi!");
        payment4.payBalance();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14713");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) (-1.0f), "", "hi!");
    }

    @Test
    public void test14714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14714");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14715");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (byte) 1, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test14716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14716");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) 1L, "", "");
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14717");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) (-1L), "", "hi!");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14718");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        boolean boolean14 = payment4.paymentCompleted();
        boolean boolean15 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test14719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14719");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) 100, "", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14720");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, 0.0d, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test14721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14721");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) '4', "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean10 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14722");
        payment.Payment payment4 = new payment.Payment((-1L), (double) '#', "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14723");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, 0.0d, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14724");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
    }

    @Test
    public void test14725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14725");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        boolean boolean14 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test14726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14726");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) 100L, "", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14727");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        boolean boolean12 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test14728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14728");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (short) 0, "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean7 = payment4.paymentCompleted();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14729");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) (byte) 1, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
    }

    @Test
    public void test14730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14730");
        payment.Payment payment4 = new payment.Payment((long) 'a', 0.0d, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test14731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14731");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 1L, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean12 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test14732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14732");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14733");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (-1), "hi!", "hi!");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        boolean boolean11 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test14734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14734");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 1L, "", "hi!");
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
    }

    @Test
    public void test14735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14735");
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
        boolean boolean15 = payment4.paymentCompleted();
        boolean boolean16 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass17 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test14736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14736");
        payment.Payment payment4 = new payment.Payment((long) 'a', 100.0d, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14737");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14738");
        payment.Payment payment4 = new payment.Payment(0L, (double) 0.0f, "", "hi!");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test14739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14739");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (byte) 1, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test14740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14740");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) (byte) 1, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test14741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14741");
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
        payment4.payDeposit();
        boolean boolean15 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test14742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14742");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        java.lang.Class<?> wildcardClass16 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test14743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14743");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) '4', "", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14744");
        payment.Payment payment4 = new payment.Payment((long) '#', 0.0d, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14745");
        payment.Payment payment4 = new payment.Payment(1L, (double) 1.0f, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14746");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) 0, "hi!", "hi!");
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14747");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        boolean boolean15 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test14748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14748");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, 0.0d, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        java.lang.Class<?> wildcardClass12 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test14749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14749");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payDeposit();
        boolean boolean15 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test14750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14750");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) 1.0f, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean12 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass13 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test14751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14751");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) 1.0f, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        boolean boolean16 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy17 = null;
        payment4.setPaymentStrategy(paymentStrategy17);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test14752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14752");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
    }

    @Test
    public void test14753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14753");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test14754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14754");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) 'a', "", "");
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14755");
        payment.Payment payment4 = new payment.Payment(0L, (double) 1L, "", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass13 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test14756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14756");
        payment.Payment payment4 = new payment.Payment((long) 1, (double) '#', "hi!", "hi!");
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14757");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) -1, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14758");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean13 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test14759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14759");
        payment.Payment payment4 = new payment.Payment((long) 100, 100.0d, "hi!", "hi!");
        payment4.payBalance();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test14760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14760");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) (short) -1, "", "hi!");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14761");
        payment.Payment payment4 = new payment.Payment((long) 'a', 0.0d, "", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
    }

    @Test
    public void test14762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14762");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 1L, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean15 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test14763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14763");
        payment.Payment payment4 = new payment.Payment(0L, 100.0d, "hi!", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14764");
        payment.Payment payment4 = new payment.Payment(0L, (double) ' ', "hi!", "hi!");
        payment4.payDeposit();
        payment4.payDeposit();
    }

    @Test
    public void test14765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14765");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test14766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14766");
        payment.Payment payment4 = new payment.Payment((long) 1, 0.0d, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14767");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy18 = null;
        payment4.setPaymentStrategy(paymentStrategy18);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test14768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14768");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, 0.0d, "", "");
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test14769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14769");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        boolean boolean15 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean18 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test14770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14770");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payBalance();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass17 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test14771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14771");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, 0.0d, "", "");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14772");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        boolean boolean12 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        boolean boolean15 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass16 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test14773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14773");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) 0.0f, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
    }

    @Test
    public void test14774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14774");
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
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment4.verifyPaymentDetails();
        boolean boolean17 = payment4.paymentCompleted();
        boolean boolean18 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test14775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14775");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14776");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) -1, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14777");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.verifyPaymentDetails();
        boolean boolean15 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test14778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14778");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) 0L, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
    }

    @Test
    public void test14779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14779");
        payment.Payment payment4 = new payment.Payment(0L, (double) '4', "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14780");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) (-1), "", "hi!");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        boolean boolean12 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test14781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14781");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) 100.0f, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean11 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        java.lang.Class<?> wildcardClass14 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test14782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14782");
        payment.Payment payment4 = new payment.Payment(100L, (double) 'a', "", "hi!");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
    }

    @Test
    public void test14783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14783");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, 1.0d, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14784");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) (short) 0, "hi!", "hi!");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test14785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14785");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) 0.0f, "", "");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test14786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14786");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (-1.0d), "", "hi!");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14787");
        payment.Payment payment4 = new payment.Payment(100L, (double) 1L, "hi!", "");
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14788");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) 100.0f, "", "hi!");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14789");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) (byte) -1, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14790");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
    }

    @Test
    public void test14791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14791");
        payment.Payment payment4 = new payment.Payment((-1L), 0.0d, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14792");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean14 = payment4.paymentCompleted();
        boolean boolean15 = payment4.paymentCompleted();
        boolean boolean16 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test14793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14793");
        payment.Payment payment4 = new payment.Payment(1L, 0.0d, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14794");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) 0.0f, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14795");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) 1.0f, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
    }

    @Test
    public void test14796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14796");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) 1L, "hi!", "");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test14797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14797");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) (-1.0f), "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14798");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) '#', "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
    }

    @Test
    public void test14799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14799");
        payment.Payment payment4 = new payment.Payment(1L, (double) 10L, "hi!", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test14800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14800");
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
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        java.lang.Class<?> wildcardClass17 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test14801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14801");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14802");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) (-1), "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14803");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        boolean boolean11 = payment4.paymentCompleted();
        boolean boolean12 = payment4.paymentCompleted();
        boolean boolean13 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean15 = payment4.paymentCompleted();
        boolean boolean16 = payment4.paymentCompleted();
        boolean boolean17 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test14804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14804");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 10.0f, "", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14805");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) 100, "", "");
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14806");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) '#', "hi!", "hi!");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14807");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14808");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean13 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass14 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test14809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14809");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payDeposit();
        boolean boolean14 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy17 = null;
        payment4.setPaymentStrategy(paymentStrategy17);
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass20 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test14810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14810");
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
        boolean boolean15 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        payment.PaymentStrategy paymentStrategy18 = null;
        payment4.setPaymentStrategy(paymentStrategy18);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test14811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14811");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (-1.0d), "", "hi!");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14812");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, 0.0d, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        java.lang.Class<?> wildcardClass12 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test14813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14813");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14814");
        payment.Payment payment4 = new payment.Payment((long) 1, (double) (-1L), "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test14815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14815");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean13 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean15 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test14816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14816");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) '#', "hi!", "hi!");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean9 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test14817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14817");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, (double) (short) 0, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14818");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) 10.0f, "", "hi!");
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14819");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) ' ', "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass12 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test14820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14820");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) 100.0f, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14821");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) '4', "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
    }

    @Test
    public void test14822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14822");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) 1, "hi!", "hi!");
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14823");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        boolean boolean12 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test14824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14824");
        payment.Payment payment4 = new payment.Payment(10L, (double) 100L, "", "hi!");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14825");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (byte) -1, "hi!", "hi!");
        payment4.payBalance();
        payment4.payBalance();
    }

    @Test
    public void test14826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14826");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) 0.0f, "", "");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test14827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14827");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean8 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test14828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14828");
        payment.Payment payment4 = new payment.Payment(0L, (double) (byte) -1, "", "hi!");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
    }

    @Test
    public void test14829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14829");
        payment.Payment payment4 = new payment.Payment(100L, (double) (short) 0, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14830");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, 1.0d, "hi!", "hi!");
    }

    @Test
    public void test14831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14831");
        payment.Payment payment4 = new payment.Payment((long) '4', 0.0d, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test14832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14832");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (byte) 1, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
    }

    @Test
    public void test14833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14833");
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
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14834");
        payment.Payment payment4 = new payment.Payment(0L, (double) 1L, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean10 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14835");
        payment.Payment payment4 = new payment.Payment(10L, (double) 'a', "", "hi!");
    }

    @Test
    public void test14836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14836");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, (double) 0.0f, "hi!", "");
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14837");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) 100.0f, "hi!", "hi!");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test14838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14838");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) 0, "hi!", "hi!");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
    }

    @Test
    public void test14839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14839");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) 0.0f, "", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14840");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (byte) 1, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14841");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (byte) -1, "", "hi!");
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14842");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) '#', "hi!", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14843");
        payment.Payment payment4 = new payment.Payment(0L, (double) (byte) -1, "", "");
        java.lang.Class<?> wildcardClass5 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test14844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14844");
        payment.Payment payment4 = new payment.Payment((long) (-1), 0.0d, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14845");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14846");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14847");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14848");
        payment.Payment payment4 = new payment.Payment(1L, 0.0d, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test14849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14849");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 1L, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        boolean boolean13 = payment4.paymentCompleted();
        boolean boolean14 = payment4.paymentCompleted();
        boolean boolean15 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test14850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14850");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) (byte) 1, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14851");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) 100, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14852");
        payment.Payment payment4 = new payment.Payment((long) 1, (double) 1L, "hi!", "hi!");
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
    }

    @Test
    public void test14853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14853");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14854");
        payment.Payment payment4 = new payment.Payment((-1L), (double) '#', "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass15 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test14855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14855");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14856");
        payment.Payment payment4 = new payment.Payment(0L, (double) 'a', "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment4.payDeposit();
    }

    @Test
    public void test14857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14857");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 100, "hi!", "");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
    }

    @Test
    public void test14858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14858");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean17 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy19 = null;
        payment4.setPaymentStrategy(paymentStrategy19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test14859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14859");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) 0.0f, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test14860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14860");
        payment.Payment payment4 = new payment.Payment(1L, 1.0d, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test14861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14861");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, 10.0d, "", "hi!");
        payment4.payDeposit();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
    }

    @Test
    public void test14862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14862");
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
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        payment4.payDeposit();
    }

    @Test
    public void test14863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14863");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 1L, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean9 = payment4.paymentCompleted();
        boolean boolean10 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean15 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass16 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test14864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14864");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) (-1L), "", "hi!");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        java.lang.Class<?> wildcardClass18 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test14865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14865");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) (short) 10, "", "hi!");
    }

    @Test
    public void test14866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14866");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (short) 0, "", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14867");
        payment.Payment payment4 = new payment.Payment(100L, (double) (byte) 0, "hi!", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        java.lang.Class<?> wildcardClass12 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test14868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14868");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (short) 100, "", "hi!");
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14869");
        payment.Payment payment4 = new payment.Payment((-1L), (double) '#', "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        boolean boolean13 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test14870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14870");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) 100, "", "hi!");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14871");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) 0, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
    }

    @Test
    public void test14872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14872");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) 0, "hi!", "hi!");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
    }

    @Test
    public void test14873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14873");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, (double) (short) 100, "hi!", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payDeposit();
        boolean boolean15 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test14874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14874");
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
        boolean boolean14 = payment4.paymentCompleted();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass16 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test14875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14875");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) 1.0f, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
    }

    @Test
    public void test14876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14876");
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
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        payment4.payBalance();
        boolean boolean18 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean20 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass21 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test14877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14877");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) (byte) 10, "", "");
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14878");
        payment.Payment payment4 = new payment.Payment((long) 10, (double) 'a', "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14879");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) (-1), "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14880");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (short) 0, "", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14881");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) 10, "hi!", "hi!");
        payment4.payBalance();
    }

    @Test
    public void test14882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14882");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) 10, "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
    }

    @Test
    public void test14883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14883");
        payment.Payment payment4 = new payment.Payment(0L, (double) 100.0f, "", "hi!");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14884");
        payment.Payment payment4 = new payment.Payment((long) '4', (double) (byte) 10, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
    }

    @Test
    public void test14885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14885");
        payment.Payment payment4 = new payment.Payment(100L, (double) 'a', "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass6 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test14886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14886");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) (short) 1, "hi!", "hi!");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14887");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) 100.0f, "", "hi!");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14888");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) 1.0f, "hi!", "hi!");
        payment4.payDeposit();
    }

    @Test
    public void test14889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14889");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) (short) -1, "hi!", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment4.payDeposit();
    }

    @Test
    public void test14890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14890");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test14891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14891");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) (byte) 1, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
    }

    @Test
    public void test14892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14892");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 1, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean12 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass13 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test14893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14893");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) (byte) -1, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
    }

    @Test
    public void test14894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14894");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, 100.0d, "", "hi!");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14895");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) '#', "hi!", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        boolean boolean11 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test14896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14896");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 0L, "hi!", "hi!");
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14897");
        payment.Payment payment4 = new payment.Payment(10L, (double) (byte) -1, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
    }

    @Test
    public void test14898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14898");
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
        boolean boolean15 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test14899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14899");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) 1L, "", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14900");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) 100.0f, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        boolean boolean9 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test14901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14901");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, (double) 0.0f, "hi!", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean11 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test14902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14902");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) (-1L), "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14903");
        payment.Payment payment4 = new payment.Payment((-1L), (double) '#', "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        java.lang.Class<?> wildcardClass15 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test14904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14904");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 0L, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test14905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14905");
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
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass17 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test14906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14906");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) (byte) 1, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14907");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) (byte) -1, "", "hi!");
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test14908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14908");
        payment.Payment payment4 = new payment.Payment((long) 'a', 100.0d, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14909");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14910");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        boolean boolean7 = payment4.paymentCompleted();
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14911");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) (short) 100, "hi!", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.payBalance();
    }

    @Test
    public void test14912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14912");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, (double) 0, "", "hi!");
        payment4.payBalance();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean10 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14913");
        payment.Payment payment4 = new payment.Payment(100L, (double) (short) 0, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass12 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test14914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14914");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) (byte) -1, "", "hi!");
        payment4.payBalance();
        payment4.payBalance();
    }

    @Test
    public void test14915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14915");
        payment.Payment payment4 = new payment.Payment(10L, (double) 100L, "", "hi!");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test14916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14916");
        payment.Payment payment4 = new payment.Payment((long) 'a', 100.0d, "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
    }

    @Test
    public void test14917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14917");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        boolean boolean12 = payment4.paymentCompleted();
        boolean boolean13 = payment4.paymentCompleted();
        boolean boolean14 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean18 = payment4.paymentCompleted();
        boolean boolean19 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test14918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14918");
        payment.Payment payment4 = new payment.Payment((long) 100, (double) (-1L), "hi!", "");
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14919");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) 10, "", "hi!");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14920");
        payment.Payment payment4 = new payment.Payment(0L, (double) ' ', "", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
    }

    @Test
    public void test14921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14921");
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
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
        payment4.payBalance();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14922");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) 0.0f, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14923");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean11 = payment4.paymentCompleted();
        boolean boolean12 = payment4.paymentCompleted();
        java.lang.Class<?> wildcardClass13 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test14924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14924");
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
        payment.PaymentStrategy paymentStrategy18 = null;
        payment4.setPaymentStrategy(paymentStrategy18);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14925");
        payment.Payment payment4 = new payment.Payment((long) 1, 1.0d, "hi!", "hi!");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
    }

    @Test
    public void test14926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14926");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14927");
        payment.Payment payment4 = new payment.Payment(100L, (double) (byte) 100, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14928");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payDeposit();
        boolean boolean12 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        boolean boolean15 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy17 = null;
        payment4.setPaymentStrategy(paymentStrategy17);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test14929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14929");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (short) -1, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14930");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (byte) 1, "hi!", "");
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14931");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) ' ', "", "");
        payment4.payBalance();
    }

    @Test
    public void test14932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14932");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean17 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test14933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14933");
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
        boolean boolean14 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean19 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test14934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14934");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) 100, "hi!", "");
        payment4.payBalance();
        payment4.payDeposit();
    }

    @Test
    public void test14935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14935");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14936");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (-1), "", "hi!");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
    }

    @Test
    public void test14937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14937");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) 100L, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        boolean boolean7 = payment4.paymentCompleted();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14938");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 100L, "", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14939");
        payment.Payment payment4 = new payment.Payment((long) 10, (-1.0d), "hi!", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test14940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14940");
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
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14941");
        payment.Payment payment4 = new payment.Payment((long) (short) 10, (double) (short) 1, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14942");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass12 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test14943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14943");
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
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy15 = null;
        payment4.setPaymentStrategy(paymentStrategy15);
    }

    @Test
    public void test14944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14944");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, (double) ' ', "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14945");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy17 = null;
        payment4.setPaymentStrategy(paymentStrategy17);
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass20 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test14946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14946");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) (byte) 0, "", "hi!");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payDeposit();
        boolean boolean9 = payment4.paymentCompleted();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test14947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14947");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payDeposit();
        boolean boolean12 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test14948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14948");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) (byte) 1, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test14949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14949");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment.PaymentStrategy paymentStrategy16 = null;
        payment4.setPaymentStrategy(paymentStrategy16);
        payment4.payDeposit();
    }

    @Test
    public void test14950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14950");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) (short) 10, "", "hi!");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14951");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) '#', "hi!", "hi!");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14952");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) (byte) 1, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payBalance();
    }

    @Test
    public void test14953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14953");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) (-1.0f), "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14954");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        boolean boolean15 = payment4.paymentCompleted();
        payment4.payDeposit();
        boolean boolean17 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test14955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14955");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) 1.0f, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        boolean boolean8 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14956");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean15 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test14957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14957");
        payment.Payment payment4 = new payment.Payment((long) '#', (double) 0L, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14958");
        payment.Payment payment4 = new payment.Payment((long) (short) 0, (double) (-1L), "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14959");
        payment.Payment payment4 = new payment.Payment(0L, (double) 100L, "hi!", "");
        payment4.payDeposit();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14960");
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
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test14961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14961");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) 0, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass8 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test14962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14962");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) (-1.0f), "hi!", "hi!");
        payment4.payBalance();
    }

    @Test
    public void test14963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14963");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, (double) (short) -1, "", "");
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14964");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) 100.0f, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass9 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test14965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14965");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, (double) '4', "", "hi!");
        payment4.payBalance();
    }

    @Test
    public void test14966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14966");
        payment.Payment payment4 = new payment.Payment(0L, (double) 10.0f, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean10 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14967");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payBalance();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.payDeposit();
        boolean boolean12 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy13 = null;
        payment4.setPaymentStrategy(paymentStrategy13);
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test14968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14968");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test14969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14969");
        payment.Payment payment4 = new payment.Payment((long) (byte) 100, 0.0d, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy12 = null;
        payment4.setPaymentStrategy(paymentStrategy12);
        boolean boolean14 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test14970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14970");
        payment.Payment payment4 = new payment.Payment((long) (-1), (double) (short) -1, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test14971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14971");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) 100L, "hi!", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test14972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14972");
        payment.Payment payment4 = new payment.Payment((long) '4', 0.0d, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14973");
        payment.Payment payment4 = new payment.Payment((long) (byte) 10, (double) ' ', "", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass11 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14974");
        payment.Payment payment4 = new payment.Payment((long) (byte) -1, 1.0d, "hi!", "");
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test14975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14975");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, 0.0d, "hi!", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        payment4.payDeposit();
        boolean boolean9 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test14976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14976");
        payment.Payment payment4 = new payment.Payment((long) ' ', (double) 'a', "", "");
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        boolean boolean8 = payment4.paymentCompleted();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test14977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14977");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, 1.0d, "", "hi!");
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        boolean boolean12 = payment4.paymentCompleted();
        boolean boolean13 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test14978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14978");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (short) 0, "", "");
        payment4.payBalance();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        java.lang.Class<?> wildcardClass10 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test14979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14979");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean16 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        boolean boolean20 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy21 = null;
        payment4.setPaymentStrategy(paymentStrategy21);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test14980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14980");
        payment.Payment payment4 = new payment.Payment(0L, (double) 1L, "", "");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass7 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test14981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14981");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (-1.0d), "", "hi!");
        payment4.payBalance();
        payment4.payBalance();
        boolean boolean7 = payment4.paymentCompleted();
        payment4.payDeposit();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14982");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) (short) 0, "", "hi!");
        boolean boolean5 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        boolean boolean8 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test14983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14983");
        payment.Payment payment4 = new payment.Payment(0L, (-1.0d), "hi!", "");
        payment4.payDeposit();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.payDeposit();
    }

    @Test
    public void test14984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14984");
        payment.Payment payment4 = new payment.Payment((-1L), (double) '#', "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14985");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, 0.0d, "", "hi!");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14986");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payDeposit();
        boolean boolean8 = payment4.paymentCompleted();
        boolean boolean9 = payment4.paymentCompleted();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payBalance();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test14987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14987");
        payment.Payment payment4 = new payment.Payment((long) (short) 1, (double) (short) 1, "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        boolean boolean7 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14988");
        payment.Payment payment4 = new payment.Payment((-1L), (double) (byte) 0, "hi!", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payBalance();
        payment4.payDeposit();
        boolean boolean9 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment.PaymentStrategy paymentStrategy11 = null;
        payment4.setPaymentStrategy(paymentStrategy11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test14989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14989");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) 100.0f, "hi!", "");
        boolean boolean5 = payment4.paymentCompleted();
        boolean boolean6 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test14990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14990");
        payment.Payment payment4 = new payment.Payment((-1L), (double) 'a', "hi!", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        payment4.payDeposit();
        boolean boolean10 = payment4.paymentCompleted();
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean13 = payment4.paymentCompleted();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test14991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14991");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, (double) 0, "", "hi!");
        payment4.verifyPaymentDetails();
    }

    @Test
    public void test14992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14992");
        payment.Payment payment4 = new payment.Payment((-1L), (double) '#', "", "hi!");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy14 = null;
        payment4.setPaymentStrategy(paymentStrategy14);
        payment4.payBalance();
        java.lang.Class<?> wildcardClass17 = payment4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test14993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14993");
        payment.Payment payment4 = new payment.Payment((long) 0, (double) (byte) 10, "", "");
        payment4.payDeposit();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.payBalance();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        java.lang.Class<?> wildcardClass18 = payment4.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test14994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14994");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, (double) '4', "", "");
        payment.PaymentStrategy paymentStrategy5 = null;
        payment4.setPaymentStrategy(paymentStrategy5);
        payment4.payBalance();
        payment4.payDeposit();
    }

    @Test
    public void test14995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14995");
        payment.Payment payment4 = new payment.Payment((-1L), 0.0d, "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.payDeposit();
        boolean boolean7 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14996");
        payment.Payment payment4 = new payment.Payment((long) (byte) 0, (double) (-1.0f), "hi!", "");
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        payment4.payBalance();
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
    }

    @Test
    public void test14997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14997");
        payment.Payment payment4 = new payment.Payment((long) 'a', (double) (byte) 10, "hi!", "");
        payment4.payBalance();
    }

    @Test
    public void test14998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14998");
        payment.Payment payment4 = new payment.Payment((long) (short) 100, 0.0d, "", "");
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy7 = null;
        payment4.setPaymentStrategy(paymentStrategy7);
        boolean boolean9 = payment4.paymentCompleted();
        payment.PaymentStrategy paymentStrategy10 = null;
        payment4.setPaymentStrategy(paymentStrategy10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test14999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14999");
        payment.Payment payment4 = new payment.Payment((long) (short) -1, (double) 100.0f, "", "");
        payment4.verifyPaymentDetails();
        boolean boolean6 = payment4.paymentCompleted();
        payment4.payDeposit();
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy9 = null;
        payment4.setPaymentStrategy(paymentStrategy9);
        payment4.verifyPaymentDetails();
        payment4.verifyPaymentDetails();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test15000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test15000");
        payment.Payment payment4 = new payment.Payment((long) (byte) 1, 1.0d, "", "hi!");
        payment4.verifyPaymentDetails();
        payment.PaymentStrategy paymentStrategy6 = null;
        payment4.setPaymentStrategy(paymentStrategy6);
        payment.PaymentStrategy paymentStrategy8 = null;
        payment4.setPaymentStrategy(paymentStrategy8);
        payment4.payBalance();
        payment4.payDeposit();
    }
}

