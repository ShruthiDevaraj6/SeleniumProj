package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CaloriecalcPageTC {
	WebDriver driver;
	@Test
	public void CalorieTC()  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.calculator.net/calorie-calculator.html");
		PageClass pg = new PageClass(driver);
		pg.enterCalorieDetails("29", "f", "110");
	}

}
