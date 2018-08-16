package seleniumrevision.org.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LauncFirefoxAndChromeTogether {
	public static WebDriver driver;
	static{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
		@Test
		@Parameters({"browser"})
		public void loginBrowser(String browser) throws IOException, InterruptedException{
			if(browser.equals("firefox")){
				driver = new FirefoxDriver();
			}
			else{
				driver = new ChromeDriver();
		}
			FileInputStream fis = new FileInputStream("./config.properties");
			Properties prop = new Properties();
			prop.load(fis);
			String url =prop.getProperty("URL");
			String username =prop.getProperty("username");
			String password =prop.getProperty("password");
			driver.get(url);
			driver.findElement(By.id("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.xpath("//div[contains(text(),'Login')][1]")).click();
			Thread.sleep(4000);
			driver.close();
		}
}
