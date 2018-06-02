package seleniumrevision.org.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class CaptureScreenshot_ActiTIMEPage extends BaseClassFireFox {
	public static void main(String[] args) throws IOException {
		Date d = new Date();
		String curDate1 = d.toString();
		System.out.println(curDate1);
		String curDate2 = curDate1.replaceAll(":", "_");
		System.out.println(curDate2);
		driver.get("https://demo.actitime.com/login.do");
		TakesScreenshot ts =(TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile =new File(".\\screenshot"+curDate2+"_actitimeLogin.png");
		FileUtils.copyFile(srcFile, destFile);
		driver.close();
	}
}
