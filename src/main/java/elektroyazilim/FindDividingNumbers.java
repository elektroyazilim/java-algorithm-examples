package elektroyazilim;

import java.util.ArrayList;
import java.util.List;

class UtilsDividing {
    public List<Integer> getDividingList(int sayi) {
        // 1,2,3,4,5,6
        List<Integer> bolunenler = new ArrayList<>();

        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                bolunenler.add(i);
            }
        }

        System.out.println(sayi + " nin bölünenleri : " + bolunenler + " - " + bolunenler.size() + " tane");
        return bolunenler;
    }
}

public class FindDividingNumbers {
    public static void main(String[] args) {
        UtilsDividing obj= new UtilsDividing();
        List<Integer> numberList = obj.getDividingList(30);

        System.out.println(numberList);
    }
}

// output
// 30 nin bölünenleri : [1, 2, 3, 5, 6, 10, 15, 30] - 8 tane
// [1, 2, 3, 5, 6, 10, 15, 30]
