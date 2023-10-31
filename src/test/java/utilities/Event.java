package utilities;

import java.util.Map;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import testcases.BaseTest;

public class Event extends BaseTest {
	
	public void log(String status, String message) {
		switch(status.toLowerCase())
		{
		case "pass":
		{
			test.pass(MarkupHelper.createLabel(message, ExtentColor.GREEN));
			break;
		}
		case "skip":
		{
			test.skip(MarkupHelper.createLabel(message, ExtentColor.YELLOW));	
			break;
			}
		case "fail":
		{
			test.fail(MarkupHelper.createLabel(message, ExtentColor.RED));	
			break;
		}
		case "warning":
		{
			test.warning(MarkupHelper.createLabel(message, ExtentColor.BLUE));	
			break;
			}
		   
		}
		
	}
	
	
	public void log(String status, Map<String, String> map) {
		String mapstr = map.toString();
		switch(status.toLowerCase())
		{
		case "pass":
		{
 			test.pass(MarkupHelper.createCodeBlock(mapstr));
 			
 			break;
		}
		case "skip":
		{
 			test.skip(MarkupHelper.createCodeBlock(mapstr));
 			break;
		}
		case "fail":
		{
 			test.fail(MarkupHelper.createCodeBlock(mapstr));
 			break;
			
		}
		 
		}
		
	}
	
	

}
