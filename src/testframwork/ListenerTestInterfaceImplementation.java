package testframwork;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.Screenshots;

public class ListenerTestInterfaceImplementation extends ListenerTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Start = "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Success = "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failure = "+result.getName());
		
		try {
			Screenshots.captureScrShot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped = "+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test Start *Context = "+context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test Finish = "+context.getName());
		
	}
	
	

}
