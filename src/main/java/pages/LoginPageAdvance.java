package pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageAdvance {

	WebDriver driver;
	@FindBy(xpath ="//*[@id='txtUsername']")
	WebElement username;
	
	@FindBy(xpath ="//*[@id='txtPassword']")
	WebElement password;
	
	@FindBy(xpath ="//*[@name='Submit']")
	WebElement loginbutton;
	
	@FindBy(xpath = "//*[@id='menu_admin_viewAdminModule']")
	WebElement admin;
	
   public LoginPageAdvance(WebDriver driver)
	{
		this.driver=driver;
     PageFactory.initElements(driver,this);
	}
	
 public void loginToApplication()
 {
	 username.sendKeys("Admin");
 
	 password.sendKeys("admin123");
	 
   loginbutton.click();
 }
 public void clickOnAdmin()
 {  
	 
    admin.click();
	 
 }
	
	public void TitleOfPage()
	{
	         String actual = driver.getTitle();
		     String expected = "OrangeHRM";
	}
	
}
