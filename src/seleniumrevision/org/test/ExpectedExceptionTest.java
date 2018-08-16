package seleniumrevision.org.test;
import org.testng.annotations.Test;

public class ExpectedExceptionTest {
   String message = "Manisha";	
   MessageUtil messageUtil = new MessageUtil(message);
	   
   @Test(expectedExceptions = ArithmeticException.class)
   public void testPrintMessage() {	
      messageUtil.printMessage();     
   }
   }
