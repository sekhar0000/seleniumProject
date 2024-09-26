package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test {

	@Test
	void log() {
		WebDriver drivr=new ChromeDriver();
		drivr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	    @Test(priority = 1)
		void openUrl() {
			System.out.println("opening url");
		}
	    
	    
		@Test(priority = 2)
		void login() {
			
			System.out.println("login into app");			
		}
		
		
		@Test(priority = 3)
		 void logout() {
			 System.out.println("log out app");
		 }
		
	}

