package seleniumrevision.org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DropdownMenu extends BaseClassChrome{

	public static void main(String[] args) throws InterruptedException  {
		driver.get("http://www.istqb.in/");
		Thread.sleep(2000);
		WebElement foundation =driver.findElement(By.xpath("//*[@id='tmMainMenu']/nav/div/div[3]/ul/li[3]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(foundation).perform();
		Thread.sleep(2000);
		WebElement online=driver.findElement(By.xpath("//*[@id='tmMainMenu']/nav/div/div[3]/ul/li[3]/div/div/div/ul/li[6]/ul/li[2]/ul/li[2]/a"));
		action.moveToElement(online).click().perform();
		Thread.sleep(1000);
		driver.close();
	}
}
