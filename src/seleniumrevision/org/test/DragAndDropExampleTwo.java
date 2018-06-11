package seleniumrevision.org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExampleTwo extends BaseClassChrome {

	public static void main(String[] args) throws InterruptedException  {
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		WebElement block1=driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement block3=driver.findElement(By.xpath("//h1[text()='Block 3']"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(block1, block3.getLocation().getX(),block3.getSize().getHeight()+10).perform();
		Thread.sleep(2000);
	}
}

