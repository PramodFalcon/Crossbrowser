package Crossbrowser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing {
	@Test
	public void test() throws Throwable {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		

		
		
		
		
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		Thread.sleep(1000);
		driver.quit();
		
		//commit
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
