package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
	    driver.manage().window().maximize();
	
	    /* method -1    
	WebElement feild=   driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
	Actions act=new Actions(driver);
	Thread.sleep(4000);
	
	act.doubleClick(feild).perform();
	
	*/

	  //input[@id='field1']
	  //input[@id='field2']
	  //button[normalize-space()='Copy Text']
	  //button[normalize-space()='Copy Text']
	    
	    
	  WebElement box1=  driver.findElement(By.xpath("//input[@id='field1']"));
	  WebElement box2=  driver.findElement(By.xpath(" //input[@id='field2']"));
	  WebElement button=driver.findElement(By.xpath(" //button[normalize-space()='Copy Text']"));
	  //to clear the box1 text
	  box1.clear();
	  
	  box1.sendKeys("hello");
	  
	  Actions act=new Actions(driver);
	  
	  act.doubleClick(button).perform();
	  
	  //verifying same text is copied or not  "hello rajsekhar"
	  
	  //get text() >>>>> returns the inner text  and get attribute difference>>>returns the value of the attribute
	  
	  String text=box2.getAttribute("value");
	  System.out.println("captured value is : "+text);
	if(text.equals("hello")){
		System.out.println("text copied");
	}
	else {
		System.out.println("not copied correctly");
	}
	  
	  driver.close();
	}

}
