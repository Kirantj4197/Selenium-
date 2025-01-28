package day1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitMethods {
	
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
     
    
     // driver.findElement(By.xpath("//input[@id='hide-textbox']")).
     
     WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
     
     WebElement hide=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='hide-textbox']")));
     
     hide.click();
     
  
     
  

	

     
	}
}
