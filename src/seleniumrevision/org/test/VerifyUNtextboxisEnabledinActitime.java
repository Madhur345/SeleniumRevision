package seleniumrevision.org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VerifyUNtextboxisEnabledinActitime extends BaseClassFireFox {

	public static void main(String[] args) throws InterruptedException {
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		WebElement unTB=driver.findElement(By.id("username"));
		if(unTB.isEnabled()){
			System.out.println("username text box is enabled");
		}
		else{
			System.out.println("username text box is disabled");
		}
		driver.close();
	}
}
