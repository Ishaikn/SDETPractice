	package myTYFirstPorject;

import java.awt.Frame;
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

public class NestedFrame {
	public static void main(String[] args) throws IOException, InterruptedException {
		
	
	WebDriver driver=new ChromeDriver();	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='w-full h-96']")));
	String emailElement=driver.findElement(By.xpath("//p[text()='Admin@gmail.com']")).getText();
	String passwordString=driver.findElement(By.xpath("//p[text()='Admin@1234'][1]")).getText();
	String confirmpasswordString=driver.findElement(By.xpath("//p[text()='Admin@1234'][2]")).getText();
	driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='form_container']/iframe")));
	driver.findElement(By.id("email")).sendKeys(emailElement);
	driver.findElement(By.id("password")).sendKeys(passwordString);
	driver.findElement(By.id("confirm-password")).sendKeys(confirmpasswordString);
	Thread.sleep(3000);
	driver.findElement(By.id("submitButton")).click();
	
	String timeString=LocalDateTime.now().toString().replace(':', '-');
	TakesScreenshot tssScreenshot=(TakesScreenshot)driver;
	File Temp=tssScreenshot.getScreenshotAs(OutputType.FILE);
	File permFile=new File("./TestYantra/"+timeString+"Iframe.png");
	FileUtils.copyFile(Temp, permFile);
//	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='w-full h-96']")));
//	String passwordString=driver.findElement(By.xpath("//p[text()='Admin@1234']/ancestor::div[@class='form_container']")).getText();
//	String passwordString=driver.findElement(By.xpath("//p[text()='Admin@1234' and @class='para']/following::p[text()='Default Confirm Password']")).getText();
}
}
//p[text()='Admin@1234' and @class='para']/following::p[text()='Default Confirm Password']
////p[.='Default Confirm Password']/following-sibling::p[@class='para']