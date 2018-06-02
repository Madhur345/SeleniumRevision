package seleniumrevision.org.test;

public class BrowserNavigationExample extends BaseClassFireFox {
	public static void main(String[] args) throws InterruptedException {
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		driver.navigate().to("https://google.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.close();
	}
}
