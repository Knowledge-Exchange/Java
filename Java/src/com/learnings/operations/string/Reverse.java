package com.learnings.operations.string;

public class Reverse {
	public static void main(String[] args) {

		String s = "Geeks";
		String r = "";
		char ch;

		for (int i = 0; i < s.length(); i++) {

			ch = s.charAt(i);
			r = ch + r;
		}

		System.out.println(r);
	}
}
