package com.EdbAutomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathpractice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.icc-cricket.com/rankings/team-rankings/mens/odi");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		Thread.sleep(4000);
		List<WebElement> teams = driver.findElements(By.xpath("//span[@class='si-fname si-text']"));
		String Country = "Sri Lanka";
		boolean flag = false;
		for (WebElement allteams : teams) {
			if (Country.equalsIgnoreCase(allteams.getText())) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println("Country is present");
		} else {
			System.out.println("Country is not present");
		}

	}

}

//for(WebElement Team:teams) {
//	String name=Team.getText();
//	
//	
//	if(name.equalsIgnoreCase("Sri Lanka")) {
//		System.out.println("Sri Lanks Team is Present");
//	}else {
//		System.out.println("Teams is not present");
//	}
