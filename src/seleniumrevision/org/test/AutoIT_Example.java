package seleniumrevision.org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class AutoIT_Example extends BaseClassFireFox{
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		Runtime run = Runtime.getRuntime();
		run.exec("C:/Users/VISHAL/Desktop/Others/cancel.exe");
		//driver.close();
	}
}
