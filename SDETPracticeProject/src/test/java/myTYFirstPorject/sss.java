package myTYFirstPorject;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.sdk.metrics.internal.concurrent.AdderUtil;

public class sss {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
	
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	
//	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("select3"))));
	WebElement elements=driver.findElement(By.id("select3"));
	
	
	Select sel=new Select(elements);
	List<WebElement> ooo = sel.getOptions();
	List<String> a = new ArrayList<String>();
	for(WebElement ppp:ooo) {
		System.out.println(ppp.getText());
	a.add(ppp.getText());
	}
	Collections.sort(a);
	System.out.println(a);
	}
}

