package Annotations;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class Test3 {
	String cmp;
	@BeforeClass
	public void init()
	{
		cmp="Atos ";
		System.out.println("inside before class method");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("inside After Class ");
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
