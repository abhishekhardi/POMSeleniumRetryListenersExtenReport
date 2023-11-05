package testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import page.automationpracticepage;

public class Selectcountry extends BaseTest{
	automationpracticepage page = new automationpracticepage(driver);
	
	@Test
	public void selectclass() throws InterruptedException {
	 
     Actions actions = new Actions(driver);
     //Scroll
     WebElement colors = driver.findElement(page.colors);
     actions.scrollToElement(colors);
     
     //Select in Country
     // Create a Select object
     Select select = new Select(driver.findElement(page.countrylist));
     select.selectByVisibleText("Canada");
     select.selectByValue("usa");
     select.selectByIndex(9);
     Thread.sleep(2000);
     
     Select select2 = new Select(driver.findElement(page.colors));
     select2.selectByValue("red");
     select2.selectByValue("blue");
     Thread.sleep(2000);
	}
	
}
