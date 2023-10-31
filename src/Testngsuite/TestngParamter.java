package Testngsuite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestngParamter {
	ChromeDriver driver;
	
	@BeforeMethod
	public void LaunchBrowser() {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.calculator.net/calorie-calculator.html");
	}
	@AfterMethod
	public void close() {
		if(driver!= null)
			driver.quit();
	}
	@Test(dataProvider = "getCalorieData")
	public void CaloriecalcTestcase(String age, String sex) throws InterruptedException {
		WebElement ageText = driver.findElement(By.id("cage"));
		ageText.clear();
		ageText.sendKeys(age);
		List <WebElement> sexList = driver.findElements(By.name("csex"));
		for (WebElement gender:sexList ) {
			System.out.println(gender.getAttribute("id") + "" + gender.getAttribute("name") + "" + gender.getAttribute("value"));
			if(gender.getAttribute("value").equals(sex)) {
				if(!gender.isSelected()) {
					gender.click();
					break;
				}}}
		Thread.sleep(3000);
		}
	@DataProvider
	public Object[][] getCalorieData() {
		Object[][] obj = new Object[3][2];
		obj[0][0]= "35";
		obj[0][1]= "f";
		
		obj[1][0]= "56";
		obj[1][1]= "m";
		
		obj[2][0]= "45";
		obj[2][1]= "f";
		return obj;
		
				
		
	}
		
}
