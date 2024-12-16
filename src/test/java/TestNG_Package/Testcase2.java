package TestNG_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/admin.html");
		String firstcolumn=driver.findElement(By.xpath("//*[@id=\"categories-table\"]/thead/tr/th[1]")).getText();
		System.out.println(1);
		String secondcolumn=driver.findElement(By.xpath("//*[@id=\"categories-table\"]/thead/tr/th[2]")).getText();
		System.out.println(2);
		String thirdcolumn=driver.findElement(By.xpath("//*[@id=\"categories-table\"]/thead/tr/th[3]")).getText();
		System.out.println(3);
		String fourthtcolumn=driver.findElement(By.xpath("//*[@id=\"categories-table\"]/thead/tr/th[4]")).getText();
		System.out.println(4);
		String fifthcolumn=driver.findElement(By.xpath("//*[@id=\"categories-table\"]/thead/tr/th[5]")).getText();
		System.out.println(5);
	}

}
