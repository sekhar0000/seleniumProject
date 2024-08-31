 package seleniumLocators;

import org.checkerframework.checker.units.qual.UnitsBottom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {

	public static void main(String[] args) {
		
		//Types of CSS selectors
		/*
		 * tag id -----tag#id
		 * tag class---tag.classname
		 * tag attribute---tag[attribute="value"]
		 * tag class attribute----tag.classname[attribute="value"] 
		 */
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		               //tag id
		driver.findElement(By.cssSelector("input#Email")).sendKeys("rajjulakanti@gmail.com");
		     
		//tag and class
		driver.findElement(By.cssSelector("input.password")).sendKeys("Raja@1994");
		
		//without tag name also we can implement
		driver.findElement(By.cssSelector(".password")).sendKeys("Raja@1994");
		
		   //click on Apparel & Shoes link
		driver.findElement(By.cssSelector("ul[class='top-menu'] li:nth-child(4) a:nth-child(1)")).click();
		System.out.println(driver.getTitle());
		
	
		/*   driver.navigate().back();
		   
		   driver.findElement(By.cssSelector("ul[class='top-menu'] li:nth-child(4) a:nth-child(1)")).click();
		   System.out.println(driver.getTitle());
		   */
	
		 // tag attribute---tag[attribute="value"]
		                                //tagname--attribute--attribute value
		driver.findElement(By.cssSelector("input[value='Subscribe']")).click();
		
		
	 // tag attribute---tag[attribute="value"]  using this search
		
		driver.findElement(By.cssSelector("input[class='search-box-text ui-autocomplete-input']")).sendKeys("raja");
		
		//tag name -class-attribute---
		
		driver.findElement(By.cssSelector("input.button-1 search-box-button[value='Search']")).click();
		
	}

}
