package myTYFirstPorject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LanguageSpecific {
public static void main(String[] args) {
	ChromeOptions options = new ChromeOptions();
//	options.addArguments("--headless");
	options.addArguments("--incognito");
	options.addArguments("--lang=De");
	WebDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.google.in/");	
}
}
