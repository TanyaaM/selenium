package selenium;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseTest {
	
	

	static WebDriver driver;
	
	public static String GetPropValue(String PName)
	{
	String PValue=null;
	try{
		Properties prop=new Properties();
		String path=System.getProperty("user.dir");
		FileInputStream ft=new FileInputStream(path+"\\src\\Config.properties");
		prop.load(ft);//LINKING TO THE PROPERTY FILE
		PValue=prop.getProperty(PName);
	}catch(Exception e){
		System.out.println("some error"+e.getMessage());
	}
	return PValue;
	}
	
	public static String GetPathValue(String PName)
	{
	String PValue=null;
	try{
		Properties prop=new Properties();
		String path=System.getProperty("user.dir");
		FileInputStream ft=new FileInputStream(path+"\\src\\Obj_Path.properties");
		prop.load(ft);//LINKING TO THE PROPERTY FILE
		PValue=prop.getProperty(PName);
	}catch(Exception e){
		System.out.println("some error"+e.getMessage());
	}
	return PValue;
	}


	/***********************OPEN BROWSER******************************
	 * author:
	 * @param btype
	 */
	public static void OpenBrowser(String BN){
		String btype= GetPropValue(BN);
		
		if(btype.equals("Mozilla")){
		
			System.setProperty("webdriver.mozilla.driver","G:\\Selenium\\mozilladriver.exe");

			 driver=new FirefoxDriver();
			
		}else if(btype.equals("Chrome")){
		 
			System.setProperty("webdriver.chrome.driver","G:\\Selenium\\chromedriver.exe");

			driver=new ChromeDriver();
			
		}else if(btype.equals("IE")){
			 System.setProperty("webdriver.IE.driver","G:\\Selenium\\IEdriver.exe");

			driver=new InternetExplorerDriver();
	}
		
	}
/*----------------------------------------------------------------------------	*/

	/**********************NAVIGATE FUNCTION****************************/
	
	
	public static void navigate(String URL){
		driver.get(GetPropValue("URL"));
	}
	/*-------------------------------*/
	
	/*********************Click ON OBJECT******************/
	
	public void click(String xpathEle){
		driver.findElement(By.xpath(GetPathValue(xpathEle))).click();
	}
	/*---------------------------------------------------------------*/
	
	/*****************Typing on Object***************************/
	
	public void type(String xpathEle,String data){
		driver.findElement(By.xpath(GetPathValue(xpathEle))).sendKeys(data);
	}
	/*-----------------------------------------------------*/
	
	/**
	 * @throws InterruptedException *********wait******************************************************/
	public void wait(int x) throws InterruptedException{
		int y=x+1000;
		
		Thread.sleep(y);
	}
}
