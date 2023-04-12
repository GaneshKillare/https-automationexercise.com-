package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.github.javafaker.Faker;

import pOM.HomePage;
import pOM.ProductPage;
import pOM.SignUPLogIn;
import testBase.BaseClass;

public class TC_008_ProductListAndProductDetails extends BaseClass {
	HomePage hm;
	SignUPLogIn sp;
	Faker faker;
	ProductPage pp;

	@Test
	public void VerifyAllProductsAndProductDetailPage() {
		faker = new Faker();
		hm = new HomePage(driver);
		sp = new SignUPLogIn(driver);
		pp = new ProductPage(driver);
		SoftAssert softAssert = new SoftAssert();
		boolean HomePgeDisplay = hm.homePageIsDisplay();
		softAssert.assertEquals(HomePgeDisplay, true);
		hm.clickOnProductBTN();
		boolean allProduct = pp.verifyAllProductList();
		softAssert.assertEquals(allProduct, true);
		pp.clickOnFirstProduct();
		boolean productInfo = pp.verifyProductinfo();
		Assert.assertEquals(productInfo, true);
		driver.close();

	}

}
