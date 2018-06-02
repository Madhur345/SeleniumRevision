package seleniumrevision.org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VerifyFB_Usernamefield_lessthanMobileNumberField extends BaseClassFireFox {

	public static void main(String[] args) {
		driver.get("https://www.facebook.com/");
		WebElement unTB =driver.findElement(By.id("email"));
		int unTBSize = unTB.getSize().getWidth();
		System.out.println("size of username text box" +unTBSize);
		WebElement mnTB =driver.findElement(By.id("u_0_o"));
		int mnTBSize = mnTB.getSize().getWidth();
		System.out.println("size of mobile number text box" +mnTBSize);
		if(unTBSize<mnTBSize){
			System.out.println("username field is smaller than Mobile Number Field");
		}else{
			System.out.println("username field is bigger than Mobile Number Field");
		}
		driver.close();
	}
}
