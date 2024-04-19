package myTYFirstPorject;

import java.sql.Driver;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Irctc_Popup {
	public static void main(String[] args) throws InterruptedException {
		// disable the notification of IRCTC
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://www.irctc.co.in/nget/train-search");
		WebElement Buses = driver.findElement(By.xpath("//a[.=' BUSES ']"));
		Buses.click();
//		
//		WebDriverUtility utility = new WebDriverUtility();
//		utility.switchwindow(driver, "home");

		driver.findElement(By.id("departFrom")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//div[.='Hyderabad']")).click();
		driver.findElement(By.id("goingTo")).sendKeys("Chennai");
		driver.findElement(By.xpath("//div[.='Chennai']")).click();
		driver.findElement(By.xpath("//span[.='Next']")).click();
		driver.findElement(By.xpath("//span[.='April']")).click();
		driver.findElement(By.xpath("//a[.='22']")).click();
//		driver.findElement(By.xpath("//button[.='Search Bus ']")).click();
//		driver.findElement(By.xpath("//i[@class='fa fa-angle-down']")).click();
		driver.close();
		
//		utility.switchwindow(driver, "train-search");
		
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
//		utility.switchwindow(driver, "https://www.air.irctc.co.in/");
		
		driver.findElement(By.id("stationFrom")).sendKeys("Bengaluru");
		driver.findElement(By.xpath("//div[text()='Bengaluru (BLR)']")).click();
		
		driver.findElement(By.id("stationTo")).sendKeys("New Delhi (DEL)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='New Delhi (DEL)']")).click();
		
		driver.findElement(By.xpath(null));
		


		
	}
}
//Set<String> allwindowSet = driver.getWindowHandles();
//for (String window : allwindowSet) {
//	driver.switchTo().window(window);
//	String urlname = driver.getCurrentUrl();
//	if (urlname.contains("home")) {
//		break;
//	}
//}