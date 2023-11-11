package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testcases.BaseTest;

import io.qameta.allure.Allure;

public class Listeners extends BaseTest implements ITestListener{
	
	private static ExtentReports reports = new ExtentReports();
	private static ExtentSparkReporter spark = new ExtentSparkReporter("report.html");
	protected static ExtentTest test;
	
 
	
	@Override		
	public void onTestStart(ITestResult result) {				
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
		test = reports.createTest(result.getMethod().getMethodName());
		System.out.println("Test has started::"+result.getName());			
		
	}	


	@Override		
	public void onTestSuccess(ITestResult result) {					
		System.out.println("Test was success::"+result.getName());
		test.pass(MarkupHelper.createLabel("PASS", ExtentColor.GREEN));		
	}	

	@Override		
	public void onTestFailure(ITestResult result) {					
		System.out.println("Test was failure::"+result.getName());		
		test.fail(MarkupHelper.createLabel("FAIL", ExtentColor.RED));	
		test.log(Status.FAIL, result.getThrowable());	
		// Capture screenshot
        captureScreenshot(result);
        String path = "C:\\Users\\ABHISHEK\\Desktop\\Automation\\POMSeleniumRetryListenersExtenReportAllureReport\\screenshots\\"+result.getMethod().getMethodName()+".png";
		test.addScreenCaptureFromPath(path);
		Allure.addAttachment("Screenshot on failure",path);
		
	}

	@Override		
	public void onTestSkipped(ITestResult result) {								
		System.out.println("Test was skipped::"+result.getName());
		test.skip(MarkupHelper.createLabel("SKIP", ExtentColor.YELLOW));	
	}	

	@Override		
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {						

	}		


	@Override		
	public void onFinish(ITestContext result) {		
		reports.flush();
	}		

	@Override		
	public void onStart(ITestContext result) {							
	}		
	
	public void captureScreenshot(ITestResult result) {
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfile, new File("C:\\Users\\ABHISHEK\\Desktop\\Automation\\POMSeleniumRetryListenersExtenReportAllureReport\\screenshots\\"+result.getMethod().getMethodName()+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
 
}
