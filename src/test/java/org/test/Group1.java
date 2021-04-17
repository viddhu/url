package org.test;

import org.testng.annotations.Test;

public class Group1 {
	@Test(groups="regression")
	public void tc11() {
		System.out.println("tc11");
	}
	@Test(groups="sanity")
	public void tc12() {
		System.out.println("tc12");
	}
	@Test(groups="smoke")
	public void tc13() {
		System.out.println("tc13");
	}

}
