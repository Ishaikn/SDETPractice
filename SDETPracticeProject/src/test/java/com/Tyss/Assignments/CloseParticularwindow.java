package com.Tyss.Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CloseParticularwindow {
	
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		int n = 9;
		for (int i = 0; i < n; i++) {
			driver.switchTo().newWindow(WindowType.TAB);
		}
		Set<String> allWindows = driver.getWindowHandles();
		List<String> windowHandlesList = new ArrayList<String>(allWindows);
		driver.switchTo().window(windowHandlesList.get(6));
		driver.close();

	}

}


//public static void main(String[] args) {
//	
//	
//	WebDriver driver=new ChromeDriver();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	openMultipleWindows(driver, 9);
//	Set<String> all = driver.getWindowHandles();
//	if(all.size()>=7) {
//		String seventhWindowHandle = (String)all.toArray()[6];
//        driver.switchTo().window(seventhWindowHandle);
//		driver.close();
//	}
//}	
//public static void openMultipleWindows(WebDriver driver, int numberOfWindows) {
//    // Check if the number of windows to open is valid
//    if (numberOfWindows <= 0) {
//        System.out.println("Number of windows should be greater than 0");
//        return;
//    }
//
//    // Create an instance of JavascriptExecutor
//    JavascriptExecutor js = (JavascriptExecutor) driver;
//
//    // Execute JavaScript to open multiple windows
//    for (int i = 0; i < numberOfWindows; i++) {
//        js.executeScript("window.open();");
//    }
//}