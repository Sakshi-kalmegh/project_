import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class flipkartlogin {
    public static void main(String[] args) {
        // Set up WebDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver"); // Replace with actual path
        WebDriver driver = new ChromeDriver();

        // Open Flipkart
        driver.get("https://www.flipkart.com");
        driver.manage().window().maximize();

        // Create an explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Close login popup if it appears
        WebElement closePopup = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'_2doB4z')]")));
        closePopup.click();

        // Search for "mobile"
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile " + Keys.RETURN);

        // Filter results with "realme"
        WebElement brandFilter = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Search Brand']")));
        brandFilter.sendKeys("realme" + Keys.RETURN);

        // Click on dropdown
        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,'1wE2Px')]")));
        dropdown.click();

        // Select "Tablet" from the dropdown
        WebElement electronicsOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Tablet')]")));
        electronicsOption.click();

        // Print success message
        System.out.println("Dropdown selection and filtering completed!");

        // Close the browser
        driver.quit();
    }

}
