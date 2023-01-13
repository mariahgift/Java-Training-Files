package java_exercise_1;

import java.util.Scanner;
public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();


        if (year % 12 == 0) {
            System.out.print("Monkey");
        } else if (year % 12 == 1) {
            System.out.print("Rooster");
        } else if (year % 12 == 2) {
            System.out.print("Dog");
        } else if (year % 12 == 3) {
            System.out.print("Boar");
        } else if (year % 12 == 4) {
            System.out.print("Rat");
        } else if (year % 12 == 5) {
            System.out.print("Ox");
        } else if (year % 12 == 6) {
            System.out.print("Tiger");
        } else if (year % 12 == 7) {
            System.out.print("Hare");
        } else if (year % 12 == 8) {
            System.out.print("Dragon");
        } else if (year % 12 == 9) {
            System.out.print("Snake");
        } else if (year % 12 == 10) {
            System.out.print("Horse");
        } else if (year % 12 == 11) {
            System.out.print("Sheep");
        }
        else {
            System.out.print("Invalid input");
        }

    }
}
