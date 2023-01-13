package java_exercise_1;

import java.util.Scanner;
public class DaysInAMonth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        String thirty = "30 days";
        String thirtyOne = "31 days";

        if (month % 2 != 0 && !(month > 7) || month == 8 || month == 10 || month == 12) {
            System.out.print(thirtyOne);
        } else if (month % 2 == 0 && !(month == 2) || month == 9 || month == 11 ) {
            System.out.print(thirty);
        }
        else {
            System.out.println("29 days");
        }
    }
}
