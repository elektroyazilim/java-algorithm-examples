package elektroyazilim;

import java.util.Scanner;

public class CheckPassword {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sifrenizi giriniz (Aerasra1241542): ");
        String sifre = input.next();
        boolean buyukHarfVarMi = false, rakamVarMi = false, kucukHarfVarMi = false;
        for (int i = 0; i < sifre.length(); i++) {

            if (sifre.charAt(i) >= 48 && sifre.charAt(i) <= 57) { // 48 - 57  --> rakam
                rakamVarMi = true;
            } else if (sifre.charAt(i) >= 65 && sifre.charAt(i) <= 90) { // 65 - 90 --> buyuk harf
                buyukHarfVarMi = true;
            } else if (sifre.charAt(i) >= 97 && sifre.charAt(i) <= 122) { // 97 - 122 --> kucuk harf
                kucukHarfVarMi = true;
            }

        }

        boolean sonuc = rakamVarMi && kucukHarfVarMi && buyukHarfVarMi; // matematik carpma = 0.1 = 0
        if(sonuc) {
            System.out.println("Gecerli sifre");
        }
        else {
            System.out.println("Gecersiz");
        }
    }

}
