package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zoomDownUsingJavascript {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		// ChromeDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		/*
		driver.manage().window().maximize();
         Thread.sleep(50);
		driver.manage().window().minimize();
       */
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("document.body.style.zoom='50%'");
	
	
	}

}
