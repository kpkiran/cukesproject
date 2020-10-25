package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class bankingDetails {
	
	@Given("^I am a the manager of the bank$")
	public void i_am_a_the_manager_of_the_bank() {
		System.out.println("I am a the manager of the bank");
	}
	
	@When("^I login as an admin$")
	public void i_login_as_an_admin() {
		System.out.println("I login as an admin");
	}
	
	@Then("^I should be given access to see accounts$")
	public void i_should_be_given_access_to_see_accounts() {
		System.out.println("I should be given access to see accounts");
	}
	
	@Given("^I see the account number$")
    public void i_see_the_account_number() throws Throwable {
        System.out.println("I see the account number");
    }

    @When("^I click on the account number$")
    public void i_click_on_the_account_number() throws Throwable {
        System.out.println("I click on the account number");
    }

    @Then("^I should be able to see the account details$")
    public void i_should_be_able_to_see_the_account_details() throws Throwable {
        System.out.println("I should be able to see the account details");
    }
    
    @Given("^I see the view accounts link$")
    public void i_see_the_view_accounts_link() throws Throwable {
        System.out.println("I see the view accounts link");
    }

    @When("^I click on the account numbers$")
    public void i_click_on_the_account_numbers() throws Throwable {
        System.out.println("I click on the account numbers");
    }

    @Then("^I should be able to see all the account details$")
    public void i_should_be_able_to_see_all_the_account_details() throws Throwable {
        System.out.println("I should be able to see all the account details");
    }
}