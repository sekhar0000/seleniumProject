package dataProviders_testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvidrDemo {

	WebDriver driver;

	@BeforeClass
	void setup() {
		driver = new ChromeDriver();

		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(dataProvider = "dp")   //data provider is attribute
	void testLogin(String email, String pwd) throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        
        Thread.sleep(3000);
 boolean status=driver.findElement(By.xpath("//img[@alt='client brand banner']")).isDisplayed();
if(status==true) {
	driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
	Assert.assertTrue(true);
	System.out.println("logged out");
}
else {
	Assert.fail();
}
 
	}
	@AfterClass
	void tearDown() {
		driver.close();
	}
	
	//indices means we have 4 inputs , i habe to use 2 input only in that  time we can mention
	
    @DataProvider(name="dp", indices= {0,1})  //here data provider is annitation
	Object[][] multipleLogin() {
    	
		Object data[][]= {
				{"Admin", "admin123"},
				{"Admin", "admin123"},
				{"Admin1","Admin123"},
				{"admin","admin123"}};
		return data;
				
		}
		
	}
	
	
	

