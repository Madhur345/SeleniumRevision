package seleniumrevision.org.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumGridDemo {

	@Test
	@Parameters({"node","browser"})
	public void launchFirefoxAndChrome(String node,String browser) throws MalformedURLException, InterruptedException{
		URL whichSystem = new URL(node);
		DesiredCapabilities whichBrowser = new DesiredCapabilities();
		whichBrowser.setBrowserName(browser);
		WebDriver driver = new RemoteWebDriver(whichSystem, whichBrowser);
		driver.get("http://demo.actitime.com/");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement un=	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
		for(int i =0;i<10;i++){
			un.sendKeys("admin"+i);
			Thread.sleep(2000);
			un.clear();
		}
		driver.quit();
	}
}
