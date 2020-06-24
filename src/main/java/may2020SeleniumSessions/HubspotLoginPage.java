package may2020SeleniumSessions;

public class HubspotLoginPage {

	public static void main(String[] args) {
		
		String browser = "chrome";
		String url = "https://app.hubspot.com/login";
		
		WebDriverFactory wf = new WebDriverFactory();
		
		wf.launchBrowser(browser);
		wf.launchUrl(url);

	}

}
