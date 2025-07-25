package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		int n = 11;
		int i;

		for (i = 2; i < n; i++) {
			if (n % i == 0) {
				break;
			}
		}
		if (i == n)
			System.out.println("The given number is  a Prime");
		else
			System.out.println("The given number is  Not a Prime");

	}
}
