package elektroyazilim;

import java.util.Scanner;

class IsItPrime {

    // this method finds any number is prime or not
    public boolean isItPrime(int num) {
        int count = 0;
        if (num == 2) {
            System.out.println("asal : min");
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
}

public class FindPrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any integer num : ");
        int number = input.nextInt();

        Utils utils = new Utils();
        boolean isPrime = utils.isItPrime(number);
        System.out.println("Is " + number + " prime? : " + isPrime);
    }


}
