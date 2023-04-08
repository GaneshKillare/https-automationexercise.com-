package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pOM.HomePage;
import pOM.SignUPLogIn;
import testBase.BaseClass;

public class TC_005_LogoutUser extends BaseClass {
	SignUPLogIn sp;
	HomePage hm;
	SoftAssert softAssert;

	@Test
	public void testLogoutUser() {
		sp = new SignUPLogIn(driver);
		hm = new HomePage(driver);
		softAssert = new SoftAssert();
		boolean homeButton = sp.VerifyHomePageDisplay();
		softAssert.assertEquals(homeButton, true);
		hm.clickOnLogInAndSignUpBTN();
		boolean logInMsg = sp.VerifylogInToYourAC();
		softAssert.assertEquals(logInMsg, true);
		sp.setEmailForLogIn("ganeshkillare1@gmail.com");
		sp.setPasswordForLogIn("Test@123");
		sp.clickOnLogInBTN();
		boolean verifyUser = sp.VerifyUser();
		softAssert.assertEquals(verifyUser, true);
		boolean homePageIsAvalable = hm.homePageIsDisplay();
		Assert.assertEquals(homePageIsAvalable, true);
	}

}
