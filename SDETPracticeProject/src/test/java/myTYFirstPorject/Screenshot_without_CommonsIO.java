package myTYFirstPorject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class Screenshot_without_CommonsIO {
public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	driver.get("https://duckduckgo.com/");
	WebElement element=driver.findElement(By.xpath("//h2[text()='Switch to DuckDuckGo. It’s private and free!']"));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(element));
	element.click();
	File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File permFile=new File("C:/Users/ishai/OneDrive/Desktop/screen1.png");
	Files.copy(screenshotFile, permFile);
}
}
