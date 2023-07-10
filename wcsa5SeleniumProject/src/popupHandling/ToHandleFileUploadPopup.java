package popupHandling;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleFileUploadPopup {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// launch the browser
		WebDriver driver = new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();
		// apply implicit wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// launch the web application
		driver.get("http://omayo.blogspot.com/");
		
		Actions act = new Actions(driver);
		WebElement uploadButton = driver.findElement(By.id("uploadfile"));
		act.doubleClick(uploadButton).perform();
		
	    Runtime.getRuntime().exec("./autoItPrograms/OmayoFileUpload.exe");

        
        
	}

}