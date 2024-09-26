package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightClickOperation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	    driver.manage().window().maximize();
	    
	WebElement button=    driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
	Actions act=new Actions(driver);
	//context click method is nothing but right click operation
	
	act.contextClick(button).perform();
	
	//click on copy option
	
	driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
	
	Thread.sleep(3000);
	//close alert box
	
    driver.switchTo().alert().accept();
	
	
	}

}
