package listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGen {
   static ExtentReports extent;
    public static ExtentReports extentReportGenerator()
    {
       String path = System.getProperty("user.dir")+"\\reports\\"+"kitezerodhareport.html";
       ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
       reporter.config().setTheme(Theme.DARK);
    	reporter.config().setReportName("Zerodha execution report");
    	
    	   extent = new ExtentReports();
    	
         extent.attachReporter(reporter);
          extent.setSystemInfo("project name","Kite Zerodh");
    
          extent.setSystemInfo("Executed by","23 April batch");
         extent.setSystemInfo("Enviromental used","Staging"); 
          
          return extent;
    
    }
    



}
