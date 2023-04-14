package pOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubscriptionPage {
	WebDriver driver ;
	public SubscriptionPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id = "susbscribe_email") WebElement SusbscribeEmail ;
	@FindBy(xpath = "//i[@class='fa fa-arrow-circle-o-right']") WebElement HomePageArrow ;
	@FindBy(xpath = "//*[@class='alert-success alert']") WebElement successMSG ;
	
	
	public void setEmailOnHomePage(String email) {
		SusbscribeEmail.sendKeys(email);
	}
	public void clickOnArrowOfSusbscribe() {
		HomePageArrow.click();
	}
	public boolean verifySusbscribeEmailSuccessMSG() {
		return successMSG.isDisplayed();
	}
	

}
