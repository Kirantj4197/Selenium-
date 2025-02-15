package utilities;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testBase.BaseClass;

public class ExtentReportManager implements ITestListener{
	

	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	String repName;
	
	public void onStart(ITestContext testContext)
	{		
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//time stamp
		repName="Test-Report-"+timeStamp+".html";
				
		sparkReporter=new ExtentSparkReporter(".\\reports\\"+repName);//specify location of the report
				
		sparkReporter.config().setDocumentTitle("Selenium E2E "); // Title of report
		sparkReporter.config().setReportName("Extent Selenium"); // name of the report
		sparkReporter.config().setTheme(Theme.DARK);
				
		extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		extent.setSystemInfo("Application", "Selelnium E2E");
	
		extent.setSystemInfo("User Name", System.getProperty("user.name"));
		extent.setSystemInfo("Environemnt","QA");
		extent.setSystemInfo("user","ranjith");
		
		String browser=testContext.getCurrentXmlTest().getParameter("browser");
		extent.setSystemInfo("Browser", browser);
		List<String> includedGroups=testContext.getCurrentXmlTest().getIncludedGroups();
		
	if(!includedGroups.isEmpty())
	{
		extent.setSystemInfo("groups", includedGroups.toString());
	}
	
	}
	
		
	public void onTestSuccess(ITestResult result)
	{
		test=extent.createTest(result.getTestClass().getName());
		test.assignCategory(result.getMethod().getGroups());
		test.log(Status.PASS,result.getName());
	}
	
	public void onTestFailure(ITestResult result)
	{
		test=extent.createTest(result.getTestClass().getName()); 
		test.assignCategory(result.getMethod().getGroups());
		test.log(Status.FAIL,result.getName()+  "Test Failed");
		test.log(Status.INFO, result.getThrowable().getMessage());
		
		try
		{
			String imgPath=new BaseClass().captureScreen(result.getName());
			test.addScreenCaptureFromPath(imgPath);
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
	}
	
	public void onTestSkipped(ITestResult result)
	{
		test=extent.createTest(result.getTestClass().getName()); 
		
		test.assignCategory(result.getMethod().getGroups());
		test.log(Status.SKIP,result.getName());
		test.log(Status.INFO, result.getThrowable().getMessage());
	}
	
	public void onFinish(ITestContext testContext)
	{
		extent.flush();
		String pathOfReport=System.getProperty("user.dir")+"\\reports\\"+repName;
		File extent=new File(pathOfReport);
		
		try
		{
			Desktop.getDesktop().browse(extent.toURI());
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

	
	
	

}
