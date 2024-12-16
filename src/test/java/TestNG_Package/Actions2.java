package TestNG_Package;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        By usernameField = By.id("username");
        driver.findElement(usernameField).sendKeys("sakshi");
        Actions ac = new Actions(driver);
        driver.findElement(usernameField).click(); 
        ac.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform(); 
        ac.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform(); 
        By passwordField = By.id("password");
        driver.findElement(passwordField).click(); 
        ac.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform(); 
        ac.keyDown(Keys.SHIFT).sendKeys(Keys.TAB).keyUp(Keys.SHIFT).perform(); 
        
        
    }
}
