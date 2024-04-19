package myTYFirstPorject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Month;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.EqualsMethod;

public class SelectDateandTime {
public static void main(String[] args) throws Exception {
//	String targetdate="22-March-2020";// usually java doesnt understand this as a date
//	SimpleDateFormat dateFormat=new SimpleDateFormat("dd-mm-yyyy");//we need to create date formate
//	dateFormat.setLenient(false);
//	try {
//	Date userDate=dateFormat.parse(targetdate);}
//	catch (Exception e) {
//		
//		throw new Exception("Invalid date");
//		
//	}
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoapps.qspiders.com/");
	WebElement Explore=driver.findElement(By.xpath("//div[text()='Explore more']/../..//p[text()='UI Testing Concepts']"));
	Explore.click();
	
	WebElement dateoption=driver.findElement(By.xpath("//section[text()='Date & Time Picker']"));
	dateoption.click();
	
	WebElement datepickerElement=driver.findElement(By.xpath("//section[text()='Date Picker']"));
	
	datepickerElement.click();
	
		
	while(true) {
		String textString=driver.findElement(By.xpath("//*[@id=\"demoUI\"]/main/section/article/aside/div/aside/div/article/div/div[2]/div[2]/div/div/div[2]/div[1]/div[1]")).getText();
		if(textString.equals("Month")) {
			break;
		}
	}
	
}
}





//initially we need to validate the user input date and if any issue we have to throw the date and then select the date