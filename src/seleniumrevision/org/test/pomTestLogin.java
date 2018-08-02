package seleniumrevision.org.test;

public class pomTestLogin extends BaseClassFireFox {

	public static void main(String[] args) throws InterruptedException {
		driver.get("https://demo.actitime.com/login.do");
		pomLoginPage login = new pomLoginPage(driver);
		login.setUsername("manager");
		login.setPassword("admin");
		login.clickLogin();
		Thread.sleep(3000);
		login.setUsername("admin");
		login.setPassword("manager");
		login.clickLogin();
		Thread.sleep(3000);
		driver.close();
	}
}
