package chromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class executeHeadlessBrowser {

	public static void main(String[] args) {
		
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless=new");      //setting for head
		
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://testautomationpractice.blogspot.com/");
		String actualTitle=driver.getTitle();
		if(actualTitle.equals("Automation Testing Practice")) {
			System.out.println("test passed");
		}
		else {
			System.out.println("test failed");
		}

	}

}
