package seleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationalMethods {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		
		
		
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().to("url");

	}

}
