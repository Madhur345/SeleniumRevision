package seleniumrevision.org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Ajaxdemo extends BaseClassFireFox{




	@BeforeClass
	public void setUp() {
		driver.navigate().to("");
	}

	@Test
	public void test_AjaxExample() {

		By container = By.cssSelector(".container");
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(container));

		//Get the text before performing an ajax call
		WebElement noTextElement = driver.findElement(By.className("radiobutton"));
		String textBefore = noTextElement.getText().trim();
		System.out.println(textBefore);

		//Click on the radio button
		driver.findElement(By.id("yes")).click();

		//Click on Check Button
		driver.findElement(By.id("buttoncheck")).click();

		/*Get the text after ajax call*/
		WebElement TextElement = driver.findElement(By.className("radiobutton"));
		wait.until(ExpectedConditions.visibilityOf(TextElement));
		String textAfter = TextElement.getText().trim();
		System.out.println(textAfter);

		/*Verify both texts before ajax call and after ajax call text.*/
		Assert.assertNotEquals(textBefore, textAfter);
		System.out.println("Ajax Call Performed");

		String expectedText = "Radio button is checked and it's value is Yes";

		/*Verify expected text with text updated after ajax call*/
		Assert.assertEquals(textAfter, expectedText);
		driver.close();
	}

}
