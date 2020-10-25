package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.ravikiran.CukesProject.Base;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition extends Base {
	
//	public WebDriver driver;
	
	@Given("^validate the browser$")
    public void validate_the_browser() throws Throwable {
        System.out.println("Browser is validated");
    }
	
	@When("^browser is triggered$")
    public void browser_is_triggered() throws Throwable {
        System.out.println("Browser is triggered");
    }
	
	@Then("^check if browser is started$")
    public void check_if_browser_is_started() throws Throwable {
//		driver = Base.initializeDriver();
        System.out.println("Check if browser is started");
    }
	
//    @Then("^verify selected \"([^\"]*)\" items are displayed$")
//    public void verify_selected_something_items_are_displayed(String strArg1) throws Throwable {
//    	 Assert.assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains(strArg1));
//    }

	
    @Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
        System.out.println("From Given");
    }

    @When("^User log into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_log_into_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        System.out.println(strArg1);
        System.out.println(strArg2);
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        System.out.println("From Then");
    }
    
    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) throws Throwable {
        System.out.println("From And");
    }
    
    @When("^User sign up with following details$")
    public void user_sign_up_with_following_details(DataTable data) throws Throwable {
    	List<List<String>> obj =   data.asLists();
    	System.out.println(obj.get(0).get(0));
    	System.out.println(obj.get(0).get(1));
    	System.out.println(obj.get(0).get(2));
    	System.out.println(obj.get(0).get(3));
    	System.out.println(obj.get(0).get(4));
    }
    
    @When("^User log in to application with (.+) and password (.+)$")
    public void user_log_in_to_application_with_and_password(String username, String password) throws Throwable {
        System.out.println(username);
        System.out.println(password);
    }

}