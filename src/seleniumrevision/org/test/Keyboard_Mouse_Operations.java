package seleniumrevision.org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Keyboard_Mouse_Operations extends BaseClassFireFox{

	public static void main(String[] args) throws InterruptedException, AWTException {
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(4000);
		Robot r = new Robot();
		r.mouseMove(300,500);
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_F);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_F);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
}
