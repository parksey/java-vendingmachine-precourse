package vendingmachine.domain;

import vendingmachine.util.VendingmachineCode;

public class ProductException {
    public static void isUnderPrice(long price) {
        if (price < VendingmachineCode.MIN_PRICE.getCode()) {
            throw new IllegalArgumentException("100원보다 적은 금액입니다.");
        }
    }
}
