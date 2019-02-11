package selenium;

	
		import java.util.Iterator;
		import java.util.Set;
		import java.util.concurrent.TimeUnit;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;


		public class Window_switch {

			public static void main(String[] args) throws InterruptedException{
			System.setProperty("webdriver.chrome.driver","G:\\Selenium\\chromedriver.exe");
			 ChromeDriver driver = new ChromeDriver();
			 driver.get("http:\\www.naukri.com");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			 
			 WebElement Recu = driver.findElement(By.xpath("//a[@title='Search Recruiters']"));
			 Recu.click();
			 Thread.sleep(5000);
			 
			 Set<String> WinId = driver.getWindowHandles();
			 System.out.println("Total Browser"+ WinId.size());
			 
			 Iterator<String> Itr = WinId.iterator();
			 String Win1= Itr.next();
			 String Win2= Itr.next();
			 String Win3= Itr.next();
			 String Win4 = Itr.next();
			 
			 driver.switchTo().window(Win3);
			 driver.close();
			 driver.switchTo().window(Win4);
			 driver.close();
			 Thread.sleep(5000);
			 
			 driver.switchTo().window(Win2);
			 //driver.switchTo().window(Win1);
			 
			 WebElement Skills = driver.findElement(By.xpath("//*[@class='sugInp']"));
			 Skills.sendKeys("Software Testing");
			 WebElement Location = driver.findElement(By.xpath("//*[@class='sugInp w135']"));
			 Location.sendKeys("Chandigarh");
			 WebElement Search = driver.findElement(By.xpath("//*[@id='qsbFormBtn']"));
			 Search.click();
			 Thread.sleep(5000);
			 Set<String> WinId1 = driver.getWindowHandles();
			 System.out.println("Total Browser"+ WinId1.size());
			
			 driver.switchTo().window(Win2);
			 driver.close();
			 Thread.sleep(5000);
			 
			 driver.switchTo().window(Win1);
			 
			 
			}
		}
		 
			 
			 

