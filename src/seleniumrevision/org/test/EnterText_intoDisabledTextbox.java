package seleniumrevision.org.test;

import org.openqa.selenium.JavascriptExecutor;

public class EnterText_intoDisabledTextbox extends BaseClassFireFox {

	public static void main(String[] args) throws InterruptedException {
		driver.get("file:///C:/Users/VISHAL/Desktop/New%20folder/Disabledtextbox.html");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("document.getElementById('t1').value='admin'");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('t2').value=''");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('t2').value='manager'");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('t2').type='button'");
	}
}
