package seleniumrevision.org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorsExampleNew extends BaseClassFireFox{

	public static void main(String[] args) throws InterruptedException {
		driver.get("file:///C:/Users/VISHAL/Documents/Log%20Files/actimelogin.html");
		WebElement unTB=driver.findElement(By.id("username"));
		unTB.clear();
		Thread.sleep(2000);
		unTB.sendKeys("madhurvishal5@gmail.com");
		WebElement pwdTB=driver.findElement(By.id("pass"));
		pwdTB.clear();
		Thread.sleep(2000);
		pwdTB.sendKeys("Password1");
		WebElement link=driver.findElement(By.linkText("Click ActiTIME Link"));
		link.click();
		driver.close();
	}
}
