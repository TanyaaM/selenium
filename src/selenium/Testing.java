package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:\\Selenium\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.naukri.com/");
		String titletext = driver.getTitle();
		System.out.println(titletext);
		if(titletext.equals("Naukari"))
		{
			System.out.println("Title testcase pass");
		}else
		{
			System.out.println("Title tescase fails");
		}
       
		driver.findElement(By.xpath(".//*[@id='qsbClick']/span[2]")).click();
		driver.findElement(By.xpath(".//*[@class='sugInp']")).sendKeys("Software Testing");
		
		driver.findElement(By.xpath(".//*[@id='location']/div[1]/div[2]/input")).sendKeys("Chandigarh");
		driver.findElement(By.xpath(".//*[@id='exp_dd']/div[1]/input[1]")).sendKeys("2");
		driver.findElement(By.xpath(".//*[@id='salary_dd']/div[1]/input[1]")).sendKeys("5");
		

	}

}
