package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class disense {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Viji\\eclipse-workspace\\class\\target\\sathvik\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		WebDriverManager.edgedriver().setup();
		
		String url="https://www.facebook.com/";
		driver.get(url);
		driver.navigate().to(url);
		boolean   displayed=driver.findElement(By.id("email")).isDisplayed();
		System.out.println(displayed);
		
//		boolean enabled=driver.findElement(By.xpath("//input[@name='pass']")).isEnabled();
//		System.out.println(enabled);
//		
		boolean  enabled=driver.findElement(By.xpath("//button[text()='Log in']")).isEnabled();
		System.out.println(enabled);
		
//		boolean displayed2 = driver.findElement(By.xpath("//input[@name='pass']")).isDisplayed();
//        System.out.println(displayed2);
		 WebElement element2 = driver.findElement(By.xpath("//a[@id='u_0_0_9Z']"));
		 element2.click();
	boolean selected = driver.findElement(By.xpath("(//input[(@type='radio')])[1]")).isSelected();
	System.out.println(selected);
	}
		
}

		
	
