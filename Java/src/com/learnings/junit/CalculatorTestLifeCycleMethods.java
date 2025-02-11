package com.learnings.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTestLifeCycleMethods {

	@BeforeAll
	static void setupBeforeAll() {
		System.out.println("Before all tests");
	}

	@AfterAll
	static void cleanupAfterAll() {
		System.out.println("After all tests");
	}

	@BeforeEach
	void setupBeforeEach() {
		System.out.println("Before each test");
	}

	@AfterEach
	void cleanupAfterEach() {
		System.out.println("After each test");
	}

	@Test
	public void testSum() {
		System.out.println("Executoing sum method...");
	}
}
