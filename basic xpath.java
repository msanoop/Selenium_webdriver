import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sel3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "c://geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("https://login.salesforce.com/?locale=in");
		dr.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("abc.com");
		dr.findElement(By.xpath("//*[@id='password']")).sendKeys("1234");
		dr.findElement(By.xpath("//*[@id='Login']")).click();
		System.out.println(dr.findElement(By.xpath("//*[@id='error']")).getText());
					
		dr.close();
	}

}
