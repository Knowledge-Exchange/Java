package com.learnings.junit;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class CalculatorTestAssumptions {

	@Test
	void exampleTest() {
		boolean condition = "true".equalsIgnoreCase(System.getProperty("runTest"));
		Assumptions.assumeTrue(condition, "Skipping the test because the condition is not met");
	}
}
