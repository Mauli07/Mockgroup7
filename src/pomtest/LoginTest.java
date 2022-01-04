package pomtest;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

	@Test
	public void loginToApp() {
		
		lp.loginWithCorrectCred();
		lp.enterPin();
	}
}
