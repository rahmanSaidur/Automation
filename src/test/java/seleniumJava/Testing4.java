package seleniumJava;

import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testing4 {
WebDriver driver;
@BeforeTest
public void init() {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.get("https://www.saucedemo.com/v1/");
	driver.manage().window().maximize();
	String title=driver.getTitle();
	System.out.println("Title is "+title);
}
@Test
public void Titlecheck() {
	
	String ExpectedTitle="Swag Labs";
	String ActualTitle=driver.getTitle();
Assert.assertEquals(ActualTitle, ExpectedTitle,"Code run succesfully");
}

@Test
public void xCheckURL() {
	String ExpectedUrl="https://www.saucedemo.com/v1/";
	String ActualUrl=driver.getCurrentUrl();
	Assert.assertEquals(ActualUrl, ExpectedUrl,"Code run");
}

}
