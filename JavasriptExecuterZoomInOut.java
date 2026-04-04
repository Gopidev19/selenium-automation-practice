package Selenium_2.Selenium_2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavasriptExecuterZoomInOut {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("document.body.style.zoom='50%'");
	Thread.sleep(5000);
	js.executeScript("document.body.style.zoom='80%'");
	
}
}
