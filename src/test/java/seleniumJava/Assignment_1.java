package seleniumJava;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class Assignment_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // webdriver initialization
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		String ExpectedUrl="https://www.saucedemo.com/v1/";
		d.get("https://www.saucedemo.com/v1/");
		String ActualUrl=d.getCurrentUrl();
		//System.out.println(ActualUrl);
		d.manage().window().maximize();
		//if(ActualUrl.equals(ExpectedUrl)){
			//System.out.println("URL matched");
		//}
		//else {
			//System.out.println("URL not matched");
		//}
		//Assert.assertEquals(ActualUrl,ExpectedUrl,"Matched");
		//username
		d.findElement(By.name("user-name")).sendKeys("standard_user");
	}

}
