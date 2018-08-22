package seleniumrevision.org.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsAndWaits extends BaseClassFireFox {
	@Test
	public void testLogin(){
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[contains(text(),'Login')][1]")).click();
		String actaulTitle =driver.getTitle();
		String expectedTitle ="actiTIME - Login";
		try{
			WebDriverWait wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.titleIs(expectedTitle));
		}catch(Exception e){
		}
		SoftAssert s = new SoftAssert();
		s.assertEquals(actaulTitle, expectedTitle);
		driver.close();
		s.assertAll();
	}
}
