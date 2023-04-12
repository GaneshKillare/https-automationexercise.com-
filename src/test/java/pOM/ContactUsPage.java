package pOM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
	WebDriver driver;
	

	public ContactUsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h2[normalize-space()='Get In Touch']")
	WebElement GetInTouch;
	@FindBy(xpath = "//input[@placeholder='Name']")
	WebElement name;
	@FindBy(xpath = "//input[@placeholder='Email']")
	WebElement email;
	@FindBy(xpath = "//input[@placeholder='Subject']")
	WebElement subject;
	@FindBy(xpath = "//textarea[@id='message']")
	WebElement yourMessageHere;
	@FindBy(xpath = "//input[@name='upload_file']")
	WebElement fileUploadBTN;
	@FindBy(xpath = "//input[@name='submit']")
	WebElement submitBTN;
	@FindBy(xpath = "//div[@class='status alert alert-success']")
	WebElement successMSG;

	public boolean verifyGetInTouch() {
		return GetInTouch.isDisplayed();
	}

	public void setName(String Name) {
		name.sendKeys(Name);
	}

	public void setEmail(String Email) {
		email.sendKeys(Email);
	}

	public void setSubject(String Subject) {
		subject.sendKeys(Subject);
	}

	public void setYourMessageHere(String MSG) {
		yourMessageHere.sendKeys(MSG);
	}

	public void uploadFile() {
		fileUploadBTN.sendKeys("C:\\Users\\Ganesha\\eclipse-workspace\\AutomationExercise\\uploadFile.txt");
	}

	public void clickOnSubmitBTN() {
	JavascriptExecutor js = (JavascriptExecutor) driver ;
	js.executeScript("arguments[0].click();", submitBTN);
	}
	public boolean verifySuccessMSG() {
		return successMSG.isDisplayed();
	}

}
