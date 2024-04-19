package myTYFirstPorject;

import org.testng.annotations.Test;

public class TestNgp1 {
	@Test(priority=-1,invocationCount=4,dependsOnMethods="methodthree")
	public void methodone() {
		System.out.println("Lenovo");
	}
	@Test(priority=-1,invocationCount=4,dependsOnMethods="methodone")
	public void methodtwo() {
		System.out.println("Dell");
	}
	@Test(priority=-1,invocationCount=4,dependsOnMethods="methodtwo")
	public void methodthree() {
		System.out.println("HCL");
	}
}
