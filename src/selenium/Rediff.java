package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rediff {

	public static void main(String[] args) throws InterruptedException {
 System.setProperty("webdriver.chrome.driver","G:\\Selenium\\chromedriver.exe");
 ChromeDriver driver=new ChromeDriver();  //calling a constructor
 
driver.get("http:\\shopping.rediff.com");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
WebElement Mobiles=driver.findElement(By.xpath(".//*[@id='topcat3']"));
WebElement Electronics=driver.findElement(By.xpath(".//*[@id='topcat4']"));
WebElement Watches=driver.findElement(By.xpath(".//*[@id='topcat5']"));
Thread.sleep(5000);
Actions actions= new Actions(driver);
actions.moveToElement(Mobiles).build().perform();

Thread.sleep(5000);
actions.moveToElement(Electronics).build().perform();

Thread.sleep(5000);
actions.moveToElement(Watches).build().perform();






	}
}


