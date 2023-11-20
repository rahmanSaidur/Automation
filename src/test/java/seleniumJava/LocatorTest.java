package seleniumJava;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver dr=new ChromeDriver();
		dr.get("https://github.com/login");
		dr.manage().window().maximize();
		Thread.sleep(3000);
		//dr.findElement(By.linkText("Forgot password?")).click();
		dr.findElement(By.cssSelector("#login_field")).sendKeys("sagornstu21.sr@gmail.com");

	}

}
