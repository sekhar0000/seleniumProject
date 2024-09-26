package seleniumMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootstrapDropdown {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");		
		driver.manage().window().maximize();
		//bootstarap f1st we have to find out  static element in the dropdown and then we can select whatever we need to click 
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
	
		//selcting single option
		//driver.findElement(By.xpath("//input[@value='Angular']")).click();
		
		//selecting all options getting size
		
	List<WebElement>options=	driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		System.out.println(options.size());
		/*
		//printing dropdown list
	for(WebElement opt:options) {
		System.out.println(opt.getText());
		}
		
		*/
		
		//slect multiple options
		for(WebElement opt:options) {
			if(opt.getText().equals("Java") || opt.getText().equals("Python") || opt.getText().equals("Mysql"));
			opt.click();
			}
		
	
	}

}
