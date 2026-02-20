import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        service.AccountManagement accountManagement0 = service.AccountManagement.getInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.User user5 = accountManagement0.registerUser("", "hi!", "", "hi!");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        service.AccountManagement accountManagement0 = service.AccountManagement.getInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.User user5 = accountManagement0.registerUser("hi!", "hi!", "", "");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        service.AccountManagement accountManagement0 = service.AccountManagement.getInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.User user5 = accountManagement0.registerUser("", "", "hi!", "");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        service.AccountManagement accountManagement0 = service.AccountManagement.getInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.User user5 = accountManagement0.registerUser("", "hi!", "hi!", "");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        service.AccountManagement accountManagement0 = service.AccountManagement.getInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.User user5 = accountManagement0.registerUser("hi!", "", "", "hi!");
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        service.AccountManagement accountManagement0 = service.AccountManagement.getInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.User user5 = accountManagement0.registerUser("", "", "hi!", "hi!");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        service.AccountManagement accountManagement0 = service.AccountManagement.getInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.User user5 = accountManagement0.registerUser("hi!", "", "hi!", "");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        service.AccountManagement accountManagement0 = service.AccountManagement.getInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.User user5 = accountManagement0.registerUser("", "hi!", "hi!", "hi!");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        service.AccountManagement accountManagement0 = service.AccountManagement.getInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.User user5 = accountManagement0.registerUser("hi!", "hi!", "hi!", "");
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        service.AccountManagement accountManagement0 = service.AccountManagement.getInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.User user5 = accountManagement0.registerUser("hi!", "hi!", "hi!", "hi!");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        service.AccountManagement accountManagement0 = service.AccountManagement.getInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.User user5 = accountManagement0.registerUser("hi!", "hi!", "", "hi!");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        service.AccountManagement accountManagement0 = service.AccountManagement.getInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.User user5 = accountManagement0.registerUser("hi!", "", "", "");
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        service.AccountManagement accountManagement0 = service.AccountManagement.getInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.User user5 = accountManagement0.registerUser("hi!", "", "hi!", "hi!");
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        service.AccountManagement accountManagement0 = service.AccountManagement.getInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.User user5 = accountManagement0.registerUser("", "", "", "hi!");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        service.AccountManagement accountManagement0 = service.AccountManagement.getInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        model.User user5 = accountManagement0.registerUser("", "", "", "");
    }
}

