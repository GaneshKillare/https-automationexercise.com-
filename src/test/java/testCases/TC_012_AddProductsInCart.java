package testCases;

import org.openqa.selenium.Dimension;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.github.javafaker.Faker;

import pOM.HomePage;
import pOM.ProductPage;
import pOM.SignUPLogIn;
import testBase.BaseClass;

public class TC_012_AddProductsInCart extends BaseClass {

	HomePage hm;
	SignUPLogIn sp;
	Faker faker;
	ProductPage pp;

	@Test
	public void testAddProductsInCart() throws InterruptedException {
		faker = new Faker();
		hm = new HomePage(driver);
		sp = new SignUPLogIn(driver);
		pp = new ProductPage(driver);
		SoftAssert softAssert = new SoftAssert();
		boolean HomePgeDisplay = hm.homePageIsDisplay();
		softAssert.assertEquals(HomePgeDisplay, true);
		
		 hm.clickOnProductBTN();
		 driver.navigate().refresh();
		 hm.clickOnProductBTN();
		 driver.manage().window().setSize(new Dimension(800, 600));
		//moveToElement(pp.moveTo1Element);
		Thread.sleep(2000);
		pp.addToCart1Product();
		
		/*pp.clickOnContinueBTN();
		//moveToElement(pp.moveTo2Element);
		pp.addToCart2Product();
		pp.clickOnViewCart();
		boolean cartProduct = pp.verifyCartProduct();
		Assert.assertEquals(cartProduct, true); */
		driver.close();
	}

}
