package seleniumrevision.org.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoConstant {
	public WebDriver driver;
	static ChromeOptions options;
	static FirefoxOptions option;

	static{
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		options = new ChromeOptions();
		options.addArguments("window-size=1366,768");
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-geolocation");
		options.addArguments("--ignore-certificate-errors");
		System.setProperty("webdriver.gecko.driver",".\\driver\\geckodriver.exe");
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("geo.enabled", false);
		option.setProfile(profile);
	}

	@BeforeMethod
	public  void openApplication(){
		driver = new FirefoxDriver(option);
		driver = new ChromeDriver(options);
		String url = Lib.getPropertyValue("URL");
		driver.get(url);
		String ITO =Lib.getPropertyValue("ImplicitWait");
		Long timeout =Long.parseLong(ITO);
		driver.manage().timeouts().implicitlyWait(timeout,TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeApplication(ITestResult result){
		if(ITestResult.FAILURE==result.getStatus()){
			Lib.captureScreenshot(driver,result.getName());
		}
		driver.close();
	}

}
