package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardActions {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://text-compare.com/");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("wel come rajsekhar");
	    
	    //CTRL+A  >>>select >>>>CTRL+C  copy >>> TAb   >>>> CTRL+V
	    
	    
	    Actions act=new Actions(driver);
	    
	 //   keydown and key up
	    
	  //CTRL+A
	    act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
	    
	  //CTRL+C
	    act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
	    
	    //tab
	    act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();

	    //ctrl +v
	    act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
	        
	//    if we have 3 keys like CTRL+SHIFT+A
	        // key down >>>click  key up >>>> release
	//    act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("A").  keyUp(Keys.SHIFT).keyUp(Keys.CONTROL).perform();
	    
	    
	}

}
