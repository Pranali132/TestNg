package Annotations;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
public class Test1 {
	@Test(priority=1)
	public void Login()
	{
		System.out.println("login Test");
		//Assert.fail();
	}
	@Test(priority=2,dependsOnMethods="Login")
	public void inbox()
	{
		System.out.println("Inbox method");
	}

	@Test(priority=3)
	public void sendMails()
	{
		System.out.println("send Mails");
	}

	@Test(priority=4,enabled=false)
	public void Logout()
	{
		System.out.println("Logout");
	}


}
