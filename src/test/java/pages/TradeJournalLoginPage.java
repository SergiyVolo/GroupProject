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
	
	@FindBy (xpath = "//*[contains(text(),'Logout')]")
	public WebElement logoutBtn;

	@FindBy (xpath = "(//*[@class='btn btn-danger btn-sm'])[1]")
	public WebElement deleteBtn;
	
	@FindBy (xpath = "(//*[@class='nav-link'])[1]")
	public WebElement homePageMessage;

	
	
}
