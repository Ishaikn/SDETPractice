package myTYFirstPorject;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonalllinkcsCapture {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://www.amazon.in/");
		int count = 0;
		List<WebElement> alllinksElements = driver.findElements(By.xpath("//a"));
		for (WebElement links : alllinksElements) {
			count++;
			System.out.println(links.getText());
		}
		System.out.println(count);

	}
}
