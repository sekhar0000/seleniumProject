package seleniumMethods;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts_popup {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		
		//Thread.sleep(3000);
		
		
		/*Alert myalert=driver.switchTo().alert();
		/*System.out.println(myalert.getText());
		myalert.accept();
		
		//confirmation alert   ok and cancel		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		Thread.sleep(3000);		
	     driver.switchTo().alert().dismiss();
	 	System.out.println(myalert.getText());
	 	
		*/
		//entering text into alert
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(3000);	
		Alert myalert=driver.switchTo().alert();
		myalert.sendKeys("hello raj");
		myalert.accept();
		
	}

}
