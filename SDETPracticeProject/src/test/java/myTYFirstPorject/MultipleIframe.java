package myTYFirstPorject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleIframe {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");

		String emailString = driver.findElement(By.xpath("//p[text()='Email:Admin@gmail.com']")).getText().substring(6);
		System.out.println(emailString);
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.id("email")).sendKeys(emailString);
		driver.switchTo().defaultContent();

		String passwordString = driver.findElement(By.xpath("//p[text()='Password : Admin@1234']")).getText()
				.substring(11);
		System.out.println(passwordString);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='w-full h-96']")));
		driver.findElement(By.id("password")).sendKeys(passwordString);
		driver.switchTo().defaultContent();

		String confirmpasswordString = driver.findElement(By.xpath("//p[text()='Confirm Password : Admin@1234']"))
				.getText().substring(19);
		System.out.println(confirmpasswordString);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='w-full h-96']")));
		driver.findElement(By.id("confirm-password")).sendKeys(confirmpasswordString);

		driver.findElement(By.id("submitButton")).click();

		String timeString = LocalDateTime.now().toString().replace(':', '-');
		TakesScreenshot tssScreenshot = (TakesScreenshot) driver;
		File Temp = tssScreenshot.getScreenshotAs(OutputType.FILE);
		File permFile = new File("./TestYantra/" + timeString + "Multiframe1.png");
		FileUtils.copyFile(Temp, permFile);

		driver.switchTo().defaultContent();

		String logineemailString = driver.findElement(By.xpath("//p[text()='Email:SuperAdmin@gmail.com']")).getText()
				.substring(6);
		System.out.println(logineemailString);
		driver.switchTo().frame(driver.findElement(By.xpath("(//iframe)[2]")));
		driver.findElement(By.id("username")).sendKeys(logineemailString);
		driver.switchTo().defaultContent();

		String loginpassword = driver.findElement(By.xpath("//p[text()='Password : SuperAdmin@1234']")).getText()
				.substring(11);
		System.out.println(loginpassword);
		driver.switchTo().frame(driver.findElement(By.xpath("(//iframe)[2]")));
		driver.findElement(By.id("password")).sendKeys(loginpassword);
		Thread.sleep(2000);
		driver.findElement(By.id("submitButton")).click();

		String timeString1 = LocalDateTime.now().toString().replace(':', '-');
		TakesScreenshot tssScreenshot1 = (TakesScreenshot) driver;
		File Temp1 = tssScreenshot1.getScreenshotAs(OutputType.FILE);
		File permFile1 = new File("./TestYantra/" + timeString1 + " Multiframe2.png");
		FileUtils.copyFile(Temp1, permFile1);

		driver.switchTo().defaultContent();

		driver.close();
	}
}
