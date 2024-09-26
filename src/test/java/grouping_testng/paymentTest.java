package grouping_testng;

import org.testng.annotations.Test;

public class paymentTest {

	@Test(priority = 1, groups = {"sanity","regression","functional"})
	void rupees() {
		System.out.println("rupees");
	}
	@Test(priority = 2,groups = {"sanity","regression","functional"})
	void dollers() {
		System.out.println("dollers");
	}

	@Test(priority = 3,groups = {"sanity","regression","functional"})
	void pounds() {
		System.out.println("pounds");
	}

	
}
