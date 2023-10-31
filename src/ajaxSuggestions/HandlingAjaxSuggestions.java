package ajaxSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class HandlingAjaxSuggestions {
	WebDriver driver;
	@Test
	public void HandlingAjax() {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.google.com");
	driver.findElement(By.name("q")).sendKeys("s");
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@role='listbox']/li")));
	List <WebElement> list = driver.findElements(By.xpath("//*[@role='listbox']/li"));
	for (WebElement e:list) {
		System.out.println(e.getText());
		if(e.getText().equalsIgnoreCase("snapdeal")){
			e.click();
			break;
		}
	}

}}
