package Annotations;
import org.testng.annotations.BeforeMethod;


import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class BM {
	@BeforeMethod// each test method
	public void beforeMethodt()
	{
		System.out.println("before method is invoked");
	}
	@AfterMethod// each test method
	public void afterMethod()
	{
		System.out.println("after method is invoked");
	}
@Test
	public void testMethod1()
	{
		System.out.println("Test Method1");
	}	@Test
	public void testMethod2()
	{
		System.out.println("Test Method2");
	}

}
