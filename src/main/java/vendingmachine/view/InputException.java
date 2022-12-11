package vendingmachine.view;

import vendingmachine.util.VendingmachineCode;

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
}
