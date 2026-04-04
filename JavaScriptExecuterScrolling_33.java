package Selenium_2.Selenium_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class JavaScriptExecuterScrolling_33 {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.com/Owala-FreeSip-Insulated-Stainless-BPA-Free/dp/B0BZYCJK89/?_encoding=UTF8&pd_rd_w=m0gKe&content-id=amzn1.sym.9929d3ab-edb7-4ef5-a232-26d90f828fa5&pf_rd_p=9929d3ab-edb7-4ef5-a232-26d90f828fa5&pf_rd_r=Z64GWR3D0ADADQ1C91PV&pd_rd_wg=7LQHA&pd_rd_r=9a30c729-fb06-4f84-8129-849089b9c318&ref_=pd_hp_d_btf_crs_zg_bs_284507&th=1");
	
	//When use jse -> if we get Element intercepted Exception
		JavascriptExecutor js=(JavascriptExecutor)driver;
//		System.out.println(js.executeScript("return window.pageYOffset;"));
//		js.executeScript("window.scrollBy(0,1500)", "");
//		System.out.println(js.executeScript("return window.pageYOffset;"));//pagexOffset
		
		//Scroll the page till element is visible
		WebElement SignInBtn=driver.findElement(By.xpath("//h2[@class='a-carousel-heading']"));
//		js.executeScript("arguments[0].scrollIntoView()", SignInBtn);
//		System.out.println(js.executeScript("return window.pageYOffset;"));
//	
         //bottom of page		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");//horizontal - scrollWidth
		System.out.println(js.executeScript("return window.pageYOffset;"));
	
		//scrolling up to initial position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
}
}
