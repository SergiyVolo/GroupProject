package step_definitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TradeJournalLoginPage;
import utilities.Driver;
import utilities.PropertiesReader;

public class TradeJournalSteps {

	TradeJournalLoginPage loginPage = new TradeJournalLoginPage();

	@Given("I am on TradeJournal sign in page")
	public void i_am_on_trade_journal_sign_in_page() {
		Driver.getDriver().get(PropertiesReader.getProperty("tradejournalUrl"));
	}

	@Given("The sign in button displays")
	public void the_sign_in_button_displays() {
		Assert.assertTrue(loginPage.signinBtn.isDisplayed());

	}

	@When("I enter valid username {string} and valid password {string}")
	public void i_enter_valid_username_and_valid_password(String username, String password) {
		loginPage.username.sendKeys(username);
		loginPage.password.sendKeys(password);
	}

	@When("I click on sign in button")
	public void i_click_on_sign_in_button() {
		loginPage.signinBtn.click();
	}

	@Then("I should be directed to home page")
	public void i_should_be_directed_to_home_page() {
		Assert.assertTrue(loginPage.homePageMessage.isDisplayed());
	}

}
