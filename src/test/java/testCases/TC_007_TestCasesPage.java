package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.github.javafaker.Faker;

import pOM.HomePage;
import pOM.SignUPLogIn;
import testBase.BaseClass;

public class TC_007_TestCasesPage extends BaseClass {
	HomePage hm;
	SignUPLogIn sp;
	Faker faker;

	@Test
	public void verifyTestCasesPage() {
		faker = new Faker();
		hm = new HomePage(driver);
		sp = new SignUPLogIn(driver);
		SoftAssert softAssert = new SoftAssert();
		boolean HomePgeDisplay = hm.homePageIsDisplay();
		softAssert.assertEquals(HomePgeDisplay, true);
		hm.clickOnTestCases();
		driver.navigate().refresh(); // handle random ads popups
		boolean testCasePage = hm.verifyNavigateTestCasePage();
		Assert.assertEquals(true, testCasePage);
		driver.close();
	}

}
