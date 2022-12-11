package vendingmachine.util;

public enum PrintMsg {
    INPUT_VENDING_AMOUNT("자판기가 보유하고 있는 금액을 입력해 주세요."),
    INPUT_PRODUCT("상품명과 가격, 수량을 입력해 주세요."),
    INIPUT_USER_AMOUNT("투입 금액을 입력해 주세요."),
    INPUT_BUY("구매할 상품명을 입력해 주세요."),

    CURRENT_COIN("자판기가 보유한 동전"),
    REMAIN_AMOUNT("잔돈"),
    COUNT_UNIT("개"),
    MONEY_UNIT("원");
    private final String msg;

    PrintMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
