package testcases;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import page.automationpracticepage;

public class automationpracticetestcases extends BaseTest{

	automationpracticepage page = new automationpracticepage(driver);
	
	@Test
	public void verifypage() {
		driver.findElement(page.pagetext).isDisplayed();
		driver.findElement(page.name).sendKeys("test");
	}
	
	@Test
	public void enteremail() {
		driver.findElement(page.email).sendKeys("a@b.com");
	}
	
	@Test
	public void enterphone() {
		driver.findElement(page.phone).sendKeys("1234567890");
	}
	
	@Test
	public void enteraddress() {
		driver.findElement(page.address).sendKeys("This is the address");
	}
	
	@Test
	public void selectgender() {
		 WebElement Country = driver.findElement(page.Country);
	        new Actions(driver)
	                .scrollToElement(Country)
	                .perform();
		driver.findElement(page.gender).click();
	}
	
	@Test
	public void verifynewbrowserwindowtext() {
		String acttext = driver.findElement(page.newbrowserwindowtext).getText();
		Assert.assertEquals(acttext, "New Browser Window", "Element text is different");
	}
	
	@Test
	public void newbrowserwindowbtn() {
		driver.findElement(page.newbrowserwindowbtn).isDisplayed();
		throw new SkipException("This is Skippe");
	}
	
	@Test
	public void selectsunday() {
		driver.findElement(page.sunday).click();
	}
	
	@Test
	public void selectmonday() {
		driver.findElement(page.monday).click();
	}
}
