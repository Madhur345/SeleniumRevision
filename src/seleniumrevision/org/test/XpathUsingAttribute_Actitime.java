package seleniumrevision.org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XpathUsingAttribute_Actitime extends BaseClassFireFox{
	public static void main(String[] args) throws InterruptedException {
		driver.get("https://demo.actitime.com/login.do");
		String xp = "//input[@class='textField'][ @id = 'username']";
		Thread.sleep(2000);
		driver.findElement(By.xpath(xp)).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		WebElement clock =driver.findElement(By.xpath("//img[contains(@src,'timer')]"));
		String ClockWidth =clock.getAttribute("width");
		System.out.println("Width of the closck is:" +ClockWidth);
		System.out.println("Height of the clock is:" + clock.getAttribute("height"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='loginButton']//div[contains(text(),'Login')]")).click();
		driver.close();
	}
}