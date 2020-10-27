package com.training.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.training.examples.Bank;
import com.training.examples.ExceedingException;
import com.training.examples.NegValueException;

class BankTest {
	Bank bank;

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
		bank = new Bank(8000);
		System.out.println("Before each testcases");
	}

	@AfterEach
	void tearDown() throws Exception {
		bank = null;
		System.out.println("After each testcases");
	}

	@Test
	void testWithdraw() {
		//fail("Not yet implemented");
		double actual = bank.withdraw(2000);
		assertEquals(6000,actual);
	}
	
	@Test
	void testWithdrawExceeding() {
		//fail("Not yet implemented");
		assertThrows(ExceedingException.class,()->
		bank.withdraw(4000));
	
	}
	@Test
	void testWithdrawEq() {
		//fail("Not yet implemented");
		assertThrows(ExceedingException.class,()->
		bank.withdraw(10000));
	
	}
	@Test
	void testDeposit()  {
		//fail("Not yet implemented");
		double actual = bank.deposit(2000);
		assertEquals(10000,actual);
	}

	@Test
	void testWithdrawNegative() {
		//fail("Not yet implemented");
		assertThrows(NegValueException.class,()->
		bank.withdraw(-4000));
	
	}
	@Test
	@DisplayName("negative deposit")
	void testDepositNeg() {
		assertThrows(NegValueException.class,()->
		bank.deposit(-4000));
	}
	@Test
	void testDepositExceed() {
		assertThrows(ExceedingException.class,()->
		bank.deposit(10000));
	}
	@Test
	void testAverage(){
		double actual = bank.average(10,10,10);
		assertEquals(10,actual);
	}
	@Test
	void testAverageNeg() {
		assertThrows(NegValueException.class,()->
		bank.average(-1,3,5));
	}
	@Test
	void testAverageExceedValues() {
		assertThrows(ExceedingException.class,()->
		bank.average(100,120,55));
	}
	@Test
	void testAverageExceed() {
		assertThrows(ExceedingException.class,()->
		bank.average(102,120,111));
	}
}
