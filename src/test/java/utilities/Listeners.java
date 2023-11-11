package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listeners implements ITestListener{

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
		test.pass(MarkupHelper.createLabel("FAIL", ExtentColor.RED));		
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
		// TODO Auto-generated method stub						
	}		

	@Override		
	public void onStart(ITestContext result) {					
		// TODO Auto-generated method stub				

	}		
}
