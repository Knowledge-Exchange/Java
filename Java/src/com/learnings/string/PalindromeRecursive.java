package com.learnings.string;

//Java program to check whether a string is a Palindrome using recursion
public class PalindromeRecursive {

	public static boolean isPalindrome(int i, int j, String s) {

		if (i >= j) {
			return true;
		}
		if (s.charAt(i) != s.charAt(j)) {
			return false;
		}

		return isPalindrome(i + 1, j - 1, s);
	}

	public static boolean isPalindrome(String s) {
		return isPalindrome(0, s.length() - 1, s);
	}

	public static void main(String[] args) {

		String s = "RACEcar";

		s = s.toLowerCase();

		if (isPalindrome(s)) {
			System.out.println("\"" + s + "\" is a palindrome.");
		} else {
			System.out.println("\"" + s + "\" is not a palindrome.");
		}
	}
}
