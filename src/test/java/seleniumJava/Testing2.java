package seleniumJava;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Testing2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver var=new ChromeDriver();
var.get("https://trytestingthis.netlify.app/");
var.manage().window().maximize();
Thread.sleep(3000);
/*var.findElement(By.id("fname")).sendKeys("Saidur");
//var.findElement(By.id("lname")).sendKeys("Rahman");
//var.findElement(By.id("male")).click();
//checking radio button enable or not
var.findElement(By.id("male")).isEnabled();
System.out.println( var.findElement(By.id("male")).isEnabled());
//checking male button is selected or not
	assert var.findElement(By.id("male")).isSelected();
	System.out.println( var.findElement(By.id("male")).isSelected());*/
//dropdown selection
WebElement dropdown=var.findElement(By.id("option"));
Select testDrop=new Select(dropdown);
//select by index
//testDrop.selectByIndex(3);
//select by value
//testDrop.selectByValue("option 2");
//select by visible text
testDrop.selectByVisibleText("Option 1");
	}
	

}
