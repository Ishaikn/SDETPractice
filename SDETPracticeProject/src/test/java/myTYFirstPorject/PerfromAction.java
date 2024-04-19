package myTYFirstPorject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerfromAction {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	driver.get("https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1");
	
	WebElement rightclickElement=driver.findElement(By.id("btn30"));
	Actions actions=new Actions(driver);
	actions.contextClick(rightclickElement).perform();
	WebElement yesElement=driver.findElement(By.xpath("//div[text()='Yes']"));
	yesElement.click();
	
	WebElement textString=driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']"));
	
	
	
//	if() {
//		actions.contextClick().perform();
//	}else {
//		System.out.println("Yes option not available");
//	}}
}
}

