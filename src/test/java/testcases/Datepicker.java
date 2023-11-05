package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import page.automationpracticepage;

public class Datepicker extends BaseTest {
	automationpracticepage page = new automationpracticepage(driver);
	
	@Test
	public void datePicker() throws InterruptedException {
		Actions actions = new Actions(driver);
		//Scroll
		WebElement pagin = driver.findElement(page.pagination);
		actions.scrollToElement(pagin).perform();;
		Thread.sleep(5000);
		
		String Year = "1985";
		String Month = "November";
		String Day = "26";		
		driver.findElement(page.datepicker).click();
		
		while(true) {
			String year = driver.findElement(page.Year).getText();
			String month = driver.findElement(page.Mon).getText();
			if(year.equalsIgnoreCase(Year)&&month.equalsIgnoreCase(Month)) {
				break;
			}else {
				driver.findElement(page.Prev).click();
			}			
		}
		driver.findElement(By.xpath("//a[contains(text(),'26')]")).click();
		Thread.sleep(5000);
	}

}
