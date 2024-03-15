package home;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actandrob {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Viji\\eclipse-workspace\\class\\target\\sathvik\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		WebDriverManager.edgedriver().setup();
		
		String url="https://www.facebook.com/";
		driver.get(url);
		driver.navigate().to(url);
		WebElement element = driver.findElement(By.id("email"));
//		element.sendKeys("vihana");
		
		Actions vi= new Actions(driver);
		vi.sendKeys(element,"vijayakumari");
		vi.doubleClick(element).build().perform();
		vi.contextClick().perform();
		
		Robot ji =new Robot();
//				
		for(int i=0; i<3; i++) {
			ji.keyPress(KeyEvent.VK_DOWN);
			ji.keyRelease(KeyEvent.VK_DOWN);
		}
	ji.keyPress(KeyEvent.VK_ENTER);
	ji.keyRelease(KeyEvent.VK_ENTER);
	
	ji.keyPress(KeyEvent.VK_TAB);
	ji.keyRelease(KeyEvent.VK_TAB);
	
	ji.keyPress(KeyEvent.VK_CONTROL);
	ji.keyRelease(KeyEvent.VK_V);
	
	ji.keyPress(KeyEvent.VK_CONTROL);
	ji.keyRelease(KeyEvent.VK_V);
		
	
	}
     


}