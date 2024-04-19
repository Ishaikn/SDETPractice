package myTYFirstPorject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class isMutiple {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1&scenario=2");

		WebElement countrydropdownElement = driver.findElement(By.id("select-multiple-native"));
		Select select = new Select(countrydropdownElement);

		if (select.isMultiple()) {
			select.selectByValue("Canada");
			select.selectByValue("India");
			select.selectByValue("Germany");
			List<WebElement> selectdropdownElements = select.getAllSelectedOptions();

			for (WebElement option : selectdropdownElements) {
				System.out.println("Selected Country" + option.getText());
			}
		} else {
			System.out.println("Selected County is not available in the List");
		}
	}
}
