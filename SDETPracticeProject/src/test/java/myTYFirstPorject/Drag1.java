package myTYFirstPorject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag1 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=1");

		WebElement dragElement = driver.findElement(By.xpath("//section[text()='Drag & Drop']"));
		dragElement.click();
		Thread.sleep(4000);
		WebElement dragposition = driver.findElement(By.xpath("//a[text()='Drag Multiple']"));
		dragposition.click();

		WebElement Source = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement targtElement = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));

		Actions actions = new Actions(driver);
		actions.dragAndDrop(Source, targtElement).build().perform();

//		WebElement Source1 = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
//		WebElement targtElement1 = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
//		WebElement Source2 = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
	}
}