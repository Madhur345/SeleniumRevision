package seleniumrevision.org.test;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PrintUniqueElementinthelistbox extends BaseClassFireFox {

	public static void main(String[] args) {
		driver.get("file:///C:/Users/VISHAL/Desktop/New%20folder/select.html");
		WebElement xp=	driver.findElement(By.id("mtr"));
		Select s = new Select(xp);
		HashSet<String> list =new HashSet<String>();
		List<WebElement> allOptions=s.getOptions();
		int count = allOptions.size();
		System.out.println(count);
		for (WebElement element : allOptions){
			String text = element.getText();
			System.out.println(text);
			list.add(text);
		}
		System.out.println("Print only unique values");
		System.out.println(list);
		driver.close();
	}
}
