package seleniumrevision.org.test;

import org.openqa.selenium.By;

public class VerifyhomepageUsingUrl extends BaseClassFireFox{
	public static void main(String[] args) throws InterruptedException {
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']/div")).click();
		Thread.sleep(4000);
		String expectedURL ="submit";
		String actualURL =driver.getCurrentUrl();
		System.out.println(actualURL);
		if(actualURL.contains(expectedURL)){
			System.out.println("Page is Displayed");
		}else{
			System.out.println("Page is not displayed");
		}
		driver.close();
	}
}
