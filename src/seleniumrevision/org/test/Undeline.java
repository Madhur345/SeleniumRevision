package seleniumrevision.org.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class Undeline extends BaseClassFireFox {
	public static void main (String [] args) {


		driver.manage ().timeouts ().implicitlyWait (10, TimeUnit.SECONDS);

		driver.get ("https://www.google.co.in/?gfe_rd=ctrl&ei=bXAwU8jYN4W6iAf8zIDgDA&gws_rd=cr");
		driver.get("https://www.wikipedia.org/");

		String cssValue= driver.findElement (By.xpath ("//a[text()='हिन्दी']")).getCssValue("text-decoration");
		System.out.println(cssValue);

		System.out.println ("value  "+cssValue);

		Actions act = new Actions(driver);

		act.moveToElement (driver.findElement (By.xpath ("//a[text()='हिन्दी']"))).perform();

		String cssValue1= driver.findElement (By.xpath ("//a[text()='हिन्दी']")).getCssValue("text-decoration");

		System.out.println ("value over  "+cssValue1);

		driver.close ();

	}

}
