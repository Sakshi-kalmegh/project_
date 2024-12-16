package TestNG_Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Technologyoption {
	@Test
	public void checkoption() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/subcategories.html");
		driver.findElement(By.xpath("//*[@id=\"add-subcategory\"]")).click();
		WebElement weSelect =driver.findElement(By.xpath("//*[@id=\"subcategories-table\"]/thead/tr/th[3]"));
		Select select=new Select(weSelect);
		List<WebElement>listoptions=select.getOptions();
		boolean exist=false;
		for(WebElement webElement : listoptions) {
			if(webElement.getText().equals("mathematics")) {
				exist=true;
			}
		}
		Assert.assertTrue(exist);
		
		
		
		
	}
}
