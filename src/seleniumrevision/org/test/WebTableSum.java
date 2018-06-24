package seleniumrevision.org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTableSum extends BaseClassFireFox{

	public static void main(String[] args) {
		driver.get("file:///C:/Users/VISHAL/Desktop/New%20folder/webtablesum.html");
		WebElement xp=driver.findElement(By.xpath("//td[text()='Total']/../td[3]"));
		String expectedTotal = xp.getText();
		System.out.println("Expected sum of marks is :"+expectedTotal);
		List <WebElement> allMarks =driver.findElements(By.xpath("(//td[3])[position()!=last()]"));
		int actualTotal =0;
		for(WebElement element : allMarks){
			String marks =element.getText();
			int actualMarks =Integer.parseInt(marks);
			actualTotal = actualTotal+actualMarks;
		}
			if(Integer.parseInt(expectedTotal)==actualTotal){
				System.out.println("sum of marks is displayed correctly");
			}else{
				System.out.println("sum of marks is displayed wrongly");
			}
			driver.close();
		}
	}
