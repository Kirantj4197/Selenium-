package day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxesAndAlerts {
	
	
	public static void main(String[] args)
	{
	
System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
	

	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    
    driver.get("https://testautomationpractice.blogspot.com/");
    
   // driver.findElement(By.cssSelector("#sunday")).click();
    
 List<WebElement> boxes=   driver.findElements(By.
		 xpath("//div[@class='form-group']/div/input[@type='checkbox']/following-sibling::label"));
    
 
 for(WebElement b:boxes)
 {
	 if(b.getText().equals("Tuesday"))
			 {
		        b.click();
		        break;
			 }
 }
    
    
    
    
	}
}
