package home;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertaa {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Viji\\eclipse-workspace\\class\\target\\sathvik\\msedgedriver.exe");
		EdgeDriver ed = new EdgeDriver();
		WebDriverManager.edgedriver().setup();
		
		 String url = "https://demo.automationtesting.in/Alerts.html";
         ed.get(url);
      
         ed.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
         org.openqa.selenium.Alert alert = ed.switchTo().alert();
         alert.dismiss();

         ed.findElement(By.xpath("(//a[@data-toggle=\"tab\"])[2]")).click();
         ed.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
         String text =alert.getText();
         System.out.println(text);
         alert.dismiss();
         
         ed.findElement(By.xpath("//a[contains(text(),'Alert with Textbox ')]")).click();
         ed.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
         String text1 =alert.getText();
         System.out.println(text1);
         alert.accept();

	
	}

}
