package pom;

import java.io.IOException;

import org.testng.annotations.Test;

import utility.ReadDataFromPropFile;

public class LoginTest extends BaseTest {
     @Test
	public void validateLogin() throws IOException
	{
    	 lp.loginToApplication(ReadDataFromPropFile.readConfigData("username"),ReadDataFromPropFile.readConfigData("password"));
	   lp.enterPin();	
	
	}
     @Test
	public void validateTitle()
	{
		lp.titleOfPage();
	}
	
	
}
