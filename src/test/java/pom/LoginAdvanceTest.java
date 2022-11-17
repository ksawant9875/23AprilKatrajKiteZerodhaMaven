package pom;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginAdvanceTest extends Main{
    @Test(priority=1)
	public void validationOfLoginAdvance()
	{
		lpa.loginToApplication();
	}
	@Test(priority=2)
	public void validateAdmin()
	{
	   lpa.clickOnAdmin();	
	}
	@Test(priority=3)
	public void verifytitle()
	{
		lpa.TitleOfPage();
     	Assert.assertEquals("actual","expected");
	
	
	}
	
}
