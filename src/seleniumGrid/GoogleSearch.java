package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleSearch {
	WebDriver driver;
	String browser= "chrome";
	DesiredCapabilities dc=null;
	@Parameters({"browser"})
	@Test
	public void googleSearchTest(String browser) throws MalformedURLException {
		if(browser.equals("chrome")) {
				dc=DesiredCapabilities.chrome();
		}
		else if(browser.equals("firefox")) {
			dc=DesiredCapabilities.firefox();
		}
		else if(browser.equals("ie")) {
			dc=DesiredCapabilities.internetExplorer();
		}
		dc.setPlatform(Platform.ANY);
		driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),dc);
			driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Mari");
		
	}

}
