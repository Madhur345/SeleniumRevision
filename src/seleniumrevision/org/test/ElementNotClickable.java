package seleniumrevision.org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class ElementNotClickable extends BaseClassChrome {
	public static void main(String[] args) throws InterruptedException {
		
		driver.get("http://www.seleniumhq.org/download/");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[text()='Java']/..//a[text()='Download']")).click();
		
	}
}

