package seleniumrevision.org.test;

import org.testng.annotations.Test;

public class GroupTestExample {
	@Test(groups={"functest","checkintest"})
	public void printMessage(){
		System.out.println("Print the message");
	}
	@Test(groups ={"functest"})
	public void writeMessage(){
		System.out.println("write the message");
	}
	@Test(groups ={"checkintest"})
	public void rewriteMessage(){
		System.out.println("Re-write the message");
	}
}
