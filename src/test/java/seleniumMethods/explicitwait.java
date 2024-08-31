package seleniumMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement mywait=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Log in']")));
		mywait.click();
		
		//WebElement link=wait.findElement(By.xpath("//a[normalize-space()='Log in']"));
		
		
	}

}
