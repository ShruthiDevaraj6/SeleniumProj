package Testngsuite;

import java.util.Hashtable;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngParamterHashtable {
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
	public void CaloriecalcTestcase(Hashtable<String,String> obj) {
		WebElement ageText = driver.findElement(By.id("cage"));
		ageText.clear();
		ageText.sendKeys(obj.get("age"));
		List <WebElement> sexList = driver.findElements(By.name("csex"));
		for (WebElement gender:sexList ) {
			System.out.println(gender.getAttribute("id") + "" + gender.getAttribute("name") + "" + gender.getAttribute("value"));
			if(gender.getAttribute("value").equals(obj.get("sex"))) {
				if(!gender.isSelected()) {
					gender.click();
					break;
				}}}}
	@DataProvider
	public Object[][] getCalorieData() {
		Hashtable <String,String> rec1 = new Hashtable<String,String> ();
		rec1.put("age", "36");
		rec1.put("sex", "f");
		Hashtable <String,String> rec2 = new Hashtable<String,String> ();
		rec2.put("age", "107");
		rec2.put("sex", "m");
		
		Object [][] obj = new Object[2][1];
		obj[0][0] = rec1;
		obj[1][0] = rec2;
		return obj;

}}
