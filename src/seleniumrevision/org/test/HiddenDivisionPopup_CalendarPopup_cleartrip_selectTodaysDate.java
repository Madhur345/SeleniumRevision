package seleniumrevision.org.test;

import java.util.Date;

import org.openqa.selenium.By;

public class HiddenDivisionPopup_CalendarPopup_cleartrip_selectTodaysDate extends BaseClassFireFox {
	public static void main(String[] args) throws InterruptedException {
		Date d = new Date();
		String str = d.toString();
		String[] str2 = str.split(" ");
		String today = str2[2];
		System.out.println(str);
		System.out.println(today);
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("DepartDate")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText(today)).click();
		Thread.sleep(2000);
		driver.close();
	}
}
