package exercises;

public class BirdWatcher {
    public static void main(String[] args) {
        noVisitBird();
        busyDays();
        totalOfVisitBirds();
}
    public static void noVisitBird() {
        int[] birdPerDay = {2, 5, 0, 7, 4, 1};
        boolean no_zero = true;
        for (int i = 0; i < birdPerDay.length; i++) {
            if (birdPerDay[i] == 0) {
                no_zero = false;
                System.out.println("true");
            }
        }
        if (no_zero) {
            System.out.println("false");
        }
    }

    public static void totalOfVisitBirds() {
        int[] birdPerDay = {2, 5, 0, 7, 4, 1};
        int sum = 0;
        for (int i = 0; i < birdPerDay.length-1; i++) {
            sum += birdPerDay[i];
        }
        System.out.println(sum);
    }

    public static void busyDays() {
        int[] birdPerDay = {2, 5, 0, 7, 4, 1};
        int busyDays = 0;
        for (int i = 0; i < birdPerDay.length; i++) {
            if (birdPerDay[i] >= 5) {
                busyDays++;
            }
        }
        System.out.println(busyDays);
    }
}
