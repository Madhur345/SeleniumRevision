package seleniumrevision.org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextClickusingActionsClass extends BaseClassChrome {
	public static void main(String[] args) throws AWTException, InterruptedException {
		driver.get("https://demo.actitime.com/login.do");
		WebElement link =	driver.findElement(By.linkText("actiTIME Inc."));
		Actions actions = new Actions(driver);
		actions.contextClick(link).perform();
		Thread.sleep(3000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
		Thread.sleep(3000);
		driver.quit();
	}
}
