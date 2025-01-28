package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObject.AirIndiaHomepage;
import pageObject.RHHomePage;
import testBase.BaseClass;

public class TC_RHLogin extends BaseClass{
	

	
	@Test(dataProvider="LoginData",dataProviderClass=utilities.DataProviders.class,groups= {"Sanity","dataDriven","Master"})
	public void someTest(String user,String pwd)
	{
		
		logger.info("Starting e commerce things");
		driver.get("https://rahulshettyacademy.com/client");
		System.out.println("im here");
	   
		RHHomePage rh=new RHHomePage(driver);
		rh.login(user,pwd);
		
		
	}

}
