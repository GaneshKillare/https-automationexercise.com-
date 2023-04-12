package pOM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	WebDriver driver;

	public ProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h2[@class='title text-center']")
	WebElement allProductList;
	@FindBy(xpath = "(//a[contains(text(),'View Product')])[1]")
	WebElement firstProduct;
	@FindBy(xpath = "//div[@class='product-information']")
	WebElement productInfo;
	@FindBy(xpath = "//input[@id='search_product']")
	WebElement searchBox;
	@FindBy(xpath = "//button[@id='submit_search']")
	WebElement searchBTN;
	@FindBy(xpath = "//div[@class='features_items']")
	WebElement searchedProducts;

	public boolean verifyAllProductList() {
		return allProductList.isDisplayed();
	}

	public boolean verifyProductinfo() {
		return productInfo.isDisplayed();
	}

	public void clickOnFirstProduct() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", firstProduct);
	}
	public void setValueInSearchBox(String searchProduct) {
		searchBox.sendKeys(searchProduct);
	}
	public void clickOnSearchBTN() {
		searchBTN.click();
	}
	public boolean verifySearchedProducts() {
		return searchedProducts.isDisplayed();
	}
	
}
