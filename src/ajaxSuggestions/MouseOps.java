package ajaxSuggestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MouseOps {
	WebDriver driver;
	@Test
	public void MouseOperations() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[3]/a")).click();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='menu']/div[2]/ul/li[3]/a")));
		WebElement printer =driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[3]/div/div/ul/li[3]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(printer).click().build().perform();
		
	}

}
