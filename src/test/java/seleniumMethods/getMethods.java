package seleniumMethods;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getMethods {

	public static void main(String[] args) {
		
		//get method to launch the browser
		
		WebDriver dr=new ChromeDriver();
		dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		dr.manage().window().maximize();
		System.out.println("the title is: " +dr.getTitle());
		
		System.out.println("the current url is :" +dr.getCurrentUrl());
		
		//System.out.println("the page source : "+ dr.getPageSource());
		
		
		//String pageSource=dr.getPageSource();		
		//System.out.println(pageSource);
		
	
	//get window handle it will return the string type  and it will open single browser window
		/*String window=dr.getWindowHandle();
		System.out.println(window);
	
	*/
		
		//get window handles  it will return type set  with multiple browser windows  
	dr.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click(); // this will open new window
	
               Set<String>	window=dr.getWindowHandles();
                System.out.println(window);
	
	
	
	
	}

}
