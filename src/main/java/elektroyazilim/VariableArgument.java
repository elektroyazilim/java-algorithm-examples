package elektroyazilim;

public class VariableArgument {
    public static void main(String[] args) {

        // array declarations
        int[] sayilar = new int[6];
        int[] numbers = {1, 23, 4, 5, 7, 7};
        int[] sylar = new int[]{1, 2, 3, 4, 5, 6, 7};

        // calling methods

        carpma(sylar);
        carpma3Dot(numbers);
    }
    public static void carpma(int[] sayilar) {
        int carpma = 1;
        for (int sayi : sayilar) {
            carpma = carpma * sayi;
        }
        System.out.println(carpma);
    }

    public static void carpma3Dot(int... parameters) {
        int carpma = 1;
        for (int sayi : parameters) {
            carpma = carpma * sayi;
        }
        System.out.println(carpma);
    }

}
