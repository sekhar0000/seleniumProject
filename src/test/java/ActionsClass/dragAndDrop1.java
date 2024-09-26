package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
	    driver.manage().window().maximize();
	
	    Thread.sleep(50);
	    Actions act=new Actions(driver);
	    
WebElement source=	    driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement  target=          driver.findElement(By.xpath("//div[@id='droppable']"));

	act.dragAndDrop(source, target).perform();
	}

}
