package seleniumrevision.org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Gmail_contextClickDemo_mailArchive extends BaseClassChrome {

	public static void main(String[] args) throws InterruptedException {
		driver.get("http://www.gmail.com");
		driver.findElement(By.xpath("//*[@id='identifierId']")).clear();
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("madhurvishal5@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();;
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).clear();
		driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys(".v9661132");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();;
		String xp="//*[@id=':3q']/span";
		Thread.sleep(5000);
		WebElement mail = driver.findElement(By.xpath(xp));
		System.out.println(mail.getText());
		Actions action = new Actions(driver);
		action.contextClick(mail).perform();
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//div[@class='J-N-JX aDE aDD'])[1]")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
