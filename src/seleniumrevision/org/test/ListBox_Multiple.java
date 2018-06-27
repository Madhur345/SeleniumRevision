package seleniumrevision.org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ListBox_Multiple extends BaseClassFireFox {

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
		s.selectByValue("d");
		List <WebElement> allSelectedOptions= s.getAllSelectedOptions();
		int size2 = allSelectedOptions.size();
		System.out.println("No of selected options are : "+size2);
		System.out.println("All selected Options are :");
		for (WebElement element1 : allSelectedOptions){
			String text1 = element1.getText();
			System.out.println(text1);
		}
		boolean multiple = s.isMultiple();
		System.out.println(multiple +" yes list box is multiple");
		if (multiple){
			WebElement firstSelectedOption =  s.getFirstSelectedOption();
			System.out.println("First selected option is : " +firstSelectedOption.getText());
			s.deselectByIndex(0);
			WebElement firstSelectedOption1 =  s.getFirstSelectedOption();
			System.out.println("First selected option is : " +firstSelectedOption1.getText());
			s.deselectByValue("v");
			WebElement firstSelectedOption2 =  s.getFirstSelectedOption();
			System.out.println("First selected option is : " +firstSelectedOption2.getText());
			s.deselectByVisibleText("DOSA");
			WebElement firstSelectedOption3 =  s.getFirstSelectedOption();
			System.out.println("First selected option is : " +firstSelectedOption3.getText());
			s.deselectAll();
		}
		Thread.sleep(3000);
		driver.close();
	}
}

