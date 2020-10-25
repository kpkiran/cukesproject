package stepDefinition;

import java.util.List;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class registrationStep {
	
	String fname;
	String lname;
	String username;
	String password;
	String email;
	
    @Given("^User submits a valid registration form$")
    public void user_submits_a_valid_registration_form(DataTable dataTable) throws Throwable {
    	List<String> list = dataTable.asList();
    	fname = list.get(0);
    	lname = list.get(1);
    	username = list.get(2);
    	password = list.get(3);
    	email = list.get(4);
    }

    @Then("^System proceeds with registration$")
    public void system_proceeds_with_registration() throws Throwable {
    	System.out.println("Registration success for " + fname + "  " + lname + " " + username + " " + password + " " + email );
    }
}
