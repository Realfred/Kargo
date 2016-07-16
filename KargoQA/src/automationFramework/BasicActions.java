package automationFramework;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicActions {
	WebDriver driver; 
	String baseUrl;
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://www.google.com/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void test() {
		driver.get(baseUrl);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("kargo");
		driver.findElement(By.cssSelector("a[href*='www.kargo.com']")).click();
		driver.findElement(By.cssSelector(".homearrow>img[alt='scroll']")).click();
		
		
		
	}
	@After
	public void tearDown() throws Exception {
	}



}
