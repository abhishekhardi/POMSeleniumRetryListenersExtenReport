package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	public  Event event= new Event();

	@Override		
	public void onTestStart(ITestResult result) {					
		System.out.println("Test has started::"+result.getName());			
		
	}	


	@Override		
	public void onTestSuccess(ITestResult result) {					
		System.out.println("Test was success::"+result.getName());
		event.log("PASS", result.getName());		
	}	

	@Override		
	public void onTestFailure(ITestResult result) {					
		System.out.println("Test was failure::"+result.getName());		
		event.log("FAIL", result.getName());
	}

	@Override		
	public void onTestSkipped(ITestResult result) {								
		System.out.println("Test was skipped::"+result.getName());
		event.log("SKIP", result.getName());
	}	

	@Override		
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {						

	}		


	@Override		
	public void onFinish(ITestContext result) {					
		// TODO Auto-generated method stub						
	}		

	@Override		
	public void onStart(ITestContext result) {					
		// TODO Auto-generated method stub				

	}		
}
