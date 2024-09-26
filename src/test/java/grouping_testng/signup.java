package grouping_testng;

import org.testng.annotations.Test;

public class signup {

	@Test(priority = 1, groups = {"regression"})
	void loginGmail() {
		System.out.println("this is signup by gmail");
	}
	@Test(priority = 2,groups = {"regression"})
	void loginnaukri() {
		System.out.println("this is signup by naukri");
	}

	@Test(priority = 3,groups = {"regression"})
	void loginlinkedin() {
		System.out.println("this is signup by linkedin");
	}

	
	
}
