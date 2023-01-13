package java_exercise_1;

import java.util.Scanner;
public class DogYears {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int humanYears;
        float dogConvertYears = 10.5f;
        int addDogYears = 4;
        int dogTwoYears = 21;

        humanYears = scan.nextInt();

        if (humanYears <= 2) {
            float dogLessTwoYears = humanYears*dogConvertYears;
            System.out.print(dogLessTwoYears);

        }
        else {
            int dogYears = dogTwoYears + (humanYears - 2) * addDogYears;
            System.out.print(dogYears);
        }
    }
}
