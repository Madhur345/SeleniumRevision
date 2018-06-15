package seleniumrevision.org.test;

import java.util.Set;

public class CloseAnySpecificBrowser extends BaseClassFireFox {

	public static void main(String[] args) {
		driver.get("https://www.naukri.com/");
		String expectedTitle ="RBS";
		Set <String> allWindowHandles = driver.getWindowHandles();
		int count = allWindowHandles.size();
		System.out.println("Total number of browser window is :"+count);
		for(String windowHandle:allWindowHandles){
			driver.switchTo().window(windowHandle);
			String actualTitle = driver.getTitle();
			if(actualTitle.contains(expectedTitle)){
				driver.close();
				System.out.println("The browser window with tilte " +actualTitle+ " is closed");
			}
		}
	}

}
