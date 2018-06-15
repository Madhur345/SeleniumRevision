package seleniumrevision.org.test;

import java.util.Set;

public class ChildBrowserPopUp extends BaseClassFireFox{

	public static void main(String[] args) throws InterruptedException {
		driver.get("https://www.naukri.com/");
		Set <String> allWindowHandles = driver.getWindowHandles();
		int count = allWindowHandles.size();
		System.out.println("Total number of browser window is :"+count);
		for(String windowHandle:allWindowHandles){
			driver.switchTo().window(windowHandle);
			String title = driver.getTitle();
			System.out.println("Window handle id of the page "+title+":" +windowHandle);
			Thread.sleep(2000);
			driver.close();
		}
	}

}
