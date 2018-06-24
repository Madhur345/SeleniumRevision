package seleniumrevision.org.test;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FileDownloadInChromeBrowser extends BaseClassChrome {
	public static void main(String[] args) throws InterruptedException {
		HashMap<String, Object> chromePrefs = new HashMap<String,Object>();
		chromePrefs.put("profile.default_content_settins.popups", 0);
		chromePrefs.put("download.default_directory", "D:\\SeleniumNotes");
		options.setExperimentalOption("prefs",chromePrefs);
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		@SuppressWarnings("deprecation")
		WebDriver driver = new ChromeDriver(cap);
		driver.get("http://www.seleniumhq.org/download/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[text()='Java']/..//a[text()='Download']")).click();
		Thread.sleep(10000);
		driver.close();
	}
}
