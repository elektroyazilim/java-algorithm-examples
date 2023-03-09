package elektroyazilim;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iterators {
    // Iterator and List Iterator
    public static void main(String[] args) {
        // List - ArrayList - LinkedList

        ArrayList<String> sehirler = new ArrayList<>();

        sehirler.add("Bursa");
        sehirler.add("Ankara");
        sehirler.add("İstanbul");


        Iterator it = sehirler.iterator();

        it.next();
        it.remove();
        System.out.println(sehirler);



        ArrayList<String> isimler = new ArrayList<>();

        isimler.add("Ali");
        isimler.add("Veli");
        isimler.add("Ahmet");

        System.out.println(isimler);

        ListIterator li = isimler.listIterator();
        System.out.println("Önceki eleman : " + li.hasPrevious());
        System.out.println("Sonraki eleman : " + li.hasNext());

        System.out.println(li.next());
        System.out.println(li.next());

        System.out.println(li.hasPrevious());
        System.out.println(li.previous());
        System.out.println(li.previous());
        System.out.println(li.hasPrevious());

        li.set("Osman");
        li.remove();
        li.add("Ömer");
        System.out.println(isimler);

        System.out.println("Program sonu");

    }
}
