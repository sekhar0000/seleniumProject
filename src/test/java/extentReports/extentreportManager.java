package extentReports;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extentreportManager implements ITestListener{
	
	public ExtentSparkReporter sparkReport;
	public ExtentReports extent;
	public ExtentTest test;
	
	public void onStart(ITestContext context) {
		//on start mthod will execute only once in a total test
			
		sparkReport=new ExtentSparkReporter(System.getProperty("user.dir")+ "/reports/myreport.html");
		sparkReport.config().setDocumentTitle("Automation report");
		sparkReport.config().setReportName("Functional Testing");
		sparkReport.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
	    extent.attachReporter(sparkReport);
	    
	    extent.setSystemInfo("Computer Name",  "localhost");
	    extent.setSystemInfo("Environment",  "QA");
	    extent.setSystemInfo("Tester Name",  "Raja");
	    extent.setSystemInfo("os",  "Windows10");
	    extent.setSystemInfo("Browser Name ",  "Chrome");
	}
	public void onTestSuccess(ITestResult result) {
		
		test = extent.createTest(result.getName());
		test.log(Status.PASS,"Test case passed is :"+ result.getName());
	}
	
	public void onTestFailure(ITestResult result) {
		
		test = extent.createTest(result.getName());
		test.log(Status.FAIL,"Test case failed is :"+ result.getName());
		test.log(Status.FAIL,"Test case failed is :"+ result.getThrowable());
	}
	public void onTestSkipped(ITestResult result) {
		
		test = extent.createTest(result.getName());
		test.log(Status.SKIP,"Test case skipped is :"+ result.getName());
	}
	public void onFinish(ITestContext context) {
		
		extent.flush();
	}


}
