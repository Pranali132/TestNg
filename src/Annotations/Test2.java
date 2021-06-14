package Annotations;
import org.testng.annotations.AfterSuite;

import static org.testng.Assert.assertEquals;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Test2 {
@BeforeSuite
	public void initSuit()
	{
		System.out.println("Suit init");
	}
	String cmp;
	@BeforeMethod// each test method
	public void beforeMethodt()
	{
		System.out.println("before method is invoked");
	}
	@BeforeTest// only once
	public void beforeTest()
	{
		System.out.println("before Test is invoked");
		cmp="Atos Syntel";
	}
	
	@AfterMethod// each test method
	public void afterMethod()
	{
		System.out.println("after method is invoked");
		System.out.println(cmp);
	}
	@AfterTest// only once
	public void afterTest()
	{
		System.out.println("afterTest is invoked");
		cmp=null;
		System.out.println(cmp);
	}
	@AfterSuite
	public void DestroySuit()
	{
		System.out.println("Suit destroyed");
	}

	
@Test
public void testMethod1()
{
	System.out.println("Test Method1");
	assertEquals(cmp,"Atos Sysntel");
}

@Test
public void testMethod2()
{
	System.out.println("Test Method2");
}

}
