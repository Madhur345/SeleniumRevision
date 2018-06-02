package seleniumrevision.org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PrintTooltip_Actitime_RememberCheckbox extends BaseClassFireFox{

	public static void main(String[] args) throws InterruptedException {
		driver.get("https://demo.actitime.com/login.do");
		WebElement checkbox=driver.findElement(By.id("keepLoggedInCheckBox"));
		Thread.sleep(2000);
		String tooltip =checkbox.getAttribute("tittle");
		System.out.println(tooltip);
		driver.close();
	}
}
