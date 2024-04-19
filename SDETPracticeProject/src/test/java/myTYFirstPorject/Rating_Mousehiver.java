package myTYFirstPorject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rating_Mousehiver {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/mouseHover/rating?sublist=2");
		WebElement starElement = driver.findElement(By.xpath("//input[@value='5']//parent::label"));
		Actions actions = new Actions(driver);
		actions.moveToElement(starElement).click(starElement).build().perform();

		WebElement reviewElement = driver.findElement(By.xpath("//textarea[@placeholder='Description']"));
		reviewElement.sendKeys("Testing automation");
		driver.close();
	}
}