package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Viji\\eclipse-workspace\\class\\target\\sathvik\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		WebDriverManager.edgedriver().setup();
		
		String url="https://www.facebook.com/";
		driver.get(url);
		driver.manage().window().maximize();
//		driver.navigate().to("https://www.facebook.com/");
//		driver.navigate().back();
//	driver.navigate().forward();
//		driver.navigate().refresh();
driver.switchTo().newWindow (WindowType.TAB);
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println(currentUrl);
//		if(url.equals(currentUrl)) {
//			System.out.println("2url  is correct");
//			
//			
//		}
//		else {
//			System.out.println("2url  is rong");
//		}
//		String title = driver.getTitle();
//	System.out.println(title);
	driver.close();
//	driver.quit();
		
//		
//	 WebElement element = driver.findElement(
//	 element.sendKeys("vihana");
//		WebElement element = driver.findElement(By.xpath("//input[@name='email']"));
//		element.sendKeys("vihana");
//	 
//	 WebElement element1 = driver.findElement(By.id("pass"));
//	 element1.sendKeys("53667128");By.id("email"));
//	 
//	 WebElement element2 = driver.findElement(By.xpath("//button[text()='Log in']"));
//	 element2.click();
//	 
//	  WebElement element3 = driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]"));
//	 element3.click();
//	 
//	 String pageSource = driver.getPageSource();
// System.out.println(pageSource);
	 
	}
	

}
