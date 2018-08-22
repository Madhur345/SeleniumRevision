package seleniumrevision.org.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReadDataFromPDF {
	@Test
	public void readData() throws IOException{
		FileInputStream fis = new FileInputStream("D:\\SeleniumBTM\\186862.pdf");
		PDFParser parser = new PDFParser(fis);
		parser.parse();
		COSDocument cosDocument=parser.getDocument();
		PDDocument pdDocument = new PDDocument(cosDocument);
		PDFTextStripper strip = new PDFTextStripper();
		String data=strip.getText(pdDocument);
		System.out.println(data);
		Assert.assertTrue(data.contains("KOTAK MAHINDRA BANK"));
		cosDocument.close();
		pdDocument.close();
		System.out.println("Bank Name is Found");
	}
}
