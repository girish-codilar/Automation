package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bas {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.name("q"));
		ele.sendKeys("thanos");
		ele.submit();
//		driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		
		
		driver.findElement(By.className("c3yYr")).click();
		
		Thread.sleep(30000);
		driver.findElement(By.className("c3yYr")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("c3yYr")).click();
		Thread.sleep(30000);
		driver.findElement(By.className("c3yYr")).click();
	}

}
