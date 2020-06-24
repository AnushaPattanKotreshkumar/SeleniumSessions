package may2020SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String browser = "chrome";
				WebDriverFactory wf = new WebDriverFactory();
		WebDriver driver = wf.launchBrowser(browser);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		wf.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");
		System.out.println(wf.getPageTitle());
		
		By industry = By.id("Form_submitForm_Industry");
		
		WebElement industryValue = driver.findElement(industry);
		
		Select select = new Select(industryValue);
		
		select.selectByIndex(2); // select 
		 select.selectByValue("Education");
		 select.selectByVisibleText("Government - Local");
		
	}

}
