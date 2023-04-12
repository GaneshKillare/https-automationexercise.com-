package pOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[normalize-space()='Home']")
	WebElement homeBTN;
	@FindBy(xpath = "//a[normalize-space()='Signup / Login']")
	WebElement logSignBTN;
	@FindBy(xpath = "//a[normalize-space()='Logout']")
	WebElement logOutBTN;
	@FindBy(xpath = "//a[normalize-space()='Contact us']")
	WebElement contactUs;
	@FindBy(xpath = "//a[contains(text(),'Test Cases')]")
	WebElement testCasesBTN;
	@FindBy(xpath = "//span[contains(text(),'Below is the list of test Cases for you to practic')]")
	WebElement confMSGTestCases ;
	@FindBy(xpath = "//a[@href='/products']") WebElement productBTN;

	public boolean homePageIsDisplay() {
		return homeBTN.isDisplayed();
	}

	public void clickOnLogInAndSignUpBTN() {
		logSignBTN.click();
	}

	public boolean verifyACDeletedSuccessfully() {
		return logSignBTN.isDisplayed();
	}

	public void clickOnLogoutBTN() {
		logOutBTN.click();
	}

	public void clickOnContactUsBTN() {
		contactUs.click();
	}

	public void clickOnHomeBTN() {
		homeBTN.click();
	}
	public void clickOnTestCases() {
		testCasesBTN.click();
	}
	public boolean verifyNavigateTestCasePage() {
		return confMSGTestCases.isDisplayed();
	}
	public void clickOnProductBTN() {
		productBTN.click();
	}
}
