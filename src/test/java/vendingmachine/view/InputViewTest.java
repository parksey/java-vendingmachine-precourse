package vendingmachine.view;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class InputViewTest {
    static InputView inputView;

    @BeforeAll
    static void setInputView() {
        inputView = new InputView();
    }

    @ParameterizedTest
    @ValueSource(strings = {"", " ", "1ㄹㄷㄴ", "abc", "5", "15"})
    public void checkAmount_test(String userInput) {
        assertThatThrownBy(()-> {
            inputView.checkAmount(userInput);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @ValueSource(strings = {"", " ", "1ㄹㄷㄴ", "abc", "5", "15", "0"})
    public void checkUserAmount_test(String userInput) {
        assertThatThrownBy(()-> {
            inputView.checkUserAmount(userInput);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
