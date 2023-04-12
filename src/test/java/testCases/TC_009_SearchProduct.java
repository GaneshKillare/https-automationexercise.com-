package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.github.javafaker.Faker;

import pOM.HomePage;
import pOM.ProductPage;
import pOM.SignUPLogIn;
import testBase.BaseClass;

public class TC_009_SearchProduct extends BaseClass {
	HomePage hm;
	SignUPLogIn sp;
	Faker faker;
	ProductPage pp;

	@Test
	public void testSearchProduct() {
		faker = new Faker();
		hm = new HomePage(driver);
		sp = new SignUPLogIn(driver);
		pp = new ProductPage(driver);
		SoftAssert softAssert = new SoftAssert();
		hm.clickOnProductBTN();
		driver.navigate().refresh();
		boolean allProduct = pp.verifyAllProductList();
		softAssert.assertEquals(allProduct, true);
		pp.setValueInSearchBox("Tshirts");
		pp.clickOnSearchBTN();
		boolean searchedIteams = pp.verifySearchedProducts();
		Assert.assertEquals(searchedIteams, true);
		driver.close();
	}

}
