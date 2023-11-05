package testcases;

import org.testng.annotations.Test;

public class AuthenticationPopup extends BaseTest{
   
	@Test
	public void authpopup() throws InterruptedException {
		//Syntax: "https://admin:admin@the-internet.herokuapp.com/basic_auth"
		driver.navigate().to("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(5000);		
	}
}
