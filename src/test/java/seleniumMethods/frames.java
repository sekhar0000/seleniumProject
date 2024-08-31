package seleniumMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		  //fram-1
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
				driver.switchTo().frame(frame1);   //switched into frame1
				driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("welcome");
				
				driver.switchTo().defaultContent();  // it back to page
				
				//frame2				
			WebElement frame2=	driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
			driver.switchTo().frame(frame2);
				driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("selenium");
		
		driver.switchTo().defaultContent();
		
		
	WebElement frame3=	driver.findElement(By.xpath("//frame[@src='frame_3.html']"));		
	driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("3rd frame");
		
		//inside frame3 you  have inner iframe
		
		driver.switchTo().frame(0); //switching to frame using index
		
		driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();
		//if you face any element not clickable or some oth exceptions you can use java script executor
		
		driver.switchTo().defaultContent();
		
		
		
	}

}
