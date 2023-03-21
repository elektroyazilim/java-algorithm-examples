package elektroyazilim;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        // kullanıcı dogru sifreyi girene kadar kisiyi sifre ekranın tutan bir uygulama yaziniz.
        Scanner input = new Scanner(System.in);
        String sifre = "1234";
        String password;


        int counter = 0;

        do {
            if(counter ==3)
            {
                System.out.println("Yeter");
                break;
            }
            System.out.print("Kullanıcı adınızı giriniz : ");
            String username = input.next();
            System.out.print("Sifrenizi giriniz : ");
            password = input.next();
            counter++;


        } while (!sifre.equals(password));
        System.out.println("program sonu");
    }
}
