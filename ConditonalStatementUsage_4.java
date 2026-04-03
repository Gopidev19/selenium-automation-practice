package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditonalStatementUsage_4 {
public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
	
	//Launch Browser
	driver.get("https://testautomationpractice.blogspot.com/");
	//Maximize the Browsere
	driver.manage().window().maximize();
	
	//isDisplay Method
	System.out.println(driver.findElement(By.xpath("//img[@class='wikipedia-icon']")).isDisplayed());
	
	//Select the Day
	WebElement checkbox=driver.findElement(By.xpath("//input[@id='sunday']"));
	
	//Check the check box isEnable Method
	System.out.println(checkbox.isEnabled());
	
	//Click the sunday checkbox
	checkbox.click();
	System.out.println("After clicked and check selected or not : "+checkbox.isSelected());
	
}
}
