package factorial;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class FactorialTest {
	
	@Test
	public void factorialTest() {
		String expected = "12!";
		
		Factorial fact = new Factorial();
		String actual = fact.calculate(479001600);
		
		// check value
		assertEquals(expected, actual, "wrong answer");
		
		
		// check datatype
		assertTrue(actual instanceof String);
	}
	
	@Test
	public void failedFactorial() {
		String expected = "NONE";

		Factorial fact = new Factorial();
		String actual = fact.calculate(999);
		
		// check value
		assertEquals(expected, actual, "wrong answer");
		
	}

}
