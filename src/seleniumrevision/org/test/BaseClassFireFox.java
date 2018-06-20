package seleniumrevision.org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class BaseClassFireFox {
	public static WebDriver driver;
	static{
		System.setProperty("webdriver.gecko.driver",".\\driver\\geckodriver.exe");
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("geo.enabled", false);
		FirefoxOptions option = new FirefoxOptions();
		option.setProfile(profile);
		driver = new FirefoxDriver(option);
		driver.manage().window().maximize();

	}
}