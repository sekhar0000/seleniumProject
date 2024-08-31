package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalMethods {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		
	WebElement logo=	driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
	System.out.println("logo available:" +logo.isDisplayed());
	    //other way
	boolean status=	driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).isDisplayed();	
	System.out.println("radio status :"+status); 
	
	
	WebElement radio= driver.findElement(By.id("pollanswers-3"));
	 System.out.println(radio.isEnabled());
	  //other way  same above we can write
	 
	 WebElement radio1= driver.findElement(By.id("pollanswers-3"));
	 System.out.println(radio1.isSelected());
	 
	 //click one rado button
	// WebElement radio2= driver.findElement(By.id("pollanswers-3"));
	// System.out.println(radio.isEnabled());
	 radio.click();
	
	}

}
