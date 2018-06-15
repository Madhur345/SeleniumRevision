package seleniumrevision.org.test;

import java.util.Set;

public class CloseChildBrowsersOnly extends BaseClassFireFox{

	public static void main(String[] args) {
		driver.get("https://www.naukri.com/");
		String parentWindowHandle = driver.getWindowHandle();
		Set <String> allWindowHandles = driver.getWindowHandles();
		int count = allWindowHandles.size();
		System.out.println("Total number of browser window is : "+count);
		for(String windowHandle:allWindowHandles){
			driver.switchTo().window(windowHandle);
			String title = driver.getTitle();
			if(!windowHandle.equals(parentWindowHandle)){
				driver.close();
				System.out.println("The browser window with tilte " +title+ " is closed");
			}
		}
	}
}
