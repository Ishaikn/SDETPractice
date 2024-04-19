package myTYFirstPorject;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPractice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://www.amazon.in/");
//		Thread.sleep(15000);
		WebElement Search = driver.findElement(By.id("twotabsearchtextbox"));
		Search.sendKeys("IPhone", Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Green']")).click();
		Set<String> allwindows = driver.getWindowHandles();

		for (String option : allwindows) {
			String title = driver.switchTo().window(option).getTitle();

			if (title.contains("iPhone 13")) {
				break;
			}

		}
		List<WebElement> colors = driver.findElements(By.xpath("//img[@class='imgSwatch']"));
		for(WebElement phone:colors) {
			System.out.println(phone.getAttribute("alt"));
		}
	}
}
