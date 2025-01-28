package day1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
	
	public static void main(String[] args)
	{
	
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
	

	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
     driver.get("https://rahulshettyacademy.com/AutomationPractice/");
     
     
     System.out.println(driver.getCurrentUrl());
     
     System.out.println(driver.getTitle());
     
     
     driver.findElement(By.cssSelector("#opentab")).click();
     
     Set<String> windowHandles=driver.getWindowHandles();
     
     for(String m:windowHandles)
     {
    	 System.out.println(m);
     }
     
     
    System.out.println(driver.findElement(By.cssSelector("input[value='radio1']")).isSelected());
    
    driver.findElement(By.xpath("//input[@id='hide-textbox']")).click();
    
    System.out.println(driver.findElement(By.cssSelector("#displayed-text")).isDisplayed());
    
    System.out.println(driver.findElement(By.cssSelector("#displayed-text")).isEnabled());

     
  

	

     
	}
}
