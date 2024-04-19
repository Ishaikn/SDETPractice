package myTYFirstPorject;

import java.awt.Robot;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload_Custom {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	driver.get("https://demoapps.qspiders.com/ui/fileUpload/multiple?sublist=3");
	WebElement fILElement=driver.findElement(By.id("fileInput"));
	fILElement.sendKeys("C:\\Users\\ishai\\OneDrive\\Desktop\\1.xlsx");
	fILElement.sendKeys("C:\\Users\\ishai\\OneDrive\\Desktop\\2.xlsx");
	List<WebElement> filesElements=driver.findElements(By.xpath("//h2[text()='Selected Files:']//following-sibling::ul//li"));
	
	for(WebElement option:filesElements) {
		System.out.println("Uploaded files are: "+option.getText());
	}
	
}
}

//when we want to upload any file which is in the src/test/resources
//we need to use (System.get.Property("user.dir")+"pathof src fil");