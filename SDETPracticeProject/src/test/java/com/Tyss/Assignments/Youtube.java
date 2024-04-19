package com.Tyss.Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement Search = driver.findElement(By.xpath("//input[@id='search']"));
		Search.click();
		Search.sendKeys("song");
		Search.sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//div[.='song new']")).click();
	}
}
