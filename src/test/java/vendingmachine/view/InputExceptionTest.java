package vendingmachine.view;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class InputExceptionTest {
    @ParameterizedTest
    @ValueSource(strings = {"", " "})
    public void nullException_test(String userInput) {
        assertThatThrownBy(()-> {
            InputException.nullException();
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @ValueSource(strings = {"", " "})
    public void isDigit_test(String userInput) {
        assertThatThrownBy(()-> {
            InputException.notNumberException();
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
