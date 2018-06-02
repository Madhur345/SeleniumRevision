package seleniumrevision.org.test;

public class EnterTextintoFocussedElement extends BaseClassFireFox {

	public static void main(String[] args) {
		driver.get("https://demo.actitime.com/login.do");
		driver.switchTo().activeElement().sendKeys("admin");
	}
}
