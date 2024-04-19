package myTYFirstPorject;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Default_Popup {
	public static void main(String[] args) throws InterruptedException {
//		//Default Alert
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
//		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
//		driver.findElement(By.id("buttonAlert2")).click();
//		Alert alt = driver.switchTo().alert();
//		System.out.println(alt.getText());
//		Thread.sleep(3000);
//		alt.accept();
//		driver.close();
//
//		//confirmation Alert
//		WebDriver driver1 = new ChromeDriver();
//		driver1.manage().window().maximize();
//		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
//		driver1.get("https://demoapps.qspiders.com/ui/alert/confirm?sublist=1");
//		driver1.findElement(By.id("buttonAlert5")).click();
//		Alert alt1 = driver1.switchTo().alert();
//		Thread.sleep(3000);
//		System.out.println(alt1);
//		alt1.accept();
//		
		//Prompt Alert
		WebDriver driver2 = new ChromeDriver();
		driver2.manage().window().maximize();
		driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver2.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
		driver2.findElement(By.id("buttonAlert1")).click();
		Alert alt2 = driver2.switchTo().alert();
		alt2.sendKeys("no");
		alt2.accept();
		WebElement textdataElement=driver2.findElement(By.xpath("//p[@class='pt-2 text-center']"));
		System.out.println(textdataElement.getText());
		
	}
}
