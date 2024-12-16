package TestNG_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;

public class webautomation {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		WebdriverActivitiesListner wd =new WebdriverActivitiesListner();
		WebDriver driverWatch=new EventFiringDecorator(wd).decorate(driver);
		driver.get("https://thekiranacademy.com/");
		driver.quit();
	}

}
