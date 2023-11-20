package seleniumJava;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver dr =new ChromeDriver();
dr.get("https://www.saucedemo.com/v1/");
dr.manage().window().maximize();
// using Relative Xpath
/*dr.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
dr.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
dr.findElement(By.xpath("//input[@type='submit']")).click();*/
// Absoulate X path

dr.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/form/input")).sendKeys("standard_user");
dr.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
dr.findElement(By.cssSelector("input#login-button")).click();
dr.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[3]/button")).click();
Thread.sleep(3000);
dr.findElement(By.xpath("//*[local-name()='svg']")).click();
dr.findElement(By.linkText("CHECKOUT")).click();//using link text
dr.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Saidur");
dr.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Rahman");
dr.findElement(By.cssSelector("input#postal-code")).sendKeys("1205");
dr.findElement(By.xpath("//input[@class='btn_primary cart_button']")).click();
dr.findElement(By.linkText("FINISH")).click();
	}
	


}
