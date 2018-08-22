package seleniumrevision.org.test;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Set;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ReadPDFDataFromURL extends BaseClassFireFox {

	public static void main(String[] args) throws IOException, InterruptedException {
		driver.get("http://tpod.accotech.xyz/erp_squareplums/index.html#/login");
		driver.findElement(By.name("username")).sendKeys("tester6@squareplums.com");
		driver.findElement(By.name("password")).sendKeys("Test17");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'])[21]")).click();
		Actions actions = new Actions(driver);
		Thread.sleep(3000);
		WebElement reservations=driver.findElement(By.xpath("//button[contains(@ng-click,'reservations')]"));
		actions.moveToElement(reservations).click().perform();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='SQP0700187602200002']/../../..//button[@title='Details']")).click();
		Thread.sleep(3000);
		WebElement payments=	driver.findElement(By.xpath("(//span[@class='ng-scope'])[3]"));
		actions.moveToElement(payments).click().perform();
		driver.findElement(By.xpath("//div[contains(text(),'OR006 - Charges towards documentation')]")).click();
		Thread.sleep(3000);
		String parentWindowHandle = driver.getWindowHandle();
		String title = driver.getTitle();
		Set <String> allWindowHandles = driver.getWindowHandles();
		int count = allWindowHandles.size();
		System.out.println("Total number of browser window is : "+count);
		for(String windowHandle:allWindowHandles){
			driver.switchTo().window(windowHandle);
			if(windowHandle.equals(parentWindowHandle)){
				driver.close();
				System.out.println("The browser window with tilte " +title+ " is closed");
			}
		}
		String getURL = driver.getCurrentUrl();
		System.out.println(getURL);
		URL pdfURL = new URL(getURL);
		InputStream inputStr=	pdfURL.openStream();
		BufferedInputStream file= new BufferedInputStream(inputStr);
		PDFParser parser = new PDFParser(file);
		parser.parse();
		String expectedText ="OR006 - Charges towards documentation";
		COSDocument cosDocument=parser.getDocument();
		PDDocument pdDocument = new PDDocument(cosDocument);
		PDFTextStripper strip = new PDFTextStripper();
		String data=strip.getText(pdDocument);
		System.out.println(data);
		Assert.assertTrue(data.contains(expectedText));
		cosDocument.close();
		pdDocument.close();
		System.out.println("Correct Service Type Is Found");

	}

}
