package company;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import resources.baseClass;

public class Listeners extends baseClass implements ITestListener
{

	public void onTestStart(ITestResult result)
	{
		
	}

	public void onTestSuccess(ITestResult result) 
	{
		
	}

	public void onTestFailure(ITestResult result) 
	{
		WebDriver driver=null;
		
	String testMethodName=result.getMethod().getMethodName();
	try 
	{
		driver=(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
	} 
	catch (Exception e1) 
	{
		
	}
	try
	{
		getScreenshotPath(testMethodName, driver);
	} 
	catch (IOException e) 
	{
		e.printStackTrace();
	}
	
	}

	public void onTestSkipped(ITestResult result) 
	{

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
	
	}

	public void onTestFailedWithTimeout(ITestResult result)
	{

	}

	public void onStart(ITestContext context) 
	{
	
	}

	public void onFinish(ITestContext context) 
	{

	}

}
