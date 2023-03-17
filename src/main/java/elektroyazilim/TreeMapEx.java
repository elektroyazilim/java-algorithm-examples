package elektroyazilim;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap liste = new TreeMap();

        HashMap<String, Integer> myList = new HashMap<>();

        myList.put("Osman", 100);
        myList.put("Ali", 89);
        myList.put("Abdullah", 76);
        myList.put("Ahmet", 95);

        for (Map.Entry<String, Integer> isim : myList.entrySet() ) {
            System.out.println(isim);
            System.out.println(isim.getKey());
            System.out.println(isim.getValue());

        }
    }
}
