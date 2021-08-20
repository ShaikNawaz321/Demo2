package Abc;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Demo {
	
	@Test()
	public void demo11() {
		
		System.out.println("demo1st");
		org.testng.Assert.assertTrue(false);

	}
	@Test
	public void demo12() {
		
		System.out.println("demo2nd");
	}
	
}
