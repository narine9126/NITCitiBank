package com.app.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

//javabydeveloper.com
public class MathUtilTest {

//	@Test
	void test_add() {
		assertEquals(15, MathUtil.add(5, 10));
	}

	void test_Multiply() {
		assertEquals(20, MathUtil.multiple(4, 5));
	}

	void test_Devide() {
		assertEquals(5, MathUtil.devide(50, 10));
	}

	void test_IsPrime() {
		assertTrue(MathUtil.isPrime(13));
	}
	void test_IsEven() {
		assertTrue(MathUtil.isEven(7));
		
	}
}
