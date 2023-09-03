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

	@FindBy(xpath = "//a[text()='Add to cart'1)[1]")
	WebElement AddToCart1Product;
	// @FindBy(xpath = "(//a[@class='btn btn-default
	// add-to-cart'][normalize-space()='Add to cart'])[2]")
	// WebElement AddToCart2;
	@FindBy(xpath = "//button[@class='btn btn-success close-modal btn-block']")
	WebElement ContinueShoppingBTN;
	@FindBy(xpath = "(//a[contains(text(),'Add to cart')])[3]")
	WebElement AddToCart2Product;
	@FindBy(xpath = "//u[normalize-space()='View Cart']")
	WebElement viewCart;
	@FindBy(xpath = "//div[@id='cart_info']")
	WebElement cardInfo;
	@FindBy(xpath = "(//a[contains(text(),'Add to cart')])[2]")
	public WebElement moveTo1Element;
	@FindBy(xpath = "(//div[@class='productinfo text-center'])[2]")
	public WebElement moveTo2Element;

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

	public void addToCart1Product() {
		AddToCart1Product.click();
	}

	public void addToCart2Product() {
		AddToCart2Product.click();
	}

	public void clickOnContinueBTN() {
		ContinueShoppingBTN.click();
	}

	public void clickOnViewCart() {
		viewCart.click();
	}

	public boolean verifyCartProduct() {
		return viewCart.isDisplayed();
	}

}
