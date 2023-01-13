package java_exercise_regex;

import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static Object basicmath(String word) {
        DecimalFormat format = new DecimalFormat("#.##");

        String[] arrayOfString = word.split(" ");
        if (arrayOfString.length == 4) {
            arrayOfString[1] = arrayOfString[1] + arrayOfString[2];
            arrayOfString[2] = arrayOfString[3];
        }

        float firstNum;
        float secondNum;

        try {
            firstNum = Float.parseFloat(arrayOfString[0]);
            secondNum = Float.parseFloat(arrayOfString[2]);
        } catch (Exception e) {
            return null;
        }

        Pattern pattern = Pattern.compile("(A-Za-z)");
        Matcher matcher = pattern.matcher(arrayOfString[1]);

        if (matcher.find()) {
            return null;
        }
        float answer = 0;

        System.out.println(arrayOfString[0]);
        System.out.println(arrayOfString[1]);
        System.out.println(arrayOfString[2]);

        if (arrayOfString[1].equals("plus")) {
            answer = firstNum + secondNum;
        } else if (arrayOfString[1].equals("minus")) {
            answer = firstNum - secondNum;
        } else if (arrayOfString[1].equals("times")) {
            answer = firstNum * secondNum;
        } else if (arrayOfString[1].equals("divided by")) {
            answer = firstNum / secondNum;
        } else {
            return null;
        }
        System.out.println(answer);
        return format.format(answer);
    }

    public static void main(String[] args) {
        basicmath("1 plus 1");
        basicmath("4 times 4");
    }
}
