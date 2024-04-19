package myTYFirstPorject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SubmitClick {
public static void main(String[] args) {
	
		
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
			driver.get("https://demoapps.qspiders.com/ui/button/buttonSubmit?sublist=3");
			
			WebElement submit=driver.findElement(By.id("sat1"));
			Actions actions=new Actions(driver);
			actions.click(submit).build().perform();
			WebElement submitbuttonElement=driver.findElement(By.id("btn40"));
			submitbuttonElement.click();
			

			WebElement submit1=driver.findElement(By.id("prob2"));
			actions.click(submit1).build().perform();
			WebElement submitbuttonElement1=driver.findElement(By.id("btn41"));
			submitbuttonElement1.click();
			
			WebElement submit3=driver.findElement(By.id("r5"));
			actions.click(submit3).build().perform();
			WebElement submitbuttonElement2=driver.findElement(By.id("btn42"));
			submitbuttonElement2.click();
			
			
			
}}
