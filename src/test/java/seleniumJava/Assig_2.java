package seleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assig_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver dr=new ChromeDriver();
dr.get("https://trytestingthis.netlify.app/");
dr.manage().window().maximize();
Thread.sleep(3000);
//insert first name and last name
WebElement txt_1=dr.findElement(By.id("fname"));
txt_1.sendKeys("Saidur");
WebElement txt_2=dr.findElement(By.id("lname"));
txt_2.sendKeys("Rahman");
//radio button selection
WebElement rb=dr.findElement(By.id("male"));
rb.click();
//confirmation of button selection
System.out.println(rb.isSelected());
//dropdown 
WebElement drop=dr.findElement(By.id("option"));
Select list=new Select(drop);
//dropdown selection using index
list.selectByIndex(2);
//checklist option3
WebElement checkbox=dr.findElement(By.name("option3"));
checkbox.click();

	}

}
