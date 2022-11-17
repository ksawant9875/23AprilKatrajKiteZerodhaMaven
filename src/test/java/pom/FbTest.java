package pom;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FbTest extends Base1c {
	@Test
	public void validateLogin()
	{
		fb.enterCredential();

	  fb.loginButton();
	}

  @Test
  public void validateLogo()
  {
	  fb.logo();
	 
  }




}
