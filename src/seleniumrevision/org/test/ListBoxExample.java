package seleniumrevision.org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ListBoxExample extends BaseClassFireFox {

	public static void main(String[] args) throws InterruptedException {
		driver.get("file:///C:/Users/VISHAL/Desktop/New%20folder/select.html");
		WebElement list=driver.findElement(By.id("mtr"));
		Select s = new Select(list);
		List <WebElement> options= s.getOptions();
		int size1 = options.size();
		System.out.println("Toatl no of options is : "+size1);
		System.out.println("All Options are :");
		for(WebElement element : options){
			String text = element.getText();
			System.out.println(text);
		}
		s.selectByIndex(0);
		s.selectByValue("v");
		s.selectByVisibleText("Poori");
		List <WebElement> allSelectedOptions= s.getAllSelectedOptions();
		int size2 = allSelectedOptions.size();
		System.out.println("No of selected options are : "+size2);
		System.out.println("All selected Options are :");
		for (WebElement element1 : allSelectedOptions){
			String text1 = element1.getText();
			System.out.println(text1);
		}
		s.deselectByIndex(0);
		s.deselectByValue("v");
		s.deselectByVisibleText("Poori");
		Thread.sleep(3000);
		driver.close();
	}
}