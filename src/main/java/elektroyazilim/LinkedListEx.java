package elektroyazilim;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        ArrayList myArray = new ArrayList(); // List myArray2 = new ArrayList();

        LinkedList liste = new LinkedList();
        LinkedList<String> sehirler = new LinkedList<>();

        //List liste = new LinkedList();
        liste.add("Ankara");
        liste.add("Kırıkkale");
        liste.add("Ağrı");
        liste.add(12);

        System.out.println(liste);

        liste.add(0,"Adana");

        System.out.println(liste);

        liste.remove("Kırıkkale");
        liste.remove(2);

        System.out.println(liste);


    }
}
