package myTYFirstPorject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v120.systeminfo.SystemInfo;

public class ValidatePlaceHolder {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	driver.get("https://demoapps.qspiders.com/ui?scenario=4");
	WebElement placeholderString=driver.findElement(By.id("name"));
	String attri=placeholderString.getAttribute("placeholder");
	
	System.out.println(attri);
	if(attri.equalsIgnoreCase("Enter your name")) {
		System.out.println("placeholder available");
	}
	else {
		System.out.println("placeholder not available");
	}
	
	
}
}
