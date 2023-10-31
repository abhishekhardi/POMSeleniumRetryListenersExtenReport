package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import testcases.BaseTest;

public class automationpracticepage {

	WebDriver driver;
		
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
	
	
	
}
