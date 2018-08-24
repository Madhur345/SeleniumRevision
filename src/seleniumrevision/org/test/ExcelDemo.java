package seleniumrevision.org.test;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDemo {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("D:\\SeleniumBTM\\SeleniumRevision\\Test Data\\inputdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Invoices Summary");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String unValue =cell.toString();
		String pwdValue =wb.getSheet("Invoices Summary").getRow(1).getCell(5).toString();
		int rowCount =0;
		 rowCount = wb.getSheet("Invoices Summary").getLastRowNum();
		 System.out.println(rowCount);
		System.out.println(unValue+":"+pwdValue);
	}
}
