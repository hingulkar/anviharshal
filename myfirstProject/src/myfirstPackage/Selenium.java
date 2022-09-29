package myfirstPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sony\\eclipse-workspace\\myfirstProject\\src\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  
		  
		  
		  driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		  WebElement country =  driver.findElement(By.xpath("//div[@class='CeEBt Ce1Y1c eU809d']"));
		  
		  Select s = new Select (country);
		 s.selectByVisibleText("Dansk");
		  
		  System.out.println("s.selectByVisibleText(\"Dansk\")");
	  
	  
	  
	  
		  
		  
//		 if(TAG.equals("button") )
//		 {
//			 System.out.println("pass");
//		 }
//		 else {
//			 System.out.println("fail");
//		 }
	}
	
}
