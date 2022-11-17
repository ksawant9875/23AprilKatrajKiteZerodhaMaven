package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static String captureScreenShotWithPath(WebDriver driver,String filename) throws IOException
	{   TakesScreenshot ts =(TakesScreenshot)driver;
	             File source =ts.getScreenshotAs(OutputType.FILE);
	            String path = System.getProperty("user.dir")+"\\screenshot\\"+filename+".png ";
		        File destination = new File(path);
		          FileHandler.copy(source, destination);
		          return path;
	}
	public static void captureScreenshot(WebDriver driver,String filename) throws IOException
	{ 
		TakesScreenshot ts = (TakesScreenshot)driver;
		          File source =ts.getScreenshotAs(OutputType.FILE);
		        String path = System.getProperty("user.dir")+"\\screenshot\\"+".png";
	              File target = new File(path);
	              FileHandler.copy(source, target);
	
	}

public static void main(String[] args) throws IOException {
	
	System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	 
	driver.get("https://www.facebook.com");
	

  
 
}
 



}
