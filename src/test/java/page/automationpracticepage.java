package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import testcases.BaseTest;

public class automationpracticepage {

	public static WebDriver driver;
		
	public automationpracticepage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By pagetext = By.xpath("//h1[contains(text(),'Automation Testing Practice')]");	
	public By name = By.xpath("//input[@id='name']");	
	public By email = By.xpath("//input[@id='email']");	
	public By tabs = By.xpath("//h2[contains(text(),'Tabs')]");	
	public By phone = By.xpath("//input[@id='phone']");
	public By address = By.xpath("//textarea[@id='textarea']");
	public By gender = By.xpath("//input[@id='male']");
	public By newbrowserwindowtext = By.xpath("//h2[contains(text(),'New Browser Window')]");
	public By newbrowserwindowbtn = By.xpath("//button[contains(text(),'New Browser Window')]");
	public By sunday = By.xpath("//input[@id='sunday']");
	public By monday = By.xpath("//input[@id='monday']");
	public By Country = By.xpath("//label[contains(text(),'Country:')]");
	public By Alertbtn = By.xpath("//button[contains(text(),'Alert')]");
	public By Confirmboxbtn = By.xpath("//button[contains(text(),'Confirm Box')]");
	public By Promptbtn = By.xpath("//button[contains(text(),'Prompt')]");
	public By Doubleclickbtn = By.xpath("//button[contains(text(),'Copy Text')]");
	public By Doubleclicktext = By.xpath("//input[@id='field2']");	
	public By DragandDrop = By.xpath("//h2[contains(text(),'Drag and Drop')]");	
	public By draggable = By.xpath("//div[@id='draggable']");	
	public By droppable = By.xpath("//div[@id='droppable']");	
	
	public By Frames = By.xpath("//h2[contains(text(),'Frames')]");	
	public By Resizable = By.xpath("//h2[contains(text(),'Resizable')]");
	public By iframe = By.id("frame-one796456169");
	public By iframeName = By.id("RESULT_TextField-0");
	public By colors = By.id("colors");
	public By countrylist = By.id("country");
	public By pagination = By.xpath("//h2[contains(text(),'Pagination Table')]");
	public By headerrows = By.xpath("//table[@name='BookTable']/tbody/tr[1]/th");
	
	

	//Datepicker
	public By datepicker = By.xpath("//input[@id='datepicker']");
	public By Next = By.xpath("//span[contains(text(),'Next')]");
	public By Prev = By.xpath("//span[contains(text(),'Prev')]");
	public By Year = By.xpath("//span[@class='ui-datepicker-year']");
	public By Mon = By.xpath("//span[@class='ui-datepicker-month']");
	
	
	
	
	
	
	
	
	
	
	
}
