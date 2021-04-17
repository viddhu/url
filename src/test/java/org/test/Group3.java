package org.test;

import org.testng.annotations.Test;

public class Group3 {
	@Test(groups="sanity")
	public void tc31() {
		System.out.println("tc31");
	}
	@Test(groups="regression")
	public void tc32() {
		System.out.println("tc32");
	}
	@Test(groups="smoke")
	public void tc33() {
		System.out.println("tc33");
	}
	

}
