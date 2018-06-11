package seleniumrevision.org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseHover extends BaseClassChrome {

	public static void main(String[] args) throws InterruptedException  {
		driver.get("https://www.actimind.com/");
		Thread.sleep(3000);
		WebElement area=driver.findElement(By.xpath("/html/body/header/div/div/div/nav/ul/li[2]/a"));
		Actions actions = new Actions(driver);
		actions.moveToElement(area).perform();
		Thread.sleep(3000);
		WebElement clouds=driver.findElement(By.xpath("/html/body/header/div/div/div/nav/ul/li[2]/ul/li/ul/li[2]/a"));
		actions.moveToElement(clouds).click().perform();
		Thread.sleep(2000);
		driver.close();
	}
}
