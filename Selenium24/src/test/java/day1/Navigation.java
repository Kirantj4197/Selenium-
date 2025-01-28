package day1;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
	
	public static void main(String[] args) throws MalformedURLException
	{
	
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
	

	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
    
   // driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
    
   // URL url=new URL("https://rahulshettyacademy.com/AutomationPractice/");
    
    //driver.navigate().to(url);
    
    driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
    driver.navigate().to("https://www.qaclickacademy.com/");
    driver.navigate().back();
    System.out.println(driver.getCurrentUrl());
    driver.navigate().forward();
    System.out.println(driver.getCurrentUrl());
    driver.navigate().refresh();
    
    
    
    
    
     

     
  

	

     
	}
}
