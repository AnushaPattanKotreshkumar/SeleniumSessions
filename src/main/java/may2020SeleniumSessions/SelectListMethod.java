package may2020SeleniumSessions;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectListMethod {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By industry = By.xpath("//select[@id='Form_submitForm_Industry']/option");
		
		//WebElement industryList = driver.findElement(industry);
		
		selectValuesFromDropDown(industry, "Travel");
		
		
		}
public static List<WebElement> getElements(By locator) {
		
		List<WebElement> element = driver.findElements(locator);
		return element;
	}
		
		public static void selectValuesFromDropDown(By locator, String value) throws InterruptedException
		{
			List<WebElement> listValues = getElements(locator);
			//listValues.size();
			
			for(int i=0; i<listValues.size(); i++)
			{
				String list = (listValues.get(i).getText());
				System.out.println(list);
				if(list.equals("Travel")) {
//					System.out.println(listValues.get(i).getText());
					Thread.sleep(2000);
					listValues.get(i).click();
					System.out.println("-----------------------------------------");
					System.out.println("After if condition " + list);
				break;
				}
		}
		
	

		}
}
