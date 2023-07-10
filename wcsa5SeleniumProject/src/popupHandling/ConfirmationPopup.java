package popupHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// launch the browser
		WebDriver driver = new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();
		// apply implicit wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// launch the web application
		driver.get("file:///C:/Users/Admin/Documents/Confirmationpopup.html");
		
		driver.findElement(By.xpath("//button[text()='click Me']")).click();
		Thread.sleep(2000);
		
		//driver.switchTo().alert().accept();
		
		Robot robot = new Robot();
		
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
		
		robot.keyPress(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
		

		
		
	}

}
