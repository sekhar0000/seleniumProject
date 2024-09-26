package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolling_javascriptExecutor {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		// ChromeDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// scroll down by using pixels-1

		// js.executeScript("window.scrollBy(0,1000 )", "");
		// System.out.println(js.executeScript("return window.pageYOffset", args));

		// scroll down by using pixels-2 element is visible
		/*
		 * WebElement webtable =
		 * driver.findElement(By.xpath("//h2[normalize-space()='Web Table']"));
		 * js.executeScript("arguments[0].scrollIntoView()", webtable);
		 * System.out.println(js.executeScript("return window.pageYOffset", args));
		 */

		// scroll down entire down

		js.executeScript("window.scrollBy(0, document.body.scrollHeight )");
		System.out.println(js.executeScript("return window.pageYOffset", args));
		
		Thread.sleep(4000);
		
		// scroll up entire down
		js.executeScript("window.scrollBy(0, -document.body.scrollHeight )");
	}

}
