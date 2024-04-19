package myTYFirstPorject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.get("https://demoapps.qspiders.com/");

		WebElement Explore=driver.findElement(By.xpath("//div[text()='Explore more']/../..//p[text()='UI Testing Concepts']"));
		Explore.click();
		
		WebElement syncoptionElement=driver.findElement(By.xpath("//section[text()='Synchronization']"));
		syncoptionElement.click();
		
		WebElement progressoption=driver.findElement(By.xpath("//section[text()='Progress Bar']"));
		progressoption.click();
		
		WebElement timeoption=driver.findElement(By.xpath("//a[text()='With Element']"));
		timeoption.click();
		
		WebElement timesElement=driver.findElement(By.xpath("//input[@placeholder='Enter time in seconds']"));
		timesElement.click();
		timesElement.sendKeys("10");
		
		WebElement startElement=driver.findElement(By.xpath("//button[text()='Start']"));
		startElement.click();
	//learn how to play and pause for some time.
		
//		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
		Thread.sleep(5);
		WebElement EndElement=driver.findElement(By.xpath("//button[text()='Reset']"));
		EndElement.click();
	}
}
