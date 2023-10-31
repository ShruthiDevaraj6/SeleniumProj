package pagefactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageClass {
	WebDriver driver;
	
	//creating constructor
	public PageClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="cage")
	@CacheLookup
	private WebElement ageTextbox;
	
	@FindBy(name="csex")
	@CacheLookup
	private List <WebElement> sexList;
	
	@FindBy(xpath="//*[@id='cpound']")
	@CacheLookup
	private WebElement weightTextbox;
	
	public void enterCalorieDetails(String age,String gender,String weight)  {
		ageTextbox.clear();
		ageTextbox.sendKeys(age);
		
		for(WebElement sex:sexList) {
			if(sex.getAttribute("value").equals(gender)) {
				if(!sex.isSelected())
					sex.click();
					break;
			}
		}	
		weightTextbox.clear();
		weightTextbox.sendKeys(weight);
	}}
	
	
	
	

