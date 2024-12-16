package TestNG_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {
    public static void main(String[] args) {
        
       
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.flipkart.com/?affid=affveve&affExtParam1=a3c6bb5ab459caadc7e6924625bc2465&affExtParam2=60827");
        driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[1]/div[1]/header/div[1]/div[2]/form/div/div/input")).sendKeys("shooes");
      
        Actions ac = new Actions(driver);
        ac.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
        ac.sendKeys("shooes").sendKeys(Keys.ENTER).perform();
        driver.close();
       
    }

}