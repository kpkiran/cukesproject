package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.ravikiran.CukesProject.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HomePage;

public class SearchStepDefinition {
	
	public WebDriver driver;
	HomePage homePage;
	
    @Given("^User is on greenkart landing page$")
    public void user_is_on_greenkart_landing_page() throws Throwable {
    	driver = Base.initializeDriver();
    }

    @When("^User searched for (.+) vegetable$")
    public void user_searched_for_something_vegetable(String strArg1) throws Throwable {
    	homePage = new HomePage(driver);
    	homePage.getSearch().sendKeys(strArg1);
    }

    @Then("^\"([^\"]*)\" resutls are displayed$")
    public void something_resutls_are_displayed(String strArg1) throws Throwable {
        Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(strArg1));
    }
    
    @Then("^verify selected (.+) items are displayed$")
    public void verify_selected_items_are_displayed(String name) throws Throwable {
    	Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(name));
    }
    
    
    @And("^added items to cart$")
    public void added_items_to_cart() throws Throwable {
        driver.findElement(By.cssSelector("a.increment")).click();
        driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
    }

    @And("^user proceeds to checkout page$")
    public void user_proceeds_to_checkout_page() throws Throwable {
        driver.findElement(By.xpath("//*[@class='cart-icon']//img[contains(@class, '')]")).click();
        driver.findElement(By.xpath("//*[@class='action-block']/button")).click();
    }
    
    
	

}
