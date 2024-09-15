package TestNGDemo;
import org.testng.annotations.Test;

public class QuickQuote {

	@Test(groups= {"Smoke"})
	public void cpsAuto()
	{
		System.out.println("User is able to rate and issue Auto policy from QQ");
	}
	
	@Test
	public void cpsProp()
	{
		System.out.println("User is able to rate and issue Prop policy from QQ");
	}
	@Test
	public void cbsAuto()
	{
		System.out.println("User is able to import auto quote in QQ");
	}	
	@Test
	public void cbsProp()
	{
		System.out.println("User is able to import HOME quote in QQ");
	}	
	@Test
	public void ecbiRenters()
	{
		System.out.println("User is aable to import rentrs quote into QQ for ECBI Validations");
	}	
	@Test
	public void integratedFlows()
	{
		System.out.println("User is aable to import rentrs quote into QQ for ECBI Validations");
	}	

}
