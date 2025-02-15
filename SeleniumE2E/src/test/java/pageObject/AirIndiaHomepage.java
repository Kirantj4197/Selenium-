package pageObject;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AirIndiaHomepage extends BasePage {
	
	

	WebDriver driver;
	
	public AirIndiaHomepage(WebDriver dirver) {
		super(dirver);
		// TODO Auto-generated constructor stub
	}


	
	
	
	@FindBy(css="div[id='onetrust-button-group-parent']")
	WebElement cookies;
	
	@FindBy(css="button[id='onetrust-accept-btn-handler']")
	WebElement accept;
	
	WebDriverWait wait=new WebDriverWait(this.driver,Duration.ofSeconds(10));
	
	public String getSomething()
	{
		return "tj";
	}
	
	

	
	
}
