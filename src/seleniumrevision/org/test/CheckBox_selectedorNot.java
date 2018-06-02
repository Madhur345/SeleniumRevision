package seleniumrevision.org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBox_selectedorNot extends BaseClassFireFox {

	public static void main(String[] args) throws InterruptedException  {
		driver.get("https://demo.actitime.com/login.do");
		WebElement checkbox=driver.findElement(By.name("remember"));
		Thread.sleep(2000);
		checkbox.click();
		if(checkbox.isSelected()){
			System.out.println("checkbox is selected");
		}
		else{
			System.out.println("checkbox is not selected");
		}
		driver.close();
	}
}
