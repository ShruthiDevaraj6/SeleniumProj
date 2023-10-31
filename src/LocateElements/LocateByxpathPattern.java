package LocateElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByxpathPattern {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/calorie-calculator.html");
		System.out.println("Starts with c function");
		List <WebElement> startswithc = driver.findElements(By.xpath("//*[starts-with(@id,'c')]"));
		for (WebElement c: startswithc) {
			System.out.println(c.getAttribute("id"));
		}
		System.out.println("Contains height function");
		List <WebElement> height= driver.findElements(By.xpath("//*[contains(@name,'height')]"));
		for (WebElement h:height) {
			System.out.println(h.getAttribute("name"));
		}
	}

}
