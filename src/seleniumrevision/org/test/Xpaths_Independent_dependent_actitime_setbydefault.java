package seleniumrevision.org.test;

import org.openqa.selenium.By;

public class Xpaths_Independent_dependent_actitime_setbydefault extends BaseClassFireFox {

	public static void main(String[] args) throws InterruptedException {
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']/div")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("(//div[@class='popup_menu_label'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='testing']/../..//a[text()='set by default']")).click();
		Thread.sleep(2000);
		driver.close();
	}
}