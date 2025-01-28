package day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	
	
	public static void main(String[] args)
	{
	
System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
	

	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("https://jqueryui.com/datepicker/");
    String year="2026";
    String month="May";
    String day="24";
    
    
    driver.switchTo().frame(0);
    //sendkeys
    //driver.findElement(By.cssSelector("#datepicker")).sendKeys("01/24/2025");
    

    driver.findElement(By.cssSelector("#datepicker")).click();
    
    while(true)
    {
    	String currentMonth=driver.findElement(By.cssSelector(".ui-datepicker-month")).getText();
    	String currentYear=driver.findElement(By.cssSelector(".ui-datepicker-year")).getText();
    	
    	if(currentMonth.equals(month) && currentYear.equals(year))
    	{
    		break;
    	}
    	
    	driver.findElement(By.cssSelector("a[title='Next']")).click();
    }
    
    
  List<WebElement> allDays=  driver.findElements(By.xpath("//td[@data-handler='selectDay']/a"));
    		
    		
   for(WebElement all:allDays)
   {
	   if(all.getText().equals(day))
			   {
		         all.click();
		          break;
			   }
   }
  
    
	}
}
