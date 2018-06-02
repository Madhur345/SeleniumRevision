package seleniumrevision.org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VerifyUNandPWDalignment extends BaseClassFireFox {

	public static void main(String[] args) throws InterruptedException {
		driver.get("https://demo.actitime.com/login.do");
		WebElement unTB=driver.findElement(By.id("username"));
		int un_x =unTB.getLocation().getX();
		int un_width =unTB.getSize().getWidth();
		int un_height =unTB.getSize().getHeight();
		System.out.println(un_x);
		System.out.println(un_width);
		System.out.println(un_height);
		Thread.sleep(2000);
		WebElement pwdTB=driver.findElement(By.name("pwd"));
		int pwd_x =pwdTB.getLocation().getX();
		int pwd_width =pwdTB.getSize().getWidth();
		int pwd_height =pwdTB.getSize().getHeight();
		System.out.println(pwd_x);
		System.out.println(pwd_width);
		System.out.println(pwd_height);
		if(un_x==pwd_x && un_width==pwd_width && un_height==pwd_height){
			System.out.println("username and password text box are aligned");
		}else{
			System.out.println("username and password text box are not aligned");
		}
		driver.close();
	}
}
