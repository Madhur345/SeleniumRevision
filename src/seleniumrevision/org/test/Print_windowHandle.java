package seleniumrevision.org.test;

public class Print_windowHandle extends BaseClassFireFox {

	public static void main(String[] args) {
		driver.get("https://demo.actitime.com/login.do");
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		driver.close();
	}
}
