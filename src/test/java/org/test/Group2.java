package org.test;

import org.testng.annotations.Test;

public class Group2 {
	@Test(groups="rerun")
	public void tc21() {
		System.out.println("tc21");
	}
	@Test(groups="retesting")
	public void tc22() {
		System.out.println("tc22");
	}
	@Test(groups="smoke")
	public void tc23() {
		System.out.println("tc23");
	}
	
	private void sample() {
		// TODO Auto-generated method stub

	}
	private void meth() {
		// TODO Auto-generated method stub

	}

}
