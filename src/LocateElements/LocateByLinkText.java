package LocateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByLinkText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/calorie-calculator.html");
		driver.findElement(By.linkText("BMI")).click();
		driver.findElement(By.partialLinkText("Watcher")).click();

	}

}
