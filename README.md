# Selenium_webdriver
Repository for selenium web driver test
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
				
		dr.get("http://facebook.com");
		//dr.findElement(By.id("email")).sendKeys("anoop@facebook.com");
		//dr.findElement(By.id("pass")).sendKeys("123456789");
		dr.findElement(By.name("email")).sendKeys("ms@fb.com");
		dr.findElement(By.name("pass")).sendKeys("123");
		dr.close();		
	}
}
