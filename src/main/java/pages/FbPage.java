package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbPage {
   
	WebDriver driver;
	public FbPage(WebDriver driver)
	{
		    this.driver=driver;
	}


  public void enterCredential()
  {
	   driver.findElement(By.xpath("//*[@id='email']")).sendKeys("kiransawant927@ymail.com");
  
       driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Djkiran5");
  }
 public void loginButton()
 {
	 driver.findElement(By.xpath("//*[@type='submit']")).click();
	 
 }
 

   public void logo()
 {
	WebElement logo = driver.findElement(By.xpath("//*[@id='content']/div/div/div/div[1]/div/img"));
     logo.isDisplayed();
    
 }


}
