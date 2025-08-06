package week3.day1;

public class ReverseString {

	public static void main(String[] args) {
		
		 String companyName= "TestLeaf";
		 String Reverse = "";	
		 char[] charArray = companyName.toCharArray();
				 for (int i = charArray.length-1; i >= 0; i--) {
					 Reverse = Reverse + charArray[i]	;
				}
				 System.out.println(Reverse);

	}

}
