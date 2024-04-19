package myTYFirstPorject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
//	WebElement multiDrop=driver.findElement(By.xpath("//select[@id='select-multiple-native' and @aria-invalid='false']/child::option[text()='Canada']"));
	WebElement multiDrop=driver.findElement(By.xpath("//label[contains(.,'Country')]"));
	
	Thread.sleep(4000);
	Select optionSelect=new Select(multiDrop);
//	List<WebElement> options=Drop.getOptions();
//	for(WebElement element:options) {
//		String list=element.getText();
//		System.out.println(list);
//		Drop.selectByVisibleText("Canada");
//		Drop.selectByVisibleText("Germany");
//	}
optionSelect.selectByValue("Canada");
optionSelect.selectByValue("Germany");

}
}
