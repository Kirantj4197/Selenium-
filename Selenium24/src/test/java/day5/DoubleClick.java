package day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	
	

	public static void main(String[] args)
	{
	
System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
	

	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
    
    
  driver.switchTo().frame("iframeResult");
  WebElement one=  driver.findElement(By.cssSelector("#field1"));
  WebElement two=driver.findElement(By.cssSelector("#field2"));
  WebElement copy= driver.findElement(By.xpath("//button[text()='Copy Text']"));
  one.clear();
  one.sendKeys("kirantj4197");
  
  Actions act=new Actions(driver);
  
  
  act.doubleClick(copy).perform();
  
  System.out.println(two.getDomProperty("value"));
  

 

}
	
	
}
