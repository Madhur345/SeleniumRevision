package seleniumrevision.org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class DiffwaysofClickingonaButton extends BaseClassFireFox {
	public static void main(String[] args) throws InterruptedException {
		driver.get("https://demo.vtiger.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		String xp ="//button[text()='Sign in']";
		Thread.sleep(2000);
		driver.findElement(By.xpath(xp)).click();
		driver.findElement(By.xpath(xp)).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(xp)).submit();
		driver.close();
	}
}
