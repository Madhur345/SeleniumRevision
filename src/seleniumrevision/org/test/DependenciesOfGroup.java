package seleniumrevision.org.test;
import org.testng.annotations.Test;

public class DependenciesOfGroup {
	
		@Test
		public void printMessage(){
			System.out.println("Print the message");
		}
		@Test(dependsOnGroups ={"checkintest.*"})
		public void writeMessage(){
			System.out.println("write the message");
		}
		@Test(groups ={"checkintest"})
		public void rewriteMessage(){
			System.out.println("Re-write the message");
		}
	}

