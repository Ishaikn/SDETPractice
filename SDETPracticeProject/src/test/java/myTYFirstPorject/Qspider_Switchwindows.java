package myTYFirstPorject;

import java.net.URL;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Qspider_Switchwindows {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		driver.findElement(By.id("browserLink1")).click();
		
		WebDriverUtility utility=new WebDriverUtility();//using Webutility class object for reusability
		utility.switchwindow(driver, "SignUpPage");
//		Set<String> allwindowSet = driver.getWindowHandles();
//		for(String window:allwindowSet) {
//			driver.switchTo().window(window);
//		String urlname=driver.getCurrentUrl();
//		if(urlname.contains("SignUpPage")) {
//			break;
//		}
//		}
		
		driver.findElement(By.id("email")).sendKeys("ishaikn@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Aairah@123");
		driver.findElement(By.id("confirm-password")).sendKeys("Aairah@123");
		driver.findElement(By.xpath("//button[.='Sign Up']")).click();
	}
}
