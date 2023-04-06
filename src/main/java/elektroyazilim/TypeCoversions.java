package elektroyazilim;

public class TypeCoversions {
    public static void main(String[] args) {
        // byte < short < int  < long < float < double


        int sayi1 = 50;     // 4 byte
        byte sayi2 = 75;    // 1 byte

        sayi1 = sayi2;  // no missing data -- automatic

        sayi2 = (byte) sayi1; // can be missing data

        float fsayi = 12.3232f;
        double dsayi = 162.121212;

        dsayi = fsayi;
        fsayi = (float) dsayi;


        int iSayi = 129, iSayi2 = 355;
        byte bSayi = 1;

        System.out.println("Integer number : "+ iSayi2);

        bSayi = (byte) iSayi2; // tasma

        System.out.println("Byte sayı : "+ bSayi);

        // String to Numbers Methods

        String anyNum = "123";
        int intOfAnyNum = Integer.parseInt(anyNum);
        float floatOfAnyNum = Float.parseFloat(anyNum);
        // ...............

        // Numbers to String

        // 1.way
        String strNum = 123 +"";

        // 2.way
        String sNum = String.valueOf(567);


    }
}
