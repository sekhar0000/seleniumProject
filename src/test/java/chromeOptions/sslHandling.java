package chromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class sslHandling {

	public static void main(String[] args) {


		//secure socket layers certificate  >>your connection is not private 
		
		ChromeOptions opt=new ChromeOptions();
        opt.setAcceptInsecureCerts(true);
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://expired.badssl.com/");
		
		driver.manage().window().maximize();
		
		System.out.println("title of the page :"+driver.getTitle());
		
		
		
		
		

	}

}
