package week3.day1;

import java.util.Arrays;

public class CountOccurrences {

	public static void main(String[] args) {
		
		String input = "Test Leaf";
		int j=0;
		char[] charArray = input.toCharArray();
		Arrays.sort(charArray);
		for (int i = 0; i < charArray.length-1; i++) {
			 if (charArray[i] == 'e') {
	                j++;
	            }
		}
		System.out.println("The number of occurance is " + j);

	}	

}
