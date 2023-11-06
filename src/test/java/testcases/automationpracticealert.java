package testcases;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import page.automationpracticepage;
import utilities.Event;
import utilities.RetryListener;

public class automationpracticealert extends BaseTest{

	automationpracticepage page = new automationpracticepage(driver);
	public  Event event= new Event();
	
	@Test(retryAnalyzer = RetryListener.class)
	public void handlealert() {
		driver.findElement(page.Alertbtn).click();	
		Alert alert = driver.switchTo().alert();
		alert.accept();
		driver.findElement(page.Confirmboxbtn).click();
		alert.accept();
		driver.findElement(page.Confirmboxbtn).click();
		alert.dismiss();
		driver.findElement(page.Promptbtn).click();
		System.out.println(alert.getText());
		alert.sendKeys("Abhishek Hardi");
		alert.accept();
		driver.findElement(page.Promptbtn).click();
		alert.sendKeys("Abhishek Hardi");
		alert.dismiss();
		
		
	}
	
}
