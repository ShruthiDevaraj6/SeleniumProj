package amazonexample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AmazonLogin {
	WebDriver driver;
	@Test
	public void MouseOperations() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement signIn = driver.findElement(By.xpath("//*[@id='nav-link-yourAccount']"));
		Actions action= new Actions(driver);
		action.moveToElement(signIn).click().build().perform();
		driver.manage().window().maximize();
		WebElement Login=driver.findElement(By.xpath("//*[@type='email']"));
		Login.sendKeys("Mari I miss you, nange nindu touch beku");
		
}}
