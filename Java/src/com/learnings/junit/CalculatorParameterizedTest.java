package com.learnings.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorParameterizedTest {
	@ParameterizedTest
	@ValueSource(ints = { 1, 2, 3, 4, 5 })
	void testSquare(int value) {

		Calculator calculator = new Calculator();
		// When
		int result = calculator.square(value);

		Assertions.assertEquals(value * value, result, "Square calculation is incorrect");
	}

}
