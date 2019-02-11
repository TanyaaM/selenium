package selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class naukri1 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://www.naukri.com/browse-jobs");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
					
		WebElement Skills=driver.findElement(By.xpath("//*[@id='skill']"));
		WebElement Location=driver.findElement(By.xpath("//*[@id='location']"));
		WebElement Exp=driver.findElement(By.xpath("//*[@id='exp_dd']"));
		WebElement Salary=driver.findElement(By.xpath("//*[@id='salary_dd']"));
		WebElement ExpSelect=driver.findElement(By.xpath("//*[@id='a5']"));
		WebElement SalSelect=driver.findElement(By.xpath("//*[@id='salary_dd']//li[@id='a10']"));
		WebElement Search=driver.findElement(By.xpath("//*[@id='qsbFormBtn']"));
		
		//we need to handle more then one value so we create list of webelement
		
		List<WebElement> Explist=driver.findElements(By.xpath(".//*[@id='exp_dd']//Li"));
		
		System.out.println(Explist.size());
		
		if(Explist.size()==32)
		{System.out.println("Total value in experience dropdown list are correct");
		
		}
		else
		{
			System.out.println("wrong count");
		}
		
		Skills.click();
		Actions actions = new Actions(driver);
		actions.moveToElement(Skills);
		actions.click();
		actions.sendKeys("Software Testing");
		actions.build().perform();
		
		Thread.sleep(5000);
		
		Location.click();
		Thread.sleep(5000);
		actions.moveToElement(Location);
		actions.click();
		actions.sendKeys("Chandigarh");
		actions.build().perform();
		
		Exp.click();
		Thread.sleep(5000);
		
		
		ExpSelect.click();
		Thread.sleep(5000);
		Salary.click();
		Thread.sleep(5000);
		actions.moveToElement(SalSelect);
		actions.click();
		actions.build().perform();
		Thread.sleep(10000);
		actions.moveToElement(Search);
		actions.click();
		actions.build().perform();
		
		Thread.sleep(5000);
		
		WebElement result=driver.findElement(By.xpath("//div[@class='count']//span[@class='cnt']"));
		
		String rslt=result.getText();
		
		System.out.println(rslt);


		

	}

}