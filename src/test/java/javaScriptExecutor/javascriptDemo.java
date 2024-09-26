package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//                                                 when your getting element intercept exception that time only you can use javascript executor
public class javascriptDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// ChromeDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		// java scriptExecutor is an interface
		// initialization of java script executor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));

		// JavascriptExecutor jva=(driver);
		js.executeScript("arguments[0].setAttribute('value','raja')", name);

		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		js.executeScript("arguments[0].setAttribute('value','raja@gmail.com')", email);

		// click ing radio button
		WebElement radiobtn = driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click()", radiobtn);

	}

}
