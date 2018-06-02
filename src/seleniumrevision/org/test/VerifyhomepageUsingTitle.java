package seleniumrevision.org.test;

import org.openqa.selenium.By;

public class VerifyhomepageUsingTitle extends BaseClassFireFox {
	public static void main(String[] args) throws InterruptedException {
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']/div")).click();
		Thread.sleep(4000);
		String expectedTitle ="actiTIME - Enter Time-Track";
		String actualTitle =driver.getTitle();
		System.out.println(actualTitle);
		if(actualTitle.equals(expectedTitle)){
			System.out.println("Page is Displayed");
		}else{
			System.out.println("Page is not displayed");
		}
		driver.close();
	}
}


