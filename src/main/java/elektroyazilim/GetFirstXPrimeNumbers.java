package elektroyazilim;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class GetFirstXPrimeNums{

    // this method finds any number is prime or not
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



    // This method gets the list of "First X Prime Numbers"
    public List<Integer> getFirstXPrimeNumbers(int primeCount) {

        if(primeCount<=0 )
        {
            System.out.println("Invalid Number");
            return null;
        }
        List<Integer> primeList = new ArrayList<>();
        int max = primeCount;

        int counter = 0;
        for (int i = 0; i <= max; i++) {
            if (isItPrime(i)) {
                primeList.add(i);
                counter++;
                if (counter == primeCount)
                    break;
            }
            if (i == max) {
                max++;
            }
        }
        return primeList;
    }
}

public class GetFirstXPrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers do you want? (Ex: 100) : ");
        int countOfPNums = input.nextInt();

        GetFirstXPrimeNums obj = new GetFirstXPrimeNums();
        List<Integer> firstXPrimeNumbers = obj.getFirstXPrimeNumbers(countOfPNums);

        if(firstXPrimeNumbers!=null)
            System.out.println(firstXPrimeNumbers);


    }

}


