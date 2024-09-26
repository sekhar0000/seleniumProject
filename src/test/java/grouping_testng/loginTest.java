package grouping_testng;

import org.testng.annotations.Test;

public class loginTest {
	
	@Test(priority = 1, groups = {"sanity"})
	void loginGmail() {
		System.out.println("login gmail");
	}
	@Test(priority = 2,groups = {"sanity"})
	void loginnaukri() {
		System.out.println("login naukri");
	}

	@Test(priority = 3,groups = {"sanity"})
	void loginlinkedin() {
		System.out.println("login linkedin");
	}




}
