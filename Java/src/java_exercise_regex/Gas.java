package java_exercise_regex;

import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Gas {
    public static Object Consumption(String gasload, String distance, String remaining) {

        DecimalFormat format = new DecimalFormat("#.###");

        String regex = "([^0-9\\.]+)";
        String gasLoad = gasload.replaceAll(regex, "");
        String distanceRepl = distance.replaceAll(regex, "");
        String remainingGas = remaining.replaceAll(regex, "");

        float gasLoadConv;
        float distanceConv;
        float remainingGasConv;
        try {
            gasLoadConv = Float.parseFloat(gasLoad);
            distanceConv = Float.parseFloat(distanceRepl);
            remainingGasConv = Float.parseFloat(remainingGas);
        } catch (Exception e) {
            return null;
        }

        Pattern gas = Pattern.compile("l$", Pattern.CASE_INSENSITIVE);
        Pattern remain = Pattern.compile("l$", Pattern.CASE_INSENSITIVE);
        Pattern dist = Pattern.compile("km$", Pattern.CASE_INSENSITIVE);

        Matcher gasMatch = gas.matcher(gasload);
        Matcher remainMatch = remain.matcher(remaining);
        Matcher kmMatch = dist.matcher(distance);


        if (remainMatch.find() && gasMatch.find() && kmMatch.find()) {
            if (remainingGasConv > gasLoadConv) {
                return null;
            } else {
                float fuelPerKM = (gasLoadConv - remainingGasConv) / distanceConv;
                float roundOff = Float.parseFloat(format.format(fuelPerKM));
                return String.valueOf(roundOff)+"L/km";
                // return roundOff;
            }
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Consumption("40", "30", "5" );
    }
}


//        String regex = "[^\\d\\.]+]";
//
//        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
//        Matcher gasLoad = pattern.matcher(gasload);
//        Matcher distanceBus = pattern.matcher(distance);
//        Matcher remainingGas = pattern.matcher(remaining);
//
//        float gasLoadF;
//        float remainingF;
//        float distanceF;
//
//        try {
//            gasLoadF = Float.parseFloat(gasload);
//            remainingF = Float.parseFloat(remaining);
//            distanceF = Float.parseFloat(distance);
//        } catch (Exception e) {
//            return null;
//        }
//
//        if(remainingF > gasLoadF) {
//            return null;
//        }
//
//        else if (gasload.matches(".*l*.") || gasload.matches(".*L*.") || remaining.matches(".*l*.") || remaining.matches(".*L*.")  || distance.matches(".*km*.") || distance.matches(".*KM*.")){
//            float fuelEveryKm = Math.round(gasLoadF - remainingF / distanceF * 100f) / 100f;
//
//            System.out.println(String.valueOf(fuelEveryKm)+"L/km");
//            return String.valueOf(fuelEveryKm)+"L/km";
//        }
//        else {
//            return null;
//        }

//     public static void main(String[] args) {
//     Consumption("45","30","40");
//     }