package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sliders {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
	    driver.manage().window().maximize();
	   
	    Actions act =new Actions(driver);
WebElement min_slide= driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
 System.out.println("location of the min : "+ min_slide.getLocation());
 
    act.dragAndDropBy(min_slide,300, 0).perform();
    
    System.out.println("after sliding " +min_slide.getLocation());
	}

}
