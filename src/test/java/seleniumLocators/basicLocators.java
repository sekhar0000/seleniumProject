package seleniumLocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicLocators {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/login");
		
	/*	driver.findElement(By.id("Email")).sendKeys("rajjulakanti@gmail.com");
		//driver.findElement(By.id("Password")).sendKeys("Raja@1994");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();

		*/
		
		//find out total links in web page
		
	/*	List<WebElement>li=driver.findElements(By.tagName("a"));
		System.out.println(li.size());
		*/
	
	//find out total images 
		
		List<WebElement>images=driver.findElements(By.tagName("img alt"));
		System.out.println(images);
		
	
	
	}

}
