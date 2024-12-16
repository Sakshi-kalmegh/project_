package TestNG_Package;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class mainheading {
    @Test
    public void verifyMainHeading() {
       
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); 

        
        WebDriver driver = new ChromeDriver();
      
           
            driver.get("https://javabykiran.com/selenium/login.html");
            driver.manage().window().maximize();

            
            String actualResult = driver.findElement(By.xpath("/html/body/div/div/p")).getText();
            System.out.println("Actual Heading: " + actualResult);

           
            String expectedResult = "login to manage test cases";

            
            Assert.assertEquals(actualResult, expectedResult, "Main heading does not match!");

    
           
            driver.quit();
        }
    }

