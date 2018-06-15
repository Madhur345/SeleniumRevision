package seleniumrevision.org.test;

import org.openqa.selenium.By;

public class FileUploadPopup_Demo extends BaseClassChrome{

	public static void main(String[] args) throws InterruptedException {
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='file'])[2]")).sendKeys("C:/Users/VISHAL/Desktop/datas.xls");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@ng-click='uploader.uploadAll()']")).click();
		Thread.sleep(3000);
		driver.close();
	}
}
