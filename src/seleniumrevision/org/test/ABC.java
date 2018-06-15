package seleniumrevision.org.test;

import java.util.Set;

import org.openqa.selenium.By;

public class ABC extends BaseClassFireFox {
	public static void main(String[] args) {
		//enter actitime login url
		driver.get("https://demo.actitime.com/login.do");
		//get the window handle id of the parent browser window
		String parentwindowHandle = driver.getWindowHandle();
		//enter username		
		driver.findElement(By.id("username")).sendKeys("admin");
		//enter password
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//click on actiTIME INC link
		driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
		//get the number of windows currently opened on the system 
		Set<String> allwhs = driver.getWindowHandles();
		//switch to all the browser windows
		for (String wh : allwhs) {
			driver.switchTo().window(wh);
		}
		//get the title of the tab
		String childtitle = driver.getTitle();
		System.out.println("Title of the child tab is :"+ childtitle);
		//close the child tab
		driver.close();
		//switch back to the main browser window
		driver.switchTo().window(parentwindowHandle);
		//close the main browser window
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		//closing the parent window
		driver.close();
	}
}
