package seleniumrevision.org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClassFireFox {
	public static WebDriver driver;
	static{
		System.setProperty("webdriver.gecko.driver",".\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();

	}
}