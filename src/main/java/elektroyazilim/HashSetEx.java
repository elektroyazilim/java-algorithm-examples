package elektroyazilim;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet mySet = new HashSet<>();

        mySet.add("Ayşe");
        mySet.add(12);
        mySet.add(true);
        mySet.add("Osman");
        mySet.add(12.45f);
        mySet.add("Ali");
        mySet.add("Ankara");
        mySet.add("Ayşe");
        mySet.add("Ayşe");
        mySet.add("Ayşe");
        mySet.add("Ayşe");

        mySet.remove("Ayşe");

        Set newSet = new HashSet<>();

        System.out.println(mySet);

        // Set to String
        String dummyStr = mySet.toString();
        System.out.println(dummyStr); // "[12.45, Osman, Ankara, 12, true, Ali]"


        System.out.println(dummyStr.substring(8,13));

        // generic
        HashSet<Integer> sayilar = new HashSet<>();

        sayilar.add(1);
        sayilar.add(12);
        sayilar.add(13);
        sayilar.add(1);
        sayilar.add(11);


        System.out.println(sayilar);
    }
}
