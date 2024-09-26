package ActionsClass;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class openLinkInNewTabKyBoard {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demowebshop.tricentis.com/");
	    driver.manage().window().maximize();
	    
	WebElement regLink=    driver.findElement(By.xpath("//a[normalize-space()='Register']"));
	    Actions act=new Actions(driver);
	    //opening new tab
	act.keyDown(Keys.CONTROL).click(regLink).keyUp(Keys.CONTROL).perform();
	
      //switching new tab
	//Set<String>ids=driver.getWindowHandles();
	
	
	List<String> ids=new ArrayList(driver.getWindowHandles());
	
	driver.switchTo().window(ids.get(1));
	// navigated to new tab and click to sign in link
	driver.findElement(By.xpath("//a[normalize-space()='Log in']")).click();
	
	// click back to home page and clicking register link
	driver.switchTo().window(ids.get(0));
	
	driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
	}

}
