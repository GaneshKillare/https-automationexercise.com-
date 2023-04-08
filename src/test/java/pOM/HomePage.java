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
	
	
	public boolean homePageIsDisplay() {
		return homeBTN.isDisplayed();
	}
	public void clickOnLogInAndSignUpBTN() {
		logSignBTN.click();
	}
	public boolean verifyACDeletedSuccessfully() {
		return	logSignBTN.isDisplayed();
		}
	public void clickOnLogoutBTN() {
		logOutBTN.click();
	}
}
