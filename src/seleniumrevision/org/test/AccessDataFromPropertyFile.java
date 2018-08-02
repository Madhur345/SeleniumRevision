package seleniumrevision.org.test;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;

public class AccessDataFromPropertyFile extends BaseClassFireFox {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("./config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("URL");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		System.out.println(url);
		System.out.println(username+":"+password);
		driver.get(url);
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.xpath("//div[contains(text(),'Login')][1]")).click();
		Thread.sleep(4000);
		driver.close();
	}
}
