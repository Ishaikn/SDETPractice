package myTYFirstPorject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {
public static void main(String[] args) throws InterruptedException{
	
	
	WebDriver driver=new ChromeDriver();	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	driver.get("https://demoapps.qspiders.com/");

	WebElement Explore=driver.findElement(By.xpath("//div[text()='Explore more']/../..//p[text()='UI Testing Concepts']"));
	Explore.click();
	
	WebElement Framesoption=driver.findElement(By.xpath("//section[text()='Frames']"));
	Framesoption.click();
	
	WebElement iFrames=driver.findElement(By.xpath("//section[text()='iframes']"));
	iFrames.click();
	
	WebElement nestedFrames=driver.findElement(By.xpath("//a[text()='Multiple iframe']"));
	nestedFrames.click();
	
	driver.switchTo().frame(driver.findElement(By.xpath("(//iframe)[1]")));
	
	Thread.sleep(4000);
	WebElement emailtext=driver.findElement(By.id("email"));
	emailtext.sendKeys("Admin@gmail.com");
	
	WebElement PasswordtextElement=driver.findElement(By.id("password"));
	PasswordtextElement.sendKeys("Admin@1234");
	
	WebElement ConfirmPassword=driver.findElement(By.id("confirm-password"));
	ConfirmPassword.sendKeys("Admin@1234");
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame(driver.findElement(By.xpath("(//iframe)[2]")));
	
	WebElement login=driver.findElement(By.id("username"));
	login.sendKeys("Admin@gmail.com");
	
	WebElement Password=driver.findElement(By.id("username"));
	Password.sendKeys("Admin@1234");
	
	WebElement loginbuttonElement=driver.findElement(By.id("submitButton"));
	loginbuttonElement.submit();
	
	driver.close();
}
}

