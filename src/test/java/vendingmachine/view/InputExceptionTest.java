package vendingmachine.view;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import vendingmachine.domain.Product;
import vendingmachine.util.ProductFormat;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @ValueSource(strings = {
            "[콜라,1500,20,]"
            , "[콜라,1500,20];[사이다,1000,10]]"
            , "[콜라,1500,20];[사이다,1000,10]]"
            , "[[콜라,1500,20];[사이다,1000,10]]"
            , "[[콜라,1500,20]]"
            , "[,콜라,1500,20]"
            , "[,]"
    })
    public void notProductsListFormat_test(String userInput) {
        List<String> inputList = List.of(userInput.split(ProductFormat.CLONE.getFormat()));
        assertThatThrownBy(()-> {
            InputException.notProductsListFormatException(inputList);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @ValueSource(strings = {"콜라", "사이다", "빕스"})
    public void isNotInProducts_test (String userInput) {
        Map<String, Product> productList = new HashMap<>();
        productList.put("가나", null);
        productList.put("초콜릿", null);
        productList.put("해쉬", null);
        assertThatThrownBy(()-> {
            InputException.isNotInProducts(productList, userInput);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
