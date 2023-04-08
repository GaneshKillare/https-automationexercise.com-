package pOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUPLogIn {
	WebDriver driver;

	public SignUPLogIn(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(partialLinkText = "Home")
	WebElement HomePage;
	@FindBy(xpath = "//h2[normalize-space()='Login to your account']")
	WebElement logInPageMSG;
	@FindBy(name = "password")
	WebElement logInPass;
	@FindBy(xpath = "//input[@data-qa='login-email']")
	WebElement logInEmail;
	@FindBy(xpath = "//button[@data-qa='login-button']")
	WebElement logInBTN;
	@FindBy(xpath = "//form[@action='/login']//p")
	WebElement ErrorMSG;
	@FindBy(xpath = "//h2[normalize-space()='New User Signup!']")
	WebElement newUserSign;
	@FindBy(name = "name")
	WebElement newUserName;
	@FindBy(xpath = "//input[@data-qa='signup-email']")
	WebElement newEmail;
	@FindBy(xpath = "//button[normalize-space()='Signup']")
	WebElement signUpBTN;
	@FindBy(xpath = "//b[normalize-space()='Enter Account Information']")
	WebElement etrAcIfo;
	@FindBy(id = "id_gender1")
	WebElement Mr;
	@FindBy(id = "id_gender2")
	WebElement Ms;
	@FindBy(id = "name")
	WebElement userName;
	@FindBy(id = "email")
	WebElement userEmail;
	@FindBy(id = "password")
	WebElement userPassword;
	@FindBy(id = "days")
	WebElement days;
	@FindBy(id = "months")
	WebElement months;
	@FindBy(id = "years")
	WebElement year;
	@FindBy(id = "newsletter")
	WebElement CBnewsLetter;
	@FindBy(id = "optin")
	WebElement CBrecOffers;
	@FindBy(id = "first_name")
	WebElement firstName;
	@FindBy(id = "last_name")
	WebElement lastName;
	@FindBy(id = "company")
	WebElement company;
	@FindBy(id = "address1")
	WebElement address1;
	@FindBy(id = "address2")
	WebElement address2;
	@FindBy(id = "country")
	WebElement countries;
	@FindBy(id = "state")
	WebElement state;
	@FindBy(id = "city")
	WebElement city;
	@FindBy(id = "zipcode")
	WebElement zipCode;
	@FindBy(id = "mobile_number")
	WebElement MObNumber;
	@FindBy(css = "button[data-qa='create-account']")
	WebElement createAC;
	@FindBy(xpath = "//b[normalize-space()='Account Created!']")
	WebElement ACisCreated;
	@FindBy(xpath = "//a[@data-qa='continue-button']")
	WebElement continueAC;
	@FindBy(partialLinkText = "Logged in")
	WebElement verifyUser;
	@FindBy(xpath = "//a[normalize-space()='Delete Account']")
	WebElement deleteAC;
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	WebElement continueBTN;
	@FindBy(xpath = "//form[@action='/signup']//p")
	WebElement errorMSGLogin;

	public boolean VerifyShowErrorMSGTimeOfLogin() {
		return errorMSGLogin.isDisplayed();
	}
	public boolean VerifyHomePageDisplay() {
		return HomePage.isDisplayed();
	}
	public boolean VerifyErrorMSGDisplay() {
		return ErrorMSG.isDisplayed();
	}

	public boolean VerifylogInToYourAC() {
		return logInPageMSG.isDisplayed();
	}

	public void setEmailForLogIn(String Email) {
		logInEmail.sendKeys(Email);
	}

	public void setPasswordForLogIn(String pass) {
		logInPass.sendKeys(pass);
	}

	public void clickOnLogInBTN() {
		logInBTN.click();
	}

	public boolean VerifyNewUserSignup() {
		return newUserSign.isDisplayed();
	}

	public void setName(String name) {
		newUserName.sendKeys(name);
	}

	public void setEmail(String email) {
		newEmail.sendKeys(email);
	}

	public void clickOnSignUpBTN() {
		signUpBTN.click();
	}

	public boolean verifyEnterACInfo() {
		return etrAcIfo.isDisplayed();
	}

	public void setTitleMR() {
		Mr.click();
	}

	public void setTitleMs() {
		Ms.click();
	}

	public void setPassword(String pass) {
		userPassword.sendKeys(pass);
	}

	public void setDay(String day) {
		days.sendKeys(day);
	}

	public void setMonth(String month) {
		months.sendKeys(month);
	}

	public void setYear(String Year) {
		year.sendKeys(Year);
	}

	public void clickOnNewsLetter() {
		CBnewsLetter.click();
	}

	public void clickOnRecOffer() {
		CBrecOffers.click();
	}

	public void setFirstName(String firstname) {
		firstName.sendKeys(firstname);
	}

	public void setLastNamee(String lastname) {
		lastName.sendKeys(lastname);
	}

	public void setCompany(String company) {
		firstName.sendKeys(company);
	}

	public void setAddress1(String Address1) {
		address1.sendKeys(Address1);
	}

	public void setAddress2(String Address2) {
		address2.sendKeys(Address2);
	}

	public void setCountry(String country) {
		countries.sendKeys(country);
	}

	public void setState(String State) {
		state.sendKeys(State);
	}

	public void setCity(String City) {
		city.sendKeys(City);
	}

	public void setZipCode(String zip) {
		zipCode.sendKeys(zip);
	}

	public void setMObNumber(String mobnum) {
		MObNumber.sendKeys(mobnum);
	}

	public void clickOncreateAC() {
		createAC.click();
	}

	public void clickOnContinue() {
		continueAC.click();
	}

	public boolean VerifyUser() {
		return verifyUser.isDisplayed();
	}

	public boolean accountIsCreated() {
		return ACisCreated.isDisplayed();
	}

	public boolean deleteAcConformation() {
		return deleteAC.isDisplayed();
	}

	public void deleteAc() {
		deleteAC.click();
	}

	public void AfterDeleteAcClickOnContiniueBTN() {
		continueBTN.click();
	}

}
