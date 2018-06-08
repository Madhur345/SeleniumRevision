package seleniumrevision.org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class NavigatetoBottomofthePage extends BaseClassFireFox {

	public static void main(String[] args) throws InterruptedException {
		driver.get("https://www.seleniumhq.org/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement fotterLogo=	driver.findElement(By.id("footerLogo"));
		int xloc =fotterLogo.getLocation().getX();
		int yloc =fotterLogo.getLocation().getY();
		js.executeScript("window.scrollTo("+xloc+","+yloc+")");
		Thread.sleep(2000);
		driver.close();
	}
}
