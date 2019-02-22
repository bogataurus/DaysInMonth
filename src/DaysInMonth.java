import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        daysInMonth();
    }
    public static void daysInMonth() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a month number: ");
        int month = input.nextInt();

        if (month >= 0 && month <= 7) {
            if ( month == 2) {
                System.out.println("Days 28");
            } else if (month % 2 != 0) {
                System.out.println("Days 31");
            } else {
                System.out.println("Days 30");
            }


        } else if (month > 7 && month <= 12) {
            if (month % 2 != 0) {
                System.out.println("Days 30");
            } else {
                System.out.println("Days 31");
            }

        }else {
            System.out.println("Enter a month 1 to 12 between");

        }
    }
}
