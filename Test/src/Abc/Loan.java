package Abc;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Loan {
	
	@BeforeClass
	public void beforeclass()
	{
	System.out.println("This beforeclass");	
	}
	
	@AfterClass
	public void afterclass()
	{
	System.out.println("This afterclass");	
	}
	
@Test(groups = {"smoke"})
public void carloan()
{
System.out.println("This is car loan");	
}

@Test
public void homeloan()
{
System.out.println("This is home loan");	
}

@Test
public void homeloan1()
{
System.out.println("This is home loan1");	
}

@Test
public void personalloan()
{
System.out.println("This is personal loan");	
}

@Test
public void mobilelloan()
{
System.out.println("This is mobile loan");	
}

@AfterMethod
public void pre()
{
System.out.println(".");	
}


}
