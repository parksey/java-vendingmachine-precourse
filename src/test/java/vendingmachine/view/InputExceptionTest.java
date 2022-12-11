package vendingmachine.view;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class InputExceptionTest {
    @ParameterizedTest
    @ValueSource(strings = {"", " "})
    public void nullException_test(String userInput) {
        assertThatThrownBy(()-> {
            InputException.nullException(userInput);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @ValueSource(strings = {"", " "})
    public void isDigit_test(String userInput) {
        assertThatThrownBy(()-> {
            InputException.notNumberException(userInput);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @ValueSource(ints = {0,5})
    public void canNotChangeMoney(long userInput) {
        assertThatThrownBy(()-> {
            InputException.notChangeMoney(userInput);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @ValueSource(ints = {0,5})
    public void notProductsListFormat_test(long userInput) {
        assertThatThrownBy(()-> {
            InputException.notProductsListFormat(userInput);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @ValueSource(ints = {0,5})
    public void productsFormat_test(long userInput) {
        assertThatThrownBy(()-> {
            InputException.notProductsFormat(userInput);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
