package seleniumrevision.org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VerifyKeepMeLoggedInisaCheckboxinActitime extends BaseClassFireFox {
	public static void main(String[] args) throws InterruptedException {
		driver.get("https://demo.actitime.com/login.do");
		WebElement checkbox=driver.findElement(By.name("remember"));
		Thread.sleep(2000);
		String actiCheckBox =checkbox.getAttribute("type");
		if(actiCheckBox.equalsIgnoreCase("checkbox")){
			System.out.println("KeepMeLoggedIn is a Checkbox in Actitime");
		}
		else{
			System.out.println("KeepMeLoggedIn is not a Checkbox in Actitime");
		}
		driver.close();
	}
}
