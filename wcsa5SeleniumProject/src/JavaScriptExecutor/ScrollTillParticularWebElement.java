package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTillParticularWebElement {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		 //apply implicit wait
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 //Launch the web Application
		 driver.get("https://www.selenium.dev/");
		 //identify webElement
		WebElement newselement = driver.findElement(By.xpath("//h2[text()='News']")); 
		
	}

}
