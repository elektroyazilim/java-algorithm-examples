package elektroyazilim;

public class WrapperClass {
    public static void main(String[] args) {
        /*
        byte        Byte
        short       Short
        int         Integer
        long        Long
        float       Float
        double      Double
        char        Character
        boolean     Boolean

         */

        // STRING leri to PRIMITIVE tiplere donusturmek icin //PARSE

        int sayi = 3;

        //System.out.println(Integer.max(3,8));

        String yas = "78";

        int yasTamsayi = Integer.parseInt(yas);
        System.out.println();

        String result = "false";
        boolean varMi = Boolean.parseBoolean(result);
        System.out.println();


        // PRIMITIVE tipleri to STRING

        // 1.yol
        String toplam = String.valueOf(45); // "45"

        // 2.yol
        String total = 678 + "";
    }
}
