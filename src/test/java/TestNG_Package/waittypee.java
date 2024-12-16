package TestNG_Package;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waittypee {
	public static void main(String[] args) {
		
	
WebDriver driver=new ChromeDriver();
	
	driver.get("https://javabykiran.com/selenium/login.html");
	WebDriverWait driverWait= new WebDriverWait( driver,Duration.ofSeconds(10));
	 driverWait
	 .until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"username\"]")))
	 .click();
driver.findElement(By.xpath("//*[@id=\"password\"]")).getText();
driver.manage().timeouts().implicitlyWait(14,TimeUnit.SECONDS);
driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).getText();
String actResult=driver.findElement(By.xpath("//*[@id=\"error-message\"]")).getText();
}



}
