package seleniumrevision.org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class findElements_Example extends BaseClassFireFox {
	public static void main(String[] args) {
		driver.get("https://demo.actitime.com/login.do");
		List <WebElement> allLinks =driver.findElements(By.tagName("a"));
		int count = allLinks.size();
		System.out.println("Number of all links is: "+ count);
		int visibleLinks =0;
		int hiddenLinks =0;
		for (WebElement link : allLinks){
			if(link.isDisplayed()){
				visibleLinks++;
				System.out.println("Visible link is: "+ link.getText());
			}else
			{
				hiddenLinks++;
			}
		}
		System.out.println("Total number of visible links: " + visibleLinks);
		System.out.println("Total number of hidden links: " + hiddenLinks);
		driver.close();
	}
}
