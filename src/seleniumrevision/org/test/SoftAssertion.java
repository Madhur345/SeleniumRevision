package seleniumrevision.org.test;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	@Test
	public void softAssert(){
		SoftAssert s = new SoftAssert();
		System.out.println("softAssert Method Was Started");
		s.assertTrue(false);
		System.out.println("softAssert Method Was Executed");
		//s.assertAll();
		
	}

	@Test
	public void hardAssert(){
		System.out.println("hardAssert Method Was Started");
		Assert.assertTrue(false);
		System.out.println("hardAssert Method Was Executed");
		//Assert.fail();
	}
}
