package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class beforeClass_annitations {
	//before class will execute @test executing before if we have 3 @tests also before class will execute once only
	
	
	@BeforeClass
	void login() {
		
		System.out.println("lig in application....");
	}
	@Test(priority = 1)
	void search() {
		System.out.println("this is search....");
	}
	@Test(priority = 2)
	void advSearch() {
		System.out.println("this is adv.....");
	}
   @AfterClass
	void logout() {
		System.out.println("logout....");
	}
}
