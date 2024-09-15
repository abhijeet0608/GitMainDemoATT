package TestNGDemo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ReportOrdering {
String url = "WWW.GOGGLE.COM";
	@BeforeSuite
	public void luanchBrowsers()
    {
		System.out.println("Launch the browser");
	}
	
	@BeforeClass
	public void launchurl()
	{
		System.out.println(url);
		
	}
	
	@BeforeMethod
	public void tc1()
	
	{
		System.out.println("BeforeTC1");
	}
	
	@Test
	public void reportoderingSUIAuto()
	{
		System.out.println("User is able to ORDER REPORT and rate and issue Auto policy from QQ");
	}
	
	@AfterMethod
	public void endOfTC1()
	{
		System.out.println("AfterTC1");
	}
	@Test
	public void reportoderingSUIProp()
	{
		System.out.println("User is able to order reports  rate and issue Prop policy from QQ");
	}
	@Test
	public void ploraValidations()
	{
		System.out.println("User needs to validate Plora");
	}	
	
	@AfterClass
	public void closeBrowser()
	{
		System.out.println("Browser is closed");
		
	}
	@BeforeSuite
	public void quitBrowsers()
    {
		System.out.println("Quit the browser");
	}
}
