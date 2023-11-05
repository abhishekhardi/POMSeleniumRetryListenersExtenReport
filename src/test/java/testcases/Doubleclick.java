package testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import page.automationpracticepage;

public class Doubleclick extends BaseTest{
	automationpracticepage page = new automationpracticepage(driver);
	
	@Test
	public void doubleclick() throws InterruptedException {
		// Create an instance of the Actions class
        Actions actions = new Actions(driver);
        
        //Scroll
        WebElement DragandDrop = driver.findElement(page.DragandDrop);
        actions.scrollToElement(DragandDrop).perform();
	           
        // Perform a double click on the element      
        actions.doubleClick(driver.findElement(page.Doubleclickbtn)).perform();
         
        //Scroll
        WebElement Frames = driver.findElement(page.DragandDrop);
        actions.scrollToElement(Frames).perform();
        
       // Perform draganddrop
        actions.clickAndHold(driver.findElement(page.draggable)).perform();
        actions.moveToElement(driver.findElement(page.droppable)).perform();
        actions.release().perform();
        Thread.sleep(5000);
        
        
      	}
}
	
