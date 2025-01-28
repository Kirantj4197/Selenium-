package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObject.AirIndiaHomepage;
import testBase.BaseClass;

public class TC_TicketBooking extends BaseClass{
	

	
	@Test(groups="Sanity")
	public void someTest()
	{
		
		logger.info("Starting testcase");
		//driver.get("https://www.airindia.com/");
	    driver.get(pr.getProperty("bookingUrl"));
		AirIndiaHomepage ahm=new AirIndiaHomepage(driver);
		System.out.println(ahm.getSomething());
		
	}

}
