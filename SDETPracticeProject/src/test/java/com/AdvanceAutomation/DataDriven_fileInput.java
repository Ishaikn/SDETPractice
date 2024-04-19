package com.AdvanceAutomation;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DataDriven_fileInput {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\Readata.properties");
		Properties pobj = new Properties();
		pobj.load(fis);

		String Browser = pobj.getProperty("browser");
		String URL = pobj.getProperty("url");

		String username = pobj.getProperty("username");
		String Password = pobj.getProperty("password");

		if (Browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (Browser.equalsIgnoreCase("firefox")) {
			new FirefoxDriver();
		} else {
			System.out.println("Invalid browser ");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get(URL);
		WebElement User = driver.findElement(By.id("username"));
		User.clear();
		User.sendKeys(username);
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.clear();
		pwd.sendKeys(Password);

		try {
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		} catch (Exception tiger) {
			System.out.println("Please enter Valid Credentials");
		}
	}
}
