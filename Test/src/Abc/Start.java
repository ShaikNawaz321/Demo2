package Abc;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Start {

	@Parameters({"URL"})
	@Test(groups = {"smoke"})
	public void demo(String urlname) 
	{
		
		System.out.println("start1st");
		System.out.println(urlname);

	}
	@Test(dataProvider = "getdata")
	public void demo1(String un,String ps) {
		
		System.out.println(un);
		System.out.println(ps);

	}
	
@DataProvider
public Object[][] getdata()
{
Object[][]	data=new Object[3][2];
data[0][0]="1stusername";
data[0][1]="1stpass";

data[1][0]="2ndusername";
data[1][1]="2ndpass";

data[2][0]="3drusername";
data[2][1]="3rdpass";
return data;
}
	

}
