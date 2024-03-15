package home;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script {
	public static void main(String[] args) throws Throwable  {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Viji\\eclipse-workspace\\class\\target\\sathvik\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		WebDriverManager.edgedriver().setup();
		
		String url="https://www.facebook.com/";
		driver.get(url);
//		driver.manage().window().maximize();
		WebElement user=driver.findElement(By.id("email"));
		WebElement password=driver.findElement(By.id("pass"));
		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("arguments[0].setAttribute('value','viji')", user,password,login);
		j.executeScript("arguments[1].setAttribute('value','****')", user,password,login);
		j.executeScript("arguments[0].setAttribute('style','background:pink')", user,password,login);
		
		j.executeScript("arguments[1].setAttribute('style','background:pink;border:2px solid red')", user,password,login);
	j.executeScript("arguments[2].click()", user,password,login);
//		
//		Object ele=j.executeScript("return arguments[0].getAttribute('value')",user,password,login);
//		System.out.println(ele);
//		WebElement down=driver.findElement(By.xpath("//a[text()='Careers']"));
//		j.executeScript("arguments[0].scrollIntoView(true)",down);
//		Thread.sleep(5000);
////		j.executeScript("arguments[0].scrollIntoView(false)",user);
////		Thread.sleep(5000);
//		j.executeScript("arguments[2].click()", user,password,login);
//		

}
}