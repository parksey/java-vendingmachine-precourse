package vendingmachine.util;

public enum VendingmachineCode {
    ZERO(0),
    PRODUCT_INFO_SIZE(3),
    TEN(10);

    private final int code;

    VendingmachineCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
