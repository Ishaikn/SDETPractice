package myTYFirstPorject;

import java.awt.Window;
import java.text.BreakIterator;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import net.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.OfRecordComponent;

public class Practise_Browser {
public static void main(String[] args) {
	
	//opening one window another window
//	WebDriver driver = new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	driver.get("https://www.amazon.in/ref=nav_logo");
//	driver.switchTo().newWindow(WindowType.WINDOW);
//	driver.get("https://www.flipkart.com/");
//	driver.switchTo().newWindow(WindowType.WINDOW);
//	driver.get("https://www.facebook.com/");
//	driver.close();
	
//	//single window multiple tabs
//	WebDriver driver1 = new ChromeDriver();
//	driver1.manage().window().maximize();
//	driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	driver1.get("https://www.amazon.in/ref=nav_logo");
//	driver1.switchTo().newWindow(WindowType.WINDOW.TAB);
//	driver1.get("https://www.flipkart.com/");
//	driver1.switchTo().newWindow(WindowType.WINDOW.TAB);
//	driver1.get("https://www.facebook.com/");
//	driver1.close();

//	//5tabs open single
//	
//	for(int i=0;i<=4;i++) {
//		WebDriver driver2 = new ChromeDriver();
//	}
////	
	for(int i=0;i<=5;i++) {
		WebDriver driver3 = new ChromeDriver();
		driver3.switchTo().newWindow(WindowType.TAB);
		
	}
	
}
}
