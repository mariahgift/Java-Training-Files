package java_exercise_regex;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GlobalWipeDown {
    public static Object downloadtime(String filesize, String speed){
        //codehere
        DecimalFormat format = new DecimalFormat("#.###");
         format.setRoundingMode(RoundingMode.HALF_UP);

        String fileSize = filesize.replaceAll("([^0-9.]+)", "");
        String speedSize = speed.replaceAll("([^0-9.]+)", "");

        double fileSizeConv;
        double speedConv;

        try {
            fileSizeConv = Double.parseDouble(fileSize);
            speedConv = Double.parseDouble(speedSize);
        } catch (Exception e) {
            return null;
        }

        Pattern kb = Pattern.compile("kb$");
        Pattern mb = Pattern.compile("mb$");
        Pattern gb = Pattern.compile("gb$");

        Matcher kbMatch = kb.matcher(filesize);
        Matcher mbMatch = mb.matcher(filesize);
        Matcher gbMatch = gb.matcher(filesize);


        if(kbMatch.find()) {
            double kbFileSize = fileSizeConv * 8;
            double kbSpeedSize = speedConv * 1000;
            double kbTime = kbFileSize / kbSpeedSize;
            double kbTotal = kbTime / 60;
            double kbRoundOff = Double.parseDouble(format.format(kbTotal));
            System.out.println(kbRoundOff);
            return kbRoundOff;
        }
        else if (gbMatch.find()) {
            double gbFileSize = fileSizeConv * 8 * 1000 * 1000;
            double gbSpeedSize = speedConv * 1000;
            double gbTime= gbFileSize / gbSpeedSize;
            double gbTotal = gbTime / 60;
            double gbRoundOff = Double.parseDouble(format.format(gbTotal));
            System.out.println(gbRoundOff);
            return gbRoundOff;

        } else if (mbMatch.find()) {
            double mbFileSize = fileSizeConv * 8 * 1000;
            double mbSpeedSize = speedConv * 1000;
            double mbTime= mbFileSize / mbSpeedSize;
            double mbTotal = mbTime / 60;
            double mbRoundOff = Double.parseDouble(format.format(mbTotal));
            System.out.println(mbRoundOff);
            return mbRoundOff;

        } else {
            return null;
        }
    }

     public static void main(String[] args) {
         downloadtime("23kb", "2mbps");
     }
}
