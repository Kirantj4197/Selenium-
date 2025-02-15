package day6;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Screenshot {
	
	

	public static void main(String[] args)
	{
	
System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
	

	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("https://www.fotmob.com/");
    TakesScreenshot ts=(TakesScreenshot)driver;
    
    //full page
    File source=ts.getScreenshotAs(OutputType.FILE);
   File target=new File(System.getProperty("user.dir")+"\\screenshots\\screen.png");
    source.renameTo(target);
    
    //specific area of the page
    
    
WebElement league= driver.findElement(By.xpath("//div[@class='css-1al0tld-Column-LeagueListCSS enpfnav0']"));

File src=league.getScreenshotAs(OutputType.FILE);
File tar=new File(System.getProperty("user.dir")+"\\screenshots\\league.png");
src.renameTo(tar);
   
  
    // specific web element


  WebElement logo= driver.findElement(By.xpath("//a[@aria-label='Link to Home']//span"));
 File sr= logo.getScreenshotAs(OutputType.FILE);
 File t=new File(System.getProperty("user.dir")+"\\screenshots\\logo.png");
 sr.renameTo(t);
  
  

}
	
	
}
