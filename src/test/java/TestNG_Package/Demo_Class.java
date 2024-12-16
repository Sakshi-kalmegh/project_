package TestNG_Package;

import java.util.ArrayList;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Demo_Class {
	
		
	
	void display()
	{
		ArrayList<String> alExpResult=new ArrayList<String>();
		alExpResult.add("Category ID");
		alExpResult.add("Category Name");
		alExpResult.add("Created At");
		alExpResult.add("Modified At");
		alExpResult.add("Actions");
		ArrayList<String> alActResult=new ArrayList<String>();
		
		WebDriver driver= new ChromeDriver();
				driver.get("https://javabykiran.com/selenium/admin.html");
				for(int i=1; i<=4;i++) {
					String actcolumn=driver.findElement(By.xpath("//*[@id=\"categories-table\"]/tbody")).getText();
				System.out.println(actcolumn);
				
				String expresult=alExpResult.get(i-1);
				
				Assert.assertEquals(alActResult, alExpResult);
				}
	}


}