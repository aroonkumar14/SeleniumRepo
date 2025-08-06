package week3.day1;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {

		int a[] = { 1, 4, 3, 8, 6,2,7 };
		Arrays.sort(a);
		for (int i = 0; i < a.length-1; i++) {
			if (a[i + 1] != a[i] + 1) {
				System.out.println("Missing element in the sequence is " + (a[i] + 1));
				
			}
		}

	}
}
