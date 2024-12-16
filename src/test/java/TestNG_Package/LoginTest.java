package TestNG_Package;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void loginheading() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		driver.manage().window().maximize();

		String Actualresult=driver.findElement(By.xpath("/html/body/div/div/h1")).getText();
		System.out.println(Actualresult);
		String Expectedresult="welcome to TKA";
		driver.close()
;
	Assert.assertEquals(Actualresult, Expectedresult);
	}
@Test
public void Testtitle() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://javabykiran.com/selenium/login.html");
String Actualresult=driver.getTitle();
System.out.println(Actualresult);
String Expectedresult="login TKA";
driver.close();
Assert.assertEquals(Actualresult, Expectedresult);
}












}