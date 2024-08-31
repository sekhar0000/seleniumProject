package seleniumMethods;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleBrowserWindows {

	public static void main(String[] args) {
      
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.bankbazaar.com/passport/how-to-make-online-appointment-for-passport.html");
		
	
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//a[normalize-space()='Passport Information']")).click();
		
		 Set<String>windowID=driver.getWindowHandles();
		 
		// /*********************
			//approach-1 -this we can use only 2 or 3 windows are opened
			
		 List<String>windowList=new ArrayList<String>(windowID);		 
		 String parentID=windowList.get(0);
		 String childiD=windowList.get(1);
		 driver.switchTo().window(childiD);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentID);
		System.out.println(driver.getTitle());
  /*
		       //&******************approach-2  using for loops******************

this approach if we want to access number of child we can access by using if condition we need to enter title.equals(ther we need to specify title)
		for (String winID:windowID) {
			String title=driver.switchTo().window(winID).getTitle();
		//	System.out.println();
			if(title.equals("title of the browser  enter"));
		*/
		}

	}


