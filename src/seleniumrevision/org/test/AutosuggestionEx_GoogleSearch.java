package seleniumrevision.org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutosuggestionEx_GoogleSearch extends BaseClassChrome {

	public static void main(String[] args) throws InterruptedException {
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("selenium");
		Thread.sleep(4000);
		List <WebElement> allSuggestions =driver.findElements(By.xpath("//*[contains(text(),'selenium')]"));
		int count=allSuggestions.size();
		System.out.println("Number of autosuggested results is :" +count);
		String expectedResult ="selenium interview questions";
		for(WebElement element : allSuggestions){
			String actualtext = element.getText();
			System.out.println(actualtext);
			if(actualtext.equalsIgnoreCase(expectedResult)){
				element.click();
				break;
			}
		}
		Thread.sleep(2000);
		driver.close();
	}
}

