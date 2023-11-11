package testcases;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest {
	
	public static WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@BeforeSuite
	public void setup() {

	}
	
	@BeforeTest
	public void extentreportsetup() {
		
		}
	
	@BeforeMethod
	public void launchApp(Method testmethod) {
		
	}
	
	@BeforeClass
	public void beforeclass() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-site-isolation-trials");
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://testautomationpractice.blogspot.com/");
		
	}
	
	@AfterClass
	public void afterclass() {
		driver.close();
		driver.quit();
		
	}
	

	
	@AfterSuite
	public void teardown() {
		
	}
}
