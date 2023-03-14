package elektroyazilim;

import java.util.Scanner;

class CheckNum{
    public static boolean isItIntegerFromScanner(Scanner input)
    {
        int number = 0;
        boolean isInt = true;
        if (input.hasNextInt())
        {
            number = input.nextInt();
            System.out.println("ok.. this entry is correct type");
        }
        else
        {
            isInt = false;
            System.out.println("no.. this entry is in wrong type...");
        }
        return isInt;
    }
}

public class NumberControl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        System.out.println("Is it integer : "+ CheckNum.isItIntegerFromScanner(input));
    }
}
