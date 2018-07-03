package seleniumrevision.org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActiTimeSelectBox extends BaseClassFireFox {

	public static void main(String[] args) throws InterruptedException {
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("(//div[contains(text(),'Login')])[1]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[contains(text(),'TASKS')]")).click();
		List <WebElement> allCheckBoxs =driver.findElements(By.xpath("//div[contains(@class,'checkbox')]"));
		int count = allCheckBoxs.size();
		System.out.println("Total Number of checkbox is : "+count);
		for (WebElement element : allCheckBoxs){
			element.click();
			break;
		}
		Thread.sleep(5000);
		List <WebElement> allCheckBoxsIActive =driver.findElements(By.xpath("//div[contains(@class,'checkbox active')]"));
		for (WebElement active : allCheckBoxsIActive){
			active.click();
			break;
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[contains(@class,'checkbox')])[2]")).click();
		Thread.sleep(5000);
		driver.close();
	}
}
