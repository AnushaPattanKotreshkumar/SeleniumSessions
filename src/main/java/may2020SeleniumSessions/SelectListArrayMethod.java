package may2020SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectListArrayMethod {
	static WebDriver driver;

	public static void main(String[] args) {

WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();

driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

By industry = By.id("Form_submitForm_Industry");

//By country = By.id("Form_submitForm_Country");

List<String> countryList = getListOptions(industry);
System.out.println(countryList);

//getListOptions(country);

	}
	public static WebElement getElement(By locator) {
		
		WebElement element = driver.findElement(locator);
		return element;
	}
	
	public static  List<String> getListOptions(By locator) {
		List<String> optionsList = new ArrayList<String>();
		
     Select select = new Select(getElement(locator));
		
		List<WebElement> listValues = select.getOptions();
		System.out.println(listValues.size());
		
		for(int i=0; i<listValues.size(); i++)
		{	
			String list = (listValues.get(i).getText());
			System.out.println(i + "---> " + list);
			//optionsList.add(list);
			}
		return optionsList;
		
		
	}
	

}
