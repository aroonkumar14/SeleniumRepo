package week3.day2.asssignment;

public class StringRemoveDuplicatewords {

	public static void main(String[] args) {

		String text = "We learn Java basics as part of java sessions in java week1";
		String[] stringArray = text.split(" ");

		for (int i = 0; i < stringArray.length; i++) {
			for (int j = i + 1; j < stringArray.length; j++) {
				if (stringArray[i].equalsIgnoreCase(stringArray[j])) {
					stringArray[j] = " "; // Replace duplicate with space
				}
			}
		}

		for (int i = 0; i < stringArray.length; i++) {
			if (!stringArray[i].equals("")) {
				System.out.print(stringArray[i] + " ");
			}
		}

	}
}
