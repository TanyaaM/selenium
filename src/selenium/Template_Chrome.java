package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Template_Chrome  extends BaseTest{

	public static void main(String[] args) throws InterruptedException {
		
		OpenBrowser("Browser_Name");
		
		
// System.setProperty("webdriver.chrome.driver","G:\\Selenium\\chromedriver.exe");
// ChromeDriver driver=new ChromeDriver();  //calling a constructor
 
 try
 {
//driver.get("http:\\gmail.com");
	 
navigate("URL");

	}catch(Exception e){
		System.out.println("some error"+e.getMessage());
		
	}finally{
		driver.quit();
	}
	}
	}

