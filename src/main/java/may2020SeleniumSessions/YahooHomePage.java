package may2020SeleniumSessions;

import java.net.StandardSocketOptions;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class YahooHomePage {
	
static WebDriver driver; 
	
@BeforeTest
public void setup() throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
	
	driver.get("https://www.yahoo.com/?.tsrc=fauxdal");
	Thread.sleep(5000);	
}

@Test
public void printLinks() {
	
	List<WebElement> links = driver.findElements(By.cssSelector("#header-nav-bar li a")); 
	
	for(int i=0; i<links.size(); i++) {
		System.out.println(links.get(i).getAttribute("href"));
	   
	  }
     }

@AfterTest
public void teardown() {
	driver.quit();
}

}