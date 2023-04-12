package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.github.javafaker.Faker;

import pOM.ContactUsPage;
import pOM.HomePage;
import pOM.SignUPLogIn;
import testBase.BaseClass;

public class TC_006_ContactUsForm extends BaseClass {
	HomePage hm;
	SignUPLogIn sp;
	Faker faker;
	ContactUsPage cp;

	@Test
	public void testContactUsForm() {
		faker = new Faker();
		hm = new HomePage(driver);
		sp = new SignUPLogIn(driver);
		cp = new ContactUsPage(driver);
		SoftAssert softAssert = new SoftAssert();
		boolean HomePgeDisplay = hm.homePageIsDisplay();
		softAssert.assertEquals(HomePgeDisplay, true);
		hm.clickOnContactUsBTN();
		boolean getInTouch = cp.verifyGetInTouch();
		softAssert.assertEquals(getInTouch, true);
		cp.setEmail(faker.internet().emailAddress());
		cp.setName(faker.name().fullName());
		cp.setSubject(faker.howIMetYourMother().catchPhrase());
		cp.setYourMessageHere(faker.address().fullAddress());
		cp.uploadFile();
		cp.clickOnSubmitBTN();
		driver.switchTo().alert().accept();
		cp.verifySuccessMSG();
		hm.clickOnHomeBTN();
		boolean HomePgeDisplayAfterFillForm = hm.homePageIsDisplay();
		Assert.assertEquals(HomePgeDisplayAfterFillForm, true);
		driver.close();
	}

}
