package seleniumMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDowns {

	public static void main(String[] args) {
		
		//selct dropdown
		//boot strap dropdown
		//hidden drop down
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");		
		driver.manage().window().maximize();
		//driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
       WebElement drop= driver.findElement(By.xpath("//select[@id='products-orderby']"));
        Select sel=new Select(drop);
        
        //select class having methods --select by visible text, by index, by value
        
        sel.selectByIndex(1);
       
        sel.selectByValue("");
        sel.selectByVisibleText("");
	
	//it display total elements in the drop down
	List<WebElement>options=     sel.getOptions();
	System.out.println("total options in the dropdown" +options.size());
	
	//printing the total options in the dropdown
	   //normal for loop
	for(int i=0;i<options.size();i++) {		
		System.out.println(options.get(i).getText());
		//enhanced for loop
		
	for(WebElement opt:options) {
	System.out.println(opt.getText());
	}
	}
	
	}

}
