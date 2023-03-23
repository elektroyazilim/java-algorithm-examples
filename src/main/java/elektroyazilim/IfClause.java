package elektroyazilim;

import java.util.Random;

public class IfClause {
    public static void main(String[] args) {

        // ************ Ex 1 *******************
        int sayi =10;

        if (sayi > 10) {
            System.out.println("Sayi 10 dan buyuktur");
        } else if (sayi < 10) {
            System.out.println("Sayi 10 dan kucuktur");
        } else {
            System.out.println("Sayi 10 a eşittir");
        }
        System.out.println("Program bitti");


        // ************ Ex 2 *******************
        String diller = "ingilizce, almanca, arapca, turkce";

        if(diller.contains("arapca"))
        {
            System.out.println("Tebrikler arapca biliyorsunuz");
        }
       if (diller.contains("turkce"))
        {
            System.out.println("Tebrikler turkce biliyorsunuz");
        }

        // ************ Ex 3 *******************

        int sayi1 = 220, sayi2 = 100, sayi3 = 1;

        int max = sayi1;

        if (max < sayi2) {
            max = sayi2;
        }

        if (max < sayi3) {
            max = sayi3;
        }
        System.out.println("Max sayi : " + max);

        // ************ Ex 4 *******************

        String cinsiyet = "bayan";
        int yas = 24;

        if (cinsiyet.equals("erkek") && yas >= 20) {
            System.out.println("Asker olabilirsiniz");
        }
        System.out.println("program sonu");

        // ************ Ex 5 *******************

        Random rnd = new Random();
        int not = rnd.nextInt(101); // 0 -100
        System.out.println(not);


        if (not >= 0 && not < 45) {
            System.out.println("Kaldiniz. Notunuz : 1");
        } else if (not >= 45 && not < 60) {
            System.out.println("Gectiniz, ama calismalisiniz");
        } else if (not >= 60 && not < 85) {
            System.out.println("Geçtiniz, iyi");
        } else {
            System.out.println("harikasiniz");
        }

        // ************ Ex 6 *******************
        String gun = "pazar"; // cumartesi

        if(gun.equalsIgnoreCase("Cumartesi") ||  gun.equalsIgnoreCase("Pazar")) //
        {
            System.out.println("Hafta sonu");
        }
        else
        {
            System.out.println("Hafta içi");
        }

        // ************ Ex 7 *******************

        //ternary operator
        int num = 15;
        String status = "";
        status = (num % 2 == 0) ? "cift" : "tektir";
        System.out.println(status);

        if (num % 2 == 1) {
            System.out.println("tektir");
        } else {
            System.out.println("cifttir");
        }



    }
}
