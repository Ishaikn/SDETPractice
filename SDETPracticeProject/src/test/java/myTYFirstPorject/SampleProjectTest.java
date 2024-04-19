package myTYFirstPorject;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleProjectTest {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String time=LocalDateTime.now().toString().replace(':', '-');
		driver.get("https://www.Testyantra.com");
		TakesScreenshot tss=(TakesScreenshot)driver;
		File temp=tss.getScreenshotAs(OutputType.FILE);
		File perm=new File("./TestYantra/"+time+"sample.png");
		FileUtils.copyFile(temp, perm);
		driver.close();
	}
}
