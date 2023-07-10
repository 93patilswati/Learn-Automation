package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetFlixLoginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.netflix.com/in/");
		 
	     driver.findElement(By.name("email")).sendKeys("swati123@gmail.com");
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.cssSelector(" e1ax5wel1 default-ltr-cache-1xbj91c")).click();
	}

}
