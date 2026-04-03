package Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_ValidateTitle_01 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	
	//Launch Browser
	driver.get("https://www.flipkart.com/");
	//Maximize the Browsere
	driver.manage().window().maximize();
	
	//Get Current Url
	String Url=driver.getCurrentUrl();
	System.out.println("Current Url of Page : "+Url);
	
	//Capture the Title
	String Title=driver.getTitle();
	System.out.println("Current Title :"+Title);//Print the Current Title
	
	//Validate the Title
	if(Title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"))
		System.out.println("Boolean True,Current and Given Title is Matching");
	else
		System.out.println("Boolean False,Current and Given Title is Not Matching");
	
	driver.close();
}
}
