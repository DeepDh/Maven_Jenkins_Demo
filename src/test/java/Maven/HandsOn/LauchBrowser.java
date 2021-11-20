package Maven.HandsOn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LauchBrowser {

	@Test
	public void Launch_Test() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Open URL using get method
		driver.get("https://www.nopcommerce.com/en");

		driver.manage().window().maximize();
		
		// Capture title of the page
		System.out.println("Title of page is : " + driver.getTitle());
		
		Assert.assertEquals(driver.getTitle(),"Free and open-source eCommerce platform. ASP.NET based shopping cart. - nopCommerce");

		driver.quit();
	}

}
