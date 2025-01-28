package day7;

import java.io.IOException;
import java.net.HttpURLConnection;

import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.asserts.SoftAssert;

public class BrokenLinks {
	
	

	public static void main(String[] args) throws IOException
	{
	
System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
	

	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    
  List<WebElement> allLinks= driver.findElements(By.xpath("//li[@class='gf-li']//a"));
  
  SoftAssert a =new SoftAssert();
  
  
  for(WebElement link:allLinks)
  {
	  
	  String att=link.getDomAttribute("href");
	  
	  if(att==null || att.isEmpty() || att.equals("#"))
	  {
		  
		  System.out.println("not a vlid link "  + link.getText());
		  
		  //continue means skipping
		  continue;
		  
	  }

	  
	  try
	  {
	  HttpURLConnection conn=(HttpURLConnection) new URL(att).openConnection();
	  
	  //to get only headers from response
	  conn.setRequestMethod("HEAD");
	  conn.connect();
	  int res=conn.getResponseCode();
	  System.out.println(res +" " + link.getText());
	  a.assertTrue(res<400,"its abroken link"+ link.getText() + " " +  res);
	  
	  } 
	  
	  catch(Exception e)
	  {
		  System.out.println("Error connecting to URL: " + att);
	  }
	  
  }
  
  
  a.assertAll();  //to print all the results after execution

   
   
  
    
  
  

}
	
	
}
