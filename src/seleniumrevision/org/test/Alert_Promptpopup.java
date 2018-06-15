package seleniumrevision.org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class Alert_Promptpopup extends BaseClassFireFox {

	public static void main(String[] args) throws InterruptedException {
		driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");
		driver.findElement(By.xpath("//input[@value='Say my name!']")).click();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("I Love India");
		Thread.sleep(2000);
		alert.accept();
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.dismiss();
		Thread.sleep(2000);
		//driver.close();
	}
}
