package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

@Listeners(listeners.myListener.class)
public class myListener implements ITestListener {

	public void onStart(ITestContext context) {
//on start mthod will execute only once in a total test
		System.out.println("test execution start in that time it will start");
	}

	public void onTestStart(ITestResult result) {
		System.out.println("test started when we mentioned in @test in that times it will run");
	// onTestStart method will execute how many times we mentioned in @test in that many times will execute
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("success");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("failure");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("skipped");
	}

	public void onFinish(ITestContext context) {
		System.out.println("finished");
	}

}
