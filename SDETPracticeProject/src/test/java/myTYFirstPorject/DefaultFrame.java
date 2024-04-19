package myTYFirstPorject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DefaultFrame {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='w-full h-96']")));
	driver.findElement(By.id("username")).sendKeys("irshad");
	driver.findElement(By.id("password")).sendKeys("irshad@123");
//	driver.findElement(By.id("submitButton")).click();
//	driver.switchTo().defaultContent();
}
}
