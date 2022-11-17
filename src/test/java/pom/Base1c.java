package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import pages.FbPage;

public class Base1c {
  static WebDriver driver;
  FbPage fb;
    
    @BeforeSuite
	public void setUp()
   {
	     System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
          driver = new ChromeDriver();
	     driver.manage().window().maximize();
    	 driver.get("https://www.facebook.com");
	
   }
	@BeforeClass
   public void objectCreation()
   {
	    fb=new FbPage(driver);
   }
    @AfterSuite
   public void tearDown()
   {
	   driver.close();
   }

 



}


