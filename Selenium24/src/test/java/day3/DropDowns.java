package day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {
	
	
	public static void main(String[] args)
	{
	
System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
	

	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    
    driver.get("https://testautomationpractice.blogspot.com/");
    WebElement select=driver.findElement(By.cssSelector("select[id='country']"));
    
    Select s=new Select(select);
    
   // s.selectByVisibleText("Japan");
    //s.selectByValue("china");
    //s.selectByIndex(2);
    
   
   

    
    
    
	}
}
