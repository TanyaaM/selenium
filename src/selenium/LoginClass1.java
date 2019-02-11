package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginClass1 {

	

	public class LoginClass extends BaseTest{
		
		@BeforeMethod
		public void BaseTestB(){
			
			System.out.println("Open Browser");
			OpenBrowser("Browser_Name");
			//navigate("URL");
		}
		
		@AfterMethod
		public void BaseTestA(){
			
			System.out.println("Close Browser");
			driver.close();
			
		}
		
		
		@Test(priority=1)	
		public void Test_Exp_list_Count() throws InterruptedException{
			
			navigate("URL");
			wait(5);
								
			try{
			List<WebElement> ExpList=driver.findElements(By.xpath("//*[@id='exp_dd']//Li"));
			
			System.out.println(ExpList.size());
			
			Assert.assertEquals(ExpList.size(), 32,"List size is not same");
			
			/*if(ExpList.size()==31)
			{
				System.out.println("Total Value in experience drop down list are correct");
				
			}else
			{
				System.out.println("Fail: Expected drop down of experience is not correct");
				Assert.fail("Fail: Expected drop down of experience is not correct");
			}
			*/
			}catch(Exception e){
				System.out.println("Some Error:"+ e.getMessage());
				Assert.fail("Some Error:"+ e.getMessage());
				
			
			}
			
			
			
		}
		
		@Test(priority=2)
	    public void Test_Naukri_Search(){
			
			try{
			navigate("URL");
			wait(5);
			type("Naukri_Search_Skills","Software Testing");
			//type("//*[@id='location']","Chandigarh");
			type("Naukri_Search_Location","Chandigarh");
			click("Naukri_Search_Exp");
			
			}catch(Exception e){
			}
			
			}
			
			/*
			WebElement Location=driver.findElement(By.xpath("//*[@id='location']"));
			WebElement Exp=driver.findElement(By.xpath("//*[@id='exp_dd']"));
			WebElement Salary=driver.findElement(By.xpath("//*[@id='salary_dd']"));
			WebElement ExpSelect=driver.findElement(By.xpath("//*[@id='a5']"));
			WebElement SalSelect=driver.findElement(By.xpath("//*[@id='salary_dd']//li[@id='a10']"));
			WebElement Search=driver.findElement(By.xpath("//*[@id='qsbFormBtn']"));
	    	
		
	    	System.out.println("I am In TestLogout");
	    	*/
			
		}

		@Test(priority=4)
		public void TestRegister(){
	    	
	    	System.out.println("I am In TestRegister");
		
	    }

		@Test(priority=3)
		public void Test4Confirm(){
	    	
	    	System.out.println("I am In TestConfirm");
		
	    }
		
		

	}



