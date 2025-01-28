package day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoSuggestiveDropDown {
	
	
	public static void main(String[] args)
	{
	
System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
	

	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("https://www.google.co.in/");
    
    driver.findElement(By.cssSelector(".gLFyf")).sendKeys("selenium");
    
  List<WebElement> all=  driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='presentation']/span"));
  
  for(WebElement a :all)
  {
	  
	  if(a.getText().equals("selenium"))
	  {
		  a.click();
		  break;
	  }
	 
  }
   
  
   

	}
    
    
	
}
