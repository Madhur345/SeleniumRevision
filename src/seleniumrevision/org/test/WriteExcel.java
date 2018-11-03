package seleniumrevision.org.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcel {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream ("D:\\SeleniumBTM\\SeleniumRevision\\Test Data\\inputdata.xlsx");

		Workbook wb = WorkbookFactory.create(fis);

		Sheet sheet = wb.getSheet("Invoices Summary");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String unValue =cell.toString();
		FileOutputStream FOS = new FileOutputStream ("D:\\SeleniumBTM\\SeleniumRevision\\Test Data\\inputdata.xlsx");
		wb.getSheet("Invoices Summary").getRow (1).getCell (5).setCellValue ("brainlesspepole you are man"); //write data
		String pwd = wb.getSheet("Invoices Summary").getRow(1).getCell(5).toString();
		wb.write (FOS); //save file
		System.out.println(unValue+" " +pwd);

	}
}