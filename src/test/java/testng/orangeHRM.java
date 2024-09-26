package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class orangeHRM {

	WebDriver driver;

	@Test(priority = 1)
	void openApp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Test(priority = 2)
	void testLogo() {
	boolean status=	driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	System.out.println("logo displayed"+status);
	System.out.println(driver.getCurrentUrl());
	}

	@Test(priority = 3)
	void testLogin() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}

	@Test(priority = 4)
	void testLogout() throws InterruptedException {
	/*	
  WebElement drop=  driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
   Select sel=new Select(drop);
   sel.selectByVisibleText("Logout");
    */
		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
	}

}
