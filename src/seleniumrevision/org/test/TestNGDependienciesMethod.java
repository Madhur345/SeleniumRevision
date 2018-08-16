package seleniumrevision.org.test;

import org.testng.annotations.Test;

public class TestNGDependienciesMethod {
		@Test
		public void printMessage(){
			System.out.println("Print the message");
		}
		@Test
		public void writeMessage(){
			System.out.println("write the message");
		}
		@Test(dependsOnMethods ={"writeMessage"})
		public void rewriteMessage(){
			System.out.println("Re-write the message");
		}
	}
