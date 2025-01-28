package day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Exceutor {
	
	

	public static void main(String[] args)
	{
	
System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
	

	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("https://testautomationpractice.blogspot.com/");
    WebElement name=driver.findElement(By.cssSelector("#name"));
   WebElement male= driver.findElement(By.cssSelector("#male"));
  
    JavascriptExecutor js=(JavascriptExecutor)driver;
    
    //in place of send keys
   js.executeScript("arguments[0].setAttribute('value','kirantj4197')",name);
   
   //in place of click  
  js.executeScript("arguments[0].click()", male);
  
  //scrolling
  
  

}
	
	
}
