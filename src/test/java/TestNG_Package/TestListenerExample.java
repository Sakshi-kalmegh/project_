package TestNG_Package;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;


public class TestListenerExample {
    @Test
    public void testMethod1() {
        System.out.println(" Method 1");
       Assert.assertEquals(3, 3);
    }

    @Test
    public void testMethod2() {
        System.out.println(" Method 2");
            Assert.assertEquals(4, 7);
    }
}

