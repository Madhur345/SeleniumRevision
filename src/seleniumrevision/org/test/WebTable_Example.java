package seleniumrevision.org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTable_Example extends BaseClassFireFox{

	public static void main(String[] args) {
		driver.get("file:///C:/Users/VISHAL/Desktop/New%20folder/webtable.html");
		List <WebElement> allRows=driver.findElements(By.xpath("//tr"));
		System.out.println("Total number of rows " +allRows.size());
		List <WebElement> allColumns=driver.findElements(By.xpath("//th"));
		System.out.println("Total number of rows " +allColumns.size());
		List <WebElement> allCells=driver.findElements(By.xpath("//td|//th"));
		System.out.println("Total number of rows "+allCells.size());
		int countNum =0;
		int sum =0;
		for(WebElement cellElement : allCells){
			String text = cellElement.getText();
			try{
				int num=Integer.parseInt(text);
				System.out.println(num);
				countNum++;
				sum =sum+num;
			}catch(Exception e){
			}
		}
		System.out.println("Total count of numeric values is :"+countNum);
		System.out.println("Total sum of all the numeric values is :"+sum);
		driver.close();
	}
}
