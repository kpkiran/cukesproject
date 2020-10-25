package stepDefinition;

import com.ravikiran.CukesProject.Base;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Base {
	
	@Before("@mobileTest")
	public void beforeValidation() {
		System.out.println("Running Mobile Before Hook");
	}
	
	@After("@seleniumTest")
	public void afterValidation() {
		driver.close();
	}
}
