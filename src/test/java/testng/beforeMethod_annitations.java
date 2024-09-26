package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class beforeMethod_annitations {
	//before method will execute executing @test before if we have two @test then before method will execute 2 time 
	
	
	
	@BeforeMethod
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
   @AfterMethod
	void logout() {
		System.out.println("logout....");
	}
}
