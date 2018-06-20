package seleniumrevision.org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClassChrome {
	public static ChromeOptions options;
	static{
		 options = new ChromeOptions();
		 options.addArguments("window-size=1366,768");
		 options.addArguments("--disable-notifications");
		 options.addArguments("--disable-geolocation");
		 options.addArguments("--ignore-certificate-errors");
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	 }
	static WebDriver driver = new ChromeDriver(options);
}
 