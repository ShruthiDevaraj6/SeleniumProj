package LocateElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/calorie-calculator.html");
		WebElement table = driver.findElementByClassName("cInfoT");
		List <WebElement> rows = table.findElements(By.tagName("tr"));
		for(WebElement row: rows) {
			List <WebElement> cells = row.findElements(By.tagName("td"));
			for(WebElement cell:cells) {
				System.out.print(cell.getText() + "\t");
			}
			System.out.println("");
		}

	}

}
