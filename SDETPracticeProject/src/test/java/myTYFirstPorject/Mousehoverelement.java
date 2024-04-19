package myTYFirstPorject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehoverelement {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/mouseHover?sublist=0");

		WebElement hoverElement = driver.findElement(By.xpath("//img[@src='/assets/message-hint-J20Zlhln.png']"));
		Actions action = new Actions(driver);
		action.moveToElement(hoverElement).perform();
		List<WebElement> textsElements = driver
				.findElements(By.xpath("//div[@class='w-[30vw] absolute left-80 bg-white rounded-2xl shadow-md']//li"));
		for (WebElement option : textsElements) {
			System.out.println(option.getText());
			driver.close();
		}
	}
}
