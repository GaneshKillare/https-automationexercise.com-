package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.github.javafaker.Faker;

import pOM.HomePage;
import pOM.SignUPLogIn;
import testBase.BaseClass;

public class TC_001_CreatenewUser extends BaseClass {

	HomePage hm;
	SignUPLogIn sp;
	Faker faker;

	@Test
	public void testCreateUser() throws InterruptedException {
		faker = new Faker();
		hm = new HomePage(driver);
		sp = new SignUPLogIn(driver);
		SoftAssert softAssert = new SoftAssert();
		boolean homePageIsAvalable = hm.homePageIsDisplay();
		softAssert.assertEquals(homePageIsAvalable, true);
		hm.clickOnLogInAndSignUpBTN();
		boolean verifyNewUser = sp.VerifyNewUserSignup();
		softAssert.assertEquals(verifyNewUser, true);
		sp.setName(faker.name().fullName());
		sp.setEmail(faker.internet().emailAddress());
		sp.clickOnSignUpBTN();
		sp.setTitleMR();
		// sp.setEmail(faker.internet().emailAddress());        --> Email is Already exist 
		sp.setPassword(faker.internet().password());
		pagescrllDown();
		sp.setDay("12");
		sp.setMonth("June");
		sp.setYear("1999");
		sp.clickOnNewsLetter();
		sp.clickOnRecOffer();
		boolean verifyACInfo = sp.verifyEnterACInfo();
		softAssert.assertEquals(verifyACInfo, true);
		sp.setFirstName(faker.name().firstName());
		sp.setLastNamee(faker.name().lastName());
		sp.setCompany(faker.company().name());
		sp.setAddress1(faker.address().buildingNumber());
		sp.setAddress2(faker.address().fullAddress());
		sp.setState("Maharashtra");
		sp.setCity("Latur");
		sp.setZipCode(faker.address().zipCode());
		sp.setMObNumber(faker.phoneNumber().phoneNumber());
		sp.clickOncreateAC();
		driver.navigate().refresh(); // for ads popup handle
		sp.clickOnContinue();
		boolean verifyUser =sp.VerifyUser();
		softAssert.assertEquals(verifyACInfo, verifyUser);
		softAssert.assertAll();
		sp.deleteAc();
		sp.AfterDeleteAcClickOnContiniueBTN();
		Assert.assertEquals(homePageIsAvalable, true);
		driver.close();
	}

}
