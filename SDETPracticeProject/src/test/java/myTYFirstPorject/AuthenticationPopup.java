package myTYFirstPorject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	driver.get("https://demoapps.qspiders.com/ui/auth?sublist=0");
	String usernameString="admin";
	String passwordString="admin";
	String uRLString="https://"+usernameString+":"+passwordString+"@"+"https://basic-auth-git-main-shashis-projects-4fa03ca5.vercel.app/";
	driver.get(uRLString);}
}
