package Selenium_2.Selenium_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessTesting_37 {
	public static void main(String[] args) {
		
		//Headless testing mean browser not open but get output
		//Advantage -> we can run multiple task and Faster execution
		//DisAdv -> User cannot see the actions on the page. So, we cannot understand flow / functionality of the test

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");//setting for headless mode of execution

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://demo.nopcommerce.com/");
        
        String Title=driver.getTitle();
    	System.out.println("Current Title :"+Title);//Print the Current Title
    	
    	//Validate the Title
    	if(Title.equals("Just a moment..."))
    		System.out.println("Boolean True,Current and Given Title is Matching");
    	else
    		System.out.println("Boolean False,Current and Given Title is Not Matching");

        driver.quit();
    }
}
