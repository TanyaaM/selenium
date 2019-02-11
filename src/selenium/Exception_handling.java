package selenium;

		import org.openqa.selenium.By;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class Exception_handling {

			public static void main(String[] args) throws InterruptedException{
				try{
				
				System.setProperty("webdriver.chrome.driver","G:\\Selenium\\chromedriver.exe");
				 ChromeDriver driver = new ChromeDriver();
				 driver.get("http://gmail.com");
				 String x =driver.getTitle();
				 Thread.sleep(5000);
				 System.out.println(x);
				 driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("rupalikashyap14@gmail.com");
				 driver.findElement(By.xpath(".//*[@id='next']")).click();
				 
				}catch(Throwable e){
					System.out.println();
					e.printStackTrace();
				}
						 
				 System.out.println("after");
				 
				

			}

		}
//finally
//driver.quit();
	
