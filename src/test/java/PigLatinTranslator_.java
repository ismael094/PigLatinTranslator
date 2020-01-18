import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PigLatinTranslator_ {

    @Test
    public void pigit_an_empty_string_should_return_empty() {
        assertThat(PigLatinTranslator.pigIt("")).isEqualTo("");
    }

    @Test
    public void pigit_Hola_string_should_return_olaHay() {
        assertThat(PigLatinTranslator.pigIt("Hola")).isEqualTo("olaHay");
    }

    @Test
    public void pigit_No_string_should_return_oNay() {
        assertThat(PigLatinTranslator.pigIt("No")).isEqualTo("oNay");
    }

    @Test
    public void pigit_with_two_words_string_should_return_the_pigit_of_the_words() {
        assertThat(PigLatinTranslator.pigIt("Hola no")).isEqualTo("olaHay onay");
    }

    @Test
    public void pigit_with_special_character_should_not_be_pigit() {
        assertThat(PigLatinTranslator.pigIt("![]")).isEqualTo("![]");
    }
}
