package com.jinyoung.test1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCheckPrime {

	@Test
	public void test() {
		CheckPrime check = new CheckPrime();
		assertFalse(check.primeCheck(89));
		//fail("Not yet implemented");
	}
	
	/*public static void main(String [] args) {
		test();
	}
*/
}
