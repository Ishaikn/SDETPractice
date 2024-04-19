package myTYFirstPorject;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows_Qsp {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleWindow?sublist=2&scenario=4");
		driver.findElement(By.id("browserButton3")).click();
		
		WebDriverUtility utility = new WebDriverUtility();
		
		utility.switchwindow(driver, "SignUp");
		driver.findElement(By.id("username")).sendKeys("Irshad");
		driver.findElement(By.id("email")).sendKeys("ishaikn@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Aairah@123");
		driver.findElement(By.xpath("//button[.='Sign Up']")).click();

		utility.switchwindow(driver, "Login");
		driver.findElement(By.id("username")).sendKeys("Irshad");
		driver.findElement(By.id("password")).sendKeys("Aairah@123");
		driver.findElement(By.xpath("//button[.='Login']")).click();

		utility.switchwindow(driver, "SignUpPage");
		driver.findElement(By.id("email")).sendKeys("ishaikn@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Aairah@123");
		driver.findElement(By.id("confirm-password")).sendKeys("Aairah@123");
		driver.findElement(By.xpath("//button[.='Sign Up']")).click();

	}
}
