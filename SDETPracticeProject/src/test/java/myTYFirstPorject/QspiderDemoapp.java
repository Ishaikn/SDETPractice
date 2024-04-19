package myTYFirstPorject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QspiderDemoapp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/");

	WebElement Explore=driver.findElement(By.xpath("//div[text()='Explore more']/../..//p[text()='UI Testing Concepts']"));
	Explore.click();

WebElement name=driver.findElement(By.id("name"));
	name.sendKeys("Irshad Basha S");
	WebElement email=driver.findElement(By.id("email"));
	email.sendKeys("ishaikn@gmail.com");
	WebElement password=driver.findElement(By.id("password"));
	password.sendKeys("Aairah@123");
	WebElement Register=driver.findElement(By.xpath("//button[text()='Register']"));	
	Register.click();
//	WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(3));
//	wait.until(ExpectedConditions.urlToBe("https://demoapps.qspiders.com/ui/login"));
////Thread.sleep(2000);	
	Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(10)).ignoring(ElementNotInteractableException.class);
	WebElement LoginEmail=driver.findElement(By.id("email"));
	LoginEmail.click();
	}

}
