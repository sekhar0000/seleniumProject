package seleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathConcept {

	public static void main(String[] args) {
		
		//absolute xpath--full path & relative xpath ---partial

		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		
		//single attribute xpath
		//---"//img[@alt='some value']"
		driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).click();
		
		
		//Multiple attributes xpath
		
		driver.findElement(By.xpath("//input[@type='button'][@value='Subscribe']")).click();
	
	
		//AND operator--- both attributes are should valid 
		
	//((	"//input[@name='search' and @type='link']"));
		
		//driver.findElement(By.xpath("//input[@value='Vote' and @id='vote-poll-1']")).click();
		
		//or operator
		//((	"//input[@name='search' or @type='link']"));
		//if one attribue is not valid also we can able to process
		
		//driver.findElement(By.xpath("//input[@value='Vote' or @id='vote-poll-1']")).click();
		
		
		//xpath with text()	--inner text	h2[normalize-space()='Welcome to our store']
		
	boolean textStatus=	      driver.findElement(By.xpath("//h2[normalize-space()='Welcome to our store']")).isDisplayed();
	System.out.println(textStatus);	
	
	// getting text	
 String getting_text=	driver.findElement(By.xpath("//h2[normalize-space()='Welcome to our store']")).getText();
   System.out.println(getting_text);
   
   //xpath with contains method
   
   
   
   driver.quit();
		
		
		
		
		
	}
	

}
