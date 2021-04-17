package org.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assetssss {
//	@Test(expectedExceptions = AssertionError.class)
	@Test
	private void tc0() {
		String s= "taj";
		SoftAssert sof= new SoftAssert();
		sof.assertEquals(s, "Taj");
		sof.assertAll();
		System.out.println("tc0 pass");
	}
	@Test
	private void tc1() {
		System.out.println("tc1 pass");
	}

}
