package ajaxSuggestions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowNavigations {
	WebDriver driver;
	@Test
	public void HandlingWindowNav() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.online.citibank.co.in/products-services/online-services/internet-banking.htm");
		String parentWindowId = driver.getWindowHandle();
		System.out.println("Parent Window id:" + parentWindowId);
		Set <String> windowIds = driver.getWindowHandles();
		driver.findElement(By.xpath("//*[@title='LOGIN NOW']")).click();
		Thread.sleep(3000);
		
		windowIds = driver.getWindowHandles();
		System.out.println("Number of open windows:" + windowIds.size());
		Iterator <String> itr = windowIds.iterator();
		String mainWindowId = itr.next().toString();
		String subWindowId = itr.next().toString();
		System.out.println("Main window id:" + mainWindowId);
		System.out.println("Sub window id:" + subWindowId);
		driver.switchTo().window(subWindowId);
		driver.findElement(By.id("User_Id")).sendKeys("SHRUTHI");
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(mainWindowId);
		driver.findElement(By.id("topMnuhomeloans")).click();
		
		
	}

}
