package home;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;

public class www {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Viji\\eclipse-workspace\\class\\target\\sathvik\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		WebDriverManager.edgedriver().setup();
//		WebDriver driver= new ChromeDriver();
		
		String url="https://www.facebook.com/";
		driver.get(url);
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.findElement( By.xpath("//a[contains(text(),'password?')]"));
		WebDriverWait explicit =new WebDriverWait(driver,Duration.ofSeconds(3));
		WebElement v=explicit.until(ExpectedConditions.presenceOfElementLocated(By.id("mail")));
		v.sendKeys("vihana");
		

}}
