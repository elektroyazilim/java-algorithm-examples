package elektroyazilim;

class FindMaxNum{
    public static int findMax(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int num : arr) {

            if (max < num) {
                max = num;
            }
        }
        System.out.println("Max num: " + max);

        return max;

    }

    public static double findMax(double[] dizi) {

        double max = Double.MIN_VALUE;

        for (double num : dizi) {

            if (max < num) {
                max = num;
            }
        }
        System.out.println("Max num: " + max);

        return max;

    }
}

public class FindMaxInArray {
    public static void main(String[] args) {
        int[] numbers = {100, 500, 90, 34, 21};

        int maxNum = FindMaxNum.findMax(numbers);
        System.out.println(maxNum);

        // Method Overloading

        double[] doubleArr = {1.2, 5.8, 90.3, 45.1};
        double max = FindMaxNum.findMax(doubleArr);
        System.out.println(max);
    }
}
