package LocateElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/calorie-calculator.html");
		List <WebElement> sexList = driver.findElements(By.name("csex"));
		for (WebElement gender: sexList) {
			System.out.println(gender.getAttribute("name")+" "+ gender.getAttribute("value")+" "+gender.getAttribute("id")+" ");
			if (gender.getAttribute("value").equals("f")) 
				if (!gender.isSelected()) {
					gender.click();
					break;
				}
					
		}

	}

}
