package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ravikiran.CukesProject.Base;

public class HomePage extends Base {
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By search = By.xpath("//input[@type='search']");
	
	public WebElement getSearch() {
		return driver.findElement(search);
	}

}
