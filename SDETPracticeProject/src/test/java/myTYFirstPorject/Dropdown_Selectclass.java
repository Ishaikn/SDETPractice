package myTYFirstPorject;

import java.sql.Driver;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

public class Dropdown_Selectclass {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://demoapps.qspiders.com/ui/dropdown");

		WebElement element = driver.findElement(By.id("select1"));

		Select sel = new Select(element);
//	sel.selectByIndex(4);
//	sel.selectByValue("+92");
		sel.selectByVisibleText("+91");
		driver.findElement(By.id("phone")).sendKeys("9035922895");
		WebElement element1 = driver.findElement(By.id("select2"));
		WebElement gender = driver.findElement(By.xpath("//option[text()='Select Gender']"));
		Select sel1 = new Select(element1);
		sel1.selectByValue("male");

		WebElement element3 = driver.findElement(By.id("select3"));

		Select se12 = new Select(element3);
		se12.selectByIndex(7);

		List<WebElement> statesElements = driver.findElements(By.id("select5"));
		List<String> stateopton = new ArrayList<String>();
		for (WebElement alloptionsElement : statesElements) {
			stateopton.add(alloptionsElement.getText());
		}
		Collections.sort(stateopton);
		for(String aaa:stateopton) {
			System.out.println(aaa);
		}

//	WebElement element5=driver.findElement(By.id("select5"));
//	Select sel5=new Select(element5);
//	sel5.selectByValue("Andhra Pradesh");
//	
//	WebElement element6=driver.findElement(By.xpath("//label[text()='City']/../..//div"));
//	Select sel6=new Select(element6);
//	sel6.selectByValue("Chittoor");
//	
//	WebElement element4=driver.findElement(By.id("select7"));
//	Select sel4=new Select(element4);
//	sel4.selectByVisibleText("3");
	}
}
