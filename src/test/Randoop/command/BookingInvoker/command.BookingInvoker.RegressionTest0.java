import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        java.lang.Class<?> wildcardClass1 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        java.lang.Class<?> wildcardClass3 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        java.lang.Class<?> wildcardClass5 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking3 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        java.lang.Class<?> wildcardClass7 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking9 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking5 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking7 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking11 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        java.lang.Class<?> wildcardClass11 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking13 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        java.lang.Class<?> wildcardClass9 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        java.lang.Class<?> wildcardClass13 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking15 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        java.lang.Class<?> wildcardClass15 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking17 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        java.lang.Class<?> wildcardClass19 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        java.lang.Class<?> wildcardClass17 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking19 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        java.lang.Class<?> wildcardClass23 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking23 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        java.lang.Class<?> wildcardClass25 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking21 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        java.lang.Class<?> wildcardClass21 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking25 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking27 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        java.lang.Class<?> wildcardClass27 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking29 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        java.lang.Class<?> wildcardClass29 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        java.lang.Class<?> wildcardClass31 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking31 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking39 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        java.lang.Class<?> wildcardClass39 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking41 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        java.lang.Class<?> wildcardClass35 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        java.lang.Class<?> wildcardClass41 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking37 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking35 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking33 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        java.lang.Class<?> wildcardClass37 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        java.lang.Class<?> wildcardClass33 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking43 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        java.lang.Class<?> wildcardClass45 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        java.lang.Class<?> wildcardClass43 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking45 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking47 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        java.lang.Class<?> wildcardClass47 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking51 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        java.lang.Class<?> wildcardClass51 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        java.lang.Class<?> wildcardClass49 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        java.lang.Class<?> wildcardClass53 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking53 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking49 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking57 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        java.lang.Class<?> wildcardClass55 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        java.lang.Class<?> wildcardClass57 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        command.BookingCommand bookingCommand57 = null;
        bookingInvoker0.setCommand(bookingCommand57);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking59 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        command.BookingCommand bookingCommand57 = null;
        bookingInvoker0.setCommand(bookingCommand57);
        command.BookingCommand bookingCommand59 = null;
        bookingInvoker0.setCommand(bookingCommand59);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking61 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        command.BookingCommand bookingCommand57 = null;
        bookingInvoker0.setCommand(bookingCommand57);
        command.BookingCommand bookingCommand59 = null;
        bookingInvoker0.setCommand(bookingCommand59);
        java.lang.Class<?> wildcardClass61 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking55 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        command.BookingCommand bookingCommand57 = null;
        bookingInvoker0.setCommand(bookingCommand57);
        java.lang.Class<?> wildcardClass59 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        command.BookingCommand bookingCommand57 = null;
        bookingInvoker0.setCommand(bookingCommand57);
        command.BookingCommand bookingCommand59 = null;
        bookingInvoker0.setCommand(bookingCommand59);
        command.BookingCommand bookingCommand61 = null;
        bookingInvoker0.setCommand(bookingCommand61);
        java.lang.Class<?> wildcardClass63 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        command.BookingCommand bookingCommand57 = null;
        bookingInvoker0.setCommand(bookingCommand57);
        command.BookingCommand bookingCommand59 = null;
        bookingInvoker0.setCommand(bookingCommand59);
        command.BookingCommand bookingCommand61 = null;
        bookingInvoker0.setCommand(bookingCommand61);
        command.BookingCommand bookingCommand63 = null;
        bookingInvoker0.setCommand(bookingCommand63);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking65 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        command.BookingCommand bookingCommand57 = null;
        bookingInvoker0.setCommand(bookingCommand57);
        command.BookingCommand bookingCommand59 = null;
        bookingInvoker0.setCommand(bookingCommand59);
        command.BookingCommand bookingCommand61 = null;
        bookingInvoker0.setCommand(bookingCommand61);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking63 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        command.BookingCommand bookingCommand57 = null;
        bookingInvoker0.setCommand(bookingCommand57);
        command.BookingCommand bookingCommand59 = null;
        bookingInvoker0.setCommand(bookingCommand59);
        command.BookingCommand bookingCommand61 = null;
        bookingInvoker0.setCommand(bookingCommand61);
        command.BookingCommand bookingCommand63 = null;
        bookingInvoker0.setCommand(bookingCommand63);
        java.lang.Class<?> wildcardClass65 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        command.BookingCommand bookingCommand57 = null;
        bookingInvoker0.setCommand(bookingCommand57);
        command.BookingCommand bookingCommand59 = null;
        bookingInvoker0.setCommand(bookingCommand59);
        command.BookingCommand bookingCommand61 = null;
        bookingInvoker0.setCommand(bookingCommand61);
        command.BookingCommand bookingCommand63 = null;
        bookingInvoker0.setCommand(bookingCommand63);
        command.BookingCommand bookingCommand65 = null;
        bookingInvoker0.setCommand(bookingCommand65);
        java.lang.Class<?> wildcardClass67 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        command.BookingCommand bookingCommand57 = null;
        bookingInvoker0.setCommand(bookingCommand57);
        command.BookingCommand bookingCommand59 = null;
        bookingInvoker0.setCommand(bookingCommand59);
        command.BookingCommand bookingCommand61 = null;
        bookingInvoker0.setCommand(bookingCommand61);
        command.BookingCommand bookingCommand63 = null;
        bookingInvoker0.setCommand(bookingCommand63);
        command.BookingCommand bookingCommand65 = null;
        bookingInvoker0.setCommand(bookingCommand65);
        command.BookingCommand bookingCommand67 = null;
        bookingInvoker0.setCommand(bookingCommand67);
        java.lang.Class<?> wildcardClass69 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        command.BookingCommand bookingCommand57 = null;
        bookingInvoker0.setCommand(bookingCommand57);
        command.BookingCommand bookingCommand59 = null;
        bookingInvoker0.setCommand(bookingCommand59);
        command.BookingCommand bookingCommand61 = null;
        bookingInvoker0.setCommand(bookingCommand61);
        command.BookingCommand bookingCommand63 = null;
        bookingInvoker0.setCommand(bookingCommand63);
        command.BookingCommand bookingCommand65 = null;
        bookingInvoker0.setCommand(bookingCommand65);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking67 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        command.BookingCommand bookingCommand57 = null;
        bookingInvoker0.setCommand(bookingCommand57);
        command.BookingCommand bookingCommand59 = null;
        bookingInvoker0.setCommand(bookingCommand59);
        command.BookingCommand bookingCommand61 = null;
        bookingInvoker0.setCommand(bookingCommand61);
        command.BookingCommand bookingCommand63 = null;
        bookingInvoker0.setCommand(bookingCommand63);
        command.BookingCommand bookingCommand65 = null;
        bookingInvoker0.setCommand(bookingCommand65);
        command.BookingCommand bookingCommand67 = null;
        bookingInvoker0.setCommand(bookingCommand67);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking69 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        command.BookingCommand bookingCommand57 = null;
        bookingInvoker0.setCommand(bookingCommand57);
        command.BookingCommand bookingCommand59 = null;
        bookingInvoker0.setCommand(bookingCommand59);
        command.BookingCommand bookingCommand61 = null;
        bookingInvoker0.setCommand(bookingCommand61);
        command.BookingCommand bookingCommand63 = null;
        bookingInvoker0.setCommand(bookingCommand63);
        command.BookingCommand bookingCommand65 = null;
        bookingInvoker0.setCommand(bookingCommand65);
        command.BookingCommand bookingCommand67 = null;
        bookingInvoker0.setCommand(bookingCommand67);
        command.BookingCommand bookingCommand69 = null;
        bookingInvoker0.setCommand(bookingCommand69);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking71 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        command.BookingCommand bookingCommand57 = null;
        bookingInvoker0.setCommand(bookingCommand57);
        command.BookingCommand bookingCommand59 = null;
        bookingInvoker0.setCommand(bookingCommand59);
        command.BookingCommand bookingCommand61 = null;
        bookingInvoker0.setCommand(bookingCommand61);
        command.BookingCommand bookingCommand63 = null;
        bookingInvoker0.setCommand(bookingCommand63);
        command.BookingCommand bookingCommand65 = null;
        bookingInvoker0.setCommand(bookingCommand65);
        command.BookingCommand bookingCommand67 = null;
        bookingInvoker0.setCommand(bookingCommand67);
        command.BookingCommand bookingCommand69 = null;
        bookingInvoker0.setCommand(bookingCommand69);
        command.BookingCommand bookingCommand71 = null;
        bookingInvoker0.setCommand(bookingCommand71);
        java.lang.Class<?> wildcardClass73 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        command.BookingCommand bookingCommand57 = null;
        bookingInvoker0.setCommand(bookingCommand57);
        command.BookingCommand bookingCommand59 = null;
        bookingInvoker0.setCommand(bookingCommand59);
        command.BookingCommand bookingCommand61 = null;
        bookingInvoker0.setCommand(bookingCommand61);
        command.BookingCommand bookingCommand63 = null;
        bookingInvoker0.setCommand(bookingCommand63);
        command.BookingCommand bookingCommand65 = null;
        bookingInvoker0.setCommand(bookingCommand65);
        command.BookingCommand bookingCommand67 = null;
        bookingInvoker0.setCommand(bookingCommand67);
        command.BookingCommand bookingCommand69 = null;
        bookingInvoker0.setCommand(bookingCommand69);
        java.lang.Class<?> wildcardClass71 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        command.BookingCommand bookingCommand57 = null;
        bookingInvoker0.setCommand(bookingCommand57);
        command.BookingCommand bookingCommand59 = null;
        bookingInvoker0.setCommand(bookingCommand59);
        command.BookingCommand bookingCommand61 = null;
        bookingInvoker0.setCommand(bookingCommand61);
        command.BookingCommand bookingCommand63 = null;
        bookingInvoker0.setCommand(bookingCommand63);
        command.BookingCommand bookingCommand65 = null;
        bookingInvoker0.setCommand(bookingCommand65);
        command.BookingCommand bookingCommand67 = null;
        bookingInvoker0.setCommand(bookingCommand67);
        command.BookingCommand bookingCommand69 = null;
        bookingInvoker0.setCommand(bookingCommand69);
        command.BookingCommand bookingCommand71 = null;
        bookingInvoker0.setCommand(bookingCommand71);
        command.BookingCommand bookingCommand73 = null;
        bookingInvoker0.setCommand(bookingCommand73);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking75 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        command.BookingCommand bookingCommand57 = null;
        bookingInvoker0.setCommand(bookingCommand57);
        command.BookingCommand bookingCommand59 = null;
        bookingInvoker0.setCommand(bookingCommand59);
        command.BookingCommand bookingCommand61 = null;
        bookingInvoker0.setCommand(bookingCommand61);
        command.BookingCommand bookingCommand63 = null;
        bookingInvoker0.setCommand(bookingCommand63);
        command.BookingCommand bookingCommand65 = null;
        bookingInvoker0.setCommand(bookingCommand65);
        command.BookingCommand bookingCommand67 = null;
        bookingInvoker0.setCommand(bookingCommand67);
        command.BookingCommand bookingCommand69 = null;
        bookingInvoker0.setCommand(bookingCommand69);
        command.BookingCommand bookingCommand71 = null;
        bookingInvoker0.setCommand(bookingCommand71);
        command.BookingCommand bookingCommand73 = null;
        bookingInvoker0.setCommand(bookingCommand73);
        command.BookingCommand bookingCommand75 = null;
        bookingInvoker0.setCommand(bookingCommand75);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking77 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        command.BookingCommand bookingCommand57 = null;
        bookingInvoker0.setCommand(bookingCommand57);
        command.BookingCommand bookingCommand59 = null;
        bookingInvoker0.setCommand(bookingCommand59);
        command.BookingCommand bookingCommand61 = null;
        bookingInvoker0.setCommand(bookingCommand61);
        command.BookingCommand bookingCommand63 = null;
        bookingInvoker0.setCommand(bookingCommand63);
        command.BookingCommand bookingCommand65 = null;
        bookingInvoker0.setCommand(bookingCommand65);
        command.BookingCommand bookingCommand67 = null;
        bookingInvoker0.setCommand(bookingCommand67);
        command.BookingCommand bookingCommand69 = null;
        bookingInvoker0.setCommand(bookingCommand69);
        command.BookingCommand bookingCommand71 = null;
        bookingInvoker0.setCommand(bookingCommand71);
        command.BookingCommand bookingCommand73 = null;
        bookingInvoker0.setCommand(bookingCommand73);
        java.lang.Class<?> wildcardClass75 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        command.BookingCommand bookingCommand57 = null;
        bookingInvoker0.setCommand(bookingCommand57);
        command.BookingCommand bookingCommand59 = null;
        bookingInvoker0.setCommand(bookingCommand59);
        command.BookingCommand bookingCommand61 = null;
        bookingInvoker0.setCommand(bookingCommand61);
        command.BookingCommand bookingCommand63 = null;
        bookingInvoker0.setCommand(bookingCommand63);
        command.BookingCommand bookingCommand65 = null;
        bookingInvoker0.setCommand(bookingCommand65);
        command.BookingCommand bookingCommand67 = null;
        bookingInvoker0.setCommand(bookingCommand67);
        command.BookingCommand bookingCommand69 = null;
        bookingInvoker0.setCommand(bookingCommand69);
        command.BookingCommand bookingCommand71 = null;
        bookingInvoker0.setCommand(bookingCommand71);
        command.BookingCommand bookingCommand73 = null;
        bookingInvoker0.setCommand(bookingCommand73);
        command.BookingCommand bookingCommand75 = null;
        bookingInvoker0.setCommand(bookingCommand75);
        command.BookingCommand bookingCommand77 = null;
        bookingInvoker0.setCommand(bookingCommand77);
        command.BookingCommand bookingCommand79 = null;
        bookingInvoker0.setCommand(bookingCommand79);
        java.lang.Class<?> wildcardClass81 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        command.BookingCommand bookingCommand57 = null;
        bookingInvoker0.setCommand(bookingCommand57);
        command.BookingCommand bookingCommand59 = null;
        bookingInvoker0.setCommand(bookingCommand59);
        command.BookingCommand bookingCommand61 = null;
        bookingInvoker0.setCommand(bookingCommand61);
        command.BookingCommand bookingCommand63 = null;
        bookingInvoker0.setCommand(bookingCommand63);
        command.BookingCommand bookingCommand65 = null;
        bookingInvoker0.setCommand(bookingCommand65);
        command.BookingCommand bookingCommand67 = null;
        bookingInvoker0.setCommand(bookingCommand67);
        command.BookingCommand bookingCommand69 = null;
        bookingInvoker0.setCommand(bookingCommand69);
        command.BookingCommand bookingCommand71 = null;
        bookingInvoker0.setCommand(bookingCommand71);
        command.BookingCommand bookingCommand73 = null;
        bookingInvoker0.setCommand(bookingCommand73);
        command.BookingCommand bookingCommand75 = null;
        bookingInvoker0.setCommand(bookingCommand75);
        java.lang.Class<?> wildcardClass77 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        command.BookingCommand bookingCommand57 = null;
        bookingInvoker0.setCommand(bookingCommand57);
        command.BookingCommand bookingCommand59 = null;
        bookingInvoker0.setCommand(bookingCommand59);
        command.BookingCommand bookingCommand61 = null;
        bookingInvoker0.setCommand(bookingCommand61);
        command.BookingCommand bookingCommand63 = null;
        bookingInvoker0.setCommand(bookingCommand63);
        command.BookingCommand bookingCommand65 = null;
        bookingInvoker0.setCommand(bookingCommand65);
        command.BookingCommand bookingCommand67 = null;
        bookingInvoker0.setCommand(bookingCommand67);
        command.BookingCommand bookingCommand69 = null;
        bookingInvoker0.setCommand(bookingCommand69);
        command.BookingCommand bookingCommand71 = null;
        bookingInvoker0.setCommand(bookingCommand71);
        command.BookingCommand bookingCommand73 = null;
        bookingInvoker0.setCommand(bookingCommand73);
        command.BookingCommand bookingCommand75 = null;
        bookingInvoker0.setCommand(bookingCommand75);
        command.BookingCommand bookingCommand77 = null;
        bookingInvoker0.setCommand(bookingCommand77);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking79 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        command.BookingCommand bookingCommand57 = null;
        bookingInvoker0.setCommand(bookingCommand57);
        command.BookingCommand bookingCommand59 = null;
        bookingInvoker0.setCommand(bookingCommand59);
        command.BookingCommand bookingCommand61 = null;
        bookingInvoker0.setCommand(bookingCommand61);
        command.BookingCommand bookingCommand63 = null;
        bookingInvoker0.setCommand(bookingCommand63);
        command.BookingCommand bookingCommand65 = null;
        bookingInvoker0.setCommand(bookingCommand65);
        command.BookingCommand bookingCommand67 = null;
        bookingInvoker0.setCommand(bookingCommand67);
        command.BookingCommand bookingCommand69 = null;
        bookingInvoker0.setCommand(bookingCommand69);
        command.BookingCommand bookingCommand71 = null;
        bookingInvoker0.setCommand(bookingCommand71);
        command.BookingCommand bookingCommand73 = null;
        bookingInvoker0.setCommand(bookingCommand73);
        command.BookingCommand bookingCommand75 = null;
        bookingInvoker0.setCommand(bookingCommand75);
        command.BookingCommand bookingCommand77 = null;
        bookingInvoker0.setCommand(bookingCommand77);
        command.BookingCommand bookingCommand79 = null;
        bookingInvoker0.setCommand(bookingCommand79);
        command.BookingCommand bookingCommand81 = null;
        bookingInvoker0.setCommand(bookingCommand81);
        java.lang.Class<?> wildcardClass83 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        command.BookingCommand bookingCommand57 = null;
        bookingInvoker0.setCommand(bookingCommand57);
        command.BookingCommand bookingCommand59 = null;
        bookingInvoker0.setCommand(bookingCommand59);
        command.BookingCommand bookingCommand61 = null;
        bookingInvoker0.setCommand(bookingCommand61);
        command.BookingCommand bookingCommand63 = null;
        bookingInvoker0.setCommand(bookingCommand63);
        command.BookingCommand bookingCommand65 = null;
        bookingInvoker0.setCommand(bookingCommand65);
        command.BookingCommand bookingCommand67 = null;
        bookingInvoker0.setCommand(bookingCommand67);
        command.BookingCommand bookingCommand69 = null;
        bookingInvoker0.setCommand(bookingCommand69);
        command.BookingCommand bookingCommand71 = null;
        bookingInvoker0.setCommand(bookingCommand71);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking73 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        command.BookingCommand bookingCommand57 = null;
        bookingInvoker0.setCommand(bookingCommand57);
        command.BookingCommand bookingCommand59 = null;
        bookingInvoker0.setCommand(bookingCommand59);
        command.BookingCommand bookingCommand61 = null;
        bookingInvoker0.setCommand(bookingCommand61);
        command.BookingCommand bookingCommand63 = null;
        bookingInvoker0.setCommand(bookingCommand63);
        command.BookingCommand bookingCommand65 = null;
        bookingInvoker0.setCommand(bookingCommand65);
        command.BookingCommand bookingCommand67 = null;
        bookingInvoker0.setCommand(bookingCommand67);
        command.BookingCommand bookingCommand69 = null;
        bookingInvoker0.setCommand(bookingCommand69);
        command.BookingCommand bookingCommand71 = null;
        bookingInvoker0.setCommand(bookingCommand71);
        command.BookingCommand bookingCommand73 = null;
        bookingInvoker0.setCommand(bookingCommand73);
        command.BookingCommand bookingCommand75 = null;
        bookingInvoker0.setCommand(bookingCommand75);
        command.BookingCommand bookingCommand77 = null;
        bookingInvoker0.setCommand(bookingCommand77);
        command.BookingCommand bookingCommand79 = null;
        bookingInvoker0.setCommand(bookingCommand79);
        command.BookingCommand bookingCommand81 = null;
        bookingInvoker0.setCommand(bookingCommand81);
        command.BookingCommand bookingCommand83 = null;
        bookingInvoker0.setCommand(bookingCommand83);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking85 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        command.BookingCommand bookingCommand57 = null;
        bookingInvoker0.setCommand(bookingCommand57);
        command.BookingCommand bookingCommand59 = null;
        bookingInvoker0.setCommand(bookingCommand59);
        command.BookingCommand bookingCommand61 = null;
        bookingInvoker0.setCommand(bookingCommand61);
        command.BookingCommand bookingCommand63 = null;
        bookingInvoker0.setCommand(bookingCommand63);
        command.BookingCommand bookingCommand65 = null;
        bookingInvoker0.setCommand(bookingCommand65);
        command.BookingCommand bookingCommand67 = null;
        bookingInvoker0.setCommand(bookingCommand67);
        command.BookingCommand bookingCommand69 = null;
        bookingInvoker0.setCommand(bookingCommand69);
        command.BookingCommand bookingCommand71 = null;
        bookingInvoker0.setCommand(bookingCommand71);
        command.BookingCommand bookingCommand73 = null;
        bookingInvoker0.setCommand(bookingCommand73);
        command.BookingCommand bookingCommand75 = null;
        bookingInvoker0.setCommand(bookingCommand75);
        command.BookingCommand bookingCommand77 = null;
        bookingInvoker0.setCommand(bookingCommand77);
        command.BookingCommand bookingCommand79 = null;
        bookingInvoker0.setCommand(bookingCommand79);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking81 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        command.BookingCommand bookingCommand57 = null;
        bookingInvoker0.setCommand(bookingCommand57);
        command.BookingCommand bookingCommand59 = null;
        bookingInvoker0.setCommand(bookingCommand59);
        command.BookingCommand bookingCommand61 = null;
        bookingInvoker0.setCommand(bookingCommand61);
        command.BookingCommand bookingCommand63 = null;
        bookingInvoker0.setCommand(bookingCommand63);
        command.BookingCommand bookingCommand65 = null;
        bookingInvoker0.setCommand(bookingCommand65);
        command.BookingCommand bookingCommand67 = null;
        bookingInvoker0.setCommand(bookingCommand67);
        command.BookingCommand bookingCommand69 = null;
        bookingInvoker0.setCommand(bookingCommand69);
        command.BookingCommand bookingCommand71 = null;
        bookingInvoker0.setCommand(bookingCommand71);
        command.BookingCommand bookingCommand73 = null;
        bookingInvoker0.setCommand(bookingCommand73);
        command.BookingCommand bookingCommand75 = null;
        bookingInvoker0.setCommand(bookingCommand75);
        command.BookingCommand bookingCommand77 = null;
        bookingInvoker0.setCommand(bookingCommand77);
        command.BookingCommand bookingCommand79 = null;
        bookingInvoker0.setCommand(bookingCommand79);
        command.BookingCommand bookingCommand81 = null;
        bookingInvoker0.setCommand(bookingCommand81);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking83 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        command.BookingCommand bookingCommand57 = null;
        bookingInvoker0.setCommand(bookingCommand57);
        command.BookingCommand bookingCommand59 = null;
        bookingInvoker0.setCommand(bookingCommand59);
        command.BookingCommand bookingCommand61 = null;
        bookingInvoker0.setCommand(bookingCommand61);
        command.BookingCommand bookingCommand63 = null;
        bookingInvoker0.setCommand(bookingCommand63);
        command.BookingCommand bookingCommand65 = null;
        bookingInvoker0.setCommand(bookingCommand65);
        command.BookingCommand bookingCommand67 = null;
        bookingInvoker0.setCommand(bookingCommand67);
        command.BookingCommand bookingCommand69 = null;
        bookingInvoker0.setCommand(bookingCommand69);
        command.BookingCommand bookingCommand71 = null;
        bookingInvoker0.setCommand(bookingCommand71);
        command.BookingCommand bookingCommand73 = null;
        bookingInvoker0.setCommand(bookingCommand73);
        command.BookingCommand bookingCommand75 = null;
        bookingInvoker0.setCommand(bookingCommand75);
        command.BookingCommand bookingCommand77 = null;
        bookingInvoker0.setCommand(bookingCommand77);
        command.BookingCommand bookingCommand79 = null;
        bookingInvoker0.setCommand(bookingCommand79);
        command.BookingCommand bookingCommand81 = null;
        bookingInvoker0.setCommand(bookingCommand81);
        command.BookingCommand bookingCommand83 = null;
        bookingInvoker0.setCommand(bookingCommand83);
        command.BookingCommand bookingCommand85 = null;
        bookingInvoker0.setCommand(bookingCommand85);
        java.lang.Class<?> wildcardClass87 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        command.BookingCommand bookingCommand57 = null;
        bookingInvoker0.setCommand(bookingCommand57);
        command.BookingCommand bookingCommand59 = null;
        bookingInvoker0.setCommand(bookingCommand59);
        command.BookingCommand bookingCommand61 = null;
        bookingInvoker0.setCommand(bookingCommand61);
        command.BookingCommand bookingCommand63 = null;
        bookingInvoker0.setCommand(bookingCommand63);
        command.BookingCommand bookingCommand65 = null;
        bookingInvoker0.setCommand(bookingCommand65);
        command.BookingCommand bookingCommand67 = null;
        bookingInvoker0.setCommand(bookingCommand67);
        command.BookingCommand bookingCommand69 = null;
        bookingInvoker0.setCommand(bookingCommand69);
        command.BookingCommand bookingCommand71 = null;
        bookingInvoker0.setCommand(bookingCommand71);
        command.BookingCommand bookingCommand73 = null;
        bookingInvoker0.setCommand(bookingCommand73);
        command.BookingCommand bookingCommand75 = null;
        bookingInvoker0.setCommand(bookingCommand75);
        command.BookingCommand bookingCommand77 = null;
        bookingInvoker0.setCommand(bookingCommand77);
        java.lang.Class<?> wildcardClass79 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        command.BookingCommand bookingCommand57 = null;
        bookingInvoker0.setCommand(bookingCommand57);
        command.BookingCommand bookingCommand59 = null;
        bookingInvoker0.setCommand(bookingCommand59);
        command.BookingCommand bookingCommand61 = null;
        bookingInvoker0.setCommand(bookingCommand61);
        command.BookingCommand bookingCommand63 = null;
        bookingInvoker0.setCommand(bookingCommand63);
        command.BookingCommand bookingCommand65 = null;
        bookingInvoker0.setCommand(bookingCommand65);
        command.BookingCommand bookingCommand67 = null;
        bookingInvoker0.setCommand(bookingCommand67);
        command.BookingCommand bookingCommand69 = null;
        bookingInvoker0.setCommand(bookingCommand69);
        command.BookingCommand bookingCommand71 = null;
        bookingInvoker0.setCommand(bookingCommand71);
        command.BookingCommand bookingCommand73 = null;
        bookingInvoker0.setCommand(bookingCommand73);
        command.BookingCommand bookingCommand75 = null;
        bookingInvoker0.setCommand(bookingCommand75);
        command.BookingCommand bookingCommand77 = null;
        bookingInvoker0.setCommand(bookingCommand77);
        command.BookingCommand bookingCommand79 = null;
        bookingInvoker0.setCommand(bookingCommand79);
        command.BookingCommand bookingCommand81 = null;
        bookingInvoker0.setCommand(bookingCommand81);
        command.BookingCommand bookingCommand83 = null;
        bookingInvoker0.setCommand(bookingCommand83);
        java.lang.Class<?> wildcardClass85 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        command.BookingCommand bookingCommand57 = null;
        bookingInvoker0.setCommand(bookingCommand57);
        command.BookingCommand bookingCommand59 = null;
        bookingInvoker0.setCommand(bookingCommand59);
        command.BookingCommand bookingCommand61 = null;
        bookingInvoker0.setCommand(bookingCommand61);
        command.BookingCommand bookingCommand63 = null;
        bookingInvoker0.setCommand(bookingCommand63);
        command.BookingCommand bookingCommand65 = null;
        bookingInvoker0.setCommand(bookingCommand65);
        command.BookingCommand bookingCommand67 = null;
        bookingInvoker0.setCommand(bookingCommand67);
        command.BookingCommand bookingCommand69 = null;
        bookingInvoker0.setCommand(bookingCommand69);
        command.BookingCommand bookingCommand71 = null;
        bookingInvoker0.setCommand(bookingCommand71);
        command.BookingCommand bookingCommand73 = null;
        bookingInvoker0.setCommand(bookingCommand73);
        command.BookingCommand bookingCommand75 = null;
        bookingInvoker0.setCommand(bookingCommand75);
        command.BookingCommand bookingCommand77 = null;
        bookingInvoker0.setCommand(bookingCommand77);
        command.BookingCommand bookingCommand79 = null;
        bookingInvoker0.setCommand(bookingCommand79);
        command.BookingCommand bookingCommand81 = null;
        bookingInvoker0.setCommand(bookingCommand81);
        command.BookingCommand bookingCommand83 = null;
        bookingInvoker0.setCommand(bookingCommand83);
        command.BookingCommand bookingCommand85 = null;
        bookingInvoker0.setCommand(bookingCommand85);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking87 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        command.BookingCommand bookingCommand57 = null;
        bookingInvoker0.setCommand(bookingCommand57);
        command.BookingCommand bookingCommand59 = null;
        bookingInvoker0.setCommand(bookingCommand59);
        command.BookingCommand bookingCommand61 = null;
        bookingInvoker0.setCommand(bookingCommand61);
        command.BookingCommand bookingCommand63 = null;
        bookingInvoker0.setCommand(bookingCommand63);
        command.BookingCommand bookingCommand65 = null;
        bookingInvoker0.setCommand(bookingCommand65);
        command.BookingCommand bookingCommand67 = null;
        bookingInvoker0.setCommand(bookingCommand67);
        command.BookingCommand bookingCommand69 = null;
        bookingInvoker0.setCommand(bookingCommand69);
        command.BookingCommand bookingCommand71 = null;
        bookingInvoker0.setCommand(bookingCommand71);
        command.BookingCommand bookingCommand73 = null;
        bookingInvoker0.setCommand(bookingCommand73);
        command.BookingCommand bookingCommand75 = null;
        bookingInvoker0.setCommand(bookingCommand75);
        command.BookingCommand bookingCommand77 = null;
        bookingInvoker0.setCommand(bookingCommand77);
        command.BookingCommand bookingCommand79 = null;
        bookingInvoker0.setCommand(bookingCommand79);
        command.BookingCommand bookingCommand81 = null;
        bookingInvoker0.setCommand(bookingCommand81);
        command.BookingCommand bookingCommand83 = null;
        bookingInvoker0.setCommand(bookingCommand83);
        command.BookingCommand bookingCommand85 = null;
        bookingInvoker0.setCommand(bookingCommand85);
        command.BookingCommand bookingCommand87 = null;
        bookingInvoker0.setCommand(bookingCommand87);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking89 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        command.BookingCommand bookingCommand57 = null;
        bookingInvoker0.setCommand(bookingCommand57);
        command.BookingCommand bookingCommand59 = null;
        bookingInvoker0.setCommand(bookingCommand59);
        command.BookingCommand bookingCommand61 = null;
        bookingInvoker0.setCommand(bookingCommand61);
        command.BookingCommand bookingCommand63 = null;
        bookingInvoker0.setCommand(bookingCommand63);
        command.BookingCommand bookingCommand65 = null;
        bookingInvoker0.setCommand(bookingCommand65);
        command.BookingCommand bookingCommand67 = null;
        bookingInvoker0.setCommand(bookingCommand67);
        command.BookingCommand bookingCommand69 = null;
        bookingInvoker0.setCommand(bookingCommand69);
        command.BookingCommand bookingCommand71 = null;
        bookingInvoker0.setCommand(bookingCommand71);
        command.BookingCommand bookingCommand73 = null;
        bookingInvoker0.setCommand(bookingCommand73);
        command.BookingCommand bookingCommand75 = null;
        bookingInvoker0.setCommand(bookingCommand75);
        command.BookingCommand bookingCommand77 = null;
        bookingInvoker0.setCommand(bookingCommand77);
        command.BookingCommand bookingCommand79 = null;
        bookingInvoker0.setCommand(bookingCommand79);
        command.BookingCommand bookingCommand81 = null;
        bookingInvoker0.setCommand(bookingCommand81);
        command.BookingCommand bookingCommand83 = null;
        bookingInvoker0.setCommand(bookingCommand83);
        command.BookingCommand bookingCommand85 = null;
        bookingInvoker0.setCommand(bookingCommand85);
        command.BookingCommand bookingCommand87 = null;
        bookingInvoker0.setCommand(bookingCommand87);
        java.lang.Class<?> wildcardClass89 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        command.BookingCommand bookingCommand57 = null;
        bookingInvoker0.setCommand(bookingCommand57);
        command.BookingCommand bookingCommand59 = null;
        bookingInvoker0.setCommand(bookingCommand59);
        command.BookingCommand bookingCommand61 = null;
        bookingInvoker0.setCommand(bookingCommand61);
        command.BookingCommand bookingCommand63 = null;
        bookingInvoker0.setCommand(bookingCommand63);
        command.BookingCommand bookingCommand65 = null;
        bookingInvoker0.setCommand(bookingCommand65);
        command.BookingCommand bookingCommand67 = null;
        bookingInvoker0.setCommand(bookingCommand67);
        command.BookingCommand bookingCommand69 = null;
        bookingInvoker0.setCommand(bookingCommand69);
        command.BookingCommand bookingCommand71 = null;
        bookingInvoker0.setCommand(bookingCommand71);
        command.BookingCommand bookingCommand73 = null;
        bookingInvoker0.setCommand(bookingCommand73);
        command.BookingCommand bookingCommand75 = null;
        bookingInvoker0.setCommand(bookingCommand75);
        command.BookingCommand bookingCommand77 = null;
        bookingInvoker0.setCommand(bookingCommand77);
        command.BookingCommand bookingCommand79 = null;
        bookingInvoker0.setCommand(bookingCommand79);
        command.BookingCommand bookingCommand81 = null;
        bookingInvoker0.setCommand(bookingCommand81);
        command.BookingCommand bookingCommand83 = null;
        bookingInvoker0.setCommand(bookingCommand83);
        command.BookingCommand bookingCommand85 = null;
        bookingInvoker0.setCommand(bookingCommand85);
        command.BookingCommand bookingCommand87 = null;
        bookingInvoker0.setCommand(bookingCommand87);
        command.BookingCommand bookingCommand89 = null;
        bookingInvoker0.setCommand(bookingCommand89);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking91 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        command.BookingCommand bookingCommand57 = null;
        bookingInvoker0.setCommand(bookingCommand57);
        command.BookingCommand bookingCommand59 = null;
        bookingInvoker0.setCommand(bookingCommand59);
        command.BookingCommand bookingCommand61 = null;
        bookingInvoker0.setCommand(bookingCommand61);
        command.BookingCommand bookingCommand63 = null;
        bookingInvoker0.setCommand(bookingCommand63);
        command.BookingCommand bookingCommand65 = null;
        bookingInvoker0.setCommand(bookingCommand65);
        command.BookingCommand bookingCommand67 = null;
        bookingInvoker0.setCommand(bookingCommand67);
        command.BookingCommand bookingCommand69 = null;
        bookingInvoker0.setCommand(bookingCommand69);
        command.BookingCommand bookingCommand71 = null;
        bookingInvoker0.setCommand(bookingCommand71);
        command.BookingCommand bookingCommand73 = null;
        bookingInvoker0.setCommand(bookingCommand73);
        command.BookingCommand bookingCommand75 = null;
        bookingInvoker0.setCommand(bookingCommand75);
        command.BookingCommand bookingCommand77 = null;
        bookingInvoker0.setCommand(bookingCommand77);
        command.BookingCommand bookingCommand79 = null;
        bookingInvoker0.setCommand(bookingCommand79);
        command.BookingCommand bookingCommand81 = null;
        bookingInvoker0.setCommand(bookingCommand81);
        command.BookingCommand bookingCommand83 = null;
        bookingInvoker0.setCommand(bookingCommand83);
        command.BookingCommand bookingCommand85 = null;
        bookingInvoker0.setCommand(bookingCommand85);
        command.BookingCommand bookingCommand87 = null;
        bookingInvoker0.setCommand(bookingCommand87);
        command.BookingCommand bookingCommand89 = null;
        bookingInvoker0.setCommand(bookingCommand89);
        java.lang.Class<?> wildcardClass91 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        command.BookingCommand bookingCommand57 = null;
        bookingInvoker0.setCommand(bookingCommand57);
        command.BookingCommand bookingCommand59 = null;
        bookingInvoker0.setCommand(bookingCommand59);
        command.BookingCommand bookingCommand61 = null;
        bookingInvoker0.setCommand(bookingCommand61);
        command.BookingCommand bookingCommand63 = null;
        bookingInvoker0.setCommand(bookingCommand63);
        command.BookingCommand bookingCommand65 = null;
        bookingInvoker0.setCommand(bookingCommand65);
        command.BookingCommand bookingCommand67 = null;
        bookingInvoker0.setCommand(bookingCommand67);
        command.BookingCommand bookingCommand69 = null;
        bookingInvoker0.setCommand(bookingCommand69);
        command.BookingCommand bookingCommand71 = null;
        bookingInvoker0.setCommand(bookingCommand71);
        command.BookingCommand bookingCommand73 = null;
        bookingInvoker0.setCommand(bookingCommand73);
        command.BookingCommand bookingCommand75 = null;
        bookingInvoker0.setCommand(bookingCommand75);
        command.BookingCommand bookingCommand77 = null;
        bookingInvoker0.setCommand(bookingCommand77);
        command.BookingCommand bookingCommand79 = null;
        bookingInvoker0.setCommand(bookingCommand79);
        command.BookingCommand bookingCommand81 = null;
        bookingInvoker0.setCommand(bookingCommand81);
        command.BookingCommand bookingCommand83 = null;
        bookingInvoker0.setCommand(bookingCommand83);
        command.BookingCommand bookingCommand85 = null;
        bookingInvoker0.setCommand(bookingCommand85);
        command.BookingCommand bookingCommand87 = null;
        bookingInvoker0.setCommand(bookingCommand87);
        command.BookingCommand bookingCommand89 = null;
        bookingInvoker0.setCommand(bookingCommand89);
        command.BookingCommand bookingCommand91 = null;
        bookingInvoker0.setCommand(bookingCommand91);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking93 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        command.BookingCommand bookingCommand57 = null;
        bookingInvoker0.setCommand(bookingCommand57);
        command.BookingCommand bookingCommand59 = null;
        bookingInvoker0.setCommand(bookingCommand59);
        command.BookingCommand bookingCommand61 = null;
        bookingInvoker0.setCommand(bookingCommand61);
        command.BookingCommand bookingCommand63 = null;
        bookingInvoker0.setCommand(bookingCommand63);
        command.BookingCommand bookingCommand65 = null;
        bookingInvoker0.setCommand(bookingCommand65);
        command.BookingCommand bookingCommand67 = null;
        bookingInvoker0.setCommand(bookingCommand67);
        command.BookingCommand bookingCommand69 = null;
        bookingInvoker0.setCommand(bookingCommand69);
        command.BookingCommand bookingCommand71 = null;
        bookingInvoker0.setCommand(bookingCommand71);
        command.BookingCommand bookingCommand73 = null;
        bookingInvoker0.setCommand(bookingCommand73);
        command.BookingCommand bookingCommand75 = null;
        bookingInvoker0.setCommand(bookingCommand75);
        command.BookingCommand bookingCommand77 = null;
        bookingInvoker0.setCommand(bookingCommand77);
        command.BookingCommand bookingCommand79 = null;
        bookingInvoker0.setCommand(bookingCommand79);
        command.BookingCommand bookingCommand81 = null;
        bookingInvoker0.setCommand(bookingCommand81);
        command.BookingCommand bookingCommand83 = null;
        bookingInvoker0.setCommand(bookingCommand83);
        command.BookingCommand bookingCommand85 = null;
        bookingInvoker0.setCommand(bookingCommand85);
        command.BookingCommand bookingCommand87 = null;
        bookingInvoker0.setCommand(bookingCommand87);
        command.BookingCommand bookingCommand89 = null;
        bookingInvoker0.setCommand(bookingCommand89);
        command.BookingCommand bookingCommand91 = null;
        bookingInvoker0.setCommand(bookingCommand91);
        java.lang.Class<?> wildcardClass93 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        command.BookingCommand bookingCommand57 = null;
        bookingInvoker0.setCommand(bookingCommand57);
        command.BookingCommand bookingCommand59 = null;
        bookingInvoker0.setCommand(bookingCommand59);
        command.BookingCommand bookingCommand61 = null;
        bookingInvoker0.setCommand(bookingCommand61);
        command.BookingCommand bookingCommand63 = null;
        bookingInvoker0.setCommand(bookingCommand63);
        command.BookingCommand bookingCommand65 = null;
        bookingInvoker0.setCommand(bookingCommand65);
        command.BookingCommand bookingCommand67 = null;
        bookingInvoker0.setCommand(bookingCommand67);
        command.BookingCommand bookingCommand69 = null;
        bookingInvoker0.setCommand(bookingCommand69);
        command.BookingCommand bookingCommand71 = null;
        bookingInvoker0.setCommand(bookingCommand71);
        command.BookingCommand bookingCommand73 = null;
        bookingInvoker0.setCommand(bookingCommand73);
        command.BookingCommand bookingCommand75 = null;
        bookingInvoker0.setCommand(bookingCommand75);
        command.BookingCommand bookingCommand77 = null;
        bookingInvoker0.setCommand(bookingCommand77);
        command.BookingCommand bookingCommand79 = null;
        bookingInvoker0.setCommand(bookingCommand79);
        command.BookingCommand bookingCommand81 = null;
        bookingInvoker0.setCommand(bookingCommand81);
        command.BookingCommand bookingCommand83 = null;
        bookingInvoker0.setCommand(bookingCommand83);
        command.BookingCommand bookingCommand85 = null;
        bookingInvoker0.setCommand(bookingCommand85);
        command.BookingCommand bookingCommand87 = null;
        bookingInvoker0.setCommand(bookingCommand87);
        command.BookingCommand bookingCommand89 = null;
        bookingInvoker0.setCommand(bookingCommand89);
        command.BookingCommand bookingCommand91 = null;
        bookingInvoker0.setCommand(bookingCommand91);
        command.BookingCommand bookingCommand93 = null;
        bookingInvoker0.setCommand(bookingCommand93);
        command.BookingCommand bookingCommand95 = null;
        bookingInvoker0.setCommand(bookingCommand95);
        java.lang.Class<?> wildcardClass97 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        command.BookingCommand bookingCommand57 = null;
        bookingInvoker0.setCommand(bookingCommand57);
        command.BookingCommand bookingCommand59 = null;
        bookingInvoker0.setCommand(bookingCommand59);
        command.BookingCommand bookingCommand61 = null;
        bookingInvoker0.setCommand(bookingCommand61);
        command.BookingCommand bookingCommand63 = null;
        bookingInvoker0.setCommand(bookingCommand63);
        command.BookingCommand bookingCommand65 = null;
        bookingInvoker0.setCommand(bookingCommand65);
        command.BookingCommand bookingCommand67 = null;
        bookingInvoker0.setCommand(bookingCommand67);
        command.BookingCommand bookingCommand69 = null;
        bookingInvoker0.setCommand(bookingCommand69);
        command.BookingCommand bookingCommand71 = null;
        bookingInvoker0.setCommand(bookingCommand71);
        command.BookingCommand bookingCommand73 = null;
        bookingInvoker0.setCommand(bookingCommand73);
        command.BookingCommand bookingCommand75 = null;
        bookingInvoker0.setCommand(bookingCommand75);
        command.BookingCommand bookingCommand77 = null;
        bookingInvoker0.setCommand(bookingCommand77);
        command.BookingCommand bookingCommand79 = null;
        bookingInvoker0.setCommand(bookingCommand79);
        command.BookingCommand bookingCommand81 = null;
        bookingInvoker0.setCommand(bookingCommand81);
        command.BookingCommand bookingCommand83 = null;
        bookingInvoker0.setCommand(bookingCommand83);
        command.BookingCommand bookingCommand85 = null;
        bookingInvoker0.setCommand(bookingCommand85);
        command.BookingCommand bookingCommand87 = null;
        bookingInvoker0.setCommand(bookingCommand87);
        command.BookingCommand bookingCommand89 = null;
        bookingInvoker0.setCommand(bookingCommand89);
        command.BookingCommand bookingCommand91 = null;
        bookingInvoker0.setCommand(bookingCommand91);
        command.BookingCommand bookingCommand93 = null;
        bookingInvoker0.setCommand(bookingCommand93);
        command.BookingCommand bookingCommand95 = null;
        bookingInvoker0.setCommand(bookingCommand95);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking97 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        command.BookingCommand bookingCommand57 = null;
        bookingInvoker0.setCommand(bookingCommand57);
        command.BookingCommand bookingCommand59 = null;
        bookingInvoker0.setCommand(bookingCommand59);
        command.BookingCommand bookingCommand61 = null;
        bookingInvoker0.setCommand(bookingCommand61);
        command.BookingCommand bookingCommand63 = null;
        bookingInvoker0.setCommand(bookingCommand63);
        command.BookingCommand bookingCommand65 = null;
        bookingInvoker0.setCommand(bookingCommand65);
        command.BookingCommand bookingCommand67 = null;
        bookingInvoker0.setCommand(bookingCommand67);
        command.BookingCommand bookingCommand69 = null;
        bookingInvoker0.setCommand(bookingCommand69);
        command.BookingCommand bookingCommand71 = null;
        bookingInvoker0.setCommand(bookingCommand71);
        command.BookingCommand bookingCommand73 = null;
        bookingInvoker0.setCommand(bookingCommand73);
        command.BookingCommand bookingCommand75 = null;
        bookingInvoker0.setCommand(bookingCommand75);
        command.BookingCommand bookingCommand77 = null;
        bookingInvoker0.setCommand(bookingCommand77);
        command.BookingCommand bookingCommand79 = null;
        bookingInvoker0.setCommand(bookingCommand79);
        command.BookingCommand bookingCommand81 = null;
        bookingInvoker0.setCommand(bookingCommand81);
        command.BookingCommand bookingCommand83 = null;
        bookingInvoker0.setCommand(bookingCommand83);
        command.BookingCommand bookingCommand85 = null;
        bookingInvoker0.setCommand(bookingCommand85);
        command.BookingCommand bookingCommand87 = null;
        bookingInvoker0.setCommand(bookingCommand87);
        command.BookingCommand bookingCommand89 = null;
        bookingInvoker0.setCommand(bookingCommand89);
        command.BookingCommand bookingCommand91 = null;
        bookingInvoker0.setCommand(bookingCommand91);
        command.BookingCommand bookingCommand93 = null;
        bookingInvoker0.setCommand(bookingCommand93);
        command.BookingCommand bookingCommand95 = null;
        bookingInvoker0.setCommand(bookingCommand95);
        command.BookingCommand bookingCommand97 = null;
        bookingInvoker0.setCommand(bookingCommand97);
        java.lang.Class<?> wildcardClass99 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        command.BookingCommand bookingCommand57 = null;
        bookingInvoker0.setCommand(bookingCommand57);
        command.BookingCommand bookingCommand59 = null;
        bookingInvoker0.setCommand(bookingCommand59);
        command.BookingCommand bookingCommand61 = null;
        bookingInvoker0.setCommand(bookingCommand61);
        command.BookingCommand bookingCommand63 = null;
        bookingInvoker0.setCommand(bookingCommand63);
        command.BookingCommand bookingCommand65 = null;
        bookingInvoker0.setCommand(bookingCommand65);
        command.BookingCommand bookingCommand67 = null;
        bookingInvoker0.setCommand(bookingCommand67);
        command.BookingCommand bookingCommand69 = null;
        bookingInvoker0.setCommand(bookingCommand69);
        command.BookingCommand bookingCommand71 = null;
        bookingInvoker0.setCommand(bookingCommand71);
        command.BookingCommand bookingCommand73 = null;
        bookingInvoker0.setCommand(bookingCommand73);
        command.BookingCommand bookingCommand75 = null;
        bookingInvoker0.setCommand(bookingCommand75);
        command.BookingCommand bookingCommand77 = null;
        bookingInvoker0.setCommand(bookingCommand77);
        command.BookingCommand bookingCommand79 = null;
        bookingInvoker0.setCommand(bookingCommand79);
        command.BookingCommand bookingCommand81 = null;
        bookingInvoker0.setCommand(bookingCommand81);
        command.BookingCommand bookingCommand83 = null;
        bookingInvoker0.setCommand(bookingCommand83);
        command.BookingCommand bookingCommand85 = null;
        bookingInvoker0.setCommand(bookingCommand85);
        command.BookingCommand bookingCommand87 = null;
        bookingInvoker0.setCommand(bookingCommand87);
        command.BookingCommand bookingCommand89 = null;
        bookingInvoker0.setCommand(bookingCommand89);
        command.BookingCommand bookingCommand91 = null;
        bookingInvoker0.setCommand(bookingCommand91);
        command.BookingCommand bookingCommand93 = null;
        bookingInvoker0.setCommand(bookingCommand93);
        java.lang.Class<?> wildcardClass95 = bookingInvoker0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        command.BookingCommand bookingCommand57 = null;
        bookingInvoker0.setCommand(bookingCommand57);
        command.BookingCommand bookingCommand59 = null;
        bookingInvoker0.setCommand(bookingCommand59);
        command.BookingCommand bookingCommand61 = null;
        bookingInvoker0.setCommand(bookingCommand61);
        command.BookingCommand bookingCommand63 = null;
        bookingInvoker0.setCommand(bookingCommand63);
        command.BookingCommand bookingCommand65 = null;
        bookingInvoker0.setCommand(bookingCommand65);
        command.BookingCommand bookingCommand67 = null;
        bookingInvoker0.setCommand(bookingCommand67);
        command.BookingCommand bookingCommand69 = null;
        bookingInvoker0.setCommand(bookingCommand69);
        command.BookingCommand bookingCommand71 = null;
        bookingInvoker0.setCommand(bookingCommand71);
        command.BookingCommand bookingCommand73 = null;
        bookingInvoker0.setCommand(bookingCommand73);
        command.BookingCommand bookingCommand75 = null;
        bookingInvoker0.setCommand(bookingCommand75);
        command.BookingCommand bookingCommand77 = null;
        bookingInvoker0.setCommand(bookingCommand77);
        command.BookingCommand bookingCommand79 = null;
        bookingInvoker0.setCommand(bookingCommand79);
        command.BookingCommand bookingCommand81 = null;
        bookingInvoker0.setCommand(bookingCommand81);
        command.BookingCommand bookingCommand83 = null;
        bookingInvoker0.setCommand(bookingCommand83);
        command.BookingCommand bookingCommand85 = null;
        bookingInvoker0.setCommand(bookingCommand85);
        command.BookingCommand bookingCommand87 = null;
        bookingInvoker0.setCommand(bookingCommand87);
        command.BookingCommand bookingCommand89 = null;
        bookingInvoker0.setCommand(bookingCommand89);
        command.BookingCommand bookingCommand91 = null;
        bookingInvoker0.setCommand(bookingCommand91);
        command.BookingCommand bookingCommand93 = null;
        bookingInvoker0.setCommand(bookingCommand93);
        command.BookingCommand bookingCommand95 = null;
        bookingInvoker0.setCommand(bookingCommand95);
        command.BookingCommand bookingCommand97 = null;
        bookingInvoker0.setCommand(bookingCommand97);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking99 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        command.BookingInvoker bookingInvoker0 = new command.BookingInvoker();
        command.BookingCommand bookingCommand1 = null;
        bookingInvoker0.setCommand(bookingCommand1);
        command.BookingCommand bookingCommand3 = null;
        bookingInvoker0.setCommand(bookingCommand3);
        command.BookingCommand bookingCommand5 = null;
        bookingInvoker0.setCommand(bookingCommand5);
        command.BookingCommand bookingCommand7 = null;
        bookingInvoker0.setCommand(bookingCommand7);
        command.BookingCommand bookingCommand9 = null;
        bookingInvoker0.setCommand(bookingCommand9);
        command.BookingCommand bookingCommand11 = null;
        bookingInvoker0.setCommand(bookingCommand11);
        command.BookingCommand bookingCommand13 = null;
        bookingInvoker0.setCommand(bookingCommand13);
        command.BookingCommand bookingCommand15 = null;
        bookingInvoker0.setCommand(bookingCommand15);
        command.BookingCommand bookingCommand17 = null;
        bookingInvoker0.setCommand(bookingCommand17);
        command.BookingCommand bookingCommand19 = null;
        bookingInvoker0.setCommand(bookingCommand19);
        command.BookingCommand bookingCommand21 = null;
        bookingInvoker0.setCommand(bookingCommand21);
        command.BookingCommand bookingCommand23 = null;
        bookingInvoker0.setCommand(bookingCommand23);
        command.BookingCommand bookingCommand25 = null;
        bookingInvoker0.setCommand(bookingCommand25);
        command.BookingCommand bookingCommand27 = null;
        bookingInvoker0.setCommand(bookingCommand27);
        command.BookingCommand bookingCommand29 = null;
        bookingInvoker0.setCommand(bookingCommand29);
        command.BookingCommand bookingCommand31 = null;
        bookingInvoker0.setCommand(bookingCommand31);
        command.BookingCommand bookingCommand33 = null;
        bookingInvoker0.setCommand(bookingCommand33);
        command.BookingCommand bookingCommand35 = null;
        bookingInvoker0.setCommand(bookingCommand35);
        command.BookingCommand bookingCommand37 = null;
        bookingInvoker0.setCommand(bookingCommand37);
        command.BookingCommand bookingCommand39 = null;
        bookingInvoker0.setCommand(bookingCommand39);
        command.BookingCommand bookingCommand41 = null;
        bookingInvoker0.setCommand(bookingCommand41);
        command.BookingCommand bookingCommand43 = null;
        bookingInvoker0.setCommand(bookingCommand43);
        command.BookingCommand bookingCommand45 = null;
        bookingInvoker0.setCommand(bookingCommand45);
        command.BookingCommand bookingCommand47 = null;
        bookingInvoker0.setCommand(bookingCommand47);
        command.BookingCommand bookingCommand49 = null;
        bookingInvoker0.setCommand(bookingCommand49);
        command.BookingCommand bookingCommand51 = null;
        bookingInvoker0.setCommand(bookingCommand51);
        command.BookingCommand bookingCommand53 = null;
        bookingInvoker0.setCommand(bookingCommand53);
        command.BookingCommand bookingCommand55 = null;
        bookingInvoker0.setCommand(bookingCommand55);
        command.BookingCommand bookingCommand57 = null;
        bookingInvoker0.setCommand(bookingCommand57);
        command.BookingCommand bookingCommand59 = null;
        bookingInvoker0.setCommand(bookingCommand59);
        command.BookingCommand bookingCommand61 = null;
        bookingInvoker0.setCommand(bookingCommand61);
        command.BookingCommand bookingCommand63 = null;
        bookingInvoker0.setCommand(bookingCommand63);
        command.BookingCommand bookingCommand65 = null;
        bookingInvoker0.setCommand(bookingCommand65);
        command.BookingCommand bookingCommand67 = null;
        bookingInvoker0.setCommand(bookingCommand67);
        command.BookingCommand bookingCommand69 = null;
        bookingInvoker0.setCommand(bookingCommand69);
        command.BookingCommand bookingCommand71 = null;
        bookingInvoker0.setCommand(bookingCommand71);
        command.BookingCommand bookingCommand73 = null;
        bookingInvoker0.setCommand(bookingCommand73);
        command.BookingCommand bookingCommand75 = null;
        bookingInvoker0.setCommand(bookingCommand75);
        command.BookingCommand bookingCommand77 = null;
        bookingInvoker0.setCommand(bookingCommand77);
        command.BookingCommand bookingCommand79 = null;
        bookingInvoker0.setCommand(bookingCommand79);
        command.BookingCommand bookingCommand81 = null;
        bookingInvoker0.setCommand(bookingCommand81);
        command.BookingCommand bookingCommand83 = null;
        bookingInvoker0.setCommand(bookingCommand83);
        command.BookingCommand bookingCommand85 = null;
        bookingInvoker0.setCommand(bookingCommand85);
        command.BookingCommand bookingCommand87 = null;
        bookingInvoker0.setCommand(bookingCommand87);
        command.BookingCommand bookingCommand89 = null;
        bookingInvoker0.setCommand(bookingCommand89);
        command.BookingCommand bookingCommand91 = null;
        bookingInvoker0.setCommand(bookingCommand91);
        command.BookingCommand bookingCommand93 = null;
        bookingInvoker0.setCommand(bookingCommand93);
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking95 = bookingInvoker0.executeCommand();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"command.BookingCommand.execute()\" because \"this.command\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

