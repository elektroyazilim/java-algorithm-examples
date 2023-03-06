package elektroyazilim;

import java.util.ArrayList;
import java.util.Arrays;

class Araba {

    String marka = "Audi";
    String model = "2000";
    int vites = 6;

    public Araba() {
    }

    public Araba(String marka, String model, int vites) {
        this.marka = marka;
        this.model = model;
        this.vites = vites;
    }
}

public class ArrayListExample {
    public static void main(String[] args) {
        int[] sayilar = new int[2]; // [0,0,0,0,0,] 1,2,3,1,2
        sayilar[0] = 14;
        sayilar[1] = 4;

        System.out.println(Arrays.toString(sayilar));

        String[] harfler = {"a", "b", "c", "d"};

        System.out.println("----------------------------------------");

        float[] ondalikliSayilar = new float[]{1.2f, 3.4f, 6.4f};

        System.out.println("----------------------------------------");

        Araba nesne1 = new Araba();
        Araba nesne2 = new Araba();
        Araba nesne3 = new Araba();

        Araba[] arabalar = {nesne1, nesne2, nesne3};

        System.out.println("----------------------------------------");

        ArrayList liste = new ArrayList();  // genel her type içine alabilir

        liste.add("Konya");
        liste.add("Adana");
        liste.add("Ankara");
        liste.add("Konya");
        liste.add(11);
        liste.add(true);
        liste.add(45.34f); // List in avantajı

        System.out.println(liste);


        for (int i = 0; i < liste.size() ; i++) {  // sayilar.length
            System.out.println(liste.get(i));      //System.out.println(sayilar [i]);

        }

        for (Object item : liste) {
            System.out.println(item);

        }

        liste.remove(2);
        liste.remove("Konya");

        System.out.println(liste);

        System.out.println(liste.get(4)); // [4]
        System.out.println("Size : " + liste.size()); // sayilar.length

        System.out.println(liste.contains("Konya"));

        int index = liste.indexOf("Konya");
        System.out.println(index);

        liste.clear();

        System.out.println("----------------------------------------");

        // generic

        ArrayList<String> sehirler = new ArrayList<>();  // int[] sehir = new int[3];

        sehirler.add("Ankara");
        sehirler.add("Rize");
        sehirler.add(0, "Bursa");


        System.out.println(sehirler); // [Bursa, Ankara, Rize]

        sehirler.add(1, "Denizli");

        System.out.println(sehirler);
        sehirler.add("Tokat");

        for (String sehir : sehirler) {
            System.out.println(sehir);

        }
    }
}
