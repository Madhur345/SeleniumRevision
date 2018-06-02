package seleniumrevision.org.test;

import org.openqa.selenium.By;

public class DynamicChanginElementExample extends BaseClassFireFox {

	public static void main(String[] args) throws InterruptedException {
		driver.get("https://www.seleniumhq.org/download/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//td[.='Java']/../..//a[.='Download']")).click();
		driver.close();
	}
}
