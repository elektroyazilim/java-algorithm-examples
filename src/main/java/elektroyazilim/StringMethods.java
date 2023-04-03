package elektroyazilim;

public class StringMethods {
    public static void main(String[] args) {

        // ******** Sout Usages ***************
        String message = "Java Programlama Dili";

        String city = "Ankara";

        System.out.println(1 + 4 + city); // 5Ankara
        System.out.println(city + 1 + 4); // "Ankara" +"1" +"4" = Ankara14
        System.out.println((1 + 4) + city);
        System.out.println(city + (1 + 4));

        // ******************************************************
        System.out.println("-----------------------------------");

        // **** length()******************

        System.out.println(message.length());
        int length = message.length();
        System.out.println(length);

        // ******************************************************
        System.out.println("-----------------------------------");


        // ***** concat() or +  **************

        String name = "Ali";
        String surname = "Demir";

        String fullName = name.concat(" ").concat(surname);
        System.out.println(fullName);

        fullName = name + " " + surname;
        System.out.println(fullName);

        // ******************************************************
        System.out.println("-----------------------------------");

        // **** indexOf()  ***************

        String anyCity = "Bolu"; // 0,1,2,3
        //int character = anyCity.indexOf("u");
        int index = anyCity.indexOf("lu");
        System.out.println(index);

        System.out.println(anyCity.indexOf("ana")); // not!!

        String word = "Adanali";
        System.out.println(word.indexOf("a"));
        System.out.println(word.lastIndexOf("a"));


        // ******************************************************
        System.out.println("-----------------------------------");

        //  ***** equals() ***********

        name = "ahmet";
        String sName = "Ahmet";

        System.out.println(name.equals(sName));

        boolean isEqual = name.equalsIgnoreCase(sName);
        System.out.println(isEqual);

        // ******************************************************
        System.out.println("-----------------------------------");


        // ***** toLowerCase() ve toUpperCase() ********

        String title = "Java Dili";
        System.out.println(title.toUpperCase());
        System.out.println(title.toLowerCase());

        title = title.toLowerCase();

        System.out.println(sName.toLowerCase().equals(name));

        System.out.println(title);

        // ******************************************************
        System.out.println("-----------------------------------");

        // ********** contains() ************ case sensitive !

        String languages = "     Java, Python, Go, C#, Ruby      ";
        System.out.println(languages.contains("Flutter"));

        // ******************************************************
        System.out.println("-----------------------------------");

        // ****** trim()*************

        System.out.println(languages);
        System.out.println(languages.trim());

        // ******************************************************
        System.out.println("-----------------------------------");

        // ****** charAt() *****************
        String java = "Java Dili";

        char c = java.charAt(5);
        System.out.println("caharacter : " + c);


        // ******************************************************
        System.out.println("-----------------------------------");

        // *********** replace() ****************
        String progLanguages = "Java, Python, Go, C#, Ruby";

        System.out.println(progLanguages);
        String text = progLanguages.replace("Ruby", "Flutter");
        System.out.println(text);

        text = progLanguages.replace(", ", "-");
        System.out.println(text);

        // ******************************************************
        System.out.println("-----------------------------------");

        // ****** substring() **********************

        String msg = "Bugün hava cok guzel";

        String txt = msg.substring(0,4); //  msg.substring(6);
        System.out.println(txt);

        // ******************************************************
        System.out.println("-----------------------------------");


        // ******** startsWith() and endsWith() *********** case sensitive

        System.out.println("Adana\nAnkara\nİstanbul");

        String message2= "Çocuk \"ben bunu istemiyorum\" dedi";
        System.out.println(message2);

        boolean isStart = message2.startsWith("ço"); // not the same with "Ço"
        System.out.println(isStart);

        boolean isEnd = message2.endsWith("di"); 
        System.out.println(isEnd);


    }
}
