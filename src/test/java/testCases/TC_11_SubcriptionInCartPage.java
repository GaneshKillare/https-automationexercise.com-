package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.github.javafaker.Faker;

import pOM.HomePage;
import pOM.SignUPLogIn;
import pOM.SubscriptionPage;
import testBase.BaseClass;

public class TC_11_SubcriptionInCartPage extends BaseClass {
	HomePage hm;
	SignUPLogIn sp;
	Faker faker;
	SubscriptionPage scrb ;

	@Test
	public void testSubcriptionINCartPage() {
		faker = new Faker();
		hm = new HomePage(driver);
		sp = new SignUPLogIn(driver);
		scrb=	new  SubscriptionPage(driver);
		SoftAssert softAssert = new SoftAssert();
		boolean homePageIsAvalable = hm.homePageIsDisplay();
		softAssert.assertEquals(homePageIsAvalable, true);
		hm.clickOnCartBTN();
		scrollDownFullPage();
		scrb.setEmailOnHomePage("ganeshkillare@gmail.com");
		scrb.clickOnArrowOfSusbscribe();
		boolean successMSG =scrb.verifySusbscribeEmailSuccessMSG();
		Assert.assertEquals(successMSG, true);
	    scrollUpPage();
		softAssert.assertEquals(homePageIsAvalable, true);
         driver.close();

	}
}
