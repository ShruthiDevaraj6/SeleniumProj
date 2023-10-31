package com.caloriecalc.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.caloriecalc.utilities.PropertyReader;

public class TestProperty {
	WebDriver driver;
	@Test
	public void PropertyTest() throws IOException {
		if(PropertyReader.ReadProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", PropertyReader.ReadProperty("chromedriverpath"));
			driver = new ChromeDriver();
			driver.get(PropertyReader.ReadProperty("appurl"));
			
		}
	}
	

}
