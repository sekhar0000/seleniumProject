package seleniumMethods;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datePicker {
	
	static void selectMonthYearDate(WebDriver driver, String month ,String year,String date) {
		
		//selecting current month and year
				while(true) {			
			String current_month=	driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String current_year =    driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();	
				if(current_month.equals(month) && current_year.equals(year)) {
					break;
				}
								
	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();   //click next button
	//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();   // click on  previous button
	
	}
	}
		
	static void selectingDate(WebDriver driver,String day) {
		//selecting date
		
	List<WebElement>allDatelist=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
	for(WebElement dt: allDatelist) {
		if(dt.getText().equals(day)){
			dt.click();
			break;
			
		}
		
	    }
	}

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/datepicker/");	
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		
	
		// method -1 is using send keys
		//Driver.findelements(By.xpath("xpath")).sendkeys("12/08/1994");
		
		//method-2  sing date picker
		
		
		String year="2025";
		String month="May";
		String day="20";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
	//selectMonthYearDate(driver, month, year,day);
	//selectingDate(driver, day)	;

		selectMonthYearDate(driver,year,month,day);
		}

	}


