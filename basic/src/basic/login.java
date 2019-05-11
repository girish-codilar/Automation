package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.flipkart.com/");
		 
		 List<WebElement> ele= driver.findElements(By.tagName("img"));
		 
		 for(WebElement d:ele)
		 {
			 String e=d.getAttribute("src");
			 System.out.println(e);
			 
		 }
		 
//		 for(int i=0;i<ele.size();i++) {
//			 String var = ele.getAttribute("innerHTML");
//			 System.out.println(var);
//		 }
		 
		 
		 driver.close();
	}

}
