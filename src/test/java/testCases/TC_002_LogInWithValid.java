package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pOM.HomePage;
import pOM.SignUPLogIn;
import testBase.BaseClass;

public class TC_002_LogInWithValid extends BaseClass {
	@Test
	public void LoginUserwithcorrectEmailAndPassword() {
		SignUPLogIn sp = new SignUPLogIn(driver);
		HomePage hm = new HomePage(driver);
		SoftAssert softAssert = new SoftAssert();
		boolean homeButton = sp.VerifyHomePageDisplay();
		softAssert.assertEquals(homeButton, true);
		hm.clickOnLogInAndSignUpBTN();
		boolean logInMsg = sp.VerifylogInToYourAC();
		softAssert.assertEquals(logInMsg, true);
		sp.setEmailForLogIn("ganeshkillare11@gmail.com");
		sp.setPasswordForLogIn("123456789");
		sp.clickOnLogInBTN();
		boolean verifyUser = sp.VerifyUser();
		Assert.assertEquals(verifyUser, true);
		/*sp.deleteAc();
		sp.clickOnContinue();
		driver.navigate().refresh();
		boolean AcDeleted = hm.verifyACDeletedSuccessfully();
		Assert.assertEquals(AcDeleted, true);*/
		driver.close();

	}

}
