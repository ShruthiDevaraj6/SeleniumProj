package LocateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateById {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/calorie-calculator.html");
		WebElement ageTextbox = driver.findElement(By.id("cage"));
		ageTextbox.clear();
		ageTextbox.sendKeys("46");
	}

}
