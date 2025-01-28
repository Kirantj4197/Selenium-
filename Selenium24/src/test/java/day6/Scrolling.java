package day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling {
	
	

	public static void main(String[] args)
	{
	
System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
	

	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("https://testautomationpractice.blogspot.com/");
   
  
    JavascriptExecutor js=(JavascriptExecutor)driver;
    
    
  //scrolling
    js.executeScript("window.scrollBy(0,4000);");
  System.out.println(js.executeScript("return window.pageYOffset;"));  //know how much its scrolled
  
  //scrolling untill element is visible
 WebElement phone= driver.findElement(By.xpath("//tr//td[text()='Smartphone']"));
  js.executeScript("arguments[0],scrollIntoView();", phone);
  
  

}
	
	
}
