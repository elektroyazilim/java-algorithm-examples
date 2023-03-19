package elektroyazilim;

import java.util.HashSet;
import java.util.TreeSet;

public class TressSetBasic {
    public static void main(String[] args) {
        HashSet hSet = new HashSet<>();
        // datalari aliyor

        TreeSet tSet = new TreeSet<>(); // type lar aynı tip

        // dataları aliyor + siraliyor

        /*
        tSet.add("Osman");
        tSet.add("Ali");
        tSet.add("Veli");

         */

        tSet.add(23);
        tSet.add(12);
        tSet.add(20);
        tSet.add(2);
        tSet.add(12);

        for(Object sayi : tSet)
        {
            System.out.println(sayi);
        }
    }
}
