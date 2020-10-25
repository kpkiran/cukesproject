package stepDefinition;

import java.util.List;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.hamcrest.CoreMatchers.is;


public class additionDefinition {
	
	public List<Integer> numbers;
	public int sum;
	
    @Given("^a list of numbers$")
    public void a_list_of_numbers(List<Integer> numbers) throws Throwable {
        this.numbers = numbers;
    }

    @When("^I add them$")
    public void i_add_them() throws Throwable {
        for(Integer number: numbers) {
        	sum += number;
        }
    }

    @SuppressWarnings("deprecation")
	@Then("should I get {int}")
    public void should_i_get(Integer expectedSum) throws Throwable {
        Assert.assertThat(sum, is(expectedSum));
    }

}
