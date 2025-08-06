package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String a = "stops";
		String b = "lpotss";

		int length1 = a.length();
		int length2 = b.length();

		if (length1 != length2) {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
			return;  
		}

		char[] charArray1 = a.toCharArray();
		char[] charArray2 = b.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		boolean check = Arrays.equals(charArray1, charArray2);

		if (check) {
			System.out.println("The given strings are Anagrame");
		} else {
			System.out.println("The given strings are not an Anagram");
		}

	}

}
