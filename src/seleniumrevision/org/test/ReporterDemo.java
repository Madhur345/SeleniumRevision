package seleniumrevision.org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterDemo {

	@Test
	public void testReport() throws InterruptedException{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Reporter.log("Browser is opened");
		driver.manage().window().maximize();
		Reporter.log("Browser is maximized");
		driver.get("https://www.google.com/");
		Reporter.log("Application is opened");
		Thread.sleep(3000);
		driver.close();
		Reporter.log("Application is closed");
	}
}
