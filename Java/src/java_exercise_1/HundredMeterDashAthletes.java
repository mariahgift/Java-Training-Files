package java_exercise_1;

import java.util.Scanner;
public class HundredMeterDashAthletes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fAthlete = scan.nextInt();
        int sAthlete = scan.nextInt();
        int tAthlete = scan.nextInt();
        int totalTime = fAthlete + sAthlete + tAthlete;

        int totalMinutes;
        totalMinutes = totalTime / 60;

        int totalSeconds;
        totalSeconds = totalTime % 60;

        if (totalSeconds >= 10) {
            System.out.print(totalMinutes + ":" + totalSeconds);
        }
        else {
            System.out.print(totalMinutes + ":0" + totalSeconds);
        }

    }
}
