package exercises;

import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 3 numbers");
        System.out.print("Enter the first number: ");
        double fnumber = scan.nextInt();
        System.out.print("Enter the second number: ");
        double snumber = scan.nextInt();
        System.out.print("Enter the third number: ");
        double tnumber = scan.nextInt();

        System.out.println("Please enter the operation you want to proceed. " +
                "\n [1] Addition " +
                "\n [2] Subtraction" +
                "\n [3] Multiplication" +
                "\n [4] Division" );

        System.out.print("Operation: ");
        int operation = scan.nextInt();

        if (operation == 1) {
            System.out.println("Sum: " + (fnumber + snumber + tnumber));
        } else if (operation == 2) {
            System.out.println("Difference: "+ (fnumber - snumber - tnumber));
        } else if (operation == 3) {
            System.out.println("Product: " + (fnumber * snumber * tnumber));
        } else if (operation == 4) {
            System.out.println("Quotient: " + (fnumber / snumber / tnumber));
        }
        else {
            System.out.println("The number is invalid");
        }
    }
}
