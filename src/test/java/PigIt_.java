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

    private String pigIt(String pharse) {
        if (pharse.length() == 0)
            return "";
        return "olaHay";
    }
}
