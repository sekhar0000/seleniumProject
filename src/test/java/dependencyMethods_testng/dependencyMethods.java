package dependencyMethods_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependencyMethods {
	
	@Test(priority = 1)
	void openapp() {
		System.out.println("opening app");
		Assert.assertTrue(true);
	}
	
	@Test(priority = 2, dependsOnMethods= {"openapp"})
	void login() {
		System.out.println("log in app");
		
		Assert.assertTrue(true);
	}

	@Test (priority = 3, dependsOnMethods = {"login"} )
	void search() {
		System.out.println("product search in app");
		
		Assert.assertTrue(false);
	}

	
	@Test(priority = 4, dependsOnMethods = {"search","login"} )
	void advsearch() {
		System.out.println("product adv search in app");
		
		Assert.assertTrue(true);
	}
}
