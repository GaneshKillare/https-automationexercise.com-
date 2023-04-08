package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.github.javafaker.Faker;

import pOM.HomePage;
import pOM.SignUPLogIn;
import testBase.BaseClass;

public class TC_004_LogInWithExistingMail extends BaseClass {
	HomePage hm;
	SignUPLogIn sp;
	Faker faker;
	SoftAssert softAssert;

	@Test
	public void logInWithExistingMail() {

		faker = new Faker();
		hm = new HomePage(driver);
		sp = new SignUPLogIn(driver);
		softAssert = new SoftAssert();
		
		boolean homePageIsAvalable = hm.homePageIsDisplay();
		softAssert.assertEquals(homePageIsAvalable, true);
		hm.clickOnLogInAndSignUpBTN();
		boolean verifyNewUser = sp.VerifyNewUserSignup();
		softAssert.assertEquals(verifyNewUser, true);
		sp.setName("Ganesh");
		sp.setEmail("loginwithExisting@mail.com");
		sp.clickOnSignUpBTN();
		boolean verifyErrorMSG = sp.VerifyShowErrorMSGTimeOfLogin();
		Assert.assertEquals(verifyErrorMSG, true);
		driver.close();
	}

}
