package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	    driver.manage().window().maximize();
	    Thread.sleep(50);
	   // driver.switchTo().frame("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//iframe[@class='demo-frame lazyloaded']");
	    
	    Thread.sleep(50);
	    Actions act=new Actions(driver);
	    
     WebElement source= driver.findElement(By.xpath("//div[@id='box5']"));
	WebElement target= driver.findElement(By.xpath("//div[@id='box106']"));	    
	    act.dragAndDrop(source, target).perform();
	    
	    WebElement source2= driver.findElement(By.xpath("//div[@id='box7']"));
	    WebElement target2= driver.findElement(By.xpath("//div[@id='box104']"));
	    act.dragAndDrop(source2, target2).perform();
	    
	    
      WebElement 	source3=   driver.findElement(By.xpath("//div[@id='box6']"));
      WebElement 	target3=   driver.findElement(By.xpath("//div[@id='box102']"));

       act.dragAndDrop(source3, target3).perform();
       
       driver.close();
	}

}
