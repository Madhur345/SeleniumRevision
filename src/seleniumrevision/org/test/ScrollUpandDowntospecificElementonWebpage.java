package seleniumrevision.org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class ScrollUpandDowntospecificElementonWebpage extends BaseClassFireFox  {
	public static void main(String[] args) throws InterruptedException {
		
	driver.get("https://www.seleniumhq.org/");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	driver.findElement(By.id("close")).click();
	WebElement fotterLogo=	driver.findElement(By.xpath("//img[contains(@src,'applitools')]"));
	int xloc =fotterLogo.getLocation().getX();
	int yloc =fotterLogo.getLocation().getY();
	js.executeScript("window.scrollTo("+xloc+","+yloc+")");
	Thread.sleep(4000);
	driver.close();

}
}
