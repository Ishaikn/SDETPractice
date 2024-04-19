package myTYFirstPorject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions_actionclass {
	public static void main(String[] args) throws AWTException {
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://demoapps.qspiders.com/ui/keyboard?sublist=0&scenario=1");
//		Actions action = new Actions(driver);
//		WebElement Element = driver.findElement(By.id("email"));
//		action.sendKeys(Element,"irshad1@gmail.com").keyDown(Keys.CONTROL).sendKeys(Element,"ax").keyUp(Keys.CONTROL).sendKeys(Keys.TAB).perform();
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		robot.keyRelease(KeyEvent.VK_ESCAPE);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyRelease(KeyEvent.VK_DOWN);
	//		robot.keyPress(KeyEvent.VK_DOWN);
	//		robot.keyPress(KeyEvent.VK_DOWN);
	//		robot.keyPress(KeyEvent.VK_DOWN);
	//		robot.keyRelease(KeyEvent.VK_TAB);
	//		robot.keyRelease(KeyEvent.VK_DOWN);
			
//		robo	t.keyPress(KeyEvent.VK_W);
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		robot.keyRelease(KeyEvent.VK_W);
		
		
//		driver.findElement(By.id("password")).sendKeys(Keys.CONTROL + "V");cmd
//		driver.findElement(By.id("confirmPassword")).sendKeys(Keys.CONTROL + "V");
	}
}
//Keys.TAB,Keys.CONTROL+"V",Keys.TAB,Keys.CONTROL+"V"