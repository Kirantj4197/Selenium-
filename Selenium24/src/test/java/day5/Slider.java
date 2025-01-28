package day5;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	

	

	public static void main(String[] args)
	{
	
System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
	

	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
   driver.get("https://testautomationpractice.blogspot.com/");
   Actions actio=new Actions(driver);
   
WebElement min= driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default'][1]"));


  System.out.println(min.getLocation());
  
  actio.dragAndDropBy(min, 100,0).perform();
  
  System.out.println(min.getLocation());

  

  


  
  
  
}
	
	
}
