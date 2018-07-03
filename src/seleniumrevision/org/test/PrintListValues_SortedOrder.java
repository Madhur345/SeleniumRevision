package seleniumrevision.org.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PrintListValues_SortedOrder extends BaseClassFireFox{

	public static void main(String[] args) {
		driver.get("file:///C:/Users/VISHAL/Desktop/New%20folder/select.html");
		ArrayList<String> list = new ArrayList<String>();
		WebElement lst=driver.findElement(By.id("mtr"));
		Select s = new Select(lst);
		List <WebElement> options =s.getOptions();
		System.out.println(options.size());
		for (WebElement element :options){
			String text = element.getText();
			System.out.println(text);
			list.add(text);
		}
		Collections.sort(list);
		System.out.println("Print list in sorted order");
		System.out.println(list.size());
		for(String text :list){
			System.out.println(text);
		}
		driver.close();
	}

}
