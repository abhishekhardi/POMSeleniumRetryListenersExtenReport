package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import page.automationpracticepage;

public class WebTable extends BaseTest{
	automationpracticepage page = new automationpracticepage(driver);

	@Test
	public void webtable() throws InterruptedException {

		Actions actions = new Actions(driver);
		//Scroll
		WebElement pagin = driver.findElement(page.pagination);
		actions.scrollToElement(pagin).perform();;
		Thread.sleep(5000);

		int headerrows = driver.findElements(page.headerrows).size();


		//Print all headers of a table
		for(int i=1; i<=headerrows; i++) {
			String header = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th["+i+"]")).getText();
			System.out.println(header);
		}

		//Print all data

		List<WebElement> list = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/td"));
		int count = list.size();
		System.out.println(count);
		for(int i=0; i<count; i++) {
			System.out.println(list.get(i).getText());
		}
	}
}
