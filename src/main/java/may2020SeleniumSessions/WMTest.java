package may2020SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WMTest {

	public static void main(String[] args) throws InterruptedException {
//		
		//Chrome driver
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        	
//        //firefox driver
//        WebDriverManager.firefoxdriver().setup();
//        WebDriver driver = new FirefoxDriver();
        
        //Safari in MAC
        //WebDriverManager.getInstance(SafariDriver.class).setup();
        //webDriver driver = new SafariDriver();
        
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(3000);
		
		String actualTitle = driver.getTitle();
		System.out.println("Actual title is " + actualTitle);
	}
	

}
