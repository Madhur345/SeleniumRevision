package seleniumrevision.org.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterisedTest {
	@Test
	@Parameters("myName")
	public void parameterisedTest(String myName){
		System.out.println("Parameterised Value is :" + myName);
	}
}
