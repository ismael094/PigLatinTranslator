import java.util.Arrays;
import java.util.stream.Collectors;

public class PigLatinTranslator {

    public static String pigIt(String phrase) {
        return Arrays.stream(phrase.split(" "))
                .map(PigLatinTranslator::pigItWord)
                .collect(Collectors.joining(" "));
    }

    private static String pigItWord(String word) {
        return word.length() > 0 && word.replaceAll("[A-Za-z]", "").length() == 0 ? word.substring(1) + word.charAt(0) + "ay" : word;
    }
}