package TestNG_Package;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Alertex {
    @Test 
    public void handleAlert() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://javabykiran.com/selenium/subcategories.html");
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);
        driver.findElement(By.xpath("//*[@id=\"add-subcategory\"]")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.close();
    }
}
