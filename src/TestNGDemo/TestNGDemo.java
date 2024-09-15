package TestNGDemo;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGDemo {

	@Test()
	public void testabc()
	{
		Reporter.log("aBHIJEEET", false);
		
		
	}	
	
	@Test()
	public void testabb()
	{
		//Reporter.log("Test is passed");
		System.out.println("Test is passed 1");
	}

}
