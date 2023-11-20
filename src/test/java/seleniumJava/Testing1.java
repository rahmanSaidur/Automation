package seleniumJava;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class Testing1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
//Webdriver intialization
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	String ExpectedTitle="Labs";
	driver.get("https://www.saucedemo.com/v1/");
	//driver.navigate().to("https://www.saucedemo.com/v1/");
	driver.manage().window().maximize();
	String ActualTitle=driver.getTitle();
	//if(ExpectedTitle.equals(ActualTitle)) {
		//System.out.println("Title Matched");
	//}
	//else {
		//System.out.println("Title not Matched");
	//}
	//assertion use
	Assert.assertEquals(ActualTitle,ExpectedTitle,"Condition Matched");
	
	
	//Thread.sleep(3000);
	//username
	//driver.findElement(By.id("user-name")).sendKeys("standard_user");
	//password
	//driver.findElement(By.id("password")).sendKeys("secret_sauce");
	//login click
	//driver.findElement(By.id("login-button")).click();
	//driver.navigate().refresh();
	//driver.navigate().back();
	// driver.quit();
	}

}
