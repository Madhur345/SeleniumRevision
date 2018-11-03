package seleniumrevision.org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverBackedSelenium;

import com.thoughtworks.selenium.Selenium;


public class SeleniumRC extends BaseClassFireFox {
	public static void main(String[] args) throws InterruptedException {
		String baseUrl = "https://www.google.co.in/";
		 Selenium selenium = new WebDriverBackedSelenium(driver, baseUrl);
		selenium.open("/");
		selenium.waitForPageToLoad("30000");
		driver.findElement(By.id("lst-ib")).sendKeys("Webdriver");
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(5000);
		selenium.stop();
	}
}
