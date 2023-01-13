package java_exercise_1;

import java.util.Scanner;
public class Quake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double magnitude;

        magnitude = scan.nextDouble();

        if (magnitude < 2.0) {
            System.out.print("Micro");
        } else if (magnitude >=2.0 && magnitude < 3.0) {
            System.out.print("Very Minor");
        }  else if (magnitude >=3.0 && magnitude < 4.0) {
            System.out.print("Minor");
        }  else if (magnitude >=4.0 && magnitude < 5.0) {
            System.out.print("Light");
        } else if (magnitude >=5.0 && magnitude < 6.0) {
            System.out.print("Moderate");
        } else if (magnitude >=6.0 && magnitude < 7.0) {
            System.out.print("Strong");
        } else if (magnitude >=7.0 && magnitude < 8.0) {
            System.out.print("Major");
        } else if (magnitude >=8.0 && magnitude < 10.0) {
            System.out.print("Great");
        } else {
            System.out.print("Meteoric");
        }

    }
}
