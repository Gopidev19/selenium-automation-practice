package Selenium_2.Selenium_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class JavaScriptExecuter_32 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	
	WebElement inputBox = driver.findElement(By.xpath("//input[@id='name']"));
	
	//When use jse -> if we get Element intercepted Exception
	JavascriptExecutor js=(JavascriptExecutor)driver;
	//Alternative of sendKeys method
	js.executeScript("arguments[0].setAttribute('value','gopi')", inputBox);
	//Alternative of Click method
	WebElement maleRatio = driver.findElement(By.xpath("//input[@id='male']"));
	js.executeScript("arguments[0].click()", maleRatio);
}
}
