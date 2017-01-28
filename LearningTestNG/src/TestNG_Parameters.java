import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_Parameters {

	@Test(dataProvider = "gerData")
	
	public void testFromfill(String username, String passwors, Integer age){
		
		System.out.println(username + " _ " + passwors + " _ " + age);
	
	}
	
	@DataProvider
	public Object[][] getData(){
		
		Object [][]data = new Object[2][3];
		
		data [0][0] = "kabir8933k@gmail.com";
		data [0][1] = "H1234567h";
		data [0][2] = 19;
		
		data[1][0] = "remoteituniversity@gmail.com";
		data[1][1] = "01715479713";
		data[1][2] = 28;
		
		return data;
				
		
	}
	
	
	
	
}
