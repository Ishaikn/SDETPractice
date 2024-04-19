package myTYFirstPorject;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemowindowHandles {
public static void main(String[] args) {

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
	String parentString=driver.getWindowHandle();
	System.out.println("Parent window"+parentString);
	driver.findElement(By.id("browserLink1")).click();
	Set<String> allwindoSet=driver.getWindowHandles();
	
}
}
