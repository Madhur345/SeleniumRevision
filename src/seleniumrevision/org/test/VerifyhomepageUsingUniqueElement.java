package seleniumrevision.org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VerifyhomepageUsingUniqueElement extends BaseClassFireFox  {
	public static void main(String[] args) throws InterruptedException {
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']/div")).click();
		Thread.sleep(4000);
		WebElement logoutBtn=driver.findElement(By.xpath("//a[text()='Logout']"));
		if(logoutBtn.isDisplayed()){
			System.out.println("Page is Displayed");
		}else{
			System.out.println("Page is not displayed");
		}
		driver.close();
	}
}
