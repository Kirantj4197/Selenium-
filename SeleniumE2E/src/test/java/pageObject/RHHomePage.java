package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RHHomePage extends BasePage{

	WebDriver driver;
	
	public RHHomePage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(css="#userEmail")
	WebElement userName;
	
	@FindBy(css="#userPassword")
	WebElement pwd;
	
     
	public void login(String user,String pass)
	{
		userName.sendKeys(user);
		pwd.sendKeys(pass);
	}
}
