package week2.day1;

public class NumberPalindrome {

	public static void main(String[] args) {
		int input = 121;
		int output = 0;
		int original = input;

		for (int i = input; i != 0; i = i / 10) {
			int rem = i % 10;
			output = output * 10 + rem;
		}

		if (original == output) {
			System.out.println("The given number " + input + " is Palindrome");

		} else {
			System.out.println("The given number " + input + " is NOT a Palindrome");

		}

	}

}
