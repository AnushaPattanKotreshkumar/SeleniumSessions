package may2020SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpicejetLoginMoveOverAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");
		
		Thread.sleep(4000);
		
		driver.manage().window().maximize();
		
		Actions ac = new Actions(driver);
		
		WebElement loginLink = driver.findElement(By.id("ctl00_HyperLinkLogin"));
		
		ac.moveToElement(loginLink).perform();
		
		Thread.sleep(4000);
		
		WebElement spiceClubMembersLink = driver.findElement(By.xpath("//a[text()='SpiceClub Members']"));
		
		ac.moveToElement(spiceClubMembersLink).perform();
		
		Thread.sleep(4000);
		
		WebElement membersLoginLink = driver.findElement(By.xpath("//ul[contains(@style,'-253px')]/li/a[text()='Member Login']"));
	
		//ac.moveToElement(membersLoginLink).click().perform();
		membersLoginLink.click();

	}

}