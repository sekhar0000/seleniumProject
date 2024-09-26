package seleniumMethods;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class datePicker3 {

	static Month convertmMonth(String month) {
		HashMap<String, Month> monthMap=new HashMap<String, Month>();
		monthMap.put("January", Month.JANUARY);
		monthMap.put("February", Month.FEBRUARY);
		monthMap.put("March", Month.MARCH);
		monthMap.put("April", Month.APRIL);
		monthMap.put("May", Month.MAY);
		monthMap.put("June", Month.JUNE);
		monthMap.put("July", Month.JULY);
		monthMap.put("August", Month.AUGUST);
		monthMap.put("September", Month.SEPTEMBER);
		monthMap.put("October", Month.OCTOBER);
		monthMap.put("November", Month.NOVEMBER);
		monthMap.put("December", Month.DECEMBER);
		
		Month vmonth=monthMap.get(month);
		
		if(vmonth== null) {
			System.out.println("Invalid Month ....");
		}
		
		
		return vmonth ;
		
	}
	
	static void selectDate(WebDriver driver, String requireYear, String requiredMonth, String requireDate) {
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");		
		driver.manage().window().maximize();

		
		String requireYear="2011";
		String requiredMonth="May";
		String requireDate="20";
		
		selectDate(driver, requireYear, requiredMonth, requireDate);
		
		//switching to frame
		Thread.sleep(3000);
		
		driver.switchTo().frame("frame-one796456169");
		
		driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();
		
		// selecting year clicking on year dropdown
		
	WebElement yearDropdown=	driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	
	Select sel=new Select(yearDropdown);
	sel.selectByVisibleText(requireYear);
	
	//selecting month
	Thread.sleep(3000);
	while(true){
	String displayMonth=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")).getText();
	                                                 ////span[@class='ui-datepicker-month']
	//convert requiredMonth and displayMonth in month objects
	
		Month expectedMonth=convertmMonth(requiredMonth);
		Month currentMonth=convertmMonth(displayMonth);
	//compare month
        int result=		expectedMonth.compareTo(currentMonth);
        
        //0 month are equal or >0future month   <0 past
        
        if(result<0) {
        	 // past month button clicking
        	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
        	
        }else if(result>0) {
        	//future month button clicking
        	
        	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
        	
        }
        else {
        	break;
        }
	}
	//selcting date
	
	List<WebElement>allDates=driver.findElements(By.xpath("//table[class='ui-datepicker-calendar']//tbody//tr//td//a"));
	for(WebElement dt:allDates) {
		if(dt.getText().equals(requireDate)) {
			dt.click();
			break;
		}
	}
	
	}
	}

