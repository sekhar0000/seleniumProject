package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class opening2newBrowsers {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demowebshop.tricentis.com/");
	    driver.manage().window().maximize();
	    
	    //newWindow(WindowType.window);  selenium 4 new feature
	    
	    driver.switchTo().newWindow(WindowType.WINDOW);
	    
	    driver.get("https://testautomationpractice.blogspot.com/");
	    
	    
	}

}
