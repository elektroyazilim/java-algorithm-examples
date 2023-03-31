package elektroyazilim;

class FindCity {
    public int usingWhile(String[] cities, String wanted) {

        int index = 0;
        int count = 0;

        while (index < cities.length) {

            if (cities[index].equals(wanted)) {
                System.out.println("Congratulations You got it. Index : " + index);
                count++;
                break;
            }

            index++;
        }
        if (count == 0) {
            System.out.println("Unfortunately, there is no city the name of " + wanted);
        }
        return index;
    }

    public int usingFor(String[] cities, String wanted) {
        boolean isExist = false;

        int i;
        for (i = 0; i < cities.length; i++) {

            if (cities[i].equals(wanted)) {
                isExist = true;
                break;
            }
        }

        if (isExist) // true
        {
            System.out.println("Congratulations You got it. Index : " + i);
        } else {
            System.out.println("Unfortunately, there is no city the name of " + wanted);
        }
        return i;
    }
}

public class FindStrOnArray {
    public static void main(String[] args) {

        String[] cities = {"Ankara", "Konya", "İstanbul", "Adana", "Rize"};
        String wanted = "Rize";

        FindCity fc = new FindCity();
        fc.usingWhile(cities, wanted);
        fc.usingWhile(cities,wanted);
    }
}
