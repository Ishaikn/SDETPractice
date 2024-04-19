package myTYFirstPorject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SRC_Resourcefileupload {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	driver.get("https://demoapps.qspiders.com/ui/fileUpload/multiple?sublist=3");
	WebElement fILElement=driver.findElement(By.id("fileInput"));
	fILElement.sendKeys(System.getProperty("user.dir")+"/src/main/resources/1.xlsx");
}
}
