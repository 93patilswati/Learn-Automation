package methidsOfWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandlesMethod {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.linkText("Open a popup window")).click();
		Thread.sleep(2000);
		//get the handle or address of child window only.
	  Set<String> allhandles = driver.getWindowHandles();	
	   for(String wh : allhandles)
	   {
		   
	   }

	}

}
