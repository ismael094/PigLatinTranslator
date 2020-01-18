import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PigIt_ {
    @Test
    public void order_an_empty_string_should_return_empty() {
        assertThat(pigIt("")).isEqualTo("");
    }

    private String pigIt(String pharse) {
        return "";
    }
}
