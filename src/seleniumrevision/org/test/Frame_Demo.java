package seleniumrevision.org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Frame_Demo extends BaseClassFireFox {

	public static void main(String[] args) throws InterruptedException {
		driver.get("file:///C:/Users/VISHAL/Desktop/New%20folder/Page4.html");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t1")).sendKeys("vishal");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("madhur");
		driver.switchTo().frame(0);
		driver.findElement(By.id("t1")).clear();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).clear();
		driver.switchTo().frame("f1");
		Thread.sleep(2000);
		driver.findElement(By.id("t1")).sendKeys("Priya");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("Kumari");
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t1")).clear();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).clear();
		driver.switchTo().frame("n1");
		Thread.sleep(2000);
		driver.findElement(By.id("t1")).sendKeys("Priyanka");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("Sharma");
		driver.switchTo().frame("n1");
		driver.findElement(By.id("t1")).clear();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).clear();
		WebElement f =driver.findElement(By.className("c1"));
		driver.switchTo().frame(f);
		Thread.sleep(2000);
		driver.findElement(By.id("t1")).sendKeys("Aditi");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("Chandan");
		driver.close();
	}
}
