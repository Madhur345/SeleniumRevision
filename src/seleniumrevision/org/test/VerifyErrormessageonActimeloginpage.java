package seleniumrevision.org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class VerifyErrormessageonActimeloginpage extends BaseClassFireFox {

	public static void main(String[] args) throws InterruptedException {
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//a[@id ='loginButton']/div")).click();
		Thread.sleep(3000);
		WebElement errorMsg=driver.findElement(By.xpath("//span[contains(text(),'invalid')]"));
		System.out.println(errorMsg.isDisplayed());
		String errText =errorMsg.getText();
		System.out.println("Error message is :" + errText);
		String actualColor = errorMsg.getCssValue("color");
		String expectedColor ="#ce0100";
		String colorAsHex =Color.fromString(actualColor).asHex();
		System.out.println("Hexadecimal format :"+ colorAsHex);
		if(colorAsHex.equals(expectedColor)){
			System.out.println("color of error message is red");
		}
		else{
			System.out.println("color of error message is not red");
		}
		driver.close();
	}
}
