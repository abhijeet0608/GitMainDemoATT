package TestNGDemo;
import org.testng.annotations.Test;

public class Eqote {

	
	@Test(groups= {"Smoke"})
	public void adminTool()
	{
		System.out.println("User need to perform Admin Validations");
	}
	
	@Test(dependsOnMethods="utilities")
	public void ContentMigration()
	{
		System.out.println("User need to perform migration activities");

	}
	@Test
	public void utilities()
	{
		System.out.println("User need to perform Utilities Operations");
	

}
}