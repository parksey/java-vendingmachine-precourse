package vendingmachine.domain;

import vendingmachine.util.ExceptionMsg;
import vendingmachine.util.VendingmachineCode;

public class ProductException {
    public static void isUnderPrice(long price) {
        if (price < VendingmachineCode.MIN_PRICE.getCode()) {
            throw new IllegalArgumentException(ExceptionMsg.NOT_MIN_AMOUNT.getMsg());
        }
    }
}
