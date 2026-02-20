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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        model.Booking.UserType userType0 = model.Booking.UserType.partner;
        java.lang.Class<?> wildcardClass1 = userType0.getClass();
        org.junit.Assert.assertTrue("'" + userType0 + "' != '" + model.Booking.UserType.partner + "'", userType0.equals(model.Booking.UserType.partner));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        model.User user0 = null;
        room.Room room1 = null;
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.Booking booking4 = new model.Booking(user0, room1, localDateTime2, localDateTime3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"room.Room.getRoomID()\" because \"room\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        model.Booking.UserType userType0 = model.Booking.UserType.staff;
        java.lang.Class<?> wildcardClass1 = userType0.getClass();
        org.junit.Assert.assertTrue("'" + userType0 + "' != '" + model.Booking.UserType.staff + "'", userType0.equals(model.Booking.UserType.staff));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        model.Booking.UserType userType0 = model.Booking.UserType.faculty;
        java.lang.Class<?> wildcardClass1 = userType0.getClass();
        org.junit.Assert.assertTrue("'" + userType0 + "' != '" + model.Booking.UserType.faculty + "'", userType0.equals(model.Booking.UserType.faculty));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        model.Booking.UserType userType0 = model.Booking.UserType.student;
        java.lang.Class<?> wildcardClass1 = userType0.getClass();
        org.junit.Assert.assertTrue("'" + userType0 + "' != '" + model.Booking.UserType.student + "'", userType0.equals(model.Booking.UserType.student));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

