package myTYFirstPorject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPractice2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://www.flipkart.com/");
		WebElement Search = driver
				.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		Search.click();
		Search.sendKeys("shirt");
		Thread.sleep(3000);
		List<WebElement> suggestion = driver
				.findElements(By.xpath("//input[@placeholder='Search for Products, Brands and More']/../../following-sibling::ul//div/span/.."));
		for (WebElement shirts : suggestion) {
			System.out.println(shirts.getText());			
//			if (shirts.getText().contains("in Casual Shirts")) {
//				System.out.println(shirts.getText());
//				shirts.click();
			}
		}
	}

