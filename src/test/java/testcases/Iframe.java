package testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import page.automationpracticepage;
import org.testng.annotations.Test;

public class Iframe extends BaseTest {
	automationpracticepage page = new automationpracticepage(driver);
	
	
	@Test
	public void iframe() throws InterruptedException {
		// Create an instance of the Actions class
	    Actions actions = new Actions(driver);
	    //Scroll
	    WebElement Resizable = driver.findElement(page.Resizable);
	    actions.scrollToElement(Resizable).perform();
	    
	    WebElement iframe = driver.findElement(page.iframe);
	    
	    driver.switchTo().frame("frame-one796456169");
	    driver.findElement(page.iframeName).sendKeys("Test");
	    Thread.sleep(5000);
	    
	    
	}
	
	
}
