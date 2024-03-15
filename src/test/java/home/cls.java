package home;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class cls {
	public static void main(String[] args) {
	System.setProperty("webdriver.edge.driver", "C:\\Users\\Viji\\eclipse-workspace\\class\\target\\sathvik\\msedgedriver.exe");
	WebDriver driver= new EdgeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	String pageSource = driver.getPageSource();
	System.out.println(pageSource);
	WebElement name = driver.findElement(By.id("email"));
	name.sendKeys("vijayakumari");
	WebElement num = driver.findElement(By.id("pass"));
	num.sendKeys("Vihana@123");
	WebElement log = driver.findElement(By.linkText("Forgotten password?"));
	log.click();
//	WebElement logo = driver.findElement(By.linkText("Forgotten "));
//	logo.click();
	List<WebElement> tag = driver.findElements(By.tagName("div"));
	for(int i=0;i<tag.size();i++) {
		WebElement linktext=tag.get(i);
		String text=linktext.getText();
		System.out.println(text);
	}
	}

}
