import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test

	public void testLogin(){
		
		System.out.println("Testing Login Screen");
		
	}
	
	@Test
	public void testFromFill(){
		System.out.println("Testing regestration from ");
	}
	
	@BeforeMethod
	public void openbrowser(){
		System.out.println("opening Browser");
	}

	@AfterMethod
	public void closingbrowser(){
		System.out.println("closing Browser");
	}
	
	@BeforeTest
	public void opendbconnection(){
		System.out.println("Create db connection ");
	}
	@AfterTest
	public void closedbconnection(){
		System.out.println("closing db connection");
		
	}
	
	@BeforeSuite
	public void runSeleniumServer(){
		
		System.out.println("starting Selenium Server ");
		
	}
	
	@AfterSuite
	public void stopSeleniumServer(){
		
		System.out.println("stoping Selenium Server ");
		
	}
	
	
}



















