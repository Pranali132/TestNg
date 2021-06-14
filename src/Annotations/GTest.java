package Annotations;
import org.testng.Assert;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GTest {
	@BeforeGroups ("sanity")
	public void beforegrp()  
	{  
	System.out.println("This method will be executed before the execution of sanity Department group");  
	}  
	
	@AfterGroups("sanity")
	public void aftergrp()  
	{  
	System.out.println("This method will be executed after the execution of sanity Department group");  
	}
	@Test(groups="sanity")
	  public void f1() {
	  System.out.println("sanity::f1");
	  }
	  @Test(groups="sanity")
	  public void f3() {
	  System.out.println("sanity::f3");
	 // Assert.fail();
	  }
	  @Test(groups="sanity")
	  public void f5() {
	  System.out.println("sanity::f5");
	  }
	  @Test(groups="regression")
	  public void f7() {
	  System.out.println("regression::f7");
	  }
	  @Test(groups="regression",dependsOnGroups={"sanity"})
	  public void f2() {
	  System.out.println("regression::f2");
	  }
	  @Test(groups="regression",dependsOnGroups={"sanity"})
	  public void f4() {
	  System.out.println("regression::f4");
	  }
	  @Test(groups="regression",dependsOnGroups={"sanity"})
	  public void f6() {
	  System.out.println("regression::f6");
	  }
}
