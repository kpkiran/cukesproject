package com.ravikiran.CukesProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;
	public static Properties properties;
	
	public static WebDriver initializeDriver() throws IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/ravikiranpadki/Downloads/chromedriver");
		properties = new Properties();
		FileInputStream fis = new FileInputStream("/Users/ravikiranpadki/eclipse-workspace/CukesProject/src/test/java/com/ravikiran/CukesProject/global.properties");
		properties.load(fis);
		driver = new ChromeDriver();
		driver.get(properties.getProperty("url"));
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		return driver;
	}
	
}
