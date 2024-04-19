package myTYFirstPorject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileuploadPopup {
	public static void main(String[] args) throws InterruptedException {	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	driver.get("https://demoapps.qspiders.com/");
	WebElement Explore=driver.findElement(By.xpath("//div[text()='Explore more']/../..//p[text()='UI Testing Concepts']"));
	Explore.click();
	
	WebElement popupoption=driver.findElement(By.xpath("//section[text()='Popups']"));
	popupoption.click();
	
	WebElement fileuploadoption=driver.findElement(By.xpath("//section[text()='File Uploads']"));
	fileuploadoption.click();
	
	//using send keys when input type is input
	driver.findElement(By.xpath("//input[@id='fileInput']")).sendKeys("D:\\Trello.xlsx");
	
//	//when there is input type is not input
//	
//	//using robot class method
//	
//	//using Javascript method to click
//	Thread.sleep(3000);
//	WebElement button=driver1.findElement(By.xpath("//input[@id='fileInput']"));
//	
//	JavascriptExecutor jssExecutor=(JavascriptExecutor)driver;
	
	
}
}
//when popup is with input type is file then we can use directly Send keys options

