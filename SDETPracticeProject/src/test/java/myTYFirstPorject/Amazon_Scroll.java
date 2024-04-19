package myTYFirstPorject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_Scroll {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
//	Thread.sleep(4000);
//	WebElement optionElement=driver.findElement(By.xpath("//span[text()='Up to 50% off | Curated furniture to enhance your home from stores near you']"));
		Actions act = new Actions(driver);
//	act.scrollByAmount(0, 900).perform();
		act.scrollToElement(driver.findElement(By.xpath("//span[@class='navFooterBackToTopText']")))
				.click(driver.findElement(By.xpath("//span[@class='navFooterBackToTopText']"))).build().perform();

	}
}
