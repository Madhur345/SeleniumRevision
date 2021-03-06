package seleniumrevision.org.test;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HashMapExample_printTheOcuuranceOfPoori extends BaseClassFireFox {
	public static void main(String[] args) {
		driver.get("file:///C:/Users/VISHAL/Desktop/New%20folder/select.html");
		WebElement list=	driver.findElement(By.id("mtr"));
		Select s = new Select(list);
		List<WebElement> options =s.getOptions();
		HashMap<String,Integer> hashmapObj = new HashMap<String,Integer>();
		for(WebElement elemets : options){
			String text = elemets.getText();
			if(hashmapObj.containsKey(text)){
				Integer value = hashmapObj.get(text);
				value++;
				hashmapObj.put(text, value);
			}
			else{
				hashmapObj.put(text,1);
			}
		}
		Set <String> allKeys=	hashmapObj.keySet();
		for(String key: allKeys){
			Integer value = hashmapObj.get(key);
			System.out.println(key + ">>>>>>" +value);
			if(value>1){
				System.out.println("occarance of "+key+ "is : "+value);
			}
		}
		driver.close();
	}
}
