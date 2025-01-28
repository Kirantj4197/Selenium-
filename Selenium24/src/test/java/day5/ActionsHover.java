package day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsHover {
	
	

	public static void main(String[] args)
	{
	
System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
	

	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("https://www.cricbuzz.com/");
    
   WebElement teams = driver.findElement(By.cssSelector("div[id='teamDropDown']"));
   WebElement team= driver.findElement(By.xpath("//a[text()='India']"));
    
    Actions ac=new Actions(driver);
    ac.moveToElement(teams).moveToElement(team).click().build().perform();
    
    WebElement rc= driver.findElement(By.cssSelector("a[title='Cricket Scorecard Archives']"));
    
    ac.contextClick(rc).perform();
    

}
	
	
}
