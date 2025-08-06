package week3.day1;

public class StringManipulation {

	public static void main(String[] args) {

		String text = "changeme";
		char[] textCharArray = text.toCharArray();
		for (int i = 0; i < textCharArray.length; i++) {
			if (i % 2 != 0) {
				textCharArray[i] = Character.toUpperCase(textCharArray[i]);
			}
		}
		String Modified = new String(textCharArray);
		System.out.println(Modified);
	}

}
