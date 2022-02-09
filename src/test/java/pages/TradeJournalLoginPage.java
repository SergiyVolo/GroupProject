package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Driver;

public class TradeJournalLoginPage {
	
	public TradeJournalLoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath = "//input[@type='text']")
	public WebElement username;
	
	@FindBy(xpath = "//input[@type='password']")
	public WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement signinBtn;
	
	@FindBy (xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a")
	public WebElement homePageMessage;

}
