package com.training.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.training.examples.Calculator;

class CalculatorTest {
	
	Calculator calculator;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before all testcases");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After all testcases");
	}

	@BeforeEach
	void setUp() throws Exception {
		calculator = new Calculator();
		System.out.println("Before each testcases");
	}

	@AfterEach
	void tearDown() throws Exception {
		calculator  = null;
		System.out.println("After each testcases");
	}

	@Test
	void testSum() {
		//fail("Not yet implemented");
		int actual = calculator.sum(10, 20);
		assertEquals(30,actual);
	}
	@Test
	void testDifference() {
		//fail("Not yet implemented");
		int actual = calculator.difference(10, 20);
		assertEquals(-10,actual);
	}
	@Test
	void testDivison() {
		//fail("Not yet implemented");
		int actual = calculator.divison(10, 20);
		assertEquals(0,actual);
	}

}
