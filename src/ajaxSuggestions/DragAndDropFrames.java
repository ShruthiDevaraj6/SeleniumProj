package ajaxSuggestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropFrames {
	WebDriver driver;
	@Test
	public void DragAndDropTest() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		WebElement drag= driver.findElement(By.id("draggable"));
		System.out.println("Drag element is" + " " + drag.getText());
		WebElement drop= driver.findElement(By.id("droppable"));
		System.out.println("Drop element is" + " " + drop.getText());
		Actions action=new Actions(driver);
		action.dragAndDrop(drag, drop).build().perform();
		System.out.println("Drop element is" + " " + drop.getText());
		if(drop.getText().equals("Dropped!")) {
			System.out.println("Drag and drop successful");}
			else
				{
				System.out.println("Unsucessful");	
				}
		}
	}


