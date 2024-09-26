package seleniumMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicTables {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo3x.opencartreports.com/admin/index.php?route=common/login");		
		driver.manage().window().maximize();
		
		WebElement user=driver.findElement(By.xpath("//input[@id='input-username']"));
		user.clear();
		user.sendKeys("demo");
		
		WebElement pass=driver.findElement(By.xpath("//input[@id='input-password']"));
		pass.clear();
		pass.sendKeys("demo");
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		
		driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@id='collapse4']//li[@class='active']//a[contains(text(),'Orders')]")).click();
		//driver.findElement(By.xpath("//ul[@id='collapse4']//li[@class='active']//a[contains(text(),'Orders')]")).click();
		/*    
	String text=	driver.findElement(By.xpath("//div[contains(text(),'Showing')]")).getText();
int total_pages=Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("Showing")-1)); 

	//repeating pages

for (int p=1;p<=total_pages;p++) {
	if(p>1)
*/
}
	
	
	}


