package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_Selenium {

	public static void main(String[] args) throws InterruptedException {
 System.setProperty("webdriver.chrome.driver","G:\\Selenium\\chromedriver.exe");
 ChromeDriver driver=new ChromeDriver();  //calling a constructor
 
driver.get("http:\\gmail.com");
String titletext=driver.getTitle();
System.out.println(titletext);   //titletext-actual result
if(titletext.equals("Gmail"))
{
	System.out.println("Title testcase pass");
}else
{
	System.out.println("Title tescase fails");
}
String pholder=driver.findElement(By.xpath("//*[@id='Email']")).getAttribute("placeholder");
System.out.println(pholder);

//driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("tanya123mahajan");;
WebElement email=driver.findElement(By.xpath("//*[@id='Email']"));

//driver.findElement(By.xpath("//*[@id='next']")).click();

WebElement next=driver.findElement(By.xpath("//*[@id='next']"));
email.sendKeys("tanya123mahajan@gmail.com");
next.click();
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id='Passwd']")).sendKeys("m@gicworld");
driver.findElement(By.xpath("//*[@id='signIn']")).click();
Thread.sleep(15000);

driver.findElement(By.xpath("//*[text()='COMPOSE']")).click();
driver.findElement(By.xpath("//*[@class='vO']")).sendKeys("tanya123mahajan@gmail.com");
driver.findElement(By.xpath("//*[@class='aoT']")).sendKeys("test");
driver.findElement(By.xpath("//*[@class='Am Al editable LW-avf']")).sendKeys("Hello");
driver.findElement(By.xpath("//*[@id='nz']")).click();
Thread.sleep(15000);

}
}



