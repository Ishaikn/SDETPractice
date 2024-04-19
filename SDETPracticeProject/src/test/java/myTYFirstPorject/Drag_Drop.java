package myTYFirstPorject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToMultiple?sublist=2");
		Thread.sleep(3000);
		List<WebElement> sourceElements = driver.findElements(By.className("draggable-elemment"));
		WebElement mobileaccessoriesElement = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		WebElement laptopaccessoriesElement = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		Actions actions1 = new Actions(driver);
		for (WebElement optionElement : sourceElements) {
			if (optionElement.getText().contains("Mobile")) {
				actions1.clickAndHold(optionElement).dragAndDrop(optionElement, mobileaccessoriesElement).release()
						.build().perform();
			} else {
				System.out.println("NA");
//				actions1.click(optionElement).dragAndDrop(optionElement, laptopaccessoriesElement).build().perform();
				//need to use Robot class
			}
		}
		driver.close();
	}
}
