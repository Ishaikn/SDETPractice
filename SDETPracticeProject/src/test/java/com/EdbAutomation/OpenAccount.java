package com.EdbAutomation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenAccount {

	public static WebDriver driver;

	public static void main(String[] args) throws IOException {

//		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\OpenAccount.properties");
		Properties Pobj = new Properties();

		Pobj.setProperty("browser", "chrome");
		Pobj.setProperty("url", "http://rmgtestingserver/domain/Online_Banking_System/index.php");

		FileOutputStream fout = new FileOutputStream(".\\src\\test\\resources\\OpenAccount.properties");
		Pobj.store(fout, "data");
		String Browser = Pobj.getProperty("browser");
		String URL = Pobj.getProperty("url");

		if (Browser.equals("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		} else {
			System.out.println(" ");
		}
		driver.get(URL);
		driver.findElement(By.xpath("//li[text()='Open Account']")).click();

		WebElement titleText = driver.findElement(By.xpath("//h3[text()='Online Account Opening Form']"));
		String Actual = "Online Account Opening Form";
		if (titleText.getText().equals(Actual)) {
			System.out.println("Dear Customer Please proceed with further Account Opening Process");
		} else {
			System.out.println("Please check the WebPage to be Tested");
		}

		FileInputStream Excel = new FileInputStream(".\\src\\test\\resources\\Testdata.xlsx");
		Workbook wrk = WorkbookFactory.create(Excel);
		Sheet sht1 = wrk.getSheet("EDB");

		sht1.createRow(1).createCell(0).setCellValue("irshad");
		sht1.getRow(1).createCell(1).setCellValue("Aairah");
		sht1.getRow(1).createCell(2).setCellValue("India");
		sht1.getRow(1).createCell(3).setCellValue("Punganur");
		sht1.getRow(1).createCell(4).setCellValue("Andhra");

		FileOutputStream fout1 = new FileOutputStream(".\\src\\test\\resources\\Testdata.xlsx");
		wrk.write(fout1);

		wrk.close();

	}
}

//Pobj.setProperty("staffid", "210001");
//Pobj.setProperty("staffpwd", "password");