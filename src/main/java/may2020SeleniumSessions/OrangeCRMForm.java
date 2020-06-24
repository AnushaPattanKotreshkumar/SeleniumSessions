package may2020SeleniumSessions;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class OrangeCRMForm {

		public static void main(String[] args) throws InterruptedException {

			String browser = "chrome";
			WebDriverFactory wf = new WebDriverFactory();
			
			
			WebDriver driver = wf.launchBrowser(browser);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			wf.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");
			System.out.println(wf.getPageTitle());
			
			By firstName = By.id("Form_submitForm_FirstName");
			By lastName = By.id("Form_submitForm_LastName");
			By countryName = By.xpath("//select[@id='Form_submitForm_Country']");
			By email = By.xpath("//input[@id='Form_submitForm_Email']");
			By jobTitle = By.xpath("//input[@id='Form_submitForm_JobTitle']");
			By companyName = By.xpath("//input[@id='Form_submitForm_CompanyName']");
			By numEmps = By.xpath("//select[@id='Form_submitForm_NoOfEmployees']");
			By phNum = By.xpath("//input[@id='Form_submitForm_Contact']");
			By industry = By.xpath("//select[@id='Form_submitForm_Industry']");
			By state = By.xpath("//select[@id='Form_submitForm_State']");
	
			
			ElementUtil elementUtil = new ElementUtil(driver);
			elementUtil.doSendKeys(firstName, "Anusha");
			elementUtil.doSendKeys(lastName, "Pattan");
		
			elementUtil.doSendKeys(email, "anushapattan7@gmail.com");
			elementUtil.doSendKeys(jobTitle, "QA Engineer");
			elementUtil.doSendKeys(companyName, "TD Bank");
			elementUtil.doSelectValuesByVisibleText(numEmps, "5,501 - 6,000");
			elementUtil.doSendKeys(phNum, "99999999999");
			elementUtil.doSelectValuesByVisibleText(industry, "Finance/ Banking / Insurance / Real Estate / Legal");	
			elementUtil.doSelectValuesByVisibleText(countryName, "United States");
			
			Thread.sleep(4000);
			
			elementUtil.doSelectValuesByVisibleText(state, "New Hampshire");
			
		}

	}