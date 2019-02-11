package selenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginClass extends BaseTest{

	@BeforeMethod
	public void BaseTestB(){
	
		//System.out.println("Open Browser");
		OpenBrowser("Browser_Name");
		navigate("URL");
	}
	
	@AfterMethod 
	public void BaseTestA()
	{
		
		System.out.println("Close Browser");
		driver.close();
	}

	
	@Test(priority=1)	
	public void TestLogin(){
		
		System.out.println("I am in TestLogin");
	}
	
	@Test(priority=2)
	public void TestLogout(){
		
		System.out.println("I am in TestLogout");
		
	}
	
	@Test(priority=4)
	public void TestRegister(){
		
		System.out.println("I am in TestRegister");
		
	}
	
	@Test(priority=3)
	public void TestConfirm(){
		
		System.out.println("I am in TestConfirm");
	}
	
	}
	

