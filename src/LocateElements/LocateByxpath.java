package LocateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByxpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/calorie-calculator.html");
		WebElement genderLabel = driver.findElement(By.xpath("//*[@id='calinputtable']/tbody/tr[2]/td[1]"));
		System.out.println(genderLabel.getText());
}
}
