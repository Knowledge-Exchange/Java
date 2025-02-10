package com.learnings.operations.array;

import java.util.HashSet;
import java.util.Set;

public class CommonElements {

	private static void FindCommonElement(String[] arr1, String[] arr2) {
		Set<String> set = new HashSet<>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i].equals(arr2[j])) {
					set.add(arr1[i]);
					break;
				}
			}
		}

		System.out.println(set.toString());
	}

	public static void main(String[] args) {

		String[] arr1 = { "java", "common", "elements", "find", "out" };

		String[] arr2 = { "java", "elements", "common" };

		FindCommonElement(arr1, arr2);
	}
}