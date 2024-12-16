package TestNG_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;

public class weblistener implements WebDriverListener {
	@Override
	public void afterQuit(WebDriver driver) {
		System.err.println("closed");
	}
@Override
@Override
public void beforeFindElement(WebElement element, By locator) {
	System.err.println("find");
}


}
