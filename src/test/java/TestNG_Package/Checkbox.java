package TestNG_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox {

	
		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			 driver.get("https://practice.expandtesting.com/checkboxes");
			 WebElement ele =  driver.findElement(By.xpath("//*[@id=\"checkbox1\"]"));
			 ele.click();
			 boolean b=ele.isSelected();
			 Assert.assertTrue(b);
		}

	

	}


