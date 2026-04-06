package Selenium_2.Selenium_2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator_47 {
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//button[@id='wzrk-confirm']")).click();
	String filepath = System.getProperty("user.dir"+"\\src\\main\\java\\Selenium_2\\Selenium_2\\Data\\fdData.xlsx");
	
	int rows=ExcelUtils_46.getRowCount(filepath, "Sheet1");
	
	for(int  r=1;r<=rows;r++) {
		//read data from excel
		String pric=ExcelUtils_46.getCellData(filepath, "Sheet1", r, 0);
		String rateOfInterest=ExcelUtils_46.getCellData(filepath, "Sheet1", r, 1);
		String periods=ExcelUtils_46.getCellData(filepath, "Sheet1", r, 2);
		String In=ExcelUtils_46.getCellData(filepath, "Sheet1", r, 3);
		String Frequency=ExcelUtils_46.getCellData(filepath, "Sheet1", r, 4);
		String MaturityValue=ExcelUtils_46.getCellData(filepath, "Sheet1", r, 5);
		String expected=ExcelUtils_46.getCellData(filepath, "Sheet1", r, 6);
		
		//pass above data into application
		driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(pric);
		driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rateOfInterest);
		driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(periods);
		
		Select perdrp= new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
		perdrp.selectByVisibleText(In);
		
		Select fredrp= new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
		fredrp.selectByVisibleText(Frequency);
		
		driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click();
		//validation
		String act_value = driver.findElement(By.xpath("span[id='resp_matval'] strong")).getText();
		
		if(Double.parseDouble(expected)==Double.parseDouble(act_value)) {
			System.out.println("Test Passed");
			ExcelUtils_46.setCellData(filepath, "Sheet1", r, 7, "Pass");
			ExcelUtils_46.fillGreenColor(filepath, "Sheet1", r, 7);
		}
		else {
			System.out.println("Test Failed");
			ExcelUtils_46.setCellData(filepath, "Sheet1", r, 7, "Fail");
			ExcelUtils_46.fillRedColor(filepath, "Sheet1", r, 7);
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@class='PL5']")).click();
	}
	driver.quit();
}
}
