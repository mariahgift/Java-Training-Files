package exercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RepeatedWords {
    public static void main(String[] args) {

        // \b - word boundary
        // [A-Z] - range, match A-Z. one or more times
        // [A-Z]+ - one or more word times
        // \s - whitespace character
        // \s+ - one or more space characters
        // 1 - refers to the matched group
        // \b - word boundary

        String regex = "\\b([A-Z]+)(\\s+\\1\\b)";
        String phrase = "HELLO WORLD WORLD " +
                " JACK AND JILL WENT UP THE THE HILL  " +
                "WE ARE THE CHAMPS CHAMPS";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher match = pattern.matcher(phrase);

        while (match.find()) {
            System.out.println(match.group(1));
        }
    }
}
