package myTYFirstPorject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemosingeFrame {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	driver.get("https://demo.automationtesting.in/Frames.html");
	
	driver.switchTo().frame(driver.findElement(By.id("singleframe")));
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hi");
}	
}

//input[@type='text']/parent::div
////input[@type='text']/ancestor::div[@class='container']