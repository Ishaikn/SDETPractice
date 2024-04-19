package myTYFirstPorject;

import java.time.Duration;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Textfield {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		WebElement Name = driver.findElement(By.id("name"));
		Actions act = new Actions(driver);
		act.sendKeys(Name, "Irshad").sendKeys(Keys.TAB).sendKeys("irshad@gmail.com").sendKeys(Keys.TAB)
				.sendKeys("Aairah@123").sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
driver.close();
	}
}
