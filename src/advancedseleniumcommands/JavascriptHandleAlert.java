package advancedseleniumcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavascriptHandleAlert {
	WebDriver driver;
	@Test
	public void HandleAlert() throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.calculator.net/calorie-calculator.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("alert('Mari moothi');");
		Thread.sleep(4000);
		Alert alert = driver.switchTo().alert();
		String alertmsg = alert.getText();
		alert.accept();
		if(alertmsg.equals("Mari moothi")) {
			System.out.println("Match found");}
			else
				{System.out.println("Match not found");	
		}
		js.executeScript("confirm('Do you want to continue yes/no');");
		Thread.sleep(4000);
		alert = driver.switchTo().alert();
		String alertmsg1 = alert.getText();
		alert.dismiss();
		if(alertmsg1.equals("Do you want to continue yes/no")) {
			System.out.println("Match found");}
			else
				{System.out.println("Match not found");	
		}
		}}
