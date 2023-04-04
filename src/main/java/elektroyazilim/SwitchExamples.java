package elektroyazilim;

public class SwitchExamples {
    public static void main(String[] args) {

        int day = 5;

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong expression");
        }


        int month  = 2;

        switch (month){
            case 12:
                System.out.println("December");
            case 1:
                System.out.println("January");
            case 2:
                System.out.println("February");
                System.out.println("** Winter Season **");
                break;
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("May");
                System.out.println("** Spring Season **");
                break;
            case 6:
                System.out.println("June");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("August");
                System.out.println("** Summer Season **");
                break;
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("October");
            case 11:
                System.out.println("November");
                System.out.println("** Fall Season **");
                break;

        }



        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Week days");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Wrong statement");

        }

        if (day == 1 || day == 2 || day == 3 || day == 4 || day == 5) {
            System.out.println("Weekdays");
        } else if (day == 6 || day == 7) {
            System.out.println("Weekend");
        }
        else
        {
            System.out.println("Wrong Statement");
        }
    }
}
