package seleniumrevision.org.test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.testng.Assert;

public class FetchDataFromPDFDemo {
	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("D:\\SeleniumBTM\\Vallore.pdf");

		PDFParser parser = new PDFParser(fis);
		parser.parse();
		COSDocument cosDoc	=parser.getDocument();
		PDDocument pdDoc = new PDDocument(cosDoc);
		PDFTextStripper strip = new PDFTextStripper();
		String data =strip.getText(pdDoc);
		System.out.println(data);
		Assert.assertTrue(data.contains("WEBAPS689118"));
		cosDoc.close();
		pdDoc.close();
		System.out.println("Receipt Number is found");
	}
}
