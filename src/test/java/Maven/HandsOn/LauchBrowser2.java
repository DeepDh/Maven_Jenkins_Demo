package Maven.HandsOn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LauchBrowser2 {

	@Test
	public void Launch_Test() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Open URL using get method
		driver.get("https://www.nopcommerce.com/");

		driver.manage().window().maximize();
		
		// Capture the page source
		System.out.println("Source of page is : " + driver.getPageSource());

		driver.quit();
	}

}
