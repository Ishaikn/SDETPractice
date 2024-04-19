package myTYFirstPorject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KeyBoardActions_01 {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless");
		options.addArguments("--incognito");
		options.addArguments("--lang=te");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/keyboard?sublist=0&scenario=1");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("hi1@gmail.com");
		email.sendKeys(Keys.CONTROL, "AC");
		driver.findElement(By.id("password")).sendKeys(Keys.CONTROL + "V");

		WebElement passwordElement = driver.findElement(By.id("confirmPassword"));
		passwordElement.sendKeys(Keys.CONTROL + "V", Keys.ENTER);
//	passwordElement.sendKeys(Keys.CONTROL+"A",Keys.CONTROL+"C");

	}
}
