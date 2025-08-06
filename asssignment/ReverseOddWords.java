package week3.day2.asssignment;

public class ReverseOddWords {

    public static void main(String[] args) {

        String text = "I am a software tester";
        String[] words = text.split(" "); 

        for (int i = 0; i < words.length; i++) {

            if (i % 2 != 0) {
               
                char[] charArray = words[i].toCharArray();
                String reversed = "";
                for (int j = charArray.length - 1; j >= 0; j--) {
                    reversed = reversed + charArray[j];
                }
                System.out.print(reversed + " ");
            } else {
                //print even index as it is
                System.out.print(words[i] + " ");
            }
        }
    }
}
