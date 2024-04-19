package myTYFirstPorject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickandHoldcircle {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0&scenario=1");
		WebElement Circle = driver.findElement(By.id("circle"));
		Actions actions = new Actions(driver);
		actions.clickAndHold(Circle).pause(3000).release().perform();
		driver.close();
	}
}
