package myTYFirstPorject;

import java.util.Set;

import org.openqa.selenium.WebDriver;
//this method is used to switch from one window to another windiow using URL
public class WebDriverUtility {

	public void switchwindow(WebDriver driver, String Url) {
		Set<String> widSet = driver.getWindowHandles();
		for (String window : widSet) {
			driver.switchTo().window(window);
			String textString = driver.getCurrentUrl();
			if (textString.contains(Url)) {
				break;
			}
		}
	}
}
