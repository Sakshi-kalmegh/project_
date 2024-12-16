package TestNG_Package;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class TestdataproviderTest {
  @Test(dataProvider = "logindata")
  public void f(Integer n, String s) {
	  System.out.println(n);
	  System.out.println(s);
  }

  @DataProvider
  public Object[][] logindata() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}
