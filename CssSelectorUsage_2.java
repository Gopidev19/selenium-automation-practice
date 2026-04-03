package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorUsage_2 {
public static void main(String[] args) {

	/*Css Selectors - Cascading Style Sheets
	 * Tag and Id              ->  tag#id
	 * Tag and Class           ->  tag.classname
	 * Tag and Attribute       ->  tag[attribute=value]
	 * Tag,Class and Attribute ->  tag.classname[attribute=value]
	 */
	
	WebDriver driver = new ChromeDriver();
	
	//Launch Browser
	driver.get("https://www.flipkart.com/");
	//Maximize the Browsere
	driver.manage().window().maximize();
	
	//Locate search box using Tag and Id ->  tag.id  
	driver.findElement(By.cssSelector("input#Search")).sendKeys("Laptop");
	
	//Locate search box using Tag and class ->  tag.class  
	driver.findElement(By.cssSelector("input.nw1UBF-v1zwn25")).sendKeys("Laptop");
	
	//Locate search box using Tag and Attribute -> tag[attribute=value]  
	driver.findElement(By.cssSelector("Input[placeholder='Search']")).sendKeys("tshirt");
	
	
	//Tag,Class and Attribute ->  tag.classname[attribute=value]
	driver.findElement(By.cssSelector("input.nw1UBF-v1zwn25[placeholder='Password']")).sendKeys("Kurta");
	    
}
}
