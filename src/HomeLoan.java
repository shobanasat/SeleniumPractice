

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeLoan {
	
	
	@AfterTest
	public void afterTest()
	{
		//Selenium
		System.out.println("After Test");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		//Selenium
		System.out.println("Before Test");
	}
	
	@Test
	public void webHomeLogin()
	{
		//Selenium
		System.out.println("Selenium webHomeLogin cases");
		System.out.println("Selenium webHomeLogin cases 1");
	}
	
	@Test
	public void mobileHomeLogin()
	{
		//Appium
		System.out.println("Appium mobileHomeLogin cases");
	}
	
	@Test
	public void apiHomeLogin()
	{
		//RestAPI
		System.out.println("RestAPI apiHomeLogin cases");
	}

}
