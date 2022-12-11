package vendingmachine.view;

import vendingmachine.domain.Product;
import vendingmachine.util.ExceptionMsg;
import vendingmachine.util.ProductFormat;
import vendingmachine.util.ProductInfo;
import vendingmachine.util.VendingmachineCode;

import java.util.List;
import java.util.Map;

public class InputException {
    public static void nullException(String userInput) {
        if (userInput ==  null || userInput.isEmpty() || userInput.isBlank()) {
            throw new IllegalArgumentException(ExceptionMsg.NULL.getMsg());
        }
    }

    public static void notNumberException(String userInput) {
        for (int inputIndex = 0; inputIndex < userInput.length(); inputIndex++) {
            isNotDigitException(userInput.charAt(inputIndex));
        }
    }

    private static void isNotDigitException(char input) {
        if (!Character.isDigit(input)) {
         throw new IllegalArgumentException(ExceptionMsg.NOT_NUMBER.getMsg());
        }
    }

    public static void isZero(long money) {
        if (money == VendingmachineCode.ZERO.getCode()) {
            throw new IllegalArgumentException(ExceptionMsg.CAN_NOT_BUY.getMsg());
        }
    }

    public static void notChangeMoney(long money) {
        if (money % VendingmachineCode.TEN.getCode() != 0) {
            throw new IllegalArgumentException(ExceptionMsg.CAN_NOT_CHANGE.getMsg());
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
            throw new IllegalArgumentException(ExceptionMsg.NOT_PRODUCT_FORMAT.getMsg());
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
            throw new IllegalArgumentException(ExceptionMsg.NOT_PRODUCT_INFO_FORMAT.getMsg());
        }
    }
    private static void notProductInfoSize(int size) {
        if (VendingmachineCode.PRODUCT_INFO_SIZE.getCode() != size) {
            throw new IllegalArgumentException(ExceptionMsg.NOT_PRODUCT_SIZE.getMsg());
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


    public static void isNotInProductsExcpetion(Map<String, Product> productList, String userInput) {
        if (!productList.containsKey(userInput)) {
            throw new IllegalArgumentException(ExceptionMsg.NOT_CONTAIN.getMsg());
        }
    }

    public static void isInProductsExcpetion(Map<String, Product> productList, String userInput) {
        if (!productList.containsKey(userInput)) {
            throw new IllegalArgumentException(ExceptionMsg.CONTAIN.getMsg());
        }
    }
}
