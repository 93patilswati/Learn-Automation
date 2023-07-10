package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ouestion1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// launch the browser
		WebDriver driver = new ChromeDriver();
		// Maximize the browser
		driver.manage().window().maximize();
		// apply implicit wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// launch the web application
		driver.get("http://omayo.blogspot.com/");
		//get the handle or address of current or parent window.
		String parenthandle = driver.getWindowHandle();
		System.out.println("Address of parent window:"+parenthandle);
		
		//launch the child window
		WebElement childWindow = driver.findElement(By.linkText("Open a popup window"));
		
		Point elementLoc = childWindow.getLocation();
		
		int xaxix = elementLoc.getX();
		int yaxis = elementLoc.getY();
		
		//Scroll till
	}

}
