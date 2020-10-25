package stepDefinition;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class gradesStepDefinition {
	
	@Given("^I open my application$")
    public void i_open_my_application() throws Throwable {
        System.out.println("Application Opened");
    }
	
	@And("^I login with following credentials$")
    public void i_login_with_following_credentials(DataTable data) throws Throwable {
        List<String> list = data.asList();
        System.out.println("Username is " + list.get(0));
        System.out.println("Password is " + list.get(1));
    }
	
	@Then("^I should be logged in$")
    public void i_should_be_logged_in() throws Throwable {
		System.out.println("You are logged in");
    }

}
