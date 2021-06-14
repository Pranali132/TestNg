package Annotations;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BT {
	@BeforeTest// only once
	public void beforeTest()
	{
		System.out.println("before Test is invoked");
	}
    @AfterTest// only once
	public void afterTest()
	{
		System.out.println("afterTest is invoked");
	}
   

   @Test
	public void testMethod1()
	{
		System.out.println("Test Method1");
	}
   @Test
	public void testMethod2()
	{
		System.out.println("Test Method2");
	}

}
