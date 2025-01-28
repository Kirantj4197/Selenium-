package day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	
	
	public static void main(String[] args)
	{
	
System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
	

	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    
    driver.get("https://ui.vision/demo/webtest/frames/");
    
    
   WebElement frame= driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
   
   driver.switchTo().frame(frame);
   
   driver.findElement(By.cssSelector("input[name='mytext1']")).sendKeys("welcome");
   driver.switchTo().defaultContent();
   WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
   driver.switchTo().frame(frame2);
   driver.findElement(By.cssSelector("input[name='mytext2']")).sendKeys("java");
   driver.switchTo().defaultContent();
   WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
   driver.switchTo().frame(frame3);
   driver.findElement(By.cssSelector("input[name='mytext3']")).sendKeys("selenium");
   
   
  driver.switchTo().frame(0);
  
  driver.findElement(By.xpath("//div/span[text()='I am a human']")).click();
  
  driver.switchTo().defaultContent();
  
WebElement frame5=  driver.findElement(By.xpath("//frame[@src='frame_5.html']"));

driver.switchTo().frame(frame5);

driver.findElement(By.cssSelector("input[name='mytext5']")).sendKeys("playwright");

driver.findElement(By.linkText("https://a9t9.com")).click();


   

    
    
    
	}
}
