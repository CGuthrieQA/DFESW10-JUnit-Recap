package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	@BeforeAll
	static void testStart() {
		System.out.println("Starting the tests...");
	}
	
	@BeforeEach
	void newTest() {
		System.out.println("Running a new test");
	}
	
	
	@Test
	void testAddition() {
		int expected = 8;
		Calculator calc = new Calculator();
		int actual = calc.addition(2, 6);
		assertEquals(expected, actual, "the answer is wrong!");
	}
	
	
	@Test
	void testSubtraction() {
		int expected = 1;
		Calculator calc = new Calculator();
		int actual = calc.subtraction(7, 6);
		assertEquals(expected, actual, "the answer is wrong!");
	}
	
	
}
