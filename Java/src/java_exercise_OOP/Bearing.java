package java_exercise_OOP;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bearing {
    public String speed;
    public String time;
    public float degree;

    public Bearing(String speed, float degree, String time) {
        this.speed = speed;
        this.time = time;
        this.degree = degree;
    }

    public float Time_conv() {
        String regex = "([^0-9\\.]+)";
        String timeStr = (this.time).replaceAll(regex, "");
        int timeConv = Integer.parseInt(timeStr);
        Pattern seconds = Pattern.compile("sec$", Pattern.CASE_INSENSITIVE);
        Pattern minutes = Pattern.compile("min$", Pattern.CASE_INSENSITIVE);
        Pattern hour = Pattern.compile("hr$", Pattern.CASE_INSENSITIVE);

        Matcher secMatch = seconds.matcher(this.time);
        Matcher minMatch = minutes.matcher(this.time);
        Matcher hrMatch = hour.matcher(this.time);

        if (secMatch.find()) {
            float secs = (timeConv / 60) / 60;
//            System.out.println(secs);
            return secs;
        } else if (minMatch.find()) {
            float mins = timeConv / 60;
//            System.out.println(mins);
            return mins;
        } else if (hrMatch.find()) {
//            System.out.println(timeConv);
            return timeConv;
        } else {
            return 0.0f;
        }
    }

    public float Distance() {
        String regex = "([^0-9\\.]+)";

        String speedStr = (this.speed).replaceAll(regex, "");
        float speedConv = Float.parseFloat(speedStr);
        Pattern knots = Pattern.compile("Knots$", Pattern.CASE_INSENSITIVE);
        Matcher knotsMatch = knots.matcher(this.speed);


        if (knotsMatch.find()) {
            float knotsPerHour = 1.85200f;
            speedConv = (knotsPerHour * Time_conv()) * speedConv;
            float speedRoundOff = Math.round(speedConv*100.0)/100.0f;
            System.out.print(speedRoundOff + "km ");
            return speedRoundOff;
        } else  {
            return 0.0f;
        }
    }

    public String Compass_Bearing() {
        float givenDegree = this.degree;
        if (givenDegree == 0 || givenDegree == 360) {
            System.out.println("North");
            return "North";
        } else if (givenDegree > 0 && givenDegree < 90) {
            float eastNorth = 90f - givenDegree;
            String cbEastNorth = "North " + eastNorth + "° East";
            System.out.println(cbEastNorth);
            return cbEastNorth;
        } else if (givenDegree == 90) {
            String east = "East";
            System.out.println(east);
            return east;
        } else if (givenDegree > 90 && givenDegree < 180) {
            float southEast = 180f - givenDegree;
            String cbSouthEast = "South " + southEast + "° East";
            System.out.print(cbSouthEast);
            return cbSouthEast;
        } else if (givenDegree == 180) {
            String south = "South";
            System.out.print(south);
            return south;
        } else if (givenDegree > 180 && givenDegree < 270) {
            float westSouth = 270f - givenDegree;
            String cbWestSouth = "South " + westSouth + "° West";
            System.out.print(cbWestSouth);
            return cbWestSouth;
        } else if (givenDegree == 270) {
            String west = "West";
            System.out.print(west);
            return west;
        } else if (givenDegree > 270 && givenDegree < 360) {
            float northWest = 360f - givenDegree;
            String cbNorthWest = "North " + northWest + "° West";
            System.out.print(cbNorthWest);
            return cbNorthWest;
        }
        return String.valueOf(givenDegree);
    }

    public String final_answer() {
        return String.valueOf(Distance() + Compass_Bearing());
    }

     public static void main(String[] args) {
         Bearing bearing = new Bearing("29.70 Knots", 90, "300min");
         bearing.final_answer();
//         bearing.Distance();
     }
}
