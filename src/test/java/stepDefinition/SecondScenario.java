package stepDefinition;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.ravikiran.CukesProject.Base;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SecondScenario extends Base {
	
    @Then("^verify selected \"([^\"]*)\" items are displayed$")
    public void verify_selected_something_items_are_displayed(String strArg1) throws Throwable {
    	 Assert.assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains(strArg1));
    }




}
