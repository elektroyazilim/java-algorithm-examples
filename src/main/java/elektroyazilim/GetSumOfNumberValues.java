package elektroyazilim;

public class GetSumOfNumberValues {
    public static void main(String[] args) {
        String number = "523798";
        int sum = getValueOfNumbers(number);
        System.out.println(sum);
    }

    public static int getValueOfNumbers(String numberstr)
    {
        int i = 0;  // charAt(index);
        int sum = 0;

        // toplama = sayi + sayi;
        // System.out.println(1+"aaa"); // 1+"" --> String // ""+1 --> String e donusturme

        while (i < numberstr.length()) // i --> 0,1,2,3,4,5,6,7
        {
            String ch = numberstr.charAt(i) + ""; // String e donusturme ( char to String )
            int sayi = Integer.parseInt(ch); // String to Integer  "7" -> 7

            sum = sum + sayi;
            i++; // unutursak sonsuz dongu
        }
        return sum;
    }
}
