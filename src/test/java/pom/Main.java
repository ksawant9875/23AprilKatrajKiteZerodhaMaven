package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pages.LoginPageAdvance;

public class Main {
   WebDriver driver;
   LoginPageAdvance lpa;
    @BeforeSuite
	public void startBrowsor()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
   driver.get("https://opensource-demo.orangehrmlive.com/");		
	}
	@BeforeClass
	public void lpAdvanceObject()
	{
		 lpa = new LoginPageAdvance(driver);
		
	}
	@AfterSuite
	public void closeBrowsor()
	{
		driver.quit();
	}
	
}
