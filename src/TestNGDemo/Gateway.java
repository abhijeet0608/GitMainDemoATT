package TestNGDemo;
import org.testng.annotations.Test;

public class Gateway {

	@Test(groups= {"Smoke"})
	public void importSUIQuote()
	{
		System.out.println("User is able to import quote succesfully from SUI");
	}
	
	@Test
	public void importQQQuote()
	{
		System.out.println("User is able to import quote succesfully from QQ To SUI");
	

	}
	@Test
	public void ezylxImport()
	{
		System.out.println("\"User is able to import quote succesfully from partners to SUI");
	

	}	
	@Test
	public void isrFlow()
	{
		System.out.println("User is aable to perform ISR flow from SUI");
	

	}	
	@Test
	public void pqsFlow()
	{
		System.out.println("\"User is aable to perform PQS flow from SUI");
	

	}	

}
