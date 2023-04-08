package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pOM.HomePage;
import pOM.SignUPLogIn;
import testBase.BaseClass;

public class TC_003_LigInWithInvalid extends BaseClass{
@Test
public void LoginUerWithIncorrectEmailAndPassword() {
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
	boolean errorMSGs=sp.VerifyErrorMSGDisplay();
	Assert.assertEquals(errorMSGs, true);
	driver.close();
}

}
