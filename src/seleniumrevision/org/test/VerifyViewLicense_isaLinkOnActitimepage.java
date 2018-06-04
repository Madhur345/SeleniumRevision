package seleniumrevision.org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VerifyViewLicense_isaLinkOnActitimepage extends BaseClassFireFox {
	public static void main(String[] args) throws InterruptedException {
		driver.get("https://demo.actitime.com/login.do");
		WebElement link=driver.findElement(By.xpath("//a[contains(text(),'actiTIME Inc.')]"));
		Thread.sleep(2000);
		String actiLink = link.getTagName();
		if(actiLink.equals("a"))	{
			System.out.println("License is a link");
		}
		else{
			System.out.println("License is a link");
		}
		driver.close();
	}
}
