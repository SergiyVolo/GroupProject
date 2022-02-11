package step_definitions;

import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.BrowserUtils;
import utilities.Driver;
import utilities.PropertiesReader;
import pages.TradeJournalLoginPage;

public class TradeJournalDeleteSteps {

	TradeJournalLoginPage loginPage = new TradeJournalLoginPage();
	BrowserUtils utils = new BrowserUtils();

	@Given("I am signed in with valid username {string} and password {string}")
	public void i_am_signed_in_with_valid_username_and_password(String username, String password) {
		Driver.getDriver().get(PropertiesReader.getProperty("tradejournalUrl"));
		loginPage.username.sendKeys(username);
		loginPage.password.sendKeys(password);
		loginPage.signinBtn.click();
	}

	@Given("The delete button is displayed")
	public void the_delete_button_is_displayed() {
		Assert.assertTrue(loginPage.deleteBtn.isDisplayed());
	}

	@When("I click delete button")
	public void i_click_delete_button() {
		loginPage.deleteBtn.click();
	}

	@Then("Message: {string} should be displayed")
	public void message_should_be_displayed(String message) {
		utils.waitUntilAlertIsPresent();
		utils.switchToAlert();
		System.out.println("Text is: " + utils.alertGetText());
		Assert.assertEquals(utils.alertGetText(), message);
	}

	@When("I click on Cancel")
	public void i_click_on_cancel() {
      utils.alertDismiss();
      
	}

	@Then("modal should close without deleting the record from  the table view")
	public void modal_should_close_without_deleting_the_record_from_the_table_view() {
		System.out.println(loginPage.oneRecord.getText());
	      Assert.assertTrue(loginPage.oneRecord.isDisplayed());
	}

	

}
