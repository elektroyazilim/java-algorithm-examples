package elektroyazilim;

import java.util.Scanner;

class ReverseText {
    public String reverseStr(String text) {
        String reverseText = "";

        for (int i = text.length() - 1; i >= 0; i--) {

            reverseText += text.charAt(i); // reverseText = reverseText + text.charAt(i) ;
        }
        return reverseText;
    }
}


public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please write any text : ");

        String customText = input.nextLine();

        ReverseText obj = new ReverseText();
        String reverse = obj.reverseStr(customText);
        System.out.println(reverse);
    }
}
