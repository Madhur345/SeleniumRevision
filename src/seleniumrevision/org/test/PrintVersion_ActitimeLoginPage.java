package seleniumrevision.org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PrintVersion_ActitimeLoginPage extends BaseClassFireFox {

	public static void main(String[] args) throws InterruptedException {
		driver.get("https://demo.actitime.com/login.do");
		WebElement version=	driver.findElement(By.xpath("//nobr[contains(text(),'actiTIME')]"));
		Thread.sleep(2000);
		String actiVersion =version.getText();
		System.out.println("version of actiTIME :" + actiVersion);
		driver.close();
	}
}
