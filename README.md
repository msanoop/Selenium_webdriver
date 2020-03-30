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
		dr.close();	
	}
}
