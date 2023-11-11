package testcases;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import page.automationpracticepage;
import utilities.RetryListener;



public class automationpracticetestcases extends BaseTest{

	automationpracticepage page = new automationpracticepage(driver);
	
	@Test(retryAnalyzer = RetryListener.class)
	@Severity(SeverityLevel.BLOCKER)
	@Description("Check the homw page landing")
	@Story("JIRA Story Ticket")
	public void verifypage() {
		driver.findElement(page.pagetext).isDisplayed();
		driver.findElement(page.name).sendKeys("test");
	}
	
	@Test(retryAnalyzer = RetryListener.class)
	@Severity(SeverityLevel.CRITICAL)
	@Description("Verify email")
	@Story("JIRA Story Ticket")
	public void enteremail() {
		driver.findElement(page.email).sendKeys("a@b.com");
	}
	
	@Test(retryAnalyzer = RetryListener.class)
	@Severity(SeverityLevel.NORMAL)
	@Description("Verify phone")
	@Story("JIRA Story Ticket")
	public void enterphone() {
		driver.findElement(page.phone).sendKeys("1234567890");
	}
	
	@Test(retryAnalyzer = RetryListener.class)
	@Severity(SeverityLevel.MINOR)
	@Description("Verify address")
	@Story("JIRA Story Ticket")
	public void enteraddress() {
		driver.findElement(page.address).sendKeys("This is the address");
	}
	
	@Test(retryAnalyzer = RetryListener.class)
	@Severity(SeverityLevel.TRIVIAL)
	@Description("Verify gender selection")
	@Story("JIRA Story Ticket")
	public void selectgender() {
		 WebElement Country = driver.findElement(page.Country);
	        new Actions(driver)
	                .scrollToElement(Country)
	                .perform();
		driver.findElement(page.gender).click();
	}
	
	@Test(retryAnalyzer = RetryListener.class)
	public void verifynewbrowserwindowtext() {
		String acttext = driver.findElement(page.newbrowserwindowtext).getText();
		Assert.assertEquals(acttext, "New Browser Window", "Element text is different");
	}
	
	@Test(retryAnalyzer = RetryListener.class)
	public void newbrowserwindowbtn() {
		driver.findElement(page.newbrowserwindowbtn).isDisplayed();
		throw new SkipException("This is Skipped");
	}
	
	@Test(retryAnalyzer = RetryListener.class)
	public void selectsunday() {
		driver.findElement(page.sunday).click();
	}
	
	@Test(retryAnalyzer = RetryListener.class)
	public void selectmonday() {
		driver.findElement(page.monday).click();
	}
	
}
