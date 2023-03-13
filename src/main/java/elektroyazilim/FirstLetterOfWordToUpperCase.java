package elektroyazilim;

import java.util.Arrays;

class OnlyFirstLetter {

    public String firstLetterToUpperCase(String text)
    {
        text = "Bugün hava nasıl";
        String newText = "";

        String[] words = text.split(" ");
        System.out.println(Arrays.toString(words)); // [Bugün, hava, nasıl]

        for (String word : words) {
            newText += word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
        }
       return newText.trim();
    }

}

public class FirstLetterOfWordToUpperCase {

    public static void main(String[] args) {
        OnlyFirstLetter onlyFirstLetter = new OnlyFirstLetter();
        String newText = onlyFirstLetter.firstLetterToUpperCase("what is test");
        System.out.println(newText);
    }
}
