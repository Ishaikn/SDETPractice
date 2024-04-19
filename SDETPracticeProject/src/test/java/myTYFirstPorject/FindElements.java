package myTYFirstPorject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	driver.get("https://demoapps.qspiders.com/ui");
	
	driver.findElement(By.xpath("//section[text()='Text Box']")).click();
	
	List<WebElement> optionsElements=driver.findElements(By.xpath("//p[text()='Scenarios']/../..//p[contains(text,'Write a script')]"));
	
	for(WebElement option:optionsElements) {
		String textString=option.getText();
	System.out.println(textString);
	}
	
}
}
