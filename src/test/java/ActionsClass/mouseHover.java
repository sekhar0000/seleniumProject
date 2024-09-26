package ActionsClass;

import java.awt.Desktop.Action;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHover {

	public static void main(String[] args) {
		//Actions class we can use and perform the actions right click , 
		//mousehover>>>>moveto elements method
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.globalsqa.com/demo-site/datepicker/");
		
		driver.manage().window().maximize();
		
	WebElement freeBooks=	driver.findElement(By.xpath("//a[@class='no_border'][normalize-space()='Free Ebooks']"));
    
	WebElement ebooks =driver.findElement(By.xpath("//span[normalize-space()='Free Tensorflow eBooks']"));
	
	Actions act=new Actions(driver);
	act.moveToElement(freeBooks).moveToElement(ebooks).build().perform();

   
	
	}

}
