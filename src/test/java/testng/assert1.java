package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assert1 {

	@Test
	void softAssertion() {
		
		System.out.println("before condition in soft assertion");
		SoftAssert as =new SoftAssert();
		Assert.assertEquals(1, 2);
		
		System.out.println("after condion in soft assertion");
		as.assertAll();
	}

	@Test
	void hardAssertion() {
	System.out.println("before condition in hard asserting");
	
	
	Assert.assertEquals(1, 1);
	
	System.out.println("after condion in hard assertion");
		
	
	}

}
