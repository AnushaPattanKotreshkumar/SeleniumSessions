package may2020SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverFactory {
	
	public WebDriver driver;
	
	/**
	 * This method is used to launch the browser on the basis on given browser name
	 * @param browser
	 * @return
	 */
	
	public WebDriver launchBrowser(String browser) {
		
		System.out.println(" browser value is " + browser);
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("safari")) {
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver = new SafariDriver();
		}
		else {
			System.out.println("Please pass the correct browser " + browser);
		}
		return driver;
	}

	public void launchUrl(String url) {
		driver.get(url);
	}
	
	public String getPageTitle() {
		return driver.getTitle();		 
	}
	
	public String getPageCurrentUrl() {
		return driver.getCurrentUrl();
	}
}
