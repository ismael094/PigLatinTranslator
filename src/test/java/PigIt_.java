import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class PigIt_ {
    @Test
    public void pigit_an_empty_string_should_return_empty() {
        assertThat(pigIt("")).isEqualTo("");
    }

    @Test
    public void pigit_Hola_string_should_return_olaHay() {
        assertThat(pigIt("Hola")).isEqualTo("olaHay");
    }

    @Test
    public void pigit_No_string_should_return_oNay() {
        assertThat(pigIt("No")).isEqualTo("oNay");
    }

    @Test
    public void pigit_with_two_words_string_should_return_the_pigit_of_the_words() {
        assertThat(pigIt("Hola no")).isEqualTo("olaHay onay");
    }

    @Test
    public void pigit_with_special_character_should_not_be_pigit() {
        assertThat(pigIt("![]")).isEqualTo("![]");
    }

    private String pigIt(String phrase) {
        if (phrase.length() == 0)
            return "";
        return Arrays.stream(phrase.split(" "))
                .map(this::pigItWord)
                .collect(Collectors.joining(" "));
    }

    private String pigItWord(String word) {
        if (word.replaceAll("[A-Za-z]", "").length() != 0)
            return word;
        return word.substring(1) + word.charAt(0) + "ay";
    }
}
