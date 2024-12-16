package TestNG_Package;

import java.util.Date;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Setup {
	
	@BeforeSuite
	public void Setup1() {
		System.out.println("Welcome to CRM");
		System.out.println(new Date());
	}
	
	@AfterSuite
	public void message() {
		System.out.println("Hey!");
		System.out.println("Stopped at: " + new Date());
	}
}
