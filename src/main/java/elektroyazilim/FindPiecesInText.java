package elektroyazilim;

import java.util.Scanner;

class HowMany {
    public static int sentences(String text) {
        String[] sentencs = text.split("\\.");
        return sentencs.length;
    }

    public static int words(String text) {
        String[] wrds = text.split(" ");
        return wrds.length;
    }

    public static int characters(String text) {
        return text.length();
    }
}

public class FindPiecesInText {
    public static void main(String[] args) {
        /*
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter any text :");
        String text = input.nextLine();
        */
        String text = "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined with a handful of model sentence structures, to generate Lorem Ipsum which looks reasonable. The generated Lorem Ipsum is therefore always free from repetition, injected humour, or non-characteristic words etc.";


        System.out.println("Sentences : " + HowMany.sentences(text));
        System.out.println("Words : " + HowMany.words(text));
        System.out.println("Characters : " + HowMany.characters(text));


    }
}
