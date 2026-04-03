package Task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_LinkandImage_PartialLink_3 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
	//Count the Link
	List links=driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	
	//Count the Image
	List Image=driver.findElements(By.tagName("img"));
	System.out.println(Image.size());
	
	//Click the product by using linkText
	driver.findElement(By.linkText("Fashion")).click();
}
}
