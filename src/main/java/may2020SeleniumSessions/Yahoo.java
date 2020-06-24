package may2020SeleniumSessions;

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

public class Yahoo {
	
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

@Test(priority=1)
public void printLinks() throws InterruptedException {
	
	
	By MailUrl = By.xpath("//*[@class= 'C(#4d00ae) Fz(14px) Fw(b) Lh(2.1) Td(n) Td(u):f Td(u):h Pos(r)']");
	
	By urls = By.xpath("//*[@class = 'C(#4d00ae) Fz(14px) Fw(b) Lh(2.1) Td(n) Td(u):f Td(u):h']");
	
	List<WebElement> links = driver.findElements(urls); 
	
	Thread.sleep(4000);
	
    links.add(driver.findElement(MailUrl));
    
	for(WebElement ele: links) {
	String url = ele.getAttribute("href"); 
	System.out.println(url);
	   
	  }
     }

@AfterTest
public void teardown() {
	driver.quit();
}

}
