package seleniumrevision.org.test;

import java.io.IOException;

import org.openqa.selenium.By;

public class FileUploadUsingAutoIt extends BaseClassChrome {

	public static void main(String[] args) throws InterruptedException, IOException {
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
		driver.findElement(By.xpath("//input[@uploader='uploader'][2]")).click();;
		Thread.sleep(2000);
		Runtime run = Runtime.getRuntime();
		run.exec("C:\\Users\\VISHAL\\Desktop\\Others\\fileupload7.exe");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//button[@ng-click='uploader.uploadAll()']")).click();
		Thread.sleep(3000);
		driver.close();
	}
	}
