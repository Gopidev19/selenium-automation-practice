package Task;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethodUage_WindowHandles_5 {
public static void main(String[] args) throws InterruptedException {

	WebDriver driver = new ChromeDriver();
	
	//Launch Browser
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	//Maximize the Browsere
	driver.manage().window().maximize();
	
	//Implicity Wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//Enter username 
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	//Enter password 
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	//Click Login Button
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
    List<String> ids=new ArrayList(driver.getWindowHandles());
	
	driver.switchTo().window(ids.get(1));//switch to Home page
	
	driver.findElement(By.xpath("//a[@class='oxd-main-menu-item']//span[text()='PIM']")).click();
	
	Thread.sleep(5000);
	
	//Close all Windows
	driver.quit();
}
}
