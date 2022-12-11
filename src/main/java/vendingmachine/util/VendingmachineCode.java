package vendingmachine.util;

public enum VendingmachineCode {
    ZERO(0),
    TEN(10);

    private final int code;

    VendingmachineCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
