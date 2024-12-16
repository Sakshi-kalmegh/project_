package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatertesting {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://thekiranacademy.com/tutorials/selenium/basics-of-selenium.php#gsc.tab=0");
		driver.findElement(By.partialLinkText("Selenium API")).click()
;	}

}
