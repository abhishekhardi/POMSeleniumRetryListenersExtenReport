package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import page.automationpracticepage;
import utilities.RetryListener;

public class Mousehoverandgettext extends BaseTest {
automationpracticepage page = new automationpracticepage(driver);
	
	
	@Test(retryAnalyzer = RetryListener.class)
	public void mousehover() throws InterruptedException {
		driver.navigate().to("https://demoqa.com/tool-tips");
		Thread.sleep(5000);
		// Create an instance of the Actions class
        Actions actions = new Actions(driver);
        WebElement mousehoverele = driver.findElement(page.mousehoverele);
        actions.moveToElement(mousehoverele).perform();
        String tooltipText = driver.findElement(page.tooltip).getText();
		System.out.println(tooltipText);
		
	}

}
