package popupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// launch the browser
		WebDriver driver = new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();
		// apply implicit wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// launch the web application
		driver.get("file:///C:/Users/Admin/Documents/AlertPopup.html");
		
		driver.findElement(By.xpath("//button[text()='ALert']")).click();
		
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		//al.accept();
		//al.dismiss();
		System.out.println(al.getText());	
		


	}

}
