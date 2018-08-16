package seleniumrevision.org.test;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGReporterActitime extends BaseClassFireFox{
	@Test
	public void actiTimeLoghin() throws InterruptedException{
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		Reporter.log("Username Text Box is visible",true);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Reporter.log("Password Text Box is also found",true);
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Login')][1]")).click();
		Reporter.log("Login is successfull",true);
		Thread.sleep(3000);
		driver.close();
	}                               
}