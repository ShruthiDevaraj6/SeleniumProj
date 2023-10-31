package com.caloriecalc.testcases;

import java.io.IOException;
import java.util.Hashtable;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.caloriecalc.utilities.ExcelReader;

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
	public void CaloriecalcTestcase(Hashtable<String,String> obj) throws InterruptedException {
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
				}}
			WebElement heightfeet = driver.findElement(By.id("cheightfeet"));
			heightfeet.clear();
			heightfeet.sendKeys(obj.get("heightfeet"));
			WebElement heightinch = driver.findElement(By.id("cheightinch"));
			heightinch.clear();
			heightinch.sendKeys(obj.get("heightinch"));		
			}
	Thread.sleep(3000);	
	}
	@DataProvider
	public Object[][] getCalorieData() throws IOException {
		String filepath = System.getProperty("user.dir") + "/src/com/caloriecalc/testdata";
		String filename = "CalorieTestData.xlsx";
		String sheetname = "CalorieTestSet";
		return ExcelReader.ReadExcelDataToObjArr(filepath, filename, sheetname);

}}
