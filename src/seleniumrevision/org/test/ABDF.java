package seleniumrevision.org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ABDF extends BaseClassFireFox {
	public static void main(String[] args) throws InterruptedException {
		driver.get("http://localhost:8080/login.do");
		//findElements() method returns list of web element
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		//get the total number of link elements
		int totalLinks = allLinks.size();
		System.out.println("total number of links present on the web page is : "+totalLinks);
		int visibleLinkCount = 0;
		int hiddenLinkCount = 0;
		//using foreach loop, iterate through all the links
		for (WebElement link : allLinks) {
			//if the link is displayed, then print the text of the link
			if (link.isDisplayed()) {
				visibleLinkCount++;
				System.out.println(visibleLinkCount+" --> "+link.getText());
			}else{
				hiddenLinkCount++;
			}
		}
		System.out.println("Total number of visible links :" + visibleLinkCount);
		System.out.println("Total number of hidden links :" + hiddenLinkCount);
		driver.close();
}}
