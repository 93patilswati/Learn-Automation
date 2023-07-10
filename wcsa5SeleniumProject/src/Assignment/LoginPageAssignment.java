package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageAssignment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(2000);
		 //To identify web element we use Locator
		 driver.findElement( By.id("email")).sendKeys("swati");
		 driver.findElement(By.id("pass")).sendKeys("swati123");
		 Thread.sleep(4000);
		 
		 driver.findElement(By.name("login")).click();
		 
		
	}

}
