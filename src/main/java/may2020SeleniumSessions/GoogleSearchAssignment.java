package may2020SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * Assignment 1 - Create a generic method to select a single value from Google search suggestion
		 * Assignment 2 - Capture all search suggestions in a list and return
		 * Assignment 3 - http://automationpractice.com/index.php
		 */
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		By serachFieldLocator = By.name("q");
		By serachResultLocator = By.xpath("//ul[@class='erkvQe']/li//span");
		
		//Assignment - 1
		searchBoxResultClick(driver,serachFieldLocator,serachResultLocator,"Selenium","selenium testing");
				
		Thread.sleep(4000);
				
		driver.navigate().back();
				
		Thread.sleep(4000);
				
		//Assignment - 2
		List<WebElement> searchSuggestions =  returnSearchBoxResult(driver,serachFieldLocator,serachResultLocator,"Selenium");
				
		for(WebElement ele: searchSuggestions) {
			System.out.println(ele.getText());
		}
				
		driver.get("http://automationpractice.com/index.php");
				
		serachFieldLocator = By.name("search_query");
				
		serachResultLocator = By.xpath("//div[@class='ac_results']/ul//li");
				
		searchBoxResultClick(driver,serachFieldLocator,serachResultLocator,"dresses","T-shirts > Faded Short Sleeve T-shirts");
		
		
		
	}
	
	public static void searchBoxResultClick(WebDriver driver, By searchFieldLocator, By serachResultLocator, String search, String searchSelect ) throws InterruptedException {
		
		driver.findElement(searchFieldLocator).sendKeys(search);

		Thread.sleep(4000);
		
		List<WebElement> list = driver.findElements(serachResultLocator);

		Thread.sleep(4000);
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getText().equalsIgnoreCase(searchSelect)) {
				list.get(i).click();
				break;
			}
		}
	}
	
	public static List<WebElement> returnSearchBoxResult(WebDriver driver, By searchFieldLocator, By searchResultlocator, String search) throws InterruptedException {
		
		driver.findElement(searchFieldLocator).sendKeys(search);

		Thread.sleep(4000);
		
		return driver.findElements(searchResultlocator);

	}

}

