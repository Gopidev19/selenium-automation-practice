package Task;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBox_5 {
public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	
	//Select All the checkBox
	List<WebElement> checkBox=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	
	//select all options
	for(WebElement check:checkBox)
		check.click();
	
	//select specific options
	for(WebElement check:checkBox) {
		if(check.getAttribute("value").equals("sunday") || check.getAttribute("value").equals("saturday"))
			check.click();
	}
	
	//UnSelect selected Days
	for(WebElement check:checkBox) {
		if(check.isSelected())
			check.click();
	}
	
}
}
