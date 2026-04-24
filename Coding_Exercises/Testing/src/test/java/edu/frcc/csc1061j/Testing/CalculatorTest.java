package edu.frcc.csc1061j.Testing;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class CalculatorTest {

	Calculator calc;
	
	@BeforeEach //creates a new Calculator object before each test
	void setup() {
		calc = new Calculator();
	}
	
	@Test // write assertion for the functions
	@DisplayName("Simple Addition")
	void testAdd() {
		assertEquals(10, calc.add(8,2), "Addition no work"); // calling add method on calc (answer, function)
	}
	@Test // write assertion for the functions
	@DisplayName("Simple Multiplication")
	void testMultiply() {
		assertEquals(10, calc.multiply(5,2), "Multiplication no work"); // calling add method on calc (answer, function, failure message)
		assertTrue(calc.multiply(3, 6) == 18, "Answer should be 18");
	}
	
	@Test
	//@Disabled("Not ready for testing")
	void testDivide() {
		assertEquals(3.0,calc.divide(6,2), "Divide not working");
	}
	
	@Test
	void testDivideException() {
		ArithmeticException exception = assertThrows(ArithmeticException.class, ()-> calc.divide(1,0));
		assertEquals("Divide by 0 Error", exception.getMessage());
	}

}
