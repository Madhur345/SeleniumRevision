package seleniumrevision.org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorsExample extends BaseClassChrome {

	public static void main(String[] args) throws InterruptedException {
		driver.get("file:///C:/Users/VISHAL/Desktop/actimelogin.html");
		WebElement unTB=  driver.findElement(By.id("username"));
		unTB.clear();
		Thread.sleep(2000);
		unTB.sendKeys("tester2@squareplums.com");
		WebElement pwdTB=  driver.findElement(By.id("pass"));
		pwdTB.clear();
		Thread.sleep(2000);
		pwdTB.sendKeys("Password1");
		WebElement link=  driver.findElement(By.linkText("Click ActiTIME Link"));
		link.click();
	}
}
