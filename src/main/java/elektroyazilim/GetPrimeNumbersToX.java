package elektroyazilim;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Utils {
    //isItPrime method checks any number is prime or not
    public boolean isItPrime(int num) {
        int count = 0;
        if (num == 2) {
            count = 0;
        } else if (num < 0 || num == 0 || num == 1) {
            count++;
        } else {
            count = 0;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    count++;
                    break;
                }
            }
        }
        boolean isPrime = count != 0 ? false : true;
        return isPrime;
    }

    // getPrimeNumbersToX method returns
    // the list of all prime numbers from 0 to the given number (max)
    public List<Integer> getPrimeNumbersToX(int max) {
        List<Integer> primeList = new ArrayList<>();
        for (int i = 0; i <= max; i++) {
            if (isItPrime(i)) {
                primeList.add(i);
            }

        }
        return primeList;
    }

}

public class GetPrimeNumbersToX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the up limit of the prime numbers' list (ex: 100): ");
        int upNum = scanner.nextInt();

        Utils obj = new Utils();
        List<Integer> primeNums = obj.getPrimeNumbersToX(upNum);
        System.out.println("Prime Numbers to " + upNum +":\n"+  primeNums);
    }
}



