package seleniumrevision.org.test;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ChecklisthasDUPLICATEvalues extends BaseClassFireFox{

	public static void main(String[] args) {
		driver.get("file:///C:/Users/VISHAL/Desktop/New%20folder/select.html");
		WebElement xp=	driver.findElement(By.id("mtr"));
		Select s = new Select(xp);
		HashSet<String> list =new HashSet<String>();
		List<WebElement> allOptions=s.getOptions();
		int count1 = allOptions.size();
		System.out.println(count1);
		for (WebElement element : allOptions){
			String text = element.getText();
			System.out.println(text);
			list.add(text);
		}
		int count2 = list.size();
		if(count1==count2){
			System.out.println("List has unique value");
		}
		else{
			System.out.println("List has duplicate value");
		}
			System.out.println(list);
			driver.close();
		}
	}
