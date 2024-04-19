package myTYFirstPorject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import javax.imageio.spi.RegisterableService;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Captcha {
	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://demoapps.qspiders.com/");
		WebElement Explore = driver
				.findElement(By.xpath("//div[text()='Explore more']/../..//p[text()='UI Testing Concepts']"));
		Explore.click();
		WebElement Captchaoption = driver.findElement(By.xpath("//section[text()='Captcha']"));
		Captchaoption.click();
		Thread.sleep(3000);
		WebElement Namefield = driver.findElement(By.id("name"));
		Namefield.sendKeys("irshad");
		WebElement emailfieldElement = driver.findElement(By.id("email"));
		emailfieldElement.sendKeys("ishaikn9@gmail.com");
		WebElement passwordfieldElement = driver.findElement(By.id("password"));
		passwordfieldElement.sendKeys("Aairah@123");

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
		Thread.sleep(4000);

		driver.findElement(By.cssSelector(".recaptcha-checkbox-border")).click();

		driver.switchTo().defaultContent();
//	Actions actions=new Actions(driver);
//	actions.scrollByAmount(0, 100);
		Thread.sleep(4000);
		WebElement register = driver.findElement(By.xpath("//button[text()='Register']"));
		register.submit();

		String time = LocalDateTime.now().toString().replace(':', '-');
		TakesScreenshot tss = (TakesScreenshot) driver;
		File tempFile = tss.getScreenshotAs(OutputType.FILE);
		File permFile = new File("./TestYantra/" + time + "Captch.png");
		FileUtils.copyFile(tempFile, permFile);
		driver.quit();

	}
}
