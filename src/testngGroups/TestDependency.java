package testngGroups;

import org.testng.annotations.Test;

public class TestDependency {
	@Test
	public void serverStartedOk() {
		System.out.println("Server started ok");
		throw new ArithmeticException();
	}
	
	@Test(alwaysRun=true,dependsOnMethods = {"serverStartedOk"})
	public void Depend() {
		System.out.println("Depend");
	}

}
