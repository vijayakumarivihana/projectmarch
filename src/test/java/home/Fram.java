package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fram {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Viji\\eclipse-workspace\\class\\target\\sathvik\\msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();	
		WebDriverManager.edgedriver().setup();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		
		 driver.switchTo().frame("frame1");
		 driver.switchTo().frame("frame3");
		 driver.findElement(By.id("//input[@id='a']")).click();
		 driver.switchTo().parentFrame();
		 String text=driver.findElement(By.xpath("//b[@id='topic']")).getText();
		 System.out.println(text);
		 driver.switchTo().defaultContent();
		 String text1=driver.findElement(By.xpath("//span[text()='not a friendly Topic']")).getText();
		 System.out.println(text1);
	}
		 
		
	}
	


