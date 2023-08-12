

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CarLoan {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}
	
	@Test
	public void webCarLogin()
	{
		//Selenium
		System.out.println("Selenium webCarLogin cases");
		System.out.println("Selenium webCarLogin cases 2");
	}
	
	@Test
	public void mobileCarLogin()
	{
		//Appium
		System.out.println("Appium mobileCarLogin cases");
	}
	
	@Test
	public void mobileCarSignin()
	{
		//Appium
		System.out.println("Appium mobileCarSignin cases");
	}
	
	@Test
	public void mobileCarSignOut()
	{
		//Appium
		System.out.println("Appium mobileCarSignOut cases");
	}
	
	@Test
	public void apiCarLogin()
	{
		//RestAPI
		System.out.println("RestAPI apiCarLogin cases");
	}

}
