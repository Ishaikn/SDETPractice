package myTYFirstPorject;

import java.awt.Desktop.Action;
import java.time.Duration;

import javax.security.auth.kerberos.KerberosTicket;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class NotificationPopup {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
	WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://demoapps.qspiders.com/ui/browserNot?sublist=0");
		WebElement notificationElement = driver.findElement(By.id("browNotButton"));
		notificationElement.click();
	
	}
}
