package java_exercise_2;

import java.util.Scanner;

public class Birthdays {

    public static void main(String[] a) {
        Scanner scan = new Scanner(System.in);

        float n = 0;
        float x = 0;
        float p = 0;
        float answer = 0;

        float initialBirthdayMoney = 10;
        float initialNaughtyMoney = 1;
        float birthdayMoney = 0;
        float totalSavings = 0;

        n = scan.nextFloat();
        x = scan.nextFloat();
        p = scan.nextFloat();

        int even = (int)(n)/2;
        int odd = ((int)n/2) +((int)n%2);

        float totalToysPrice = p * (float)odd;

        /* 10 yrs old
        * even numbers: 2, 4, 6, 8, 10
        * i: 1, 2, 3, 4, 5
        * initial value of money = 10
        * loop: 1, 2, 3, 4, 5
        * value: 10, 20, 30, 40, 50
        * birthdayMoney: 10, 30, 60, 100, 150
        *
        * */
        /**
         *
         */
        for (int i = 1; i <= even; i++) {
            birthdayMoney += (float)i*initialBirthdayMoney;
            System.out.println(birthdayMoney);
        }

        float naughtyMoney = even * initialNaughtyMoney;

        totalSavings = totalToysPrice + (birthdayMoney - naughtyMoney);

        if (x <= totalSavings) {
            answer = totalSavings - x;
            System.out.printf("Yes! you still have %.2f left", answer);

        } else {
            answer = x - totalSavings;
            System.out.printf("No! you still need %.2f", answer);
        }
    }
}