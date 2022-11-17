package listeners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pom.BaseTest;
import utility.Screenshot;

public class TestNGListeners extends BaseTest implements ITestListener {
	ExtentReports extent =ExtentReportGen.extentReportGenerator();
	ExtentTest test;
	
	
	@Override
	public void onTestStart(ITestResult result) {
	
		 test = extent.createTest(result.getName());
	System.out.println("Test case:"+result.getMethod().getMethodName()+" has been started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
    System.out.println("Test case:"+result.getMethod().getMethodName()+"has been passed");
	     
        test.log(Status.PASS,"Test case is pass");
	  
	}

	@Override
	public void onTestFailure(ITestResult result) {
	   System.out.println("Test case:"+result.getMethod().getMethodName()+"has been failed");
	  test.fail(result.getName());
	  test.fail(result.getThrowable());
	   
	   try {
		//	Screenshot.captureScreenshot(driver,result.getMethod().getMethodName());
			test.addScreenCaptureFromPath(Screenshot.captureScreenShotWithPath(driver, result.getName()));
	   }
        catch (IOException e)
		{
			e.printStackTrace();
		  System.out.println("exception arrived catch is executing");
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	
		test.log(Status.SKIP,"test case is skiped");
		
		System.out.println("test case:"+result.getMethod().getMethodName()+"has been skipped");
	}

 
	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		 System.out.println("test case:"+context.getName()+"has been started");
	}

	@Override
	public void onFinish(ITestContext context) {
	 System.out.println("test case:"+context.getName()+"has been finished");
	  extent.flush();
	
	}

 
}
