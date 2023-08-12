

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RunningTestNG {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	@Test
	public void demo()
	{
		System.out.println("Hello");
	}
	
	@Test
	public void demo2() {
		System.out.println("This is demo2");
	}
}
