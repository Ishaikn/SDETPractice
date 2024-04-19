package myTYFirstPorject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseHover_tooltip {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/mouseHover/mouseHoverimage?sublist=1");
		WebElement imagElement = driver.findElement(By.xpath("//img[@title='Order Placed Image']"));
		String textString = imagElement.getAttribute("Title");
		System.out.println(textString);
		driver.close();
	}
}
