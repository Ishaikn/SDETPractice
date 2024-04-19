package myTYFirstPorject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownvalidation {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/dropdown");

		WebElement allcountyElements = driver.findElement(By.id("select3"));
		Select sel = new Select(allcountyElements);
		List<WebElement> alloptionsElements = sel.getOptions();
		System.out.println(alloptionsElements.size());
		boolean flag = false;// when we need to hide the boolean condition
		for (WebElement county : alloptionsElements) {
			String text = county.getText();
			if (text.equalsIgnoreCase("India")) {
				flag = true;
				break;
			}
			if (flag) {
				System.out.println("Country is available ");
			} else {
				System.out.println("Country is not available ");
			}
		}
	}
}
