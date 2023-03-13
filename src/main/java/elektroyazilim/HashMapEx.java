package elektroyazilim;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapEx {
    public static void main(String[] args) {

        HashMap liste = new HashMap();
        liste.put("Ali", 100);
        liste.put("Osman", 89);
        liste.put("İbrahim", 95);

        System.out.println(liste);

        Set setListe = liste.entrySet(); // tüm liste Set olarak geliyor.
        System.out.println("Whole Map as a Set");
        System.out.println(setListe);

        System.out.println("Only Keys");
        Set setKey = liste.keySet();
        System.out.println(setKey);

        liste.remove("İbrahim");
        System.out.println(liste);

        liste.replace("Ali", 85);
        System.out.println(liste);

        System.out.println(liste.values());
        System.out.println(liste.get("Osman"));

        HashMap<Integer, String> myList = new HashMap<>(); // generic
        myList.put(12, "Ali");
        myList.put(13, "Osman");
        myList.put(14, "Ahmet");
        myList.put(15, "Hasan");
        myList.put(16, "Orhan");

        System.out.println(myList);
        System.out.println(myList.entrySet());

        for (Map.Entry<Integer, String> item : myList.entrySet()) {
            System.out.print(item);
            System.out.print("\nKey : " + item.getKey());
            System.out.print("\tValue : " + item.getValue()+"\n");

        }
    }
}
