package vendingmachine.view;

import vendingmachine.util.ProductFormat;
import vendingmachine.util.ProductInfo;
import vendingmachine.util.VendingmachineCode;

import java.util.List;

public class InputException {
    public static void nullException(String userInput) {
        if (userInput ==  null || userInput.isEmpty() || userInput.isBlank()) {
            throw new IllegalArgumentException("아무 값도 입력하지 않았습니다.");
        }
    }

    public static void notNumberException(String userInput) {
        for (int inputIndex = 0; inputIndex < userInput.length(); inputIndex++) {
            isNotDigitException(userInput.charAt(inputIndex));
        }
    }

    private static void isNotDigitException(char input) {
        if (!Character.isDigit(input)) {
         throw new IllegalArgumentException("숫자가 아닙니다.");
        }
    }

    public static void isZero(long money) {
        if (money == VendingmachineCode.ZERO.getCode()) {
            throw new IllegalArgumentException("살수있는 상품이 없습니다.");
        }
    }

    public static void notChangeMoney(long money) {
        if (money % VendingmachineCode.TEN.getCode() != 0) {
            throw new IllegalArgumentException("동전으로 변환이 불가능 합니다.");
        }
    }


    public static void notProductsListFormatException(List<String> inputList) {
        for (String input: inputList) {
            notProductStartEndFormatException(input);
            notProductsFormatException(input.substring(1,input.length()-1));
        }
    }
    public static void notProductStartEndFormatException(String userInput) {
        if (!(userInput.startsWith(ProductFormat.OPEN_SQUARE.getFormat())
                && userInput.endsWith(ProductFormat.CLOSE_SQUARE.getFormat()))) {
            throw new IllegalArgumentException("각 상품은 `[`로 시작하고 `]`로 끝나야 합니다.");
        }
    }
    private static void notProductsFormatException(String userInput) {
        startWithCommaException(userInput);
        List<String> productInfo = List.of(userInput.split(ProductFormat.COMMA.getFormat()));
        notProductInfoSize(productInfo.size());
        checkEachProductInfoException(productInfo);
    }
    private static void startWithCommaException(String userInput) {
        if (userInput.startsWith(ProductFormat.COMMA.getFormat())
                || userInput.endsWith(ProductFormat.COMMA.getFormat())) {
            throw new IllegalArgumentException("상품 정보 규격이 맞지 않습니다.");
        }
    }
    private static void notProductInfoSize(int size) {
        if (VendingmachineCode.PRODUCT_INFO_SIZE.getCode() != size) {
            throw new IllegalArgumentException("상품에는 상품명,가격,수량 을 입력하여야 합니다.");
        }
    }
    private static void checkEachProductInfoException(List<String> productInfo) {
        checkPriceFormat(productInfo.get(ProductInfo.PRICE.getIndex()));
        checkCountFormat(productInfo.get(ProductInfo.COUNT.getIndex()));
    }

    private static void checkPriceFormat(String price) {
        notNumberException(price);
        notChangeMoney(Long.parseLong(price));
    }
    private static void checkCountFormat(String count) {
        notNumberException(count);
    }
}
