package seleniumrevision.org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class RemoveValuefromText_withoutusingClearMethod extends BaseClassFireFox {

	public static void main(String[] args) throws InterruptedException {
		driver.get("https://demo.actitime.com/login.do");
		WebElement unTB=driver.findElement(By.id("username"));
		unTB.sendKeys("ajit kumar");
		String value =unTB.getAttribute("value");
		System.out.println(value);
		Thread.sleep(3000);
		//unTB.sendKeys(Keys.CONTROL + "a" + Keys.DELETE);
		unTB.sendKeys(Keys.CONTROL + "a");
		unTB.sendKeys(Keys.DELETE);
	}
}

