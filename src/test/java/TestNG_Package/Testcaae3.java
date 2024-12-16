package TestNG_Package;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class Testcaae3 {
public void testinvalidlogin()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://javabykiran.com/selenium/login.html");
	driver.findElement(By.xpath("//*[@id=\"username\"]")).getText()
;
driver.findElement(By.xpath("//*[@id=\"password\"]")).getText();
driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).getText();
String actResult=driver.findElement(By.xpath("//*[@id=\"error-message\"]")).getText();
}

}
