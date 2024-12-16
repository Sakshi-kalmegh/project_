package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class classname {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/admin.html");
		driver.findElement(By.className("class=\"edit-btn\"")).click();
		driver.close();	
		}

}


