package testngGroups;

import org.testng.annotations.Test;

public class GroupTest {
	
	public class Test1 {
		@Test(groups = {"functest", "checkintest"})
		public void testMethod1() {
			System.out.println("Test method 1");
		}
		
		@Test(groups = {"functest", "checkintest"})
		public void testMethod2() {
			System.out.println("Test method 2");
		}
		
		@Test(groups = {"functest"})
		public void testMethod3() {
			System.out.println("Test method 3");
		}
	}

}
