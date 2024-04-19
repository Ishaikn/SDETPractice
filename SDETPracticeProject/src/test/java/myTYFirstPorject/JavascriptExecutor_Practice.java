package myTYFirstPorject;

import java.security.KeyStoreSpi;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor_Practice {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/ref=nav_logo");

		// Launch the application
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("window.location=arguments[0]", "https://www.amazon.in/ref=nav_logo");

		// toScroll
//		jss.executeAsyncScript("window.scrollBy (0, 5000)");

		// scrollto till the bottom of the page
		jss.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		// scrollto top of the page
		jss.executeScript("window.scrollTo(0,0)");

		// scroll Till Element
		WebElement element = driver.findElement(By.xpath("//span[text()='Best Sellers in Books']"));
		jss.executeScript("arguments[0].scrollIntoView(true);", element);

		String elementtextString = (String) jss.executeScript("return arguments[0].innerText;", element);
		System.out.println(elementtextString);

	}
}
