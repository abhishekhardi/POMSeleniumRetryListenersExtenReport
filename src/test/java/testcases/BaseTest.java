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
import utilities.Event;

public class BaseTest {
	protected ExtentReports reports = new ExtentReports();
	protected ExtentSparkReporter spark = new ExtentSparkReporter("report.html");
	public static ExtentTest test;
	
	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@BeforeSuite
	public void setup() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-site-isolation-trials");
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	}
	
	@BeforeTest
	public void extentreportsetup() {
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("DocumentTitle");
		spark.config().setReportName("ReportName");
		spark.config().setTimeStampFormat("dd-MM-yyyy");
		//System config
		reports.setSystemInfo("OS", "Windows");
		reports.setSystemInfo("Browser", "Chrome");
		reports.setSystemInfo("URL", "https://testautomationpractice.blogspot.com/");
		reports.setSystemInfo("Environment", "QA");
		reports.attachReporter(spark);
		}
	
	@BeforeMethod()
	public void launchApp(Method testmethod) {
		test = reports.createTest(testmethod.getName());
	}
	
	@AfterSuite
	public void teardown() {
		driver.close();
		driver.quit();
		reports.flush();
	}
}
