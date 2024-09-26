package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class allAnnitations {

	@BeforeSuite
	void bs() {
		System.out.println("before suite");
	}

	@AfterSuite
	void as() {
		System.out.println("after suite");
	}

	@BeforeMethod
	void bm() {
		System.out.println("before method");
	}

	@AfterMethod
	void am() {
		System.out.println("after method");
	}

	@BeforeTest
	void bt() {
		System.out.println("before test");
	}

	@AfterTest
	void At() {
		System.out.println("After test");
	}

	@BeforeClass
	void bc() {
		System.out.println("before class");
	}

	@AfterClass
	void ac() {
		System.out.println("after class");
	}

	@Test
	void test() {
		System.out.println("test");
	}
}
