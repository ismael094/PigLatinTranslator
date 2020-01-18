import org.junit.Test;

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

    private String pigIt(String phrase) {
        if (phrase.length() == 0)
            return "";
        return phrase.substring(1) + phrase.charAt(0) + "ay";
    }
}
