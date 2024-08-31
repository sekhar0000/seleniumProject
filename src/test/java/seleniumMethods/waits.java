package seleniumMethods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class waits {

	public static void main(String[] args) {
	//	types of waits
		//Thread.sleep(2000);
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	//	single time , it will not wait total time if the element is visible it willperform and it move to next operation
		//it applies all the elements ---if the time is not sufficient  then it will throw an exception
		driver.get("https://demowebshop.tricentis.com/");
       
	}

}
