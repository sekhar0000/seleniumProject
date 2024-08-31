package seleniumMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxs_other {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
       //click one check box below is the method 
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//if we want click all the check boxes
		
	List<WebElement>allcheckboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox' ]"));
	/*
	//***********************approach-1**********************
	for(int i=0;i<allcheckboxes.size();i++) {
		allcheckboxes.get(i).click();
	}
	//******************approach-2**********************
	for(WebElement checkbox:allcheckboxes) {
		checkbox.click();
		}
	//	***********************approach-3********************
	 * 
	 * click ing last 3 check boxes--total no of checkboxes - how many check boxes want to click =starting index
	 * 7-3=4   starting index 4

		
	for(int i=4;i<allcheckboxes.size();i++) {
		allcheckboxes.get(i).click();
	}
		 
	//i want to click 1st 3 check boxes*******************************
	for(int i=0;i<3;i++) {
		allcheckboxes.get(i).click();
	}
	*/
	
	
	//i want to un select check boxes *******************************8
	//1st we will click 3 check boxes and thn will un check
	for(int i=0;i<3;i++) {
		allcheckboxes.get(i).click();
	}
	
	Thread.sleep(4000);
	
	for(int i=0;i<allcheckboxes.size();i++) {
		if(allcheckboxes.get(i).isSelected()) {
			allcheckboxes.get(i).click();
		}
	}
	
	}

}

