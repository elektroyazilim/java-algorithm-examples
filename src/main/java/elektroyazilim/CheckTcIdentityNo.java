package elektroyazilim;

import java.util.Scanner;

public class CheckTcIdentityNo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Criterias :
        // First character cannot start by zero     --> charAt(0)
        // The length of it must be 11 character    --> length()
        // The last character must be even          --> charAt(10) % 2== 0

        System.out.print("TC identity no : ");
        String tcNo = input.next();

        System.out.println(tcNo);
        String ch = tcNo.substring(0, 1); // for first character
        // tcNo.charAt(0) is alternative

        String rndm = "" + tcNo.charAt(0);


        if (!ch.equals("0") && tcNo.length() == 11 && tcNo.charAt(10) % 2 == 0) {
            System.out.println("Valid TC No");
        }
        else
        {
            if (ch.equals("0")) {
                System.out.println("The first character of TC no cannot be zero !.");
            }
            if (tcNo.length() != 11) {
                System.out.println("Tc no must be 11 length..");
            }
            if (tcNo.charAt(10) % 2 != 0)
            {
                System.out.println("The last character of TC No must be even...");
            }
        }
    }
}
