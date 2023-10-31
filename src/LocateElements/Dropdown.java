package LocateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/calorie-calculator.html");
		WebElement activity = driver.findElement(By.id("cactivity"));
		Select dd = new Select(activity);
		System.out.println("Dropdown_Select by index");
		System.out.println(dd.getFirstSelectedOption().getText());
		dd.selectByIndex(0);
		Thread.sleep(3000);
		
		System.out.println("Dropdown_Select by Value");
		System.out.println(dd.getFirstSelectedOption().getText());
		dd.selectByValue("1.725");
		Thread.sleep(3000);
		
		System.out.println("Dropdown_Select by VisibleText");
		System.out.println(dd.getFirstSelectedOption().getText());
		dd.selectByVisibleText("Extra Active: very intense exercise daily, or physical job");
		Thread.sleep(3000);
		
		System.out.println("Is the dropdown multiselect"+ dd.isMultiple());
		
		
	}

}
