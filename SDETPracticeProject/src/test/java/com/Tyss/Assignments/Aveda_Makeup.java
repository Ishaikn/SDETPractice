package com.Tyss.Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aveda_Makeup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.aveda.de/products/17976/best-sellers");
		driver.findElement(By.xpath("//button[.='Ablehnen']")).click();
		Thread.sleep(2000);
//		Actions action = new Actions(driver);
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeAsyncScript("window.scrollBy(0,300)");
//		WebElement makeup = driver.findElement(By.xpath("//div[@class='mpp-filter-set__choices']//a[.=' Makeup ']"));
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOf(makeup));
//		js.executeScript("argument[0].click()", makeup);
//		action.click(makeup).perform();
		List<WebElement> allProducts = driver.findElements(By.xpath("//a[@class='js-spp-link']"));
		for (WebElement product : allProducts) {
			System.out.println(product.getText());
		}
	}
}
//public static void main(String[] args) {
//	WebDriver driver=new ChromeDriver();
//	driver.manage().window().maximize();
//	
//	driver.get("https://www.aveda.de/");
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	driver.findElement(By.xpath("//div[@class='block block-nodeblock block-nodeblock-6656 block-nodeblock-96 block-template-site-header-menu-category-v1']/descendant::a[text()='BESTSELLER']")).click();
//	WebElement makeup=driver.findElement(By.xpath("//div[@class='mpp-filter-set__choices']/child::a[text()=' Makeup ']"));
//	makeup.click();


