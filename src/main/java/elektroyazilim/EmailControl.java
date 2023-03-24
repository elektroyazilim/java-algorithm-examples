package elektroyazilim;

import java.util.Scanner;

public class EmailControl {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen e-mail adresinizi Giriniz : "); // agag@ghhh.com
        String mail = input.next();
        System.out.println(mail);

        // 2 tane kriter :
        // - @ karakteri var mi
        // - com, com.tr, net, net.tr, org, org.tr, tr

        String domains = "com, com.tr, net, net.tr, org, org.tr, tr";

        boolean atVarMi = mail.contains("@"); // true, false
        System.out.println(atVarMi);

        int noktaNerede = mail.indexOf("."); // 15
        System.out.println(noktaNerede);

        String wantedText = mail.substring(noktaNerede + 1);
        System.out.println(wantedText);

        /// @
        // com

        if (atVarMi && domains.contains(wantedText)) // esma@asasa AND
        {
            System.out.println("Geçerli mail adresi");
        }
        else
        {// elektr@
            if (atVarMi == false) {
                System.out.println("@ karakteri kullanilmalidir");
            }
            if (domains.contains(wantedText) == false) {
                System.out.println("Domain bilgisi girilmelidir.");
            }
        }
        System.out.println("program sonu");
    }
}
