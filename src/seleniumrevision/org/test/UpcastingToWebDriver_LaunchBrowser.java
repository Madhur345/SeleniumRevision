package seleniumrevision.org.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UpcastingToWebDriver_LaunchBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", ".\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		String title =driver.getTitle();
		System.out.println("The title of the page is :"+title);
		String currentURL =driver.getCurrentUrl();
		System.out.println("The current url of the page is :"+currentURL);
		String windowHandle=driver.getWindowHandle();
		System.out.println("The window handle of the page is :"+windowHandle);
		String pageSource =driver.getPageSource();
		System.out.println("The page source of the page is :"+pageSource);
		Thread.sleep(2000);
		driver.close();
	}
}



