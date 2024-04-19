package myTYFirstPorject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedwithMultiple {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://demoapps.qspiders.com/ui/frames/nestedWithMultiple?sublist=3");

		driver.switchTo().frame(driver.findElement(By.xpath("(//iframe)[1]")));
		String emailString = driver.findElement(By.xpath("//p[text()='Admin@gmail.com']")).getText();
		String Password = driver.findElement(By.xpath("//p[text()='Admin@1234']")).getText();
		String ConfirmPassword = driver.findElement(By.xpath("//p[text()='Admin@1234']")).getText();

		WebElement Frame1 = driver.findElement(By.xpath("//div[@class='form_container']/iframe"));
		driver.switchTo().frame(Frame1);
		driver.switchTo().frame(0);
//		driver.switchTo().frame(driver.findElement(By.xpath("(//iframe)[1]")));
		driver.findElement(By.id("email")).sendKeys(emailString);
		driver.switchTo().parentFrame();

		driver.switchTo().frame(1);
//		driver.switchTo().frame(driver.findElement(By.xpath("(//iframe)[2]")));
		driver.findElement(By.id("password")).sendKeys(Password);
		driver.switchTo().parentFrame();

		driver.switchTo().frame(2);
//		driver.switchTo().frame(driver.findElement(By.xpath("(//iframe)[3]")));
		driver.findElement(By.id("confirm")).sendKeys(ConfirmPassword);
		driver.switchTo().parentFrame();

		driver.switchTo().frame(3);
//		driver.switchTo().frame(driver.findElement(By.xpath("(//iframe)[4]")));
		Thread.sleep(3000);
		driver.findElement(By.id("submitButton")).click();

		driver.switchTo().defaultContent();

		driver.close();
	}
}
