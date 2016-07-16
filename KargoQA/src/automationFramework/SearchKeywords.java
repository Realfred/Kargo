package automationFramework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchKeywords {
@SuppressWarnings("resource")
public static void main(String[] args) throws IOException{
		
	FileReader file = new FileReader("[Kargo TEXT file here");
	BufferedReader br = new BufferedReader(file);
	
	
	String line;
	while ((line = br.readLine()) != null){
	String inputData = line;
	
	
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(inputData);
	driver.findElement(By.cssSelector(".lsb[type = 'submit']")).click();

	}
	
	}
}

	
	

	



