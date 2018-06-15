package seleniumrevision.org.test;

import java.util.Set;

import org.openqa.selenium.By;

public class HandleTabs_using_getWindowHandles extends BaseClassFireFox {

	public static void main(String[] args) throws InterruptedException {
		driver.get("https://demo.actitime.com/login.do");
		String parentWindowHandle = driver.getWindowHandle();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Thread.sleep(6000);
		Set <String> alLWindowHandles = driver.getWindowHandles();
		int count = alLWindowHandles.size();
		System.out.println("Number of browser window opened is " +count);
		for(String windowHandle : alLWindowHandles){
			driver.switchTo().window(windowHandle);
		}
		String childTitle = driver.getTitle();
		System.out.println("The tiltle of the child browser is : " + childTitle);
		driver.findElement(By.xpath("//a[text()='Help Center']")).click();
		Thread.sleep(2000);
		driver.switchTo().window(parentWindowHandle);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}

